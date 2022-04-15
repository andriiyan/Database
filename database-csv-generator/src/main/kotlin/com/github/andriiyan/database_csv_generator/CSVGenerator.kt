package com.github.andriiyan.database_csv_generator

import com.github.andriiyan.database_csv_generator.models.Event
import com.github.andriiyan.database_csv_generator.models.Ticket
import com.github.andriiyan.database_csv_generator.models.User
import java.io.File
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

private const val USER_ITEM_COUNT = 100_000
private const val EVENT_ITEM_COUNT = 1_000
private const val TICKET_ITEM_COUNT = 1_000_000

fun main() {
    val usersFile = File("db/users-test.csv")
    val ticketFile = File("db/ticket-test.csv")
    val eventFile = File("db/event-test.csv")

    val csvFileInfo = StringBuilder()

    repeat(USER_ITEM_COUNT) {
        csvFileInfo.append(
            User(
                id = it + 1,
                name = "name $it",
                email = "email$it@gmail.com",
                createdDate = ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME)
            ).toCSV()
        )
        csvFileInfo.append("\n")
    }

    writeIntoFile(usersFile, csvFileInfo)
    csvFileInfo.clear()

    repeat(EVENT_ITEM_COUNT) {
        csvFileInfo.append(
            Event(
                id = it + 1,
                title = "Title $it",
                date = ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME)
            ).toCSV()
        )
        csvFileInfo.append("\n")
    }

    writeIntoFile(eventFile, csvFileInfo)
    csvFileInfo.clear()

    repeat(TICKET_ITEM_COUNT) {
        csvFileInfo.append(
            Ticket(
                id = it + 1,
                eventId = it % EVENT_ITEM_COUNT + 1,
                userId = it % USER_ITEM_COUNT + 1,
                place = it,
                category = "Category $it"
            ).toCSV()
        )
        csvFileInfo.append("\n")
    }

    writeIntoFile(ticketFile, csvFileInfo)
    csvFileInfo.clear()

}

private fun writeIntoFile(file: File, stringBuffer: StringBuilder) {
    if (!file.exists() && !file.createNewFile()) {
        println("ERROR: Not able to create a file ${file.absolutePath}")
        return
    }

    file.bufferedWriter().use {
        it.write(stringBuffer.toString())
    }
    println("INFO: Data has been written to the file")
}