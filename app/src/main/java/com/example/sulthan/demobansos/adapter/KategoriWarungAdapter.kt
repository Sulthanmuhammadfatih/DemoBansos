package com.example.sulthan.demobansos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sulthan.demobansos.R
import com.example.sulthan.demobansos.pojo.PojoWarung
import kotlinx.android.synthetic.main.rv_detail.view.*

class KategoriWarungAdapter ( private val warung : List<PojoWarung>,
                              private val adapterOnClick : (PojoWarung) -> Unit) : RecyclerView.Adapter<KategoriWarungAdapter.WarungHolder>(){

    inner class WarungHolder (view: View) : RecyclerView.ViewHolder(view) {
        fun bindwarung (warung: PojoWarung) {
            itemView.apply {
                tv_profile.text = warung.penjual
                tv_stock.text = warung.stock
                tv_jarak.text = warung.jarak
                Glide.with(itemView.context).load(warung.fotopenjual).circleCrop().into(img_rv_detail)

                setOnClickListener {
                    adapterOnClick(warung)
                }

            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KategoriWarungAdapter.WarungHolder {
        return WarungHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_detail,parent, false))
    }

    override fun getItemCount(): Int = warung.size

    override fun onBindViewHolder(holder: KategoriWarungAdapter.WarungHolder, position: Int ) {
        holder.bindwarung(warung[position])
    }


}