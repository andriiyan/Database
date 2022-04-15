package com.github.andriiyan.database_csv_generator.models

data class Ticket(
    val id: Int,
    val eventId: Int,
    val userId: Int,
    val category: String,
    val place: Int,
    val createdDate: String? = null,
    val updatedDate: String? = null
) : CSVModel {
    override fun toCSV(): String = "$id,$eventId,$userId,$place,$category,$createdDate,$updatedDate"
}
