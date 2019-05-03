package com.g00fy2.appcompatdaynightissue

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity.*

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        supportActionBar?.title = localClassName
        button.apply {
            text = resources.getText(R.string.goto_activity_b)
            setOnClickListener { startActivity(Intent(this@ActivityA, ActivityB::class.java)) }
        }
    }
}