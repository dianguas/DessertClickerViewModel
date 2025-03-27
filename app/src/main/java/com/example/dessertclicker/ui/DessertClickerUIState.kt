package com.example.dessertclicker.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.model.Dessert

data class DessertClickerUIState(
    val desserts: List<Dessert> = Datasource.dessertList,
    var revenue:Int = 0,
    var dessertsSold: Int = 0,
    val currentDessertIndex: Int =0
)
