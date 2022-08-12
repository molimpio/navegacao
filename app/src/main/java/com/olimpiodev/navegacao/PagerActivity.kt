package com.olimpiodev.navegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tabs.*
import kotlinx.android.synthetic.main.toolbar.*

class PagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tabsPageAdapter = TabsPagerAdapter(this, supportFragmentManager)
        viewPager.adapter = tabsPageAdapter
    }
}