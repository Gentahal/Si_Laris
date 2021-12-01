package com.example.silaris.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Notif(
    var notif: String?,
    var desc: String?,
    var gambar: Int
) :Parcelable