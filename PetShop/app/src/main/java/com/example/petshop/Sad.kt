package com.example.petshop

class Sad(date : String) : Mood(date) {
    override fun express(): String {
        return "Sad"
    }
}