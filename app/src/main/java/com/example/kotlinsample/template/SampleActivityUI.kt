package com.example.kotlinsample.template

import android.view.View
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.verticalLayout

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {

        }
    }
}