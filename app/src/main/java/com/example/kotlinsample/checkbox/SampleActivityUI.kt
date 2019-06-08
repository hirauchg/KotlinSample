package com.example.kotlinsample.checkbox

import android.view.View
import com.example.kotlinsample.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            id = R.id.container

            /* Ankoでのレイアウト実装 */
//            val checkBox1 = checkBox("ボタン１")
//            val checkBox2 = checkBox("ボタン２")
//            val checkBox3 = checkBox("ボタン３")
//
//            val textView = textView().lparams {
//                verticalMargin = dip(10)
//            }
//
//            button("確定ボタン") {
//                onClick {
//                    var checkedBoxStrings = ""
//                    if (checkBox1.isChecked) checkedBoxStrings += (checkBox1.text.toString())
//                    if (checkBox2.isChecked) checkedBoxStrings += (checkBox2.text.toString())
//                    if (checkBox3.isChecked) checkedBoxStrings += (checkBox3.text.toString())
//
//                    textView.text = checkedBoxStrings
//                }
//            }
        }
    }
}