package com.example.kotlinsample.mediarecorder

import android.media.MediaPlayer
import android.media.MediaRecorder
import android.os.Bundle
import android.os.Environment
import com.example.kotlinsample.BaseActivity
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.setContentView
import java.io.File
import java.io.IOException
import java.lang.Exception

class SampleActivity : BaseActivity() {

    private val mFilePath = Environment.getExternalStorageDirectory().path + "/sample.wav"

    lateinit var mMediaRecorder: MediaRecorder
    lateinit var mMediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = SampleActivityUI()
        ui.setContentView(this)

        ui.apply {
            startRecord.onClick {
                startRecord()
            }

            stopRecord.onClick {
                stopRecord()
            }

            startPlay.onClick {
                startPlayer()
            }

            stopPlay.onClick {
                stopPlayer()
            }
        }
    }

    private fun startRecord() {
        val wavFile = File(mFilePath)
        if (wavFile.exists()) {
            wavFile.delete()
        }

        try {
            mMediaRecorder = MediaRecorder()
            mMediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC)
            mMediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT)
            mMediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT)
            mMediaRecorder.setOutputFile(mFilePath)

            mMediaRecorder.prepare()
            mMediaRecorder.start()
        } catch(e: Exception){
            e.printStackTrace()
        }
    }

    private fun stopRecord() {
        try {
            mMediaRecorder.stop()
            mMediaRecorder.reset()
            mMediaRecorder.release()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun startPlayer() {
        try {
            mMediaPlayer = MediaPlayer()
            mMediaPlayer.setDataSource(mFilePath)
            mMediaPlayer.prepare()
            mMediaPlayer.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun stopPlayer() {
        try {
            mMediaPlayer.stop()
            mMediaPlayer.prepare()
            mMediaPlayer.release()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}