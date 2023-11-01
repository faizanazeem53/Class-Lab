/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomongame;

/**
 *
 * @author umair ashraf
 */
import java.util.ArrayList;
import java.util.List;

// Class to represent a Player
class Player {
    String name;
    List<Algomon> algomonTeam = new ArrayList<>();

    // Constructor for creating a Player with a name
    public Player(String name) {
        this.name = name;
    }

    // Method to add an Algomon to the player's team (up to 4 Algomon)
    public void addAlgomonToTeam(Algomon algomon) {
        if (algomonTeam.size() < 4) {
            algomonTeam.add(algomon);
            System.out.println(name + " adds " + algomon.getType() + " Algomon to their team.");
        } else {
            System.out.println("Maximum number of Algomon reached for player " + name);
        }
    }

    // Method to list the Algomon in the player's team
    public void listTeam() {
        System.out.println(name + "'s Algomon Team:");
        for (Algomon algomon : algomonTeam) {
            System.out.println(algomon.getType() + " (Health: " + algomon.health + ")");
        }
    }
}

