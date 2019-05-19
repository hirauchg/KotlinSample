package com.example.kotlinsample.oss

import android.os.Bundle
import com.example.kotlinsample.BaseActivity
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ui = SampleActivityUI()
        ui.setContentView(this)

        ui.mButton.setOnClickListener {
            startActivity<OssLicensesMenuActivity>("title" to "オープンソースライセンス")
        }
    }
}