package com.example.vitalist.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "list_names")

data class ListNames(
    @PrimaryKey(autoGenerate = true)
    val id: Int?, //автоматический идентификатор первой колонны, null нужно
                //указывать для автоматичсекой гинерации
    @ColumnInfo (name = "name")
    val name: String,

    @ColumnInfo (name = "time") //время создания заметки
    val time: String,

    @ColumnInfo (name = "allItemCounter")//для сохранения кол-ва элементов в списке
    val allItemCounter: Int,

    @ColumnInfo (name = "checkedItemsCounter")//записываем, сколько уже выполнено
    val checkedItemsCounter: Int,

    @ColumnInfo (name = "itemsId")//идентификатор элементов, которые добавлены в список
    val itemsId: String,

): Serializable
