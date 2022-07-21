package com.example.mobile.Homework1

fun main(){
    val money = 8680
    calculatorFunction(money)
}

//money : Int => รับค่า money จาก mainFunction
fun calculatorFunction(money : Int) {

    var m1000 = 0           //แบงค์ 1000
    var m500 = 0            //แบงค์ 500
    var m100 = 0            //แบงค์ 100
    var m50 = 0             //แบงค์ 50
    var m20 = 0             //แบงค์ 20
    var money1 = money     //โยงค่าให้อยู่ใน Function

    if(money1 >= 1000){
        m1000 = money1/1000
        money1 %=1000
    }
    if(money1 >= 500){
        m500 = money1/500
        money1%=500
    }
    if(money1 >= 100){
        if(m1000 or m500 == 0 ){
            m50 = money1/50
            money1%=50
        }else{
            m100 = money1 / 100
            money1 %= 100
        }
    }
    if(money1 >= 50){
        if(money1 % 20 != 0){
            m50 = money1/50
            money1%=50
        }
    }
    if(money1 >= 20){
        m20 = money1/20
        money1%=20
    }
    println("""
        money : $money
        ---------------
        1000 => $m1000
        500  => $m500
        100  => $m100
        50   => $m50
        20   => $m20
    """)
}