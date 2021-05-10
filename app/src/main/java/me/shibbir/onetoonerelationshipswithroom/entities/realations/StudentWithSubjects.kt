package me.shibbir.onetoonerelationshipswithroom.entities.realations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import me.shibbir.onetoonerelationshipswithroom.entities.Student
import me.shibbir.onetoonerelationshipswithroom.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)
