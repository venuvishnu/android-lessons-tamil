package com.athisoft.lessons.oop.`class`

import android.util.Log

class CarFactoryZ {

    /*
Classes
======
A class in Kotlin is a blueprint or template used to create objects.
It defines the data (properties) and actions (functions) that
objects will have. For example, a Car class can define properties
like brand and speed, and functions like drive().
Objects are the actual instances created from the class.
*/

//    val producedCar = CarFactory()
//
//    producedCar.car()
//    producedCar.car(name = "BMW", newColor = "White", newSeats = 4)
//    producedCar.car("TATA", "Black",6)


    val carName = ""
    val color = "Black"
    val seats = 2

    fun car(name: String = carName, newColor: String = color, newSeats: Int = seats){

        Log.i("Cars", "Car Name = $name, Color = $newColor, Seats = $newSeats")

    }

}