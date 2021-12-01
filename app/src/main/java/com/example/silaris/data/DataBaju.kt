package com.example.silaris.data

import com.example.silaris.R

object DataBaju {
    val namaBarang = arrayOf(
        "Sweater Plus Rok pendek",
        "Crewneck pria motif",
        "Hoodie blck XVL",
        "Jaket jeans",
        "Jas Pria",
        "Jaket Nigers",
        "Jaket jeans pria",
        "Jaket Pria",
        "Kaos oversize",
        "Topi Mafia"
    )

    val hargaBarang = arrayOf(
        "Rp 250.000",
        "Rp 150.000",
        "Rp 300.000",
        "RP 350.000",
        "Rp 900.000",
        "Rp 50.000",
        "Rp 290.000",
        "Rp 250.000",
        "Rp 70.000",
        "Rp 25.000"
    )

    val gambarBarang = intArrayOf(
        R.drawable.img_item1,
        R.drawable.img_item2,
        R.drawable.img_item3,
        R.drawable.img_item4,
        R.drawable.img_item5,
        R.drawable.img_item6,
        R.drawable.img_item7,
        R.drawable.img_item8,
        R.drawable.img_item9,
        R.drawable.img_item10,
    )

    val detailBarang = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mus magna nunc in commodo netus nec sagittis, cras sit. Enim nisi at vulputate vitae." +
                " Arcu cras tincidunt mi fusce blandit et. Nisi massa aliquam nullam scelerisque et justo diam aliquam suspendisse.",

        )


    val listBaju: ArrayList<Baju>
        get() {
            val listBaju = arrayListOf<Baju>()
            for (position in namaBarang.indices) {
                val baju = Baju(
                    nama = namaBarang[position],
                    harga = hargaBarang[position],
                    detail = detailBarang[position],
                    gambar = gambarBarang[position]
                )
                listBaju.add(baju)
            }
            return listBaju
        }
}