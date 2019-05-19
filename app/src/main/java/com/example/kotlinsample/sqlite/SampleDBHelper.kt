package com.example.kotlinsample.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.*

class SampleDBHelper(ctx: Context) : ManagedSQLiteOpenHelper(ctx, DB_SAMPLE, null, DB_VERSION) {

    companion object {
        const val DB_SAMPLE = "db_sample"
        const val DB_VERSION = 1

        const val TABLE_SAMPLE = "table_sample"

        const val CULM_ID = "id"
        const val CULM_TEXT = "text"
        const val CULM_NUMBER = "number"

        private var instance: SampleDBHelper? = null

        @Synchronized
        fun getInstance(ctx: Context): SampleDBHelper {
            if (instance == null) {
                instance = SampleDBHelper(ctx.getApplicationContext())
            }
            return instance!!
        }
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.createTable(
            TABLE_SAMPLE, true,
            CULM_ID to INTEGER + PRIMARY_KEY + UNIQUE,
            CULM_TEXT to TEXT,
            CULM_NUMBER to INTEGER)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}