package com.athisoft.lessons.oop.inheritance

import android.util.Log

open class Animal(val name: String){

    open fun sound(){
        Log.i("Inheritance", "$name makes a sound")
    }

}

class Dogz(name: String) : Animal(name){

    fun loyalty(){
        Log.i("Inheritance", "$name is Loyal to you!")
    }

    override fun sound(){
        Log.i("Inheritance", "$name barks")
    }

}

class Catz(name: String) : Animal(name){

    override fun sound(){
        Log.i("Inheritance", "$name meows")
    }

}