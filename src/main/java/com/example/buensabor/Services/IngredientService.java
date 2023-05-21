package com.example.buensabor.Services;

import com.example.buensabor.Models.Entity.Ingredient;
import com.example.buensabor.Models.FixedEntities.MeasurementUnit;

public interface IngredientService extends BaseService<Ingredient,Long> {
    //Agregamos todos los metodos que solo pertenecen a User, lo agregamos a la interfaz para mantener el orden

    void decrementStock(Long ingredientId, double quantity, MeasurementUnit measurementUnit);
    void incrementStock(Long ingredientId, double quantity, MeasurementUnit measurementUnit);
}
