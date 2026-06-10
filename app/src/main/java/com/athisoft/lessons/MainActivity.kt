package com.athisoft.lessons

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
                Column(modifier = Modifier.padding(padding)) {

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
            }


        }
    }
}

fun calculateMe(firstOperand: Int, secondOperand: Int, calculateCallback:(result: Int) -> Unit){

    val addition = firstOperand + secondOperand
    calculateCallback(addition)
}
