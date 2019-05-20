package com.example.kotlinsample.viewpager

import android.widget.TextView
import org.jetbrains.anko.*

class SampleFragmentUI : AnkoComponent<SampleFragment> {

    lateinit var mTextView: TextView

    override fun createView(ui: AnkoContext<SampleFragment>) = with(ui) {
        verticalLayout {
            mTextView = textView {
                textSize = 20F
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent) {
                topMargin = dip(10)
            }
        }
    }
}