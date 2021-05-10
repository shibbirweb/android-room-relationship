package me.shibbir.roomrelationship.entities.realations

import androidx.room.Embedded
import androidx.room.Relation
import me.shibbir.roomrelationship.entities.Director
import me.shibbir.roomrelationship.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)