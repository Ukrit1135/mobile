package com.example.mobile.Homework1

fun main() {
    print("Enter your working hours : ")
    //รับเวลาชั่วโมงทำงาน
    val time1 = readLine()!!.toIntOrNull()
    //กัน error จากการไม่ใส่ตัวเลข
    println("---------------------------")
    if (time1 == null) {
        println("Please enter your working hours!!!")
    }else
        CalsalaryFunction(time1)
}

fun CalsalaryFunction (time1:Int) {
    var salary : Int = if(time1 <= 40){
        time1*100
    }else
        ((time1-40)*150)+4000

    println("Result : $salary")
}