# Thomas Travels Automation System

## Overview

Thomas Travels Automation System is a Core Java console-based application developed to manage and process driver information.

The project demonstrates the use of Object-Oriented Programming, arrays, methods, constructors, encapsulation, iterative searching, filtering, and basic business logic.

## Technologies Used

* Java
* Core Java
* Object-Oriented Programming (OOP)
* Arrays
* Iterative Search
* Scanner for user input

## Key Features

* Check whether a driver belongs to the Car category.
* Retrieve driver details using Driver ID.
* Count drivers belonging to a specific category.
* Retrieve all drivers belonging to a specific category.
* Find the driver who has travelled the maximum distance.
* Menu-driven execution with multiple operations in a single run.
* Exit the application using the Exit option.

## OOP Concepts Demonstrated

The project uses a class-based structure to organize driver data and application logic.

### Classes and Objects

The application uses separate classes such as:

* `Driver` — stores driver-related information.
* `Travel` — contains the business logic and driver operations.
* `Test` — handles user input and program execution.

### Encapsulation

Driver fields are kept private and accessed through getter methods.

### Constructors

Driver objects are created using a constructor with driver details such as:

* Driver ID
* Driver Name
* Category
* Total Distance Travelled

### Methods

Different methods are used to perform specific operations such as searching by ID, counting by category, filtering drivers, and finding the maximum distance travelled.

## Data Structures

A `Driver[]` array is used to store multiple Driver objects.

The application processes the array using iterative loops to search, count, filter, and compare driver information.

## Searching and Data Processing

The application implements iterative searching techniques to:

* Find a driver using Driver ID.
* Count drivers based on category.
* Retrieve drivers belonging to a particular category.
* Compare total distances to identify the driver with the maximum distance travelled.

## Menu Operations

The application provides the following operations:

```text
1. Check if driver is a Car driver
2. Retrieve driver by ID
3. Count drivers by category
4. List drivers by category
5. Find driver with maximum distance travelled
6. Exit
```

The menu runs repeatedly, allowing multiple operations to be performed during a single execution.

## Project Structure

```text
ThomasTravels/
└── src/
    └── com/
        ├── Driver.java
        ├── Travel.java
        └── Test.java
```

## How to Run

1. Clone the repository.
2. Open the project in Eclipse or another Java IDE.
3. Configure the required Java JDK.
4. Run `Test.java`.
5. Enter the number of drivers.
6. Enter the required driver details.
7. Select an operation from the menu.
8. Choose option `6` to exit.

## Learning Outcomes

This project demonstrates practical understanding of:

* Core Java
* Object-Oriented Programming
* Encapsulation
* Classes and Objects
* Constructors
* Arrays of Objects
* Methods
* Loops
* Conditional Statements
* Iterative Searching
* Data Filtering
* Basic Business Logic
* Menu-driven applications

## Author

**Akarsh Reddy**
