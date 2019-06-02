package com.glamvian.basketballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.glamvian.basketballclub.adapter.RecyclerViewAdapter
import com.glamvian.basketballclub.model.Item
import com.glamvian.basketballclub.view.RecyclerViewUI
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity


class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RecyclerViewUI().setContentView(this)
        val recyclerViewUI = findViewById<RecyclerView>(R.id.recyclerViewUI)
        initData()
        recyclerViewUI.layoutManager = LinearLayoutManager(this)
        recyclerViewUI.adapter = RecyclerViewAdapter(this,items){
            val nameClub = it.name
            val logoClub = it.image
            val desc = it.desc
            startActivity<ClubDetailActivity>("name" to nameClub,
                "image" to logoClub,"desc" to desc)

        }
    }

    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val img = resources.obtainTypedArray(R.array.club_image)
        val desc = resources.getStringArray(R.array.club_desc)
        items.clear()
        for(i in name.indices){
            items.add(Item(name[i],img.getResourceId(i,0),desc[i]))
        }
        img.recycle()
    }

}
