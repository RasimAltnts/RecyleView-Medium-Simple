package com.example.recyclerviewkullanm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var list: Array<String> = arrayOf("1.","2.","3.","4.","5.")
    var recyclerViewAdapter:adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager:RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyleView.layoutManager = layoutManager
        data()

    }

    fun data(){
        recyclerViewAdapter = adapter(list)
        recyleView.adapter = recyclerViewAdapter
    }
}