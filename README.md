# Table-Number-Spring
Table Number

This is a project using Spring-Boot and Spring MVC Architecture with API to add a number from 0 to the specified number in the database. 

This Project is very much compatible to work in a multithreaded environment where the number is inserted by multiple threads at the same time. 
 
Entity class in the project is defined as TableNumber.java

Dao Layer is defined and extending the JPA repository class from the org.springframework.data.jpa.repository.JpaRepository package.

TableServiceImpl.java is the Service Layer implementing the TableService Interface containing the business Logic for the application and @Autowired annotation is being 
used for dependency injection between Service Layer and Dao Layer.

The method addFunction(T t) is responsible for saving the numbers in the database from 0 to the entered number in the request. The method is synchronized so that the database should be consistent
in a multi-threaded environment. Conditions are being handled in the method if the table is empty or the number is already present in the database etc.

Controller Class is defined as TableController.java and @PostMapping(value="/addnumber") is being used on the method addnumber(@RequestBody T t) for handler mapping 

Before running the project make sure to run create-db.sql in your local database server and also change the database related configruation in application.properties under src/main/resource

Once the project is running, by default the server port is 8080 ( if not changed in application.properties). so using a jmeter or postman you can make a POST request
using the API "http://localhost:8080/addnumber".

For the POST Request you can pass your request body as the JSON object as below - 

{
"tableNumber" : number
}

You can change the number to the desired integer value and from 0 to number will be stored in the MySQL database.

Added a .jmx file for load testing using Jmeter test-plan, I have tested the application using 10000 threads and 5000 threads, although I have gone through an error of JavaOutofMemory error which can be due to the limit set by Operating System, but after load testing the second time without changing the number the database result is consistent in case of 'n' number of threads.
