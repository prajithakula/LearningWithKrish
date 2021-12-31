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
public class Veg extends Burger{
     @Override
   public float price() {
      return 450.0f;
   }

   @Override
   public String name() {
      return "Veg Burger";
   }
}
