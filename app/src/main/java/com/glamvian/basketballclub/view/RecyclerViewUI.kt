package com.glamvian.basketballclub.view

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.glamvian.basketballclub.MainActivity
import com.glamvian.basketballclub.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView

class RecyclerViewUI : AnkoComponent<MainActivity>{
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
       linearLayout{
           recyclerView{
               id = R.id.recyclerViewUI
               lparams(width= matchParent,height = matchParent)
               layoutManager = LinearLayoutManager(ctx)
           }
       }
    }

}