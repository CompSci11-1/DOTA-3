/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import image.ResourceTools;
import java.awt.Image;
import java.util.ArrayList;
/**
 *
 * @author erickbassett
 */
public class CombatVisualizer extends CombatPanel {
    
//    private String enemy = "Adil";
    private Enemy enemy = null;
//    private ArrayList<Attack> moves;
    
    public CombatVisualizer(Character character, Enemy enemy) {
//        this.moves = new ArrayList<Attack>();
//        this.moves = moves;
        this.enemy = enemy;
        setEnemy(enemy);
        setCharacter(character);
        initialize();
    }
    
    private void initialize() {
        
        setEnemyName(this.enemy.getName());       
    }

}


