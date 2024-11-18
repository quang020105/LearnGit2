package com.example.learngit

data class Student (
    private val name:String = "",
    val age:Int = 0
){
    fun getAge():Int{
        return age
    }
}