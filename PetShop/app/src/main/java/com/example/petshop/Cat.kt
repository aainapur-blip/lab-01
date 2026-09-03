package com.example.petshop

class Cat(name:String, age:Int) : Pet(name,age), Pettable{
    override fun speak(): String {
        return "Meow"
    }
    override fun Pet(){
        println("The cat is a pettable cat")
    }
}