package com.example.learngit

data class Student (
    private val name:String = "",
    val age:Int = 0
){
    fun getName():String{
        return name
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }


}