package com.athisoft.lessons.lessons.controlflow

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun Ranges(){

    //Example 1

    for ( chars in 'a' .. 'z' ) {

        Text(
            fontSize = 20.sp,
            text = "$chars"
        )

    }

    //Example 2

    for (number in 10..30) {

        Text(
            fontSize = 20.sp,
            text = "$number"
        )

    }



}