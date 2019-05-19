package com.example.kotlinsample.sqlite

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.kotlinsample.BaseActivity
import org.jetbrains.anko.setContentView

class SampleActivity : BaseActivity() {

    lateinit var mSampleManager: SampleManager
    lateinit var mListView: ListView

    private var mUI = SampleActivityUI()
    private var mSampleModelList = listOf<SampleModel>()
    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mUI.setContentView(this)

        mListView = mUI.mListView


        // SampleManagerの生成
        mSampleManager = SampleManager(this)
        loadList()

        // insert
        mUI.mInsertButton.setOnClickListener {
            mSampleManager.insertSampleModel("SampleModel-" + mCount, mCount)
            mCount++
            loadList()
        }

        // update
        mUI.mUpdateButton.setOnClickListener {
            if (mSampleModelList.isNotEmpty()) {
                mSampleManager.updateSampleModel(mSampleModelList.first().id, "SampleModel-" + mCount, mCount)
                mCount++
                loadList()
            }
        }

        // delete
        mUI.mDeleteButton.setOnClickListener {
            if (mSampleModelList.isNotEmpty()) {
                mSampleManager.deleteSampleModel(mSampleModelList.first().id)
                loadList()
            }
        }
    }

    // select
    private fun loadList() {
        mSampleModelList = mSampleManager.getSampleModelList()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mSampleModelList)
        mListView.adapter = adapter
    }
}