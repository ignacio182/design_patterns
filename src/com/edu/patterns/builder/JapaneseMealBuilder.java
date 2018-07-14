package com.edu.patterns.builder;

public class JapaneseMealBuilder extends MealBuilder {

	public JapaneseMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildDrink() {
		meal.setDrink("sake");
	}

	@Override
	public void buildMainCourse() {
		meal.setMainCourse("chicken teriyaki");
	}

	@Override
	public void buildSide() {
		meal.setSide("miso soup");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
