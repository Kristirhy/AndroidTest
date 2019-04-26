package com.example.androidtest.data.data_model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Book (
    var judul : String = "",
    var penulis : String = "",
    var penerbit : String = "",
    var email : String = "",
    var facebook : String = "",
    var twitter : String = "",
    @PrimaryKey(autoGenerate = true) var id : Int = 0
    )