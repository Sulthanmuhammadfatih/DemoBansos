package com.example.sulthan.demobansos.pojo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class Pojo {

    //tetst
    @Parcelize
    class Kategori (
        val name : String,
        val image : String
    ):Parcelable
}