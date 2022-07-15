package com.example.mobile.Homework1

fun main(){
    val point = 72
    println("""
All Point : $point
----------------------""")
    pointFunction(point)
}

//point1 => รับค่า point จาก mainFunction
fun pointFunction(point1 : Int){
    //ส่งค่ากลับไปหา Function main
    return(
        //เทียบหาเกรด
        when (point1) {
            in 0..49 -> {               // 0-49
                println("Grade F")
                //todo
            }
            in 50..54 -> {              // 50-54
                println("Grade D")
                //todo
            }
            in 55..59 -> {              // 55-59
                println("Grade D+")
                //todo
            }
            in 60..64 -> {              // 60-64
                println("Grade C")
                //todo
            }
            in 65..69 -> {              // 65-69
                println("Grade C+")
                //todo
            }
            in 70..74 -> {              // 70-74
                println("Grade B")
                //todo
            }
            in 75..79 -> {              // 75-79
                println("Grade B+")
                //todo
            }
            else -> {                   // ไม่ตรงกับกรณีใด
                println("Grade A")
                //todo
            }
        }
    )

}