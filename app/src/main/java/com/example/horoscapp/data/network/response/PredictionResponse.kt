package com.example.horoscapp.data.network.response

import com.example.horoscapp.domain.model.PredictionModel
import com.google.gson.annotations.SerializedName

data class PredictionResponse(
    @SerializedName("date") val date:String,
    @SerializedName("horoscope") val horoscope:String,          //el nom que fiquem al serializedname sera el valor del que volem que la api ens retorni quan la cridem,
    @SerializedName("sign") val sign:String                     // el nom de despres pot ser el que vulguem
){
    fun toDomain():PredictionModel{
        return PredictionModel(
            horoscope = horoscope,
            sign = sign
        )
    }
}
