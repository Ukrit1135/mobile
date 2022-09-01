package com.example.mobile.Homework1

fun main() {
    print("Enter Number No.1 : ")
    val num1 = readLine()!!.toIntOrNull()
    print("Enter Number No.2 : ")
    val num2 = readLine()!!.toIntOrNull()
    print("Enter Number No.3 : ")
    val num3 = readLine()!!.toIntOrNull()

        CalvalueFunction(num1!!,num2!!,num3!!)
}

fun CalvalueFunction(num1:Int, num2:Int, num3:Int) {
    val sum1 = num1+num2
    val sum2 = num1+num3
    val sum3 = num2+num3
    when{
        sum1>sum2 -> {
            println("Position : 1 and 2")
            //todo
        }
        sum2>sum3 -> {
            println("Position : 1 and 3")
            //todo
        }
        else -> {
            println("Position : 2 and 3")
            //todo
        }
    }
//    if(sum1 > sum2) {
//        println("Position : 1 and 2")
//    }else if(sum2 > sum3) {
//        println("Position : 1 and 3")
//    }else println("Position : 2 and 3")
}