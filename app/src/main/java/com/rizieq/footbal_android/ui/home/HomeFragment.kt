package com.rizieq.footbal_android.ui.home

import android.content.res.TypedArray
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.rizieq.footbal_android.R
import com.rizieq.footbal_android.adapter.AdapterHome
import com.rizieq.footbal_android.model.ModelHome
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.ArrayList

class HomeFragment : Fragment() {

    private lateinit var adapter: AdapterHome
    lateinit var countryFootbal: Array<String>
    lateinit var locationFootbal: Array<String>
    lateinit var stadiumFootball: Array<String>
    lateinit var teamFootball: Array<String>
    lateinit var leguageFootbal: Array<String>
    lateinit var imgFootball: TypedArray
    private var modelHome = ArrayList<ModelHome>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        prepared()
        useItem()
    }
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private fun prepared() {
        countryFootbal = resources.getStringArray(R.array.country_football)
        locationFootbal = resources.getStringArray(R.array.location_football)
        stadiumFootball = resources.getStringArray(R.array.stadium_football)
        teamFootball = resources.getStringArray(R.array.team_football)
        leguageFootbal = resources.getStringArray(R.array.leguage_football)
        imgFootball = resources.obtainTypedArray(R.array.data_photo)
    }

    private fun useItem() {
        adapter = AdapterHome(this,countryFootbal,locationFootbal,stadiumFootball,teamFootball,leguageFootbal,imgFootball)
        rv_home.setHasFixedSize(true)
        rv_home.layoutManager = LinearLayoutManager(context)
        rv_home.adapter = adapter
    }

}