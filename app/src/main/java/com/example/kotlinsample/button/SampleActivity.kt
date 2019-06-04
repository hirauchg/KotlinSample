package com.example.kotlinsample.button

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.find
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleActivityUI().setContentView(this)

        /* 動的実装用
        val parent = find<LinearLayout>(R.id.Container)

        val btn1 = Button(this).apply {
            text = "ボタン１"
            setOnClickListener {
                toast("ボタン１がタップされました。")
            }
        }

        val btn2 = Button(this).apply {
            text = "ボタン２"
            setOnClickListener {
                toast("ボタン２がタップされました。")
            }
        }

        val btn3 = Button(this).apply {
            text = "ボタン１とボタン２を無効化します。"
            setOnClickListener {
                btn1.isClickable = false
                btn2.isEnabled = false
            }
        }
        
        parent.addView(btn1)
        parent.addView(btn2)
        parent.addView(btn3)
        */
    }
}