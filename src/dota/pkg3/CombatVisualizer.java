/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
/**
 *
 * @author erickbassett
 */
public class CombatVisualizer extends CombatPanel {
    
//    private String enemy = "Adil";
    private Enemy enemy = null;
//    private JDialog dialog;
//    private ArrayList<Attack> moves;
//    private CombatResultHandler combatResultHandler;
    

    public CombatVisualizer(Character character, Enemy enemy, CombatResultHandler resultHandler) {

//        this.moves = new ArrayList<Attack>();
//        this.moves = moves;
        this.enemy = enemy;
        setEnemy(enemy);
        setCharacter(character);
        setEnemyName(this.enemy.getName());
        setCombatResultHandler(resultHandler);

    }
    
}




