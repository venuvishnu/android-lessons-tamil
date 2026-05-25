package com.athisoft.lessons.lessons.operators

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun LogicalOperators() {

    /*
    Logical Operators
    ====================
    Logical operators are used to determine the logic between variables or values.
    These Operator only return a boolean value either 'True' or 'False'.
    */

    //Logical AND  &&      - Return true if both statements are true

    val userName = true
    val password = false

    val checkIfBothInputFilled = userName && password


    Text(
        fontSize = 20.sp,
        text = "Is User Filled both Inputs?: $checkIfBothInputFilled"
    )

    val ifBothStatementsAreTrue = 10 == 10 && 10 >= 10

    Text(
        fontSize = 20.sp,
        text = "If both Statement are True?: $ifBothStatementsAreTrue"
    )


    //Logical OR ||     - Return true if one of the statements are true
    val sunday = false
    val monday = false

    val soGoingOut = sunday || monday

    Text(
        fontSize = 20.sp,
        text = "So are we going outing or not?: $soGoingOut"
    )


    //Logical Not !    - Reverse the result, returns false if the result is true

    val confession = false

    val logicalNot = !confession

    Text(
        fontSize = 20.sp,
        text = "Do you love me?: $logicalNot"
    )

}