/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton.EarlyInstantiation;

/**
 *
 * @author hp
 */
public class Team {
    public static void main(String[] args) {

        Captain player1 = Captain.getplayer();
        Captain player2 = Captain.getplayer();
        
        System.out.println(player1);
        System.out.println(player2);
        
        
      
   }
}
