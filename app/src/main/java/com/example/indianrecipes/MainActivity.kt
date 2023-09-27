package com.example.indianrecipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(mainLooper).postDelayed(
            {
                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            },2000
        )

    }
}