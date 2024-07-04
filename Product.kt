package com.example.encapsulationtasks

fun main() {
    // Creating a new variable and object  of the Product class with initial values
    val product = Product("Laptop", 1200.0)



    println("Name: ${product.getName()}") // Getting the name of the product
    println("Price: ${product.getPrice()}") // Getting the price of the product

    // Updating product details
    product.setName("Smartphone") // Setting a new name for the product
    product.setPrice(800.0) // Setting a new price for the product


    println("Name: ${product.getName()}") // Printing  the updated name of the product
    println("Price: ${product.getPrice()}") // Printing the updated price of the product
}

//   Primary Constructor
class Product(private var name: String, private var price: Double) {

    // Method to get the name of the product
    fun getName(): String {
        return name
    }

    // Method to set the name of the product
    fun setName(newName: String) {
        name = newName
    }

    // Method to get the price of the product
    fun getPrice(): Double {
        return price
    }

    // Method to set the price of the product, and to check if the new price is positive we have used if else
    fun setPrice(newPrice: Double) {
        if (newPrice > 0) {
            price = newPrice
        } else {
            println("Price should be a positive value.")
        }
    }
}
