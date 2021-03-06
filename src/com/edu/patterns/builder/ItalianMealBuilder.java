package com.edu.patterns.builder;

public class ItalianMealBuilder extends MealBuilder {

	public ItalianMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildDrink() {
		meal.setDrink("red wine");
	}

	@Override
	public void buildMainCourse() {
		meal.setMainCourse("pizza");
	}

	@Override
	public void buildSide() {
		meal.setSide("bread");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}