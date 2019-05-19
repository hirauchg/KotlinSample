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
            getString(R.string.oss_title)
        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList)

        val listView = mUI.mListView
        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> startActivity<com.example.kotlinsample.anko.SampleActivity>()
                1 -> startActivity<com.example.kotlinsample.menu.SampleActivity>()
                2 -> startActivity<com.example.kotlinsample.back.SampleActivity>()
                3 -> startActivity<com.example.kotlinsample.oss.SampleActivity>()
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
