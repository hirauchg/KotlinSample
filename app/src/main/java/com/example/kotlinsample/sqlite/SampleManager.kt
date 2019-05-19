package com.example.kotlinsample.sqlite

import android.content.Context
import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.db.select
import org.jetbrains.anko.db.update

class SampleManager(ctx: Context) {

    private val mDB = SampleDBHelper.getInstance(ctx)

    fun getSampleModelList(): List<SampleModel> {
        lateinit var sampleModelList: List<SampleModel>
        mDB.use {
            sampleModelList = select(SampleDBHelper.TABLE_SAMPLE).parseList(classParser())
        }
        return sampleModelList
    }

    fun insertSampleModel(name: String, age: Int) {
        mDB.use {
            insert(SampleDBHelper.TABLE_SAMPLE,
                SampleDBHelper.CULM_TEXT to name,
                SampleDBHelper.CULM_NUMBER to age)
        }
    }

    fun updateSampleModel(id: Int, name: String, age: Int) {
        mDB.use {
            update(SampleDBHelper.TABLE_SAMPLE,
                SampleDBHelper.CULM_TEXT to name,
                SampleDBHelper.CULM_NUMBER to age)
                .whereSimple(SampleDBHelper.CULM_ID + " = ?", id.toString()).exec()
        }
    }

    fun deleteSampleModel(id: Int) {
        mDB.use {
            delete(SampleDBHelper.TABLE_SAMPLE, SampleDBHelper.CULM_ID + " = ?", arrayOf(id.toString()))
        }
    }
}