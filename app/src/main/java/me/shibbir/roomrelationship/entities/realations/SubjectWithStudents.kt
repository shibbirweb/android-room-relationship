package me.shibbir.roomrelationship.entities.realations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import me.shibbir.roomrelationship.entities.Student
import me.shibbir.roomrelationship.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)
