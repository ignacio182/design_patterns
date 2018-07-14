package com.edu.patterns.builder;

public abstract class MealBuilder {
	
		protected Meal meal;
		
		public abstract void buildDrink();

		public abstract void buildMainCourse();

		public abstract void buildSide();

		public abstract Meal getMeal();
}
