package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //val pet = Pet("pet", 5)
        val Cat = Cat("barbie", 4)
        val Dog = Dog("Mochi", 6)
        val Pets = mutableListOf(Cat, Dog)
        val Scorpion = Scorpion("Stinger", 32)
        val Pets = mutableListOf(Cat, Dog, Scorpion)
        val pettablePets = mutableListOf<Pettable>(Cat, Dog, Scorpion)

    }
}
