package com.PAPB2.foodapp.view.home;

import com.PAPB2.foodapp.model.Categories;
import com.PAPB2.foodapp.model.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
