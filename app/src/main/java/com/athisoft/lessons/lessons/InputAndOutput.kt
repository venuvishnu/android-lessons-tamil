package com.athisoft.lessons.lessons

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp

@Composable
fun InputAndOutput(){

    //Input & Output Basic

    var year by remember { mutableStateOf("") }

    TextField(
        value = year,
        onValueChange = {year = it},
        label = {Text("Enter Your Year")}
    )

    Text(
        fontSize = 20.sp,
        text = year
    )

}