package me.shibbir.onetoonerelationshipswithroom.entities.realations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import me.shibbir.onetoonerelationshipswithroom.entities.Student
import me.shibbir.onetoonerelationshipswithroom.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)
