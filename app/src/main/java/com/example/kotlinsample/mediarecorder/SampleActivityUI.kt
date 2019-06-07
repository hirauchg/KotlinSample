package com.example.kotlinsample.mediarecorder

import android.widget.Button
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.button
import org.jetbrains.anko.verticalLayout

class SampleActivityUI : AnkoComponent<SampleActivity> {

    lateinit var startRecord: Button
    lateinit var stopRecord: Button
    lateinit var startPlay: Button
    lateinit var stopPlay: Button

    override fun createView(ui: AnkoContext<SampleActivity>) = with(ui) {
        verticalLayout {
            startRecord = button("録音開始")
            stopRecord = button("録音終了")
            startPlay = button("再生開始")
            stopPlay = button("再生終了")
        }
    }
}