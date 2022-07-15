package com.example.mobile.Homework1

fun main(){
    val money = 350
    calculatorFunction(money)
}

//money1 => รับค่า money จาก mainFunction
fun calculatorFunction(money1 : Int) {

    var m1000 = 0           //แบงค์ 1000
    var m500 = 0            //แบงค์ 500
    var m100 = 0            //แบงค์ 100
    var m50 = 0             //แบงค์ 50
    var m20 = 0             //แบงค์ 20
    var money2 = money1     //โยงค่าให้อยู่ใน Function

    if(money2 >= 1000){
        m1000 = money2/1000
        money2 %=1000
    }
    if(money2 >= 500){
        m500 = money2/500
        money2%=500
    }
    if(money2 >= 100){
        if(money1 == 100){
            m50 = money2/50
            money2%=50
        }else{
            m100 = money2 / 100
            money2 %= 100
        }
    }
    if(money2 >= 50){
        m50 = money2/50
        money2%=50
    }
    if(money2 >= 20){
        m20 = money2/20
        money2%=20
    }

    println("""
        money : $money1
        ---------------
        1000 => $m1000
        500  => $m500
        100  => $m100
        50   => $m50
        20   => $m20
    """)

}