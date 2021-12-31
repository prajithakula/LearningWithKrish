/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class UserService {
    ArrayList users;
     
    public UserService() {
        users = new ArrayList();
        users.add(new User("PJ","pj@gmail.com"));
        users.add(new User("shan","shan@gmail.com"));
        users.add(new User("shagy","shagy@gmail.com"));
        users.add(new User("hela","hela@gmail.com"));
    }
    public ArrayList getUsers(){
        return users;
    } 
}
