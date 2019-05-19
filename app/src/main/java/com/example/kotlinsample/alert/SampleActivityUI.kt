package com.example.kotlinsample.alert

import android.widget.Button
import com.example.kotlinsample.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.button
import org.jetbrains.anko.verticalLayout

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var mButton1: Button
    lateinit var mButton2: Button
    lateinit var mButton3: Button
    lateinit var mButton4: Button

    override fun createView(ui: AnkoContext<SampleActivity>) = with(ui) {
        verticalLayout {
            mButton1 = button(R.string.alert_button_1)
            mButton2 = button(R.string.alert_button_2)
            mButton3 = button(R.string.alert_button_3)
            mButton4 = button(R.string.alert_button_4)
        }
    }
}