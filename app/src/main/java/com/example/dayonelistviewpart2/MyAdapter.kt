package com.example.dayonelistviewpart2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) : ArrayAdapter<User>(context,R.layout.each_items,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflate = LayoutInflater.from(context)
        val view = inflate.inflate(R.layout.each_items,null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val lastMsg = view.findViewById<TextView>(R.id.tv_msg)
        val lastMsgTime = view.findViewById<TextView>(R.id.tv_time)

        name.text = arrayList[position].user_name
        lastMsg.text = arrayList[position].user_lastmsg
        lastMsgTime.text = arrayList[position].user_lastMsgTime
        image.setImageResource(arrayList[position].user_imageid)

        return view // must return here
    }

}