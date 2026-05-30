package com.athisoft.lessons.lessons.controlflow

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun ForLoop() {

        /*
        Kotlin - For Loop
        =================
        In Kotlin, a for loop is used to repeat (iterate) code for
        each item in a sequence.

        Syntax: for (item in collection) { ... }
         */

        //Example One

        val ninjas = listOf("Naruto", "Madara", "Minato", "Hinata", "Sasuke")

        var howManyTimesRepeated = 0

        for (ninja in ninjas) {

            Text(
                fontSize = 20.sp,
                text = "Ninja's Name: $ninja"
            )

            howManyTimesRepeated++
        }

        Text(
            fontSize = 20.sp,
            text = "How many times it repeated: $howManyTimesRepeated"
        )

        //Example Two

        for(i in 10 downTo 1){

            Text(
                fontSize = 20.sp,
                text = "My Current Value: $i"
            )

        }

}