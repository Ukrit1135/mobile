package com.example.mobile.Homework1

fun main(){
    val height = 175.00f
    val weight = 93.54f
    println("""
        Height : $height
        Weight : $weight
        ----------------------------
        ${bmiFunction(height, weight)}
    """)
}

//height รับค่าจาก Functionmain ,height1 => ส่วนสูง(m) ,weight => น้ำหนักตัว(kg)
fun bmiFunction(height: Float,weight: Float): Float {
    val height1 = height/100.00f
    return weight/(height1*height1)
}