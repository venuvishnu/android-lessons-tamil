package com.athisoft.lessons.lessons.operators

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun AssignmentOperators(){

    /*Assignment Operators*/

    //Basic Assignment Operator
    var name = "Athisoft"

    Text(
        fontSize = 20.sp,
        text = "Variable Result: $name"
    )


    //Addition Assignment +=
    var birds = 10

    birds += 5

    Text(
        fontSize = 20.sp,
        text = "Addition Assignment Result: $birds"
    )

    //Subtraction Assignment -=
    var candy = 10

    candy -= 2

    Text(
        fontSize = 20.sp,
        text = "Subtraction Assignment Result: $candy"
    )


    //Multiplication Assignment *=
    var stars = 20

    stars *= 5

    Text(
        fontSize = 20.sp,
        text = "Multiplication Assignment Result: $stars"
    )

    //Division Assignment /=
    var cars = 6

    cars /= 2

    Text(
        fontSize = 20.sp,
        text = "Division Assignment Result: $cars"
    )

    //Modulus Assignment %=

    var people = 9

    people %= 2

    Text(
        fontSize = 20.sp,
        text = "Modulus Assignment Result: $people"
    )


}