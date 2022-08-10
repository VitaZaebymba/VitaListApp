package com.example.vitalist.activities

import android.app.Application
import com.example.vitalist.db.MainDataBase

class MainApp : Application() {
    val database by lazy { MainDataBase.getDataBase(this) } //запуск бд
}