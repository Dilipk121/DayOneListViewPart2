package com.example.dayonelistviewpart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val tv_name = findViewById<TextView>(R.id.tv_user_name)
        val tv_mobile = findViewById<TextView>(R.id.tv_user_mobile)
        val image = findViewById<CircleImageView>(R.id.user_image)


        val name = intent.getStringExtra("userName")
        val mobile = intent.getStringExtra("userMobile")
        val imageId = intent.getIntExtra("userImage",0)

        //set all received values
        tv_name.text = name
        tv_mobile.text = mobile
        image.setImageResource(imageId)

    }
}