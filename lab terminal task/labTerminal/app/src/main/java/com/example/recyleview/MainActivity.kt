package com.example.recyleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button=findViewById<Button>(R.id.button)
        reccyle.layoutManager=LinearLayoutManager(this)
        reccyle.adapter= customadapter()

        button.setOnClickListener {
            var i= Intent(this,SendSmS::class.java)
            startActivity(i)

    }
}
}