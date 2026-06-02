package com.athisoft.lessons.lessons.controlflow

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun BreakContinue(){

    /*
    Kotlin Break and Continue
    =========================
    */


    //    Example 1

/*    var number = 0

    while (number < 10) {

        number++

        Text(
            fontSize = 20.sp,
            text = "$number"
        )

        if (number == 5) break

    }*/

    //    Example 2

    var number = 0

    while (number < 10) {

        number++

        if (number == 3){
            continue
        }


        Text(
            fontSize = 20.sp,
            text = "$number"
        )

    }

    Text(
        fontSize = 20.sp,
        text = "I am from Outside Loop"
    )


    //    Example 3

    //Break on For Loop
    for (i in 1..10) {
        if (i == 5) {
            break   // stop the loop at 5
        }
        Text("Break - Current Value $i")
    }

    //Continue on For Loop
    for (i in 1..5) {
        if (i == 3) {
            continue   // skip 3
        }
        Text("Continue - Current Value $i")
    }

}