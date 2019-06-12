package com.example.kotlinsample.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.kotlinsample.BaseActivity
import org.jetbrains.anko.sdk27.coroutines.onItemClick
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast

class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = SampleActivityUI()
        ui.setContentView(this)

        // テストデータの作成
        val itemList = listOf("アイテム１", "アイテム２", "アイテム３", "アイテム４", "アイテム５")

        // ListViewのAdapterを設定
        ui.mListView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList)

        // タップイベントの実装
        // onItemClick(AdapterView<?> parent, View view, int position, long id)
        ui.mListView.onItemClick { p0, p1, p2, p3 ->

            // p2(タップされたリストのposition)でitemListからどのリストがタップされたかを取得し、トーストで表示
            toast(itemList.get(p2))
        }

        // Kotlinでのタップイベントの実装
//        ui.mListView.setOnItemClickListener { parent, view, position, id ->
//            タップ時の処理
//        }
    }
}