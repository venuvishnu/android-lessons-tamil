package com.athisoft.lessons.oop.abstractclass

import android.util.Log

abstract class Animal(val name: String){

    abstract fun makeSound()

    fun sleep(){
        Log.i("Abstract", "$name is Sleeping...")
    }

}

interface Behavior{
    fun loyalty()
}


class Dog(name: String) : Animal(name), Behavior {

    override fun makeSound() {
        Log.i("Abstract", "$name is Barking!")
    }

    override fun loyalty() {
        TODO("Not yet implemented")
    }

}

class Cat(name: String) : Animal(name) {

    override fun makeSound() {
        Log.i("Abstract", "$name is Meowing!")
    }

}