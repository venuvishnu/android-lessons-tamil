package com.athisoft.lessons.lessons

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun StringTemplates(){

    //String Templates

    val name = "Athisoft"
    val year = 2026

    Text(
        fontSize = 20.sp,
        text = "Hi $name,"
    )

    Text(
        fontSize = 20.sp,
        text = "What's the next year? ${year + 1}"
    )

}