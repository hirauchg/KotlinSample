package com.example.kotlinsample.recyclerview

import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.kotlinsample.R
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class SampleAdapterUI : AnkoComponent<ViewGroup> {

    lateinit var mCard: LinearLayout
    lateinit var mName: TextView
    lateinit var mDelete: ImageView

    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        cardView {
            cardElevation = dip(3).toFloat()
            radius = 8F
            setContentPadding(25,20,25,20)
            lparams(width = matchParent, height = wrapContent) {
                horizontalMargin = dip(10)
                verticalMargin = dip(5)
            }

            mCard = linearLayout {
                mName = textView {
                    textSize = 20F
                }.lparams(width = 0, weight = 1F)

                mDelete = imageView(R.drawable.ic_delete) {
                    scaleType = ImageView.ScaleType.FIT_CENTER
                }.lparams(width = 44, height = 44) {
                    gravity = Gravity.CENTER_VERTICAL
                }
            }
        }
    }
}