# Database

Some tasks are modified to use models that I've created in the previous task regarding Spring Core, but complexity of the tasks are should be same.

| # | Task | Modified task |
| :---: | :---: | :---: |
| 1 | Design database for CDP program. Your DB should store information about students (name, surname, date of birth, phone numbers, primary skill, created_datetime, updated_datetime etc.), subjects (subject name, tutor, etc.) and exam results (student, subject, mark). | Same, but replacing models to the Event, User and Ticket |
| 2 | Please add appropriate constraints (primary keys, foreign keys, indexes, etc.). | Same |
| 3 | Design such kind of database for PostrgeSQL. Show your design in some suitable way (PDF, PNG, etc). | Same |
| 4 | Try different kind of indexes (B-tree, Hash, GIN, GIST) for your fields. Analyze performance for each of the indexes (use ANALYZE and EXPLAIN). Check the size of the index. Try to set index before inserting test data and after. What was the time? | Same (But read my comment about that) |
| 5 | Add trigger that will update column updated_datetime to current date in case of updating any of student. | Same |
| 6 | Add validation on DB level that will check username on special characters (reject student name with next characters '@', '#', '$') | Same |
| 7 | Create snapshot that will contain next data: student name, student surname, subject name, mark (snapshot means that in case of changing some data in source table – your snapshot should not change) | Same |
| 8 | Create function that will return average mark for input user | Function to return user’s average place number |
| 9 | Create function that will return avarage mark for input subject name | Create a function that will return an average user name length
for the event by event’s name |
| 10 |  Create function that will return student at "red zone" (red zone means at least 2 marks <=3) | Create a function that will return users that have more than 5 tickets |

The main description of the work cotains in the [database-task.pdf](database-task.pdf).
