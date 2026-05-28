package com.athisoft.lessons.lessons.controlflow

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun WhenExample(){

    //Kotlin: When - as Expression Also with argument     Example 1

    val day = 5

    val result = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }


    Text(
        fontSize = 20.sp,
        text = "Day as Word: $result"
    )



        /*
        Kotlin When  - Without Argument also as Statement
        =============
        */

    val age = 10

    when {
        age < 13 -> Text("Child")
        age < 18 -> {
            Text("Teen")
            Text("I am second")
        }
        else -> Text("Adult")
    }

}