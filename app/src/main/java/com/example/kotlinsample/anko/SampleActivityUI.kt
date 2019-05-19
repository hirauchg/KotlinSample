package com.example.kotlinsample.anko

import android.widget.TextView
import com.example.kotlinsample.R
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>) = with(ui) {
        verticalLayout {
            textView(R.string.anko_title) {
                textSize = 20F
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent) {
                topMargin = dip(10)
            }
        }
    }
}