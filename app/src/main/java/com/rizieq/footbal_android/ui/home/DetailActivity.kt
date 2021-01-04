package com.rizieq.footbal_android.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.rizieq.footbal_android.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        var INTENT_DATA_TEAM = "DATA_TEAM"
        var INTENT_DATA_IMAGE = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dataCountry : String = intent.getStringExtra(INTENT_DATA_TEAM)
        val dataImg : Int = intent.getIntExtra(INTENT_DATA_IMAGE,0)

        country_detail.text = dataCountry
        Glide.with(this)
            .load(dataImg)
            .into(img_detail)


    }
}