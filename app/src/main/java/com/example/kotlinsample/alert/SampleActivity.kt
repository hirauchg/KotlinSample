package com.example.kotlinsample.alert

import android.os.Bundle
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.*

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ui = SampleActivityUI()
        ui.setContentView(this)

        ui.mButton1.setOnClickListener {
            alert("メッセージ") {
                title = "タイトル"
            }.show()
        }

        ui.mButton2.setOnClickListener {
            alert("メッセージ") {
                title = "タイトル"

                yesButton {
                    // OKボタンタップ時の処理を記述する
                }

                noButton {
                    // OKボタンタップ時の処理を記述する
                    // 何も記述しなかった場合は、ダイアログが閉じるだけ
                }
            }.show()
        }

        ui.mButton3.setOnClickListener {
            alert("メッセージ") {
                title = "タイトル"

                positiveButton("YES") {
                }

                negativeButton("NO") {
                }
            }.show()
        }

        ui.mButton4.setOnClickListener {
            alert("メッセージ") {
                title = "タイトル"

                customView {
                    verticalLayout {
                        padding = dip(16)

                        textView("テキスト").lparams(width = matchParent) {
                            bottomMargin = dip(10)
                        }

                        editText().lparams(width = matchParent) {
                            bottomMargin = dip(10)
                        }

                        switch().lparams {
                            bottomMargin = dip(10)
                        }

                        radioGroup {
                            linearLayout {
                                radioButton().setText("radio1")
                                radioButton().setText("radio2")
                                radioButton().setText("radio3")
                            }
                        }
                    }
                }

                yesButton {}
                noButton {}
            }.show()
        }
    }
}