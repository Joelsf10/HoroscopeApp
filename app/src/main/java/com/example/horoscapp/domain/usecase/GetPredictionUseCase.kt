package com.example.horoscapp.domain.usecase

import com.example.horoscapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    //el operator ens permet sobreescriure alguns parametres de creacio de la funcio
    suspend operator fun invoke(sign:String){
        repository.getPrediction(sign)
    }

}