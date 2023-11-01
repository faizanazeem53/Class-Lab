/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomongame;

/**
 *
 * @author Faizan
 */
// Class to represent a Match
class Match {
    Player player1;
    Player player2;

    // Constructor for creating a Match with two players
    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // Method to start the match
    public void startMatch() {
        System.out.println("Match between " + player1.name + " and " + player2.name + " begins!");
    }
}
