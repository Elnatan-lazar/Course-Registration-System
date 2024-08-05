# Course Registration System

## Overview

This project is a simple course registration system that uses object-oriented design principles and design patterns. The system allows students to register for courses, where only certain roles (Lecturers and Practitioners) can create courses. Additionally, it includes an Observer pattern implementation to notify students when a course becomes available if it's initially full.

## Features

- **Singleton Pattern**: Ensures that only one instance of the `CourseFactory` is used for creating courses.
- **Factory Pattern**: Provides a way to create different types of courses (`Mandatory`, `Non-Mandatory`, `Seminar`) through a factory method.
- **Null Object Pattern**: Uses a `NullStudent` class to handle cases where a student object might be null.
- **Observer Pattern**: Allows students to register for notifications if a course they are interested in becomes available.

## Classes

- **`Course`**: Represents a course with methods to add students, manage course capacity, and notify observers.
- **`Lecturer`**: A role that can create mandatory courses.
- **`Practitioner`**: A role that can create non-mandatory courses.
- **`Student`**: Represents a student who can register for courses.
- **`StudentObserver`**: An observer that gets notified when a course becomes available.
- **`CourseFactory`**: A singleton factory for creating courses.
- **`NullStudent`**: A null object representing a student with default values.

## Usage

1. **Creating Courses**

    You can create different types of courses using the `CourseFactory`:

    ```java
    CourseFactory factory = CourseFactory.getInstance();
    Course mandatoryCourse = factory.createOrGetCourse("mandatory", 1, "Mandatory Course");
    Course nonMandatoryCourse = factory.createOrGetCourse("nonmandatory", 2, "Non-Mandatory         Course");
    Course seminarCourse = factory.createOrGetCourse("seminar", 3, "Seminar Course");


2. **Adding Students**
    Students can be added to a course if there is space. If the course is full, students can         register for notifications:

    ```java
    Course course = new Course("Math", 30);
    Student student = new Student("Alice");
    try {
        course.add(student);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }


3. **Observer Pattern**
    To notify students when a course becomes available:
    
    1.Create a StudentObserver and register it with the course.
    2.Simulate adding students and check if notifications are triggered:
    ```java
    Course course = new Course("Math", 30);
    StudentObserver observer = new StudentObserver("Bob");

    course.addObserver(observer);
    course.addStudent(); // This will notify observers if there is space available


## Contributions are welcome! Please fork the repository and submit a pull request with your changes.

License
This project is licensed under the MIT License - see the LICENSE file for details.

