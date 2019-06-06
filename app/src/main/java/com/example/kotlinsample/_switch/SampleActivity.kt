package com.example.kotlinsample._switch

import android.app.ActionBar
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.Toast
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.find
import org.jetbrains.anko.sdk27.coroutines.onCheckedChange
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast
import org.jetbrains.anko.wrapContent

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleActivityUI().setContentView(this)

        /*** kotlin + Ankoでの実装 ***/
        val parent = find<LinearLayout>(R.id.container)

        val switch = Switch(this)
        switch.onCheckedChange { buttonView, isChecked ->
            if (isChecked) {
                toast("ONになりました。")
            } else {
                toast("OFFになりました。")
            }
        }

        val button = Button(this)
        button.setText("スイッチの状態を切り替える")
        button.onClick {
            switch.isChecked = !switch.isChecked
        }

        parent.addView(switch, LinearLayout.LayoutParams(wrapContent, wrapContent))
        parent.addView(button)


        /*** kotlinのみでの実装 ***/
//        val parent = findViewById<LinearLayout>(R.id.Container)
//
//        val switch = Switch(this)
//        switch.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//                Toast.makeText(this, "ONになりました。", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "OFFになりました。", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        val button = Button(this)
//        button.setText("スイッチの状態を切り替える")
//        button.setOnClickListener {
//            switch.isChecked = !switch.isChecked
//        }
//
//        parent.addView(switch, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
//        parent.addView(button)
    }
}