package com.example.kotlinsample._switch

import android.view.View
import com.example.kotlinsample.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onCheckedChange
import org.jetbrains.anko.sdk27.coroutines.onClick

class SampleActivityUI : AnkoComponent<SampleActivity> {

    override fun createView(ui: AnkoContext<SampleActivity>): View = with(ui) {
        verticalLayout {
            id = R.id.container

            /* Ankoでのレイアウト実装 */
//            val switch = switch {
//                onCheckedChange { buttonView, isChecked ->
//                    if (isChecked) {
//                        toast("ONになりました。")
//                    } else {
//                        toast("OFFになりました。")
//                    }
//                }
//            }.lparams(width = wrapContent)
//
//            button("スイッチの状態を切り替える") {
//                onClick {
//                    switch.isChecked = !switch.isChecked
//                }
//            }
        }
    }
}