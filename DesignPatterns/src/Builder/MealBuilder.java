/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Builder;

/**
 *
 * @author hp
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem((Item) new Veg());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new NonVeg());
      meal.addItem(new Marinda());
      return meal;
   }
}
