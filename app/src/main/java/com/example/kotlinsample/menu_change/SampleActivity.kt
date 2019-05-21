package com.example.kotlinsample.menu_change

import android.os.Bundle
import android.view.Menu
import com.example.kotlinsample.BaseActivity
import com.example.kotlinsample.R
import org.jetbrains.anko.setContentView

class SampleActivity : BaseActivity() {

    val mUI = SampleActivityUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mUI.setContentView(this)

        mUI.mMenuAllChangeBtn.setOnCheckedChangeListener { _, _ ->
            invalidateOptionsMenu()
        }

        mUI.mMenuPartChangeBtn.setOnCheckedChangeListener { _, _ ->
            invalidateOptionsMenu()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (mUI.mMenuAllChangeBtn.isChecked) {
            menuInflater.inflate(R.menu.menu_change_1, menu)
        } else {
            menuInflater.inflate(R.menu.menu_change_2, menu)
        }

        menu?.findItem(R.id.menu_change_1_item_1)?.isVisible = mUI.mMenuPartChangeBtn.isChecked
        menu?.findItem(R.id.menu_change_2_item_1)?.isVisible = mUI.mMenuPartChangeBtn.isChecked
        return super.onCreateOptionsMenu(menu)
    }
}