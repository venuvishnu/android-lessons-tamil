package com.athisoft.lessons.lessons.operators

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun ComparisonOperator() {

    /*
    Comparison Operators
    =====================
    Comparison Operator only return a boolean value either 'True' or 'False'
    */

    //Equal to ==
    val apple = 10
    val orange = 5
    val mango = 10

    val result = apple == mango

    Text(
        fontSize = 20.sp,
        text = "Is it Equal?: $result"
    )


    //Not Equal to !=
    val ants = 10
    val bats = 5
    val cats = 10

    val result2 = ants != bats

    Text(
        fontSize = 20.sp,
        text = "Is it Not Equal?: $result2"
    )


    //Greater Than >
    val mouse = 10
    val dogs = 5
    val bear = 10

    val result3 = 15 > 5

    Text(
        fontSize = 20.sp,
        text = "Is it Greater Than?: $result3"
    )


    //Less Than <
    val result4 = 9 < 10

    Text(
        fontSize = 20.sp,
        text = "Is it Less Than?: $result4"
    )


    //Greater Than or Equal To >=
    val result5 = 14 >= 15

    Text(
        fontSize = 20.sp,
        text = "Is it Greater Than or Equal To?: $result5"
    )

    //Less Than or Equal To <=
    val result6 = 15 <= 10

    Text(
        fontSize = 20.sp,
        text = "Is it Less Than or Equal To?: $result6"
    )

}