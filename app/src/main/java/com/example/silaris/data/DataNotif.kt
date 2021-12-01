package com.example.silaris.data

import com.example.silaris.R

object DataNotif {

    val namaNotif = arrayListOf(
        "Kontak dan Teman",
        "Promo dan Cashback",
        "Feed dan Live",
        "Shoping Pay",
        "Info Shoping",
        "Shoping Games"
    )

    val descNotif = arrayListOf(
        "Belum ada Notifikasi",
        "2X Lebih Besar: Po..",
        "Cari Live di sini ..",
        "Gunakan kode ini d..",
        "Dikon 11.11 buruan..",
        "Ada ribuan Voucher.."
    )

    var gambarNotif = arrayListOf(
        R.drawable.nt_person,
        R.drawable.nt_discount,
        R.drawable.nt_feed,
        R.drawable.nt_wallet,
        R.drawable.nt_discount,
        R.drawable.nt_game
    )

    val listNotif: ArrayList<Notif>
        get() {
            val listNotif = arrayListOf<Notif>()
            for (position in namaNotif.indices) {
                val notif = Notif(
                    notif = namaNotif[position],
                    desc = descNotif[position],
                    gambar = gambarNotif[position]
                )
                listNotif.add(notif)
            }
            return listNotif
        }
}