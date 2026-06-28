package com.athisoft.lessons

import android.util.Log

/*
In Kotlin, a constructor initializes a class instance, cleanly splitting into a concise primary constructor
in the class header and optional secondary constructors in the class body.
The primary constructor minimizes boilerplate by declaring and initializing properties simultaneously,
while any additional setup logic goes inside init blocks.
*/
class CarFactory {

    var carName: String = ""
    var maxSpeed: Int = 0

    constructor(name: String, speed: Int){
        this.carName = name
        this.maxSpeed = speed
    }


   init {
       Log.i("CarFactory", "Car Name: $carName, Car Speed: $maxSpeed")
   }

}