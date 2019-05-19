package com.example.kotlinsample.anko

import android.os.Bundle
import com.example.kotlinsample.BaseActivity
import org.jetbrains.anko.setContentView

class AnkoActivity : BaseActivity() {

    private val mUI = AnkoActivityUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mUI.setContentView(this)
    }
}