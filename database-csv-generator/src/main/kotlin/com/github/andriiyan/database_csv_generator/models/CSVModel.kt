package com.github.andriiyan.database_csv_generator.models

interface CSVModel {
    fun toCSV(): String
}