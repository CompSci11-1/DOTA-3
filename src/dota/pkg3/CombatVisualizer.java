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
//    private ArrayList<Attack> moves;
    
    public CombatVisualizer(Character character, Enemy enemy, Boolean first) {
//        this.moves = new ArrayList<Attack>();
//        this.moves = moves;
        this.enemy = enemy;
        setEnemy(enemy);
        setCharacter(character);
        setEnemyName(this.enemy.getName());
        initialize(character, enemy, first);
    }
    
    private void initialize(Character character, Enemy enemy, Boolean first) {
        if (first){
        JDialog dialog;
        dialog = new JDialog();

        dialog.setModal(true);
        dialog.setTitle("Battle!");

        CombatVisualizer cv = new CombatVisualizer(character, enemy, false);
        dialog.add(cv);
        dialog.setAlwaysOnTop(true);

        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setSize(new Dimension(800, 600));
        dialog.setVisible(true);
        dialog.setFocusable(true);
        
        }
    }
}


