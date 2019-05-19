package com.example.kotlinsample.menu

import android.widget.TextView
import com.example.kotlinsample.R
import org.jetbrains.anko.*

class MenuActivityUI : AnkoComponent<MenuActivity> {

    override fun createView(ui: AnkoContext<MenuActivity>) = with(ui) {
        verticalLayout {
            textView(R.string.menu_title) {
                textSize = 20F
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent) {
                topMargin = dip(10)
            }
        }
    }
}