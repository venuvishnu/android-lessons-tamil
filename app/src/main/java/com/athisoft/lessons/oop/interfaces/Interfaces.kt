package com.athisoft.lessons.oop.interfaces

import android.util.Log

interface Drivable{
    val maxSpeed: Int
    fun drive()

    fun stop(){
        Log.i("Interface", "Car is Stopped.")
    }
}

interface MusicPlayable{
    fun playMusic()
}


class Car(
    override val maxSpeed: Int
) : Drivable, MusicPlayable {

    override fun drive(){
        Log.i("Interface", "Car is driving at speed of $maxSpeed")
    }

    override fun playMusic() {
        Log.i("Interface", "Playing Music!")
    }

    override fun stop(){
        Log.i("Interface", "Car saying It doesn't want to stop.")
    }
}