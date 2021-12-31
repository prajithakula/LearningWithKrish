/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento;

import java.util.Stack;

/**
 *
 * @author hp
 */
public class RankHistory {
    private  Stack<PlayerInfo.RankMemento> rankHistory = new Stack<>();

    public void saveRank(PlayerInfo player){
        rankHistory.push(player.saveRank());
    }

    public void revertRank(PlayerInfo player){
        if (!rankHistory.isEmpty()){
            player.revertRank(rankHistory.pop());
        }else{
            System.out.println("Nothing left to Undo");
        }
    }
}
