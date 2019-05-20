package com.example.kotlinsample.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoContext

class SampleFragment : Fragment() {

    val mUI = SampleFragmentUI()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return mUI.createView(AnkoContext.create(inflater.context, this, false))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val text = arguments?.getString("key")
        mUI.mTextView.text = text
        super.onViewCreated(view, savedInstanceState)
    }
}