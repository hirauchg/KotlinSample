package com.example.kotlinsample.recyclerview

import android.os.Bundle
import com.example.kotlinsample.BaseActivity
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast

class SampleActivity : BaseActivity(), SampleAdapter.SampleAdapterListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ui = SampleActivityUI()
        ui.setContentView(this)

        // テストデータ
        val sampleModelList = arrayListOf<SampleModel>()
        for (i in 0..20) {
            val sampleModel = SampleModel(i, "SampleModel" + i)
            sampleModelList.add(sampleModel)
        }

        val adapter = SampleAdapter(this)
        adapter.setSampleModelList(sampleModelList)
        ui.mRecyclerView.adapter = adapter
    }

    override fun onClickCard(position: Int) {
        toast("onClickCard : " + position)
    }

    override fun onClickDelete(position: Int) {
        toast("onClickDelete : " + position)
    }
}