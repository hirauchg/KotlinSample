package com.example.kotlinsample.checkbox

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.setContentView

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleActivityUI().setContentView(this)

        /*** kotlinのみでの実装 ***/
        findViewById<LinearLayout>(R.id.container).apply {
            val checkBox1 = CheckBox(this@SampleActivity)
            checkBox1.text = "ボタン１"
            addView(checkBox1)

            val checkBox2 = CheckBox(this@SampleActivity)
            checkBox2.text = "ボタン２"
            addView(checkBox2)

            val checkBox3 = CheckBox(this@SampleActivity)
            checkBox3.text = "ボタン３"
            addView(checkBox3)

            val textView = TextView(this@SampleActivity)
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.setMargins(0, 10, 0, 10)
            addView(textView, params)

            val button = Button(this@SampleActivity)
            button.text = "確定ボタン"
            button.setOnClickListener {
                var checkedBoxStrings = ""
                if (checkBox1.isChecked) checkedBoxStrings += (checkBox1.text.toString())
                if (checkBox2.isChecked) checkedBoxStrings += (checkBox2.text.toString())
                if (checkBox3.isChecked) checkedBoxStrings += (checkBox3.text.toString())

                textView.text = checkedBoxStrings
            }
            addView(button)
        }


        /*** kotlin + Ankoでの実装 ***/
//        val parent = find<LinearLayout>(R.id.container).apply {
//            val checkBox1 = checkBox("ボタン１")
//            val checkBox2 = checkBox("ボタン２")
//            val checkBox3 = checkBox("ボタン３")
//
//            val textView = textView()
//            val params = LinearLayout.LayoutParams(wrapContent, wrapContent)
//            params.verticalMargin = dip(10)
//            textView.layoutParams = params
//
//            val button = button("確定ボタン")
//            button.onClick {
//                var checkedBoxStrings = ""
//                if (checkBox1.isChecked) checkedBoxStrings += (checkBox1.text.toString())
//                if (checkBox2.isChecked) checkedBoxStrings += (checkBox2.text.toString())
//                if (checkBox3.isChecked) checkedBoxStrings += (checkBox3.text.toString())
//
//                textView.text = checkedBoxStrings
//            }
//        }
    }
}