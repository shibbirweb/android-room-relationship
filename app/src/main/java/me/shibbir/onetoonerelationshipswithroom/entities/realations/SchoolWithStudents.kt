package me.shibbir.onetoonerelationshipswithroom.entities.realations

import androidx.room.Embedded
import androidx.room.Relation
import me.shibbir.onetoonerelationshipswithroom.entities.School
import me.shibbir.onetoonerelationshipswithroom.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName",
    )
    val students: List<Student>
)
