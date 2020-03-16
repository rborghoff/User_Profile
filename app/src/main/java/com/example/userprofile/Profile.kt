package com.example.userprofile

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Profile (
    val firstname: String,
    val lastName: String,
    val description: String,
    val imgUrl: Uri?
) : Parcelable