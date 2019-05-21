package com.example.kotlinsample.alpha_animation

import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var mFadeInButton: Button
    lateinit var mFadeOutButton: Button
    lateinit var mTextView: TextView

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            linearLayout {
                mFadeInButton = button("FadeIn").lparams(width = 0, weight = 1F)
                mFadeOutButton = button("FadeOut").lparams(width = 0, weight = 1F)
            }

            mTextView = textView("FadeInしたり、FadeOutしたりします。") {
                textSize = 20F
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent) {
                topMargin = dip(10)
            }
        }
    }
}