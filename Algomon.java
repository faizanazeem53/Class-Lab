/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomongame;

/**
 *
 * @author Faizan
 */
// Class to represent an Algomon
class Algomon {
    AlgomonType type;
    int health;
    int attack;
    int defense;
    int speed;
    Ability offensiveAbility;
    Ability defensiveAbility;
    Ability healingAbility;

    // Constructor for creating an Algomon with its characteristics and abilities
    public Algomon(AlgomonType type, int health, int attack, int defense, int speed,
                   Ability offensiveAbility, Ability defensiveAbility, Ability healingAbility) {
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.offensiveAbility = offensiveAbility;
        this.defensiveAbility = defensiveAbility;
        this.healingAbility = healingAbility;
    }

   public AlgomonType getType() {
        return type;
    }

    // Method to use the offensive ability on a target Algomon
    public void useOffensiveAbility(Algomon targetAlgomon) {
        offensiveAbility.useAbility(this, targetAlgomon);
    }

    // Method to use the defensive ability on a target Algomon
    public void useDefensiveAbility(Algomon targetAlgomon) {
        defensiveAbility.useAbility(this, targetAlgomon);
    }

    // Method to use the healing ability to restore health
    public void useHealingAbility() {
        healingAbility.useAbility(this, this);
    }
}
