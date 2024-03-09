package com.example.dayonelistviewpart2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val names = arrayOf("Dilip", "Rahul", "Ankit", "Aman", "Mukesh", "Bhaskar", "Sujit")
        val lastMsg = arrayOf(
            "Hey Dilip are you excited",
            "Hey Rahul are you excited",
            "Hey Ankit are you excited",
            "Hey Aman are you excited",
            "Hey Mukesh are you excited",
            "Hey Bhaskar are you excited",
            "Hey Sujit are you excited"
        )

        val lastMsgTime =
            arrayOf("6:25 AM", "5:05 AM", "7:15 PM", "8:29 AM", "3:55 AM", "4:20 PM", "9:51 PM")
        val mobiles = arrayOf(
            "7889455612",
            "9889455612",
            "4889455612",
            "3889455612",
            "5889455612",
            "6889455612",
            "2889455612"
        )

        val image_id = intArrayOf(
            R.drawable.pizza_1,
            R.drawable.pizza_2,
            R.drawable.pizza_3,
            R.drawable.pizza_4,
            R.drawable.pizza_5,
            R.drawable.pizza_6,
            R.drawable.pizza_7
        )


        userArrayList = ArrayList()

        for (i in names.indices) {
            val data_user = User(names[i], lastMsg[i], lastMsgTime[i], mobiles[i], image_id[i])
            userArrayList.add(data_user)
        }

        val listView = findViewById<ListView>(R.id.listViewLayout)

        listView.isClickable = true

        listView.adapter = MyAdapter(this, userArrayList) // set adapter here


        //onclick items
        listView.setOnItemClickListener { parent, view, position, id ->

            val name = names[position]
            val userMobile = mobiles[position]
            val userImage = image_id[position]

            val intent = Intent(this,UserActivity::class.java)

            intent.putExtra("userName",name)
            intent.putExtra("userMobile",userMobile)
            intent.putExtra("userImage",userImage)

            startActivity(intent)

        }


    }
}