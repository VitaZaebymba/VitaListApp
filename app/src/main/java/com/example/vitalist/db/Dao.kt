package com.example.vitalist.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.vitalist.entities.NoteItem
import kotlinx.coroutines.flow.Flow



//DAO - Data Access Object, класс, с помощью которого получаем доступ к бд, запись, чтение
@Dao
interface Dao {
    @Query ("SELECT * FROM note_list")
    fun getAllNotes(): Flow<List<NoteItem>> //получаем все заметки без фильтрации
    //Flow - специальный класс, который будет подключать нашу бд к нашему списку и втоматически всё обновлять
    @Insert
    suspend fun insertNote(note: NoteItem) //функция запускается внутри корутины, поэтому suspend
}