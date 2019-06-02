package com.glamvian.basketballclub.view

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.glamvian.basketballclub.R
import org.jetbrains.anko.*

class ItemUI : AnkoComponent<ViewGroup>{
    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        linearLayout { lparams(
            width= matchParent, height = wrapContent)
        orientation = LinearLayout.HORIZONTAL
        padding = dip (16)

            imageView(R.drawable.atlanta_hawks){
                id = R.id.club_image
            }.lparams(width= dip(50),height = dip(50))

            textView("Atlanta Hawks"){
                id = R.id.club_name
            }.lparams(width= wrapContent,height = wrapContent){
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(10)
            }
        }
    }
}