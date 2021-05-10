package me.shibbir.roomrelationship.entities.realations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import me.shibbir.roomrelationship.entities.Student
import me.shibbir.roomrelationship.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)
