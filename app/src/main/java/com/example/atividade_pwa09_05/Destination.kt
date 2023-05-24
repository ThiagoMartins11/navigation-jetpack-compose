package com.example.atividade_pwa09_05

sealed class Destination(var route: String){
    object ScreenFirst: Destination("ScreenFirst")
    object ScreenSecond: Destination("ScreenSecond")
}
