package com.example.kotlinsample.menu_change

import android.view.View
import android.widget.ToggleButton
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var mMenuAllChangeBtn: ToggleButton
    lateinit var mMenuPartChangeBtn: ToggleButton // 追加

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            mMenuAllChangeBtn = toggleButton()
            mMenuPartChangeBtn = toggleButton() // 追加
        }
    }
}