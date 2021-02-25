package com.example.sulthan.demobansos.ui

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.sulthan.demobansos.MainActivity
import com.example.sulthan.demobansos.R

class LoginActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        button = findViewById(R.id.btn_masuk) as Button
        button.setOnClickListener { 
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}