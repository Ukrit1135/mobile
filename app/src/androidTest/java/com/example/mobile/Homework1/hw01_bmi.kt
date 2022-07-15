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

//hei1 => ส่วนสูง(cm) ,hei2 => ส่วนสูง(m) ,wei => น้ำหนักตัว(kg)
fun bmiFunction(hei1: Float,wei: Float): Float {
    val hei2 = hei1/100.00f
    return wei/(hei2*hei2)
}