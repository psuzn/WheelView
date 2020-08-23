package me.sujanpoudel.wheelviewdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import me.sujanpoudel.wheelview.WheelView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main)
        val wheelView = findViewById<WheelView>(R.id.wheel_view)
        wheelView.setOnClickListener {
          Toast.makeText(this,"Click on WheelView",Toast.LENGTH_SHORT).show()
        }
        wheelView.titles = listOf("First", "Second", "Third", "Fourth")
    }
}