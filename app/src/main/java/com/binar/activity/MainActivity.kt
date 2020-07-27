package com.binar.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.simpleName,"onCreate() in Activity 1 run")

        btn_activity_1.setOnClickListener {
            val intentActivity1to2 = Intent(this, Activity2::class.java)
            // start activity 2
            startActivity(intentActivity1to2)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.simpleName,"onStart() in Activity 1 run")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.simpleName,"onResume() in Activity 1 run")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.simpleName,"onPause() in Activity 1 run")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.simpleName,"onStop() in Activity 1 run")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.simpleName,"onDestroy() in Activity 1 run")
    }
}