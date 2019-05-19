package com.example.kotlinsample.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.AnkoContext

class SampleAdapter(val mListener: SampleAdapterListener): RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

    interface SampleAdapterListener {
        fun onClickCard(position: Int)
        fun onClickDelete(position: Int)
    }

    private val mUI = SampleAdapterUI()
    private var mSampleModelList = listOf<SampleModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(mUI.createView(AnkoContext.create(parent.context, parent)))
    }

    override fun getItemCount(): Int {
        return mSampleModelList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mSampleModelList.get(position)

        holder.card.setOnClickListener {
            mListener.onClickCard(position)
        }

        holder.delete.setOnClickListener {
            mListener.onClickDelete(position)
        }

        holder.name.text = item.name
    }

    fun setSampleModelList(sampleModelList: List<SampleModel>) {
        mSampleModelList = sampleModelList
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val card: LinearLayout = mUI.mCard
        val name: TextView = mUI.mName
        val delete: ImageView = mUI.mDelete
    }
}