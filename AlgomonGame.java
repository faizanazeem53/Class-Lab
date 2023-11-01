/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algomongame;

/**
 *
 * @author Faizan
 */
/*
* My github Repo link https://github.com/faizanazeem53/Class-Lab
*/
public class AlgomonGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create abilities with descriptions
        Ability fireOffensive = new Ability("Fireball", 20, "A fiery projectile is launched!");
        Ability fireDefensive = new Ability("Fire Shield", 10, "A protective shield of flames surrounds the Algomon.");
        Ability fireHealing = new Ability("Fire Heal", 15, "The Algomon's wounds are cauterized, restoring health.");

        Ability waterOffensive = new Ability("Water Blast", 25, "A powerful water blast strikes the target.");
        Ability waterDefensive = new Ability("Water Barrier", 12, "A watery barrier is created to deflect incoming attacks.");
        Ability waterHealing = new Ability("Water Heal", 18, "The Algomon is enveloped in healing waters, restoring health.");

        // Create Algomon with abilities
        Algomon fireAlgomon = new Algomon(AlgomonType.Fire, 100, 30, 20, 40, fireOffensive, fireDefensive, fireHealing);
        Algomon waterAlgomon = new Algomon(AlgomonType.Water, 90, 25, 15, 45, waterOffensive, waterDefensive, waterHealing);

        // Create players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Add Algomon to players' teams
        player1.addAlgomonToTeam(fireAlgomon);
        player2.addAlgomonToTeam(waterAlgomon);

        // Create a match
        Match match = new Match(player1, player2);
        match.startMatch();

        // List the Algomon teams
        player1.listTeam();
        player2.listTeam();

        // Demonstrate the abilities (printing to console)
        fireAlgomon.useOffensiveAbility(waterAlgomon);
        waterAlgomon.useDefensiveAbility(fireAlgomon);
        waterAlgomon.useHealingAbility();
    }
    
}
