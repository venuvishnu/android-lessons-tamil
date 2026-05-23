package com.athisoft.lessons.lessons

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Variables() {

    /*
       val = value   - readonly (immutable)
       var = variable - changeable (mutable)
    */

    val name = "Athisoft"
    val year = 2026
    val mixed = "What is this year? $year $name"

    Text(name)
    Text(mixed)


    val nextYear = year + 1

    Text("Next Year is: $nextYear")

    /*
    //General Rules
    val 213Hello = "No"
    val textVariable = "Yes"
    val currentYear = "Yes"
    val a = "Yes"
    val myVar = "Yes"
    val myvar = "Yes"
    val myPlace = "Error"
    val var = "Error"

     */
}