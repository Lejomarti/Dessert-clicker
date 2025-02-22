package com.example.dessertclicker.data

import androidx.annotation.DrawableRes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.dessertclicker.data.Datasource.dessertList

data class DessertUiState (


val revenue : Int = 0,
val dessertsSold : Int = 0,
val currentDessertIndex :Int = 0,
var currentDessertPrice:Int = dessertList[currentDessertIndex].price,
@DrawableRes val currentDessertImageId:Int = dessertList[currentDessertIndex].imageId
)

