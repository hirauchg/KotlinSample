package com.example.kotlinsample.imageview

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import com.example.kotlinsample.R
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            textView("ScaleType　：　指定なし")
            imageView(R.drawable.soccer_ball) {
                backgroundColor = Color.parseColor("#CCCCCC")
            }.lparams(width = dip(200), height = dip(100)) {
                bottomMargin = dip(10)
            }

            textView("ScaleType　：　FIT_XY")
            imageView(R.drawable.soccer_ball) {
                backgroundColor = Color.parseColor("#CCCCCC")
                scaleType = ImageView.ScaleType.FIT_XY
            }.lparams(width = dip(200), height = dip(100)) {
                bottomMargin = dip(10)
            }

            textView("ScaleType　：　CENTER_CROP")
            imageView(R.drawable.soccer_ball) {
                backgroundColor = Color.parseColor("#CCCCCC")
                scaleType = ImageView.ScaleType.CENTER_CROP
            }.lparams(width = dip(200), height = dip(100)) {
                bottomMargin = dip(10)
            }

            textView("ScaleType　：　FIT_CENTER")
            imageView(R.drawable.soccer_ball) {
                backgroundColor = Color.parseColor("#CCCCCC")
                scaleType = ImageView.ScaleType.FIT_CENTER

                setOnClickListener {
                    toast("クリックされました。")
                }
            }.lparams(width = dip(200), height = dip(100))
        }
    }
}