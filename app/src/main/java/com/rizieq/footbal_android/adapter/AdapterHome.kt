package com.rizieq.footbal_android.adapter

import android.content.Context
import android.content.res.TypedArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rizieq.footbal_android.R
import com.rizieq.footbal_android.ui.home.HomeFragment

class AdapterHome(private val context: HomeFragment,
                  internal var countryData: Array<String>,
                  internal var locationData: Array<String>,
                  internal var stadiumData: Array<String>,
                  internal var leguageData: Array<String>,
                  internal var teamData: Array<String>,
                  internal var imgData: TypedArray
) : RecyclerView.Adapter<AdapterHome.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_home,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return imgData.length()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvCountry.text = countryData[position]
        holder.tvLocation.text = locationData[position]
        holder.tvStadium.text = stadiumData[position]
        holder.tvLeguage.text = leguageData[position]
        holder.tvTeam.text = teamData[position]

        Glide.with(context)
            .load(imgData.getResourceId(position,-1))
            .into(holder.imgFootball)
    }


    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        internal var tvCountry: TextView
        internal var tvLocation: TextView
        internal var tvStadium: TextView
        internal var tvTeam: TextView
        internal var tvLeguage: TextView
        internal var imgFootball: ImageView

        init {

            tvCountry = itemView.findViewById(R.id.country)
            tvLocation = itemView.findViewById(R.id.location)
            tvStadium = itemView.findViewById(R.id.stadium)
            tvTeam = itemView.findViewById(R.id.team)
            tvLeguage = itemView.findViewById(R.id.lenguage)
            imgFootball = itemView.findViewById(R.id.img)


        }
    }
}