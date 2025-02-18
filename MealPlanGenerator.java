// Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
// Problem Statement:
// Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
// Hints:
// Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
// Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
// Use a generic method to validate and generate a personalized meal plan dynamically.

interface MealPlan {
    void displayMealDetails();
}
class VegetarianMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("Vegetarian Meal: Includes plant-based ingredients.");
    }
}
class VeganMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("Vegan Meal: Excludes all animal products.");
    }
}
class KetoMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("Keto Meal: High-fat, low-carb diet.");
    }
}
class HighProteinMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("High-Protein Meal: Focuses on protein-rich foods.");
    }
}
class Meal<T extends MealPlan> {
    T mealPlan;
    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }
    public void displayMealPlan() {
        mealPlan.displayMealDetails();
    }
    public static <T extends MealPlan> void validateAndGenerateMealPlan(T mealPlan) {
        if (mealPlan != null) {
            System.out.println("Meal Plan Generated Successfully!");
            mealPlan.displayMealDetails();
        } else {
            System.out.println("Invalid Meal Plan!");
        }
    }
}
public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());
        Meal.validateAndGenerateMealPlan(vegetarianMeal.mealPlan);
        Meal.validateAndGenerateMealPlan(veganMeal.mealPlan);
        Meal.validateAndGenerateMealPlan(ketoMeal.mealPlan);
        Meal.validateAndGenerateMealPlan(highProteinMeal.mealPlan);
    }
}
