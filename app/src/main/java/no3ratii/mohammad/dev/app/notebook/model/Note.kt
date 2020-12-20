package no3ratii.mohammad.dev.app.notebook.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val title : String,
    val desc : String
)