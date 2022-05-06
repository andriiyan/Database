package com.github.andriiyan.database_csv_generator.models

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val createdDate: String? = null,
    val updatedDate: String? = null
) : CSVModel {
    override fun toCSV(): String = "$id,$name,$email,$createdDate,$updatedDate"
}
