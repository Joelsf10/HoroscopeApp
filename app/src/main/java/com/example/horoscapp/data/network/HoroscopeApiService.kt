package com.example.horoscapp.data.network

import com.example.horoscapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    //Quan necesitem passar un parametre al GET hem de ficar-lo entre /{}/, sino no només /_/  (en el cas d'aquesta api)
    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign: String) : PredictionResponse  //la etiqueta del path ha de ser la mateixa que has ficat al GET de dalt perque tu pots tenir diferents paths
}