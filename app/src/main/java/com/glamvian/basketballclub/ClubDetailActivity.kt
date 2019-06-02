package com.glamvian.basketballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_club_detail.*

class ClubDetailActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club_detail)
        val intent = intent
        val logo: Int = intent.getIntExtra("image",0)
        Glide.with(this).load(logo).into(logoClub)
        namaClub.text = intent.getStringExtra("name")
        desc.text = intent.getStringExtra("desc")
    }

}