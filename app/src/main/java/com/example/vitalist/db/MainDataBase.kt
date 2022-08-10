package com.example.vitalist.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.vitalist.entities.Library
import com.example.vitalist.entities.ListItem
import com.example.vitalist.entities.ListNames
import com.example.vitalist.entities.NoteItem

@Database (entities = [Library::class, ListItem::class, ListNames::class, NoteItem::class], version = 1)
abstract class MainDataBase : RoomDatabase () {

    abstract  fun getDao(): Dao

    companion object {
        @Volatile
        private  var INSTANCE: MainDataBase? = null
        fun getDataBase(context: Context): MainDataBase {
            return  INSTANCE ?: synchronized(this) { //на случай, если несколько потоков одновременно используют создание бд
                val instance = Room.databaseBuilder(context.applicationContext, //переменная, в которой будем создавать бд
                    MainDataBase::class.java, "vita_list.db").build()
                instance
            }
        }
    }
}