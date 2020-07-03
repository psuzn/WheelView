package me.sujanpoudel.wheelviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.sujanpoudel.wheelview.WheelView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wheelView = findViewById<WheelView>(R.id.wheel_view)
        wheelView.titles = listOf("A", "B", "C", "D","E","F","G","H","I","J","K")
    }
}