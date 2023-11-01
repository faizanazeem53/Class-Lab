/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomongame;

/**
 *
 * @author Faizan
 */
// Class to represent an Ability
class Ability {
    String name;
    int power;
    String description;

    // Constructor for creating an Ability
    public Ability(String name, int power, String description) {
        this.name = name;
        this.power = power;
        this.description = description;
    }

    // Method to use the ability on a target Algomon
    public void useAbility(Algomon sourceAlgomon, Algomon targetAlgomon) {
        System.out.println(sourceAlgomon.getType() + " Algomon uses " + name + " on " + targetAlgomon.getType() + " Algomon.");
        System.out.println(description);
    }
}

