/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento;

/**
 *
 * @author hp
 */
public class RankingApp {
    public static void main(String[] args) {

        RankHistory rankHistory = new RankHistory();
        PlayerInfo player1 = new PlayerInfo();

        player1.addRank(new Rank(82, HealthState.HEALTHY));
        player1.addRank(new Rank(90, HealthState.UNHEALTHY));
        
        rankHistory.saveRank(player1);
        System.out.println(player1);

        player1.addRank(new Rank(50, HealthState.UNHEALTHY));

        rankHistory.saveRank(player1);
        System.out.println(player1);

        player1.addRank(new Rank(55, HealthState.UNHEALTHY));

        rankHistory.saveRank(player1);
        System.out.println(player1);
    }
}
