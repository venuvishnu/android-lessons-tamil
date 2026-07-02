package com.athisoft.lessons.oop.dataclass



    /*
        /*
        Kotlin Data Class
        ----------------------
        */

        val user1 = User(1,"Athisoft","support@athisoft.in")
        val user2 = User(1,"Athisoft","support@athisoft.in")
        val user3 = User(1,"Venu","Venu@athisoft.in")

        val (id, name, email) = user3

            Log.i("DataClass", "$id")
            Log.i("DataClass", "$name")
            Log.i("DataClass", "$email")
    */

data class User(
    val id: Int,
    val name: String,
    val email: String
)