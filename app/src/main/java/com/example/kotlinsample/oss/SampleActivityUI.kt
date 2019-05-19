package com.example.kotlinsample.oss

import android.widget.Button
import com.example.kotlinsample.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.button
import org.jetbrains.anko.verticalLayout

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var mButton: Button

    override fun createView(ui: AnkoContext<SampleActivity>) = with(ui) {
        verticalLayout {
            mButton = button(R.string.oss_button)
        }
    }
}