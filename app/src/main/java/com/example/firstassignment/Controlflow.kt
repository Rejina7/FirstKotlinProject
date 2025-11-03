package com.example.firstassignment

fun main() {
    val day = 3

    when(day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4,5 -> println("Thursday or Friday")
        in 6..7 -> println("Weekend")
        else -> println("Invalid day")
    }
}

