package com.example.kotlinsample.edittext

import android.text.InputFilter
import android.text.InputType
import android.view.View
import org.jetbrains.anko.*

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            editText {
                filters = arrayOf(InputFilter.LengthFilter(5))
            }

            editText("初期値を指定できます。") {
                maxLines = 5
            }

            editText {
                hint = "ヒントを指定できます。"
            }

            editText {
                inputType = InputType.TYPE_CLASS_NUMBER
            }

            val passwordEditText = editText {
                inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_VARIATION_PASSWORD
            }

            button("パスワードの表示") {
                setOnClickListener {
                    val password = passwordEditText.text.toString()
                    if (password.isEmpty()) {
                        toast("パスワードを入力してください。")
                    } else {
                        toast(password)
                    }
                }
            }
        }
    }
}