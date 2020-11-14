package com.example.uts_android

class BusinessLogic {
    var result=0.0

    fun hitungAngka(p:Int, l:Int): Int {
        this.result= (p+l).toDouble()
        return p+l
    }
}