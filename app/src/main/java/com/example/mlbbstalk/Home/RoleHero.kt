package com.example.mlbbstalk.Home

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RoleHero(
    var id : String,
    var nama : String,
    var role : String,
    var spesialis : String,
    var foto : Int,
    var deskripsi : String
) : Parcelable