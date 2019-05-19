package com.example.kotlinsample.sqlite

import android.widget.Button
import android.widget.ListView
import com.example.kotlinsample.R
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var mInsertButton: Button
    lateinit var mUpdateButton: Button
    lateinit var mDeleteButton: Button
    lateinit var mListView: ListView

    override fun createView(ui: AnkoContext<SampleActivity>) = with(ui) {
        verticalLayout {
            linearLayout {
                mInsertButton = button(R.string.sqlite_button_insert)
                mUpdateButton = button(R.string.sqlite_button_update)
                mDeleteButton = button(R.string.sqlite_button_delete)
            }

            mListView = listView()
        }
    }
}