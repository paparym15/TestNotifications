package com.one.testnotifications

import android.app.ActivityManager
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        btn2.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }

        btn3.setOnClickListener {
            val i = Intent(this, ThirdActivity::class.java)
            startActivity(i)
        }
        btn4.setOnClickListener {
            val i = Intent(this, FourthActivity::class.java)
            startActivity(i)
        }
        btn5.setOnClickListener {
            val i = Intent(this, FifthActivity::class.java)
            startActivity(i)
        }

        val manager = getSystemService(ACTIVITY_SERVICE) as ActivityManager

        val item = manager.getRunningTasks(10).map {
            it.numActivities
        }

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("-->", "received")
    }
}