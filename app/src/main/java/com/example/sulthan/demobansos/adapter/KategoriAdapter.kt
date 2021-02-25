package com.example.sulthan.demobansos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sulthan.demobansos.R
import com.example.sulthan.demobansos.pojo.Pojo
import kotlinx.android.synthetic.main.item_rv.view.*

class KategoriAdapter  ( private val kategori : List<Pojo.Kategori>,
                         private val onClickItem : (Pojo.Kategori) -> Unit) : RecyclerView.Adapter<KategoriAdapter.KategoriHolder>() {

    inner class KategoriHolder( view : View) : RecyclerView.ViewHolder(view) {
        fun bindkategori(kategori : Pojo.Kategori) {
            itemView.apply {
                tv_item.text = kategori.name
                Glide.with(itemView.context).load(kategori.image).circleCrop().into(img_view)

                setOnClickListener {
                    onClickItem(kategori)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriHolder {
        return KategoriHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))
    }

    override fun getItemCount(): Int = kategori.size

    override fun onBindViewHolder(holder: KategoriHolder, position: Int) {
        holder.bindkategori(kategori[position])
    }
}
