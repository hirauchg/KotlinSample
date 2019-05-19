package com.example.kotlinsample

import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import org.jetbrains.anko.browse
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class AppInfoActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ui = AppInfoActivityUI()
        ui.setContentView(this)

        val version = packageManager.getPackageInfo(packageName, 0).versionName

        val listView = ui.mListView
        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> browse("https://hirauchi-genta.com/app/kotlinsample")
                1 -> browse("https://hirauchi-genta.com/privacy")
                2 -> startActivity<OssLicensesMenuActivity>("title" to getString(R.string.app_info_oss))
                3 -> toast(version)
            }
        }

        val itemList = listOf(
            getString(R.string.app_info_site),
            getString(R.string.app_info_privacy),
            getString(R.string.app_info_oss),
            getString(R.string.app_info_version))
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList)
        listView.adapter = adapter
    }

}