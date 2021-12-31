/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype;

import java.util.List;

/**
 *
 * @author hp
 */
public class ImplementorClass {
    
    public static void main(String[] args) {
        UserDetails users = new UserDetails();
        users.getUsers();
 
       
        UserDetails usersNew;
        try {
            usersNew = (UserDetails) users.clone();
            UserDetails usersNew1 = (UserDetails) users.clone();
            List list = usersNew.getUsersList();
            list.add(new User("Tim", "tim@gmail.com"));
            List list1 = usersNew1.getUsersList();
            list1.remove(new User("steve", "steve@gmail.com"));
 
            System.out.println("users List: " + users.getUsersList());
            System.out.println("usersNew List: " + list);
            System.out.println("usersNew1 List: " + list1);
        } catch (CloneNotSupportedException e) {
          
            e.printStackTrace();
        }
    }
    
    
}
