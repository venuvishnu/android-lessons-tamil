package com.athisoft.lessons.lessons.functions

import android.util.Log
import androidx.compose.runtime.Composable
import com.athisoft.lessons.calculateMe

@Composable
fun HigherOrder(){

    /*
   Higher-order Functions
   =======================
   A higher-order function is any function that either takes one or
   more functions as arguments, returns a function as its result, or both
   */


    calculateMe(10,10){ result ->
        Log.d("Result", "Addition Result: $result")
    }

}

fun calculateMe(firstOperand: Int, secondOperand: Int, calculateCallback:(result: Int) -> Unit){

    val addition = firstOperand + secondOperand
    calculateCallback(addition)
}