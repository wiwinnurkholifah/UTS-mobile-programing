package com.example.uts_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_android.adapter.ImageAdapter

class BeritaActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        val imageList = listOf<Image>(
            Image(
                R.drawable.dpr2,
                "DPR Klaim Pertumbuhan Ekonomi Indonesia Saat Pandemi Covid-19 Membaik",
                "Liputan6.com, Jakarta - Ketua Komisi XI DPR RI, Dito Ganinduto, meminta masyarakat, pelaku usaha untuk tetap optimis di tengah pandemi Covid-19, terlebih melihat kondisi ekonomi di Indonesia..\n" +
                        "\n" +
                        "\"Saya berharap optimisme dari seluruh masyarakat, pelaku usaha, dan market bahwa momentum pemulihan bisa berlanjut ke depan sehingga kita bersama-sama dapat melewati dampak terburuk dari pandemi Covid-19 ini,\" kata Dito dalam keterangannya, Kamis (12/11/2020).\n" +
                        "\n" +
                        "Pasalnya, dia memandang pertumbuhan ekonomi Indonesia di triwulan III 2020 cenderung membaik, yakni -3,49% daripada triwulan II sebesar -5,32%.\n" +
                        "\n" +
                        "\"Ini dipengaruhi oleh akselerasi stimulus fiskal (APBB). Dan program pemulihan ekonomi nasional yang dapat dilihat dari peningkatan konsumsi Pemerintah di Triwulan III 2020 yang mampu tumbuh positif,\" ungkap Dito.\n" +
                        "\n" +


                        " "

            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}