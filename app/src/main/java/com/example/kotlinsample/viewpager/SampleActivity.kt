package com.example.kotlinsample.viewpager

import android.os.Bundle
import android.support.v4.view.ViewPager
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.setContentView

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = SampleActivityUI()
        ui.setContentView(this)

        val adapter = SampleViewPagerAdapter(supportFragmentManager)
        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        viewPager.adapter = adapter
        ui.mTabLayout.setupWithViewPager(viewPager)
    }
}