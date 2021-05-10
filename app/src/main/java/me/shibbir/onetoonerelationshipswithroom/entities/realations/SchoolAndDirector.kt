package me.shibbir.onetoonerelationshipswithroom.entities.realations

import androidx.room.Embedded
import androidx.room.Relation
import me.shibbir.onetoonerelationshipswithroom.entities.Director
import me.shibbir.onetoonerelationshipswithroom.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)