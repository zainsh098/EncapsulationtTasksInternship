package com.example.encapsulationtasks
fun main() {
    val employee = Employee("Zain  Shakoor", "Software Engineer", 110000.0)
    employee.setSalary(6900000.0)
    println("Employee Name: ${employee.getName()}, " +
            "Employee Position: ${employee.getPosition()}, " +
            "Employee Salary: ${employee.getSalary()}")
}


//primary contructor
class Employee(private var name: String, private var position: String, private var salary: Double) {

    // method to get the employee name
    fun getName(): String {
        return name
    }

    // method to set the employee name
    fun setName(newName: String) {
        name = newName
    }

    // method to get the employee position
    fun getPosition(): String {
        return position
    }

    // method to set the employee position
    fun setPosition(newPosition: String) {
        position = newPosition
    }

    // method to get the employee salary
    fun getSalary(): Double {
        return salary
    }

    // method to set the employee's salary,
    fun setSalary(newSalary: Double) {
        if (newSalary > 0) { //check if salary is positive or negative
            salary = newSalary
        } else {
            println("Salary should be a positive value.")
        }
    }
}


