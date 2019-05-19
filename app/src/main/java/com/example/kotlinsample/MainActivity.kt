package com.example.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.kotlinsample.anko.AnkoActivity
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
            getString(R.string.anko_title)
        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList)

        val listView = mUI.mListView
        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> startActivity<AnkoActivity>()
            }
        }

        listView.adapter = adapter
    }
}
