package com.example.sulthan.demobansos.ui.dashboard.kategori

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sulthan.demobansos.R
import com.example.sulthan.demobansos.adapter.KategoriAdapter
import com.example.sulthan.demobansos.pojo.Pojo
import com.example.sulthan.demobansos.ui.DetailWarungActivity
import kotlinx.android.synthetic.main.fragment_beras.*


class BerasFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beras, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listkategori = listOf(
            Pojo.Kategori(
                name = "Beras Pandan Wangi",
                image = "https://cf.shopee.co.id/file/5d510e5c94ecfd18980c98101820e6fd"
            ),
            Pojo.Kategori(
                name = "Beras Ramos",
                image = "https://assets.klikindomaret.com/products/20025487/20025487_1.jpg"
            ),
            Pojo.Kategori(
                name = "Beras Rojolele",
                image = "https://id-live-01.slatic.net/p/ae6557f5af5dcdcc82611340d29a2eda.jpg"
            ),
            Pojo.Kategori(
                name = "Beras Maknyuss",
                image = "https://cdn1-production-images-kly.akamaized.net/ZTdLPTHu2YDIxzb_i_KljXEtggs=/640x640/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1659577/original/078857800_1501055779-4370282_9a01a2a1-cf58-45c2-9080-17ce5207a37a.jpg"
            ),
            Pojo.Kategori(
                name = "Beras sipulen",
                image = "https://cf.shopee.co.id/file/c84971cb846c8e0f399e775eb97dcfd1"
            ),
            Pojo.Kategori(
                name = "Beras Cap Sumo",
                image = "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//109/MTA-4765888/sumo_beras_sumo_5kg_termurah_full02_bhis53ro.jpg"
            ),
            Pojo.Kategori(
                name = "Beras finna",
                image = "https://ecs7.tokopedia.net/img/cache/500-square/VqbcmM/2020/6/29/30bc8cac-59de-44d3-b064-d726d75d9a91.jpg"
            ),
            Pojo.Kategori(
                name = "Cap top koki",
                image = "https://ecs7.tokopedia.net/img/cache/700/VqbcmM/2020/6/13/e687b714-8459-43dc-8a9c-a1956c0defef.jpg"
            )

        )

        val kategoriAdapter = KategoriAdapter(listkategori) {
            kategori ->
            Toast.makeText(activity, " clicked ${kategori.name},", Toast.LENGTH_SHORT).show()
            val intent = Intent(activity, DetailWarungActivity::class.java)
            startActivity(intent)

            //Intent

        }

        rv_main_beras.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = kategoriAdapter
        }
    }

}