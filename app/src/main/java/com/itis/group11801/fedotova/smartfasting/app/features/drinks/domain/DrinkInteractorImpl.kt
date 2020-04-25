package com.itis.group11801.fedotova.smartfasting.app.features.drinks.domain

import com.itis.group11801.fedotova.smartfasting.app.di.scope.AppScope
import com.itis.group11801.fedotova.smartfasting.app.features.drinks.domain.model.DrinkNote
import javax.inject.Inject

@AppScope
class DrinkInteractorImpl @Inject constructor(
    private val drinkRepository: DrinkRepository
) {

    suspend fun saveDrinkNote(drinkNote: DrinkNote) {
        drinkRepository.saveDrinkNote(drinkNote)
    }
}