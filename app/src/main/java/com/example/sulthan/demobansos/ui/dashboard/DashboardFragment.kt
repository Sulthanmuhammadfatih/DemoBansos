package com.example.sulthan.demobansos.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sulthan.demobansos.R
import com.example.sulthan.demobansos.adapter.KategoriAdapter
import com.example.sulthan.demobansos.pojo.Pojo
import com.example.sulthan.demobansos.ui.dashboard.kategori.BerasFragment
import com.example.sulthan.demobansos.ui.dashboard.kategori.Minyakfragment
import com.example.sulthan.demobansos.ui.dashboard.kategori.SardenFragment
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlin.math.min

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    lateinit var berasFragment: BerasFragment
    lateinit var minyakfragment: Minyakfragment
    lateinit var sardenFragment: SardenFragment

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val imageView : ImageView = root.findViewById(R.id.imageView)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            imageView.drawable
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        berasFragment = BerasFragment()
        minyakfragment = Minyakfragment()
        sardenFragment = SardenFragment()




        //btnberas
        btn_beras.setOnClickListener {
            applyFragment(berasFragment)
        }


        //btnMinyak
        btn_minyak.setOnClickListener{
            applyFragment(minyakfragment)
        }

        //btnSarden
        btn_sarden.setOnClickListener {
            applyFragment(sardenFragment)
        }

        applyFragment(berasFragment)
    }


    private fun applyFragment (fragment: Fragment) {
        val fragmentManager = childFragmentManager
        val fragmentTrasaction = fragmentManager.beginTransaction()
        fragmentTrasaction.replace(R.id.fragmenr_contariner, fragment)
        fragmentTrasaction.commit()
    }

}