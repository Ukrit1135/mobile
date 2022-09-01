package com.example.mobile.Homework1

fun main() {
    print("Enter millisecond : ")
    val timemilli = readLine()!!.toLongOrNull()
    CaltimerFunction(timemilli!!)
}

fun CaltimerFunction (timemilli:Long) {
    var timemilli1 : Long = timemilli
    var milli1: Long = 0
    var second1 : Long = 0
    var minute1 : Long = 0
    var hour1 : Long = 0
    var day1 : Long = 0
    var month1 : Long = 0
    var year1 : Long = 0

    if(timemilli1>=1000){
         milli1= timemilli1%1000
        timemilli1 /= 1000

        if(timemilli1>=60){
            second1 = timemilli1%60
            timemilli1 /= 60

            if(timemilli1>=60){
                minute1 = timemilli1%60
                timemilli1 /= 60

                if(timemilli1>=24){
                    hour1 = timemilli1%24
                    timemilli1 /= 24

                    if(timemilli1>=30){
                        day1 = timemilli1%30
                        timemilli1 /= 30

                        if(timemilli1>=12){
                            month1 = timemilli1%12
                            timemilli1 /= 12

                            if(timemilli1>=1){
                                year1 = timemilli1%1
                            }
                        }
                    }
                }
            }
        }
    }else
        milli1 = timemilli1
    println("""
-----------------------------
Year        : $year1
Month       : $month1
Day         : $day1
Hour        : $hour1
minute      : $minute1
second      : $second1
millisecond : $milli1
    """)
}