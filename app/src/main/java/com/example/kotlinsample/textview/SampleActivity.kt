package com.example.kotlinsample.textview

import android.graphics.Color
import android.os.Bundle
import com.example.kotlinsample.BaseActivity
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.textColor

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = SampleActivityUI()
        ui.setContentView(this)

        ui.mTextView.setOnClickListener {
            ui.mTextView.text = "変更されました。"
            ui.mTextView.textSize = 20F
            ui.mTextView.textColor = Color.parseColor("#0000FF")
        }
    }
}