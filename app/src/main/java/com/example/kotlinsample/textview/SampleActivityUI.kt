package com.example.kotlinsample.textview

import android.graphics.Color
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var mTextView: TextView

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            textView("デフォルトの表示")

            textView("文字サイズを20Fに変更") {
                textSize = 20F
            }

            textView("文字色を赤に変更") {
                textColor = Color.parseColor("#FF0000")

                setOnClickListener {
                    toast("タップされました。")
                }
            }

            mTextView = textView("動的に変更されます。")
        }
    }
}