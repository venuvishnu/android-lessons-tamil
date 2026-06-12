package com.athisoft.lessons.lessons.functions

import android.util.Log
import androidx.compose.runtime.Composable
import kotlin.concurrent.thread

@Composable
fun HigherOrder(){

    /*
   Higher-order Functions
   =======================
   A higher-order function is any function that either takes one or
   more functions as arguments, returns a function as its result, or both

   ::      Function Reference Operator
   */


    calculateMe(10,10){ result ->
        Log.d("Result", "Addition Result: $result")
    }

}

fun calculateMe(firstOperand: Int, secondOperand: Int, calculateCallback:(result: Int) -> Unit){

    val addition = firstOperand + secondOperand
    calculateCallback(addition)
}





//fetchUserFromDatabase() { name ->
//    Log.d("MainCode","Hi, $name")
//}


fun fetchUserFromDatabase(onResult: (name:String) -> Unit) {

    //Simulate Network Operation
    thread {
        Thread.sleep(5000)
        val username = "Athisoft"

        onResult(username)
    }

    Log.d("MainCode","Program continues running")
}

fun showGreetings(name: String){
    Log.d("MainCode","Hi, $name")
}
