package com.example.kotlinsample.edittext

import android.os.Bundle
import com.example.kotlinsample.BaseActivity
import org.jetbrains.anko.setContentView

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleActivityUI().setContentView(this)
    }
}