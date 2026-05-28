package com.athisoft.lessons.lessons.controlflow

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun IfElse(){

    //Example One
    val username = true
    val password = false

    if(username && password) {

        Text(
            fontSize = 20.sp,
            text = "Login is success"
        )

    } else {

        Text(
            fontSize = 20.sp,
            text = "Login is Failed"
        )

    }


    //Example 2
        //If Else Single Liner

    val a = 10
    val b = 20

    if (a == b) Text("A is Equal to B") else Text("A is not Equal to B")


    //Example 3

    val sunDay = false
    val specialDay = false

    var ticketCost = 0

    ticketCost = if (sunDay == true) {
        500
    } else {
        100
    }

    Text(
        fontSize = 20.sp,
        text = "Ticket Price is: $ticketCost"
    )


    //Example 4

    val sunDay1 = false
    val specialDay1 = true

    var ticketCost1 = 0

    if (sunDay1 == true){

        ticketCost1 = 500

    } else if(specialDay1 == true){

        ticketCost1 = 1000

    } else {

        ticketCost1 = 100

    }

    Text(
        fontSize = 20.sp,
        text = "Ticket Price is: $ticketCost1"
    )

}