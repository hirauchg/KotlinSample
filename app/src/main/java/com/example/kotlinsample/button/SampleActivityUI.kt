package com.example.kotlinsample.button

import android.view.View
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {

            /* 動的実装用
            id = R.id.Container
            */

            val btn1 = button("ボタン１") {
                setOnClickListener {
                    toast("ボタン１がタップされました。")
                }
            }

            val btn2 = button("ボタン２") {
                setOnClickListener {
                    toast("ボタン２がタップされました。")
                }
            }

            button("ボタン１とボタン２を無効化します。") {
                setOnClickListener {
                    btn1.isClickable = false
                    btn2.isEnabled = false
                }
            }
        }
    }
}