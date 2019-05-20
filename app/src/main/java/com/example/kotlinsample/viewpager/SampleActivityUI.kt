package com.example.kotlinsample.viewpager

import android.support.design.widget.TabLayout
import android.support.v4.content.ContextCompat.getColor
import android.view.View
import com.example.kotlinsample.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.design.tabLayout
import org.jetbrains.anko.support.v4.viewPager
import org.jetbrains.anko.verticalLayout

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var mTabLayout: TabLayout

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            mTabLayout = tabLayout {
                tabGravity = TabLayout.GRAVITY_FILL
                backgroundColor = getColor(ctx, android.R.color.black)
                setTabTextColors(getColor(ctx, android.R.color.white), getColor(ctx, android.R.color.holo_green_light))
                setSelectedTabIndicatorColor(getColor(ctx, android.R.color.holo_green_light))
            }

            viewPager {
                id = R.id.ViewPager
            }
        }
    }
}