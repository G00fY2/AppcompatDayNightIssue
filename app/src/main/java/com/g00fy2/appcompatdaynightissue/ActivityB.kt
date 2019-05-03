package com.g00fy2.appcompatdaynightissue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity.*

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        supportActionBar?.title = localClassName
        button.apply {
            text = resources.getString(R.string.toggle_mode)
            setOnClickListener { toggleNightMode() }
        }
    }

    private fun toggleNightMode() {
        when (AppCompatDelegate.getDefaultNightMode()) {
            AppCompatDelegate.MODE_NIGHT_YES -> AppCompatDelegate.MODE_NIGHT_NO
            else -> AppCompatDelegate.MODE_NIGHT_YES
        }.let {
            delegate.localNightMode = it
            AppCompatDelegate.setDefaultNightMode(it)
        }
    }
}