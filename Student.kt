package com.example.encapsulationtasks


fun main(){

// variable of student class
    val student=Student()
    student.setGrade("A") //setting grades
    println(student.getGrade())// getting grades


    student.setName("Zain") //setting name
println(student.getName()) //getting name




}


class Student() {
    private lateinit var name: String //lateinit var for later initialization
    private var grade: String="" // private var for grade



 // getter and setter methods
    //grade of type string
    fun getGrade(): String {

        return grade

    }

    fun setGrade(grade: String) {
// checking Or operator to check the valid grades
        if (grade == "A" || grade == "B" || grade == "C" || grade == "D" || grade == "F") {

            this.grade = grade
        }

        else{

            println("The grade is not Valid Error ")

        }
    }


    fun getName(): String {

        return name
    }
    fun setName(name: String) {
        this.name = name

    }




}