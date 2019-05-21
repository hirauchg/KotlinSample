package com.example.kotlinsample.alpha_animation

import android.os.Bundle
import android.view.animation.AlphaAnimation
import com.example.kotlinsample.BaseActivity
import org.jetbrains.anko.setContentView

class SampleActivity : BaseActivity() {

    private val mUI = SampleActivityUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mUI.setContentView(this)

        mUI.mFadeInButton.setOnClickListener {
            fadeIn()
        }

        mUI.mFadeOutButton.setOnClickListener {
            fadeOut()
        }
    }

    private fun fadeIn() {
        val fadeIn = AlphaAnimation(0F, 1F)
        fadeIn.startOffset = 500
        fadeIn.duration = 1000
        fadeIn.fillAfter = true

        mUI.mTextView.startAnimation(fadeIn)
    }

    private fun fadeOut() {
        val fadeOut = AlphaAnimation(1F, 0F)
        fadeOut.startOffset = 500
        fadeOut.duration = 1000
        fadeOut.fillAfter = true

        mUI.mTextView.startAnimation(fadeOut)
    }
}