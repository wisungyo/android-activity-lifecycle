package com.binar.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        Log.d(MainActivity::class.simpleName,"onCreate() in Activity 2 run")

        btn_activity_2.setOnClickListener {
            val intentActivity2to1 = Intent(this, MainActivity::class.java)
            // start activity 1
            startActivity(intentActivity2to1)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.simpleName,"onStart() in Activity 2 run")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.simpleName,"onResume() in Activity 2 run")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.simpleName,"onPause() in Activity 2 run")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.simpleName,"onStop() in Activity 2 run")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.simpleName,"onDestroy() in Activity 2 run")
    }
}