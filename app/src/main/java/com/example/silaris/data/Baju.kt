package com.example.silaris.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Baju(
    var nama: String?,
    var harga: String?,
    var detail: String?,
    var gambar: Int?
) : Parcelable