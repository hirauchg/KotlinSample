package com.example.kotlinsample

import android.widget.ListView
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.listView
import org.jetbrains.anko.verticalLayout

class MainActivityUI : AnkoComponent<MainActivity> {

    lateinit var mListView: ListView

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            mListView = listView()
        }
    }
}