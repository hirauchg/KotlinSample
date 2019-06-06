package com.example.kotlinsample.radiobutton

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.setContentView

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleActivityUI().setContentView(this)

        /*** kotlinのみでの実装 ***/
        val parent = findViewById<LinearLayout>(R.id.container)

        val radioButton1 = RadioButton(this).apply {
            id = R.id.radiobutton_1
            text = "ラジオボタン１"
        }

        val radioButton2 = RadioButton(this).apply {
            id = R.id.radiobutton_2
            text = "ラジオボタン２"
        }

        val radioButton3 = RadioButton(this).apply {
            id = R.id.radiobutton_3
            text = "ラジオボタン３"
        }

        val radioGroup = RadioGroup(this).apply {
            addView(radioButton1)
            addView(radioButton2)
            addView(radioButton3)

            check(R.id.radiobutton_2)
            setOnCheckedChangeListener { group, checkedId ->
                val radioButton = findViewById<RadioButton>(checkedId)
                Toast.makeText(this@SampleActivity, radioButton.text, Toast.LENGTH_SHORT).show()
            }
        }

        parent.addView(radioGroup)


        /*** kotlin + Ankoでの実装 ***/
//        find<LinearLayout>(R.id.container).apply {
//            radioGroup {
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
//
//                check(R.id.radiobutton_2)
//                setOnCheckedChangeListener { group, checkedId ->
//                    val radioButton = findViewById<RadioButton>(checkedId)
//                    toast(radioButton.text)
//                }
//            }
//        }
    }
}