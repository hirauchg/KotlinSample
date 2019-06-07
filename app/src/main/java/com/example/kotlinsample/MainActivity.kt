package com.example.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private val mUI = MainActivityUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mUI.setContentView(this)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        setUpView()
    }

    private fun setUpView() {
        val itemList = listOf(
            getString(R.string.anko_title),
            getString(R.string.menu_title),
            getString(R.string.back_title),
            getString(R.string.oss_title),
            getString(R.string.alert_title),
            getString(R.string.sqlite_title),
            getString(R.string.recyclerview_title),
            getString(R.string.viewpager_title),
            getString(R.string.menu_change_title),
            getString(R.string.alpha_animation_title),
            getString(R.string.textview_title),
            getString(R.string.edittext_title),
            getString(R.string.imageview_title),
            getString(R.string.button_title),
            getString(R.string.switch_title),
            getString(R.string.radiobutton_title),
            getString(R.string.mediarecorder_title)
        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList)

        val listView = mUI.mListView
        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> startActivity<com.example.kotlinsample.anko.SampleActivity>()
                1 -> startActivity<com.example.kotlinsample.menu.SampleActivity>()
                2 -> startActivity<com.example.kotlinsample.back.SampleActivity>()
                3 -> startActivity<com.example.kotlinsample.oss.SampleActivity>()
                4 -> startActivity<com.example.kotlinsample.alert.SampleActivity>()
                5 -> startActivity<com.example.kotlinsample.sqlite.SampleActivity>()
                6 -> startActivity<com.example.kotlinsample.recyclerview.SampleActivity>()
                7 -> startActivity<com.example.kotlinsample.viewpager.SampleActivity>()
                8 -> startActivity<com.example.kotlinsample.menu_change.SampleActivity>()
                9 -> startActivity<com.example.kotlinsample.alpha_animation.SampleActivity>()
                10 -> startActivity<com.example.kotlinsample.textview.SampleActivity>()
                11 -> startActivity<com.example.kotlinsample.edittext.SampleActivity>()
                12 -> startActivity<com.example.kotlinsample.imageview.SampleActivity>()
                13 -> startActivity<com.example.kotlinsample.button.SampleActivity>()
                14 -> startActivity<com.example.kotlinsample._switch.SampleActivity>()
                15 -> startActivity<com.example.kotlinsample.radiobutton.SampleActivity>()
                16 -> startActivity<com.example.kotlinsample.mediarecorder.SampleActivity>()
            }
        }

        listView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menu_app_info -> startActivity<AppInfoActivity>()
        }
        return super.onOptionsItemSelected(item)
    }
}
