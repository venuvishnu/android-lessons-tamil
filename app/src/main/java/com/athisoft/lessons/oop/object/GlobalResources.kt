package com.athisoft.lessons.oop.`object`

import android.util.Log

/*
Kotlin Object
================
In Kotlin, an object is a special construct that represents a singleton — meaning only one instance of it exists throughout the program.
Unlike classes, you don’t need to instantiate it with new or MyClass().
The compiler automatically creates the instance the first time it’s accessed, and you can directly call its properties and functions.
This makes object declarations perfect for utility holders, global configurations, or shared resources where multiple instances would be unnecessary.
*/
object GlobalResources {

val username = "Athisoft"
val location = "Tamil Nadu"


fun logMyData(input: String){

    Log.i("MyObject", "Log function is called successfully!")
    Log.i("MyObject", "Data: $input ")

}


}