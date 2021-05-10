package me.shibbir.onetoonerelationshipswithroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import me.shibbir.onetoonerelationshipswithroom.entities.Director
import me.shibbir.onetoonerelationshipswithroom.entities.School
import me.shibbir.onetoonerelationshipswithroom.entities.Student
import me.shibbir.onetoonerelationshipswithroom.entities.Subject
import me.shibbir.onetoonerelationshipswithroom.entities.realations.StudentSubjectCrossRef

@Database(
    entities = [
        School::class,
        Student::class,
        Director::class,
        Subject::class,
        StudentSubjectCrossRef::class
    ],
    version = 1
)
abstract class SchoolDatabase : RoomDatabase() {

    abstract val schoolDao: SchoolDao

    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}