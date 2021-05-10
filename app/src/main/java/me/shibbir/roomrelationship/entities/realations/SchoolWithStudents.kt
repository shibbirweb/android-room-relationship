package me.shibbir.roomrelationship.entities.realations

import androidx.room.Embedded
import androidx.room.Relation
import me.shibbir.roomrelationship.entities.School
import me.shibbir.roomrelationship.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName",
    )
    val students: List<Student>
)
