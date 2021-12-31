/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class UserDetails implements Cloneable{
    private ArrayList userList;
     
    public UserDetails() {
        this.userList=new ArrayList<>();
    }
     
    public UserDetails(ArrayList users) {
        this.userList = users;
    }
     
    public void getUsers() {
        UserService s = new UserService();
        this.userList = s.getUsers();
    }
     
    public ArrayList getUsersList(){
        return userList;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
            List temp = new ArrayList();
            for(Object s : this.getUsersList()){
                temp.add(s);
            }
            return new UserDetails((ArrayList) temp);
    }
}
