/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton.LazyInstantiation;

/**
 *
 * @author hp
 */
public class Captain {
    private static volatile Captain player = new Captain();
    
    private Captain(){}

    public static Captain getplayer() {
        if(player==null){
            synchronized(Captain.class){
                if(player==null){
                    player=new Captain();
                }
            }
        }
        return player; 
    }
    
}
