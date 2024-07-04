package com.example.encapsulationtasks

fun main() {

    //making object of car class
    val car = Car("Toyota", "Corolla", 50000)
    car.setMileage(60000)// setting new milage


    car.setMake("Honda Civic ")
    println("Car: ${car.getMake()} ")

    println("Model ${car.getModel()}")
    println("Mileage: ${car.getMileage()}")


}

//making primary constructor here

class Car(private var make: String, private var model: String, private var mileage: Int) {

    // method to get the car's make
    fun getMake(): String {
        return make
    }

    // method to set the car's make
    fun setMake(newMake: String) {
        make = newMake
    }

    // method to get the car's model
    fun getModel(): String {
        return model
    }

    // method to set the car's model
    fun setModel(newModel: String) {
        model = newModel
    }

    // method to get the car's mileage
    fun getMileage(): Int {
        return mileage
    }

    // method to set the car's mileage, and check if it's negative or positive
    fun setMileage(newMileage: Int) {
        if (newMileage >= 0) { //condition for  new milage value to be positive
            mileage = newMileage
        } else {
            println("Mileage cannot be negative.")
        }
    }
}


