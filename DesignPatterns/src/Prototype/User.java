/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype;

/**
 *
 * @author hp
 */
public class User {
    
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name of user:"+this.name+" Email of User:"+this.email+"\n";
    }
    
}
