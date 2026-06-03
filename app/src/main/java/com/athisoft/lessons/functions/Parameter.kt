package com.athisoft.lessons.functions

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun Parameter(){

    /*
    Kotlin: Functions with Parameters
    ===================================
    */


/*
//    Example 1

    //Parameter
    fun greetings(name: String, year: Int){

        Log.d("Greetings", "Hello, $name and year is $year")

    }

    //Argument
    greetings("Venu", 2026)

*/

//    Example 2



    fun calculate(firstOperand : Int, secondOperand : Int) : Int {

        return firstOperand + secondOperand
    }


    val result = calculate(5, 10)

    Text(
        fontSize = 20.sp,
        text = "Result of the Calculation: $result"
    )


}