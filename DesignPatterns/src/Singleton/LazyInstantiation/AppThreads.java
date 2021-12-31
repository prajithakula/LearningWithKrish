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
public class AppThreads implements Runnable{
    
     @Override
    public void run() {
        Captain player = Captain.getplayer();;
        System.out.println(player);
    }
}
