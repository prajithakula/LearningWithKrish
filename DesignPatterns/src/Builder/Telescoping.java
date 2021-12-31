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
public class Telescoping {
   private String name;
   private Packing packing;
   private float price;
   
    public Telescoping(String name, Packing packing, float price) {
        this.name = name;
        this.packing = packing;
        this.price = price;
    }
   public Telescoping(String name, Packing packing ) {
        this.name = name;
        this.packing = packing;
       
    }
   public Telescoping(String name) {
        this.name = name;
        
    }

    @Override
    public String toString() {
        return "Telescoping{" + "name=" + name + ", packing=" + packing + ", price=" + price + '}';
    }
   
}
