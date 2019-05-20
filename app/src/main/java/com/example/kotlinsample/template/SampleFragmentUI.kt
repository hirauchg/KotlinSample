package com.example.kotlinsample.template

import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.verticalLayout

class SampleFragmentUI : AnkoComponent<SampleFragment> {

    override fun createView(ui: AnkoContext<SampleFragment>) = with(ui) {
        verticalLayout {

        }
    }
}