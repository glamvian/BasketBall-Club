package com.glamvian.basketballclub.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.glamvian.basketballclub.R
import com.glamvian.basketballclub.model.Item
import com.glamvian.basketballclub.view.ItemUI
import org.jetbrains.anko.AnkoContext

class RecyclerViewAdapter(private val context: Context,private val items: List<Item>,private val listener:(Item)-> Unit):
    RecyclerView.Adapter<ClubViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ClubViewHolder {
        return ClubViewHolder(ItemUI().createView(AnkoContext.create(p0.context,p0)))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(p0: ClubViewHolder, p1: Int) {
        p0.bindItem(items[p1],listener)
    }


}

class ClubViewHolder(view: View):RecyclerView.ViewHolder(view){
 val name = view.findViewById<TextView>(R.id.club_name)
    private val image = view.findViewById<ImageView>(R.id.club_image)

    fun bindItem(items: Item, listener: (Item) -> Unit){
        name.text = items.name
        Glide.with(itemView.context).load(items.image).into(image)
        itemView.setOnClickListener{listener(items)}
    }
}