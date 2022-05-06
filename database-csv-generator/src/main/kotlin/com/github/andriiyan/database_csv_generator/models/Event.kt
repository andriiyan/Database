package com.github.andriiyan.database_csv_generator.models

data class Event(
    val id: Int,
    val title: String,
    val date: String,
    val createdDate: String? = null,
    val updatedDate: String? = null
) : CSVModel {
    override fun toCSV(): String = "$id,$title,$date,$createdDate,$updatedDate"
}
