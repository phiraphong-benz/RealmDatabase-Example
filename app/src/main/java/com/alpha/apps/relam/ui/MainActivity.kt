package com.alpha.apps.relam.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alpha.apps.relam.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        savedInstanceState.let {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.contentContainer, MainFragment.newInstance())
                .commit()
        }


//
//        val novel = Novel()
//        novel.id = 1
//        novel.title = " รักนี้ไม่เสื่อมศรัทธา"
//        novel.dateTime = "16/02/63"
//
//        Realm.init(this)
//
//        val realm = Realm.getDefaultInstance()
//
//        val realmConfig = RealmConfiguration.Builder().build()
//        Realm.setDefaultConfiguration(realmConfig)
//
//        realm.beginTransaction()
//        realm.insertOrUpdate(novel)
//
//
//        realm.commitTransaction()
//
//        val result = realm.where(Novel::class.java)
//            .contains("title", "รักนี้ไม่เสื่อมศรัทธา")
//            .findAll()
//
//
//        Log.d("RESULT", "" +    result[0]?.id)
//
    }
}