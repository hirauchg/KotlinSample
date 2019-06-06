package com.example.kotlinsample.radiobutton

import android.view.View
import android.widget.RadioButton
import com.example.kotlinsample.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onCheckedChange

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            id = R.id.container

            /* Ankoでのレイアウト実装 */
//            radioGroup {
//
//                radioButton {
//                    id = R.id.radiobutton_1
//                    text = "ラジオボタン１"
//                }
//
//                radioButton {
//                    id = R.id.radiobutton_2
//                    text = "ラジオボタン２"
//                }
//
//                radioButton {
//                    id = R.id.radiobutton_3
//                    text = "ラジオボタン３"
//                }
//
//                check(R.id.radiobutton_2)
//
//                onCheckedChange { group, checkedId ->
//                    val radioButton = find<RadioButton>(checkedId)
//                    toast(radioButton.text)
//                }
//            }
        }
    }
}