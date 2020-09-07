package com.alpha.apps.relam.db.model

import io.realm.Realm
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Novel(

    @PrimaryKey
    var id: Int = 0,
    var title: String = "",
    var dateTime: String = ""

) : RealmObject()