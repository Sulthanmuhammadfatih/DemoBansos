package com.example.sulthan.demobansos

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ButtonBarLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.sulthan.demobansos.ui.dashboard.Scan

class MainActivity : AppCompatActivity() {

    private lateinit var buttonNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setup TitleBar Transparent
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications,
                R.id.navigation_timeline,
                R.id.qr_navigation
            )
        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


//        button.setOnClickListener {
//            val intent = Intent(this, Scan::class.java)
//            startActivity(intent)


//        buttonNavigationView = findViewById(R.id.qr_navigation) as BottomNavigationView
//        buttonNavigationView.setOnClickListener {
//            startActivity(Intent(this@MainActivity, Scan::class.java))
//        }
        }

        }




