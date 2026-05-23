package com.athisoft.lessons.lessons

import androidx.compose.runtime.Composable

@Composable
fun DataTypes() {

    //Integer - up to 10 digit
    val money : Int = 1000000000

    //Long  - up to 19 digit
    val bigMoney : Long = 100000000000000

    //String
    val bigText : String = "Lengthy................. Text"

    //Boolean
    val isThisOnline : Boolean = false

    //Character
    val myLetter : Char = '3'

    //Float
    val weight : Float = 10.2f

    //Double
    val bigWeight : Double = 10.20

}