package com.athisoft.lessons.lessons.operators

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun ArithmeticOperators(){

    /* Arithmetic Operators */

    //Addition
    val tamil = 50
    val english = 20
    val total = tamil + english

    Text(
        fontSize = 30.sp,
        text = "Addition Result: $total"
    )

    //Subtraction
    val a = 10
    val b = 5
    val result = a - b

    Text(
        fontSize = 30.sp,
        text = "Subtraction Result: $result"
    )

    //Multiplication
    val ticketPrice = 100
    val ticket = 5
    val totalPrice = ticketPrice * ticket

    Text(
        fontSize = 30.sp,
        text = "Multiplication Result: $totalPrice"
    )

    //Division
    val chocolates = 12
    val friends = 3

    val eachPerson = chocolates / friends

    Text(
        fontSize = 30.sp,
        text = "Division Result: $eachPerson"
    )


    //Modulus

    val reminder = 10 % 3

    Text(
        fontSize = 30.sp,
        text = "Modulus Result: $reminder"
    )


    //Increment / Decrement

    var apple = 5
    var people = 5

    apple++

    people--

    val incrementResult = apple
    val decrementResult = people

    Text(
        fontSize = 30.sp,
        text = "Increment Result: $incrementResult"
    )

    Text(
        fontSize = 30.sp,
        text = "Decrement Result: $decrementResult"
    )

}