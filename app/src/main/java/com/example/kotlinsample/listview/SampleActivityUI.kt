package com.example.kotlinsample.listview

import android.view.View
import android.widget.ListView
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    // SampleActivityから参照するためにクラス変数で宣言しておく
    lateinit var mListView: ListView

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {

            // ListViewの実装
            mListView = listView()
        }
    }
}