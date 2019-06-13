package com.example.kotlinsample.seekbar

import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.SeekBar
import android.widget.TextView
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onSeekBarChangeListener

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleActivityUI().setContentView(this)

        /*** kotlinのみでの実装 ***/
        findViewById<RelativeLayout>(R.id.container).apply {
            val textView = TextView(this@SampleActivity)
            textView.textSize = 18F
            val textViewParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
            textViewParams.addRule(RelativeLayout.CENTER_HORIZONTAL)
            textViewParams.setMargins(0, 20, 0, 0)
            addView(textView, textViewParams)

            val seekBar = SeekBar(this@SampleActivity).apply {
                progress = 5
                max = 10

                setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                        textView.text = progress.toString()
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {
                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {
                    }
                })
            }
            val seekBarParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
            seekBarParams.addRule(RelativeLayout.CENTER_IN_PARENT)
            addView(seekBar, seekBarParams)
        }

        /*** kotlin + Ankoでの実装 ***/
//        find<RelativeLayout>(R.id.container).apply {
//            val textView = textView().apply {
//                textSize = 18F
//
//                layoutParams = RelativeLayout.LayoutParams(wrapContent, wrapContent).apply {
//                    addRule(RelativeLayout.CENTER_HORIZONTAL)
//                    verticalMargin = dip(10)
//                }
//            }
//
//            seekBar().apply {
//                progress = 5
//                max = 10
//
//                onSeekBarChangeListener {
//                    onProgressChanged { seekBar, i, b ->
//                        textView.text = i.toString()
//                    }
//                }
//
//                layoutParams = RelativeLayout.LayoutParams(matchParent, wrapContent).apply {
//                    addRule(RelativeLayout.CENTER_IN_PARENT)
//                }
//            }
//        }
    }
}