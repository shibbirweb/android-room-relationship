package me.shibbir.onetoonerelationshipswithroom

import androidx.room.*
import me.shibbir.onetoonerelationshipswithroom.entities.Director
import me.shibbir.onetoonerelationshipswithroom.entities.School
import me.shibbir.onetoonerelationshipswithroom.entities.Student
import me.shibbir.onetoonerelationshipswithroom.entities.realations.SchoolAndDirector
import me.shibbir.onetoonerelationshipswithroom.entities.realations.SchoolWithStudents

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>
}