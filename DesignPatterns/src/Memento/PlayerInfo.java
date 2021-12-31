/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class PlayerInfo {
    private ArrayList<Rank> rankList = new ArrayList<>();

    public void addRank(Rank rank){
        rankList.add(rank);
    }

    public ArrayList<Rank> getRankList() {
        return (ArrayList) rankList.clone();
    }

    
    public RankMemento saveRank(){
        return new RankMemento(getRankList());
    }

    public void revertRank(RankMemento rankMemento){
        rankList = rankMemento.getRankList();
    }

    @Override
    public String toString() {
        return "Player{" +
                "rankList=" + rankList +
                '}';
    }

    //Memento class
   static class RankMemento{

        ArrayList<Rank> rankList;

        public RankMemento(ArrayList<Rank> players) {
            this.rankList = players;
        }

        private ArrayList<Rank> getRankList() {
            return rankList;
        }
    }
    
    
}
