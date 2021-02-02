package com.wangneng.kotlindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var data = ArrayList<String>()
    private var adapter: MyAdapter? = null
    private lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv = findViewById(R.id.rv)

        adapter = MyAdapter()
        adapter!!.add(getData())
        val manager = LinearLayoutManager(this)
        rv.layoutManager = manager
        rv.adapter = adapter
        adapter.set



    }

    fun getData() :List<String>{
        for (i in 1..100){
            data!!.add("我是标题"+i)
        }
        return data;
    }
}
