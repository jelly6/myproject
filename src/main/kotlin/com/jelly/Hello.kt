package com.jelly

fun main(args: Array<String>) {
//    println("Hello, Kotlin")
    val h =Human()
    h.hello()
}

class Human{
    fun hello(){//no void
        println("Hello,kotlin")
    }
}