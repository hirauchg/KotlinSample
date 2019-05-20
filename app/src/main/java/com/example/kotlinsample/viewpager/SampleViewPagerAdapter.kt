package com.example.kotlinsample.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class SampleViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(p0: Int): Fragment {
        val bundle = Bundle()
        bundle.putString("key", "Fragment : " + (p0 + 1))
        val fragment = SampleFragment()
        fragment.arguments = bundle
        return fragment
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        val titles = listOf("フラグメント１", "フラグメント２", "フラグメント３")
        return titles.get(position)
    }
}