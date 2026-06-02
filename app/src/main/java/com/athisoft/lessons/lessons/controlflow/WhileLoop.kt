package com.athisoft.lessons.lessons.controlflow

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun WhileLoop(){

    /*
    While Loop
    ============
    Loops can execute a block of code as long as a specified condition is reached.
    When the condition is false, the loop stops.
    */

    //Example One

/*
    var count = 0

    while(count < 30){
        count++

        Text(
            fontSize = 20.sp,
            text = "Current Value $count"
        )

        if (count == 25) break

    }

    Text(
        fontSize = 20.sp,
        text = "While loop ended at: $count"
    )

    */


    // Example 2


    var count = 0

    while(count < 10){
        count++

        if (count == 5) {
            continue
        }

        Text(
            fontSize = 20.sp,
            text = "Current Value $count"
        )

    }

    Text(
        fontSize = 20.sp,
        text = "While loop ended at: $count"
    )


}