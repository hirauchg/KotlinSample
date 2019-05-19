package com.example.kotlinsample.recyclerview

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var mRecyclerView: RecyclerView

    override fun createView(ui: AnkoContext<SampleActivity>) = with(ui) {
        verticalLayout {
            mRecyclerView = recyclerView {
                layoutManager = LinearLayoutManager(ctx, LinearLayoutManager.VERTICAL, false)
            }.lparams(width = matchParent) {
                topMargin = dip(5)
            }
        }
    }
}