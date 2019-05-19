package com.example.kotlinsample.menu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast

class MenuActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MenuActivityUI().setContentView(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menu_1 -> toast(R.string.menu_menu_1)
            R.id.menu_2 -> toast(R.string.menu_menu_2)
            R.id.menu_3 -> toast(R.string.menu_menu_3)
        }
        return super.onOptionsItemSelected(item)
    }
}