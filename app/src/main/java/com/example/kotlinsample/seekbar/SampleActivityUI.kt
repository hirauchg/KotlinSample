package com.example.kotlinsample.seekbar

import android.view.View
import com.example.kotlinsample.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onSeekBarChangeListener

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        relativeLayout {
            id = R.id.container

            /* Ankoでのレイアウト実装 */
//            val textView = textView {
//                textSize = 18F
//            }.lparams {
//                centerHorizontally()
//                topMargin = dip(20)
//            }
//
//            // SeekBarの実装
//            seekBar {
//                progress = 5 // 初期値
//                max = 10     // 最大値
//
//                // 操作イベントの実装
//                onSeekBarChangeListener {
//
//                    // 値が変更されたら呼ばれる
//                    onProgressChanged { seekBar, i, b ->
//                        textView.text = i.toString()
//                    }
//                }
//            }.lparams(matchParent, wrapContent) {
//                centerInParent()
//            }
        }
    }
}