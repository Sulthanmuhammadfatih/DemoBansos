package com.example.sulthan.demobansos.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sulthan.demobansos.R
import com.example.sulthan.demobansos.adapter.KategoriAdapter
import com.example.sulthan.demobansos.adapter.KategoriWarungAdapter
import com.example.sulthan.demobansos.pojo.PojoWarung
import kotlinx.android.synthetic.main.activity_detail_warung.*
import kotlinx.android.synthetic.main.fragment_sarden.*
import kotlinx.android.synthetic.main.rv_detail.*
import com.example.sulthan.demobansos.pojo.Pojo
import com.example.sulthan.demobansos.ui.dashboard.kategori.BerasFragment
import java.util.ArrayList

class DetailWarungActivity : AppCompatActivity() {

    private lateinit var imageView: ImageButton
    lateinit var kategoriWarungAdapter: KategoriWarungAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Setup titlebar
        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

//        imageView = findViewById(R.id.btn_back_detail) as ImageButton
//        imageView.setOnClickListener {
//            intent = Intent(this, MainActivity::class.java)
//        }

//        //Intent btn previous
//        btn_back_detail.setOnClickListener {
//            startActivity(Intent(this, BerasFragment::class.java))
//        }

        setContentView(R.layout.rv_detail_warung)
        val pojoWarung = intent.getParcelableExtra<Pojo.User>("kategori")


        val listBeras = arrayListOf<PojoWarung> (
            PojoWarung("Pak Sapto","150 KG","1500 M","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Pak Jamal","500 KG","1500 M","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Agen Barokah","320 KG","1500 M","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Agen sinar jaya","290 KG","1500 M","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Warung bu ratih","100 KG","1500 M","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Warung pak jamal","500 KG","1500 M","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Warung pak joko","1000 KG","1500 M","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Warung bu ida","975 KG","1500 M","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80")
        )

        val listsarden = arrayListOf<PojoWarung>(
            PojoWarung("Sulthan","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Pak ahmad","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Pak joko","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Bu aisyah","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Pak jamil","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Agen barkah","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Sulton","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Sulton","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80")
        )

        val listminyak = arrayListOf<PojoWarung>(
            PojoWarung("Sulthan","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Pak ahmad","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Pak joko","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Bu aisyah","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Pak jamil","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Agen barkah","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Sulton","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80"),
            PojoWarung("Sulton","29","1500","https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2689&q=80")
        )

        val kategoriWarungAdapter = KategoriWarungAdapter(listsarden) {
            pojowarung ->
            Toast.makeText(this, "clicked ${pojowarung.penjual}", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, )
        }

        rv_detail_deket.apply {
            layoutManager = LinearLayoutManager(this@DetailWarungActivity)
            adapter = kategoriWarungAdapter
        }

        rv_detail_jauh.apply {
            layoutManager = LinearLayoutManager(this@DetailWarungActivity)
            adapter = kategoriWarungAdapter
        }

        }

}