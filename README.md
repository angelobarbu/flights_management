# flights_management

University project that consists in implementing a GUI application using a visual programming language and a database for a flights' management situation in an airport.

GUI application was implemented using Java and Java Swing toolkit. The database was created using SQL Server. The connection to the database was created using the driver
SQL Server JDBC Driver 9.4.0 downloaded from https://docs.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver15

Login to the application using the following credentials
username: sa
password: serveradmin

The project consists in multiple JFrames connected to each other using JButtons.

There are JFrames that INSERT into, UPDATE or DELETE from a particular table.
There are also JFrames that send ordinary queries(based on INNER JOIN) to the database, but also queries that include subqueries(mostly SELECT subquery).

The principle of SELECT queries is pretty straightforward: we connect to the database using Connection and DriverManager packages from java.sql.
Then, we create a statement to that connection and we execute the query. The result set is then added to an array list that is then used to fill the JTable with the
result from the database. The principle is similar for the INSERT, UPDATE and DELETE operations for the database.
