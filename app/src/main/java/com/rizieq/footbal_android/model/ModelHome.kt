package com.rizieq.footbal_android.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelHome (
    val countryFootball: String?,
    val locationFootball: String?,
    val stadiumFootball: Int?,
    val teamFootball: Int?,
    val leguageFootball: Int?,
    val imgFootball: Int?
): Parcelable

