package com.example.horoscapp.ui.detail

sealed class HoroscopeDetailState { //el view model mirara l'estat que sigui
    data object Loading:HoroscopeDetailState()
    data class Error(val error: String):HoroscopeDetailState()   //s'utilitza requereixi parametres fem servir una data class, sino sera un data object
    data class Success(val prediction: String, val sign: String):HoroscopeDetailState()
}