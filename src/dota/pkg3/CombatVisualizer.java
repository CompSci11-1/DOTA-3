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
    private JDialog dialog;
//    private ArrayList<Attack> moves;
    
<<<<<<< HEAD
    public CombatVisualizer(Character character, Enemy enemy, Boolean first) {
=======
    public CombatVisualizer(Character character, Enemy enemy, Boolean start) {
>>>>>>> origin/pretty_combat
//        this.moves = new ArrayList<Attack>();
//        this.moves = moves;
        this.enemy = enemy;
        setEnemy(enemy);
        setCharacter(character);
        setEnemyName(this.enemy.getName());
<<<<<<< HEAD
        initialize(character, enemy, first);
    }
    
    private void initialize(Character character, Enemy enemy, Boolean first) {
        if (first){
        JDialog dialog;
        dialog = new JDialog();
=======
        if (start){
        initialize(character, enemy);
        }
    }
    
    private void initialize(Character character, Enemy enemy) {
//        JDialog dialog;
        this.dialog = new JDialog();
>>>>>>> origin/pretty_combat

        dialog.setModal(true);
        dialog.setTitle("Battle!");

        CombatVisualizer cv = new CombatVisualizer(character, enemy, false);
        dialog.add(cv);
        dialog.setAlwaysOnTop(true);

        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
<<<<<<< HEAD
        dialog.setSize(new Dimension(800, 600));
        dialog.setVisible(true);
        dialog.setFocusable(true);
        
        }
    }
=======
        dialog.setSize(new Dimension(540, 430));
        dialog.setVisible(true);
        dialog.setFocusable(true);
               
    }

    public void close(){
        this.dialog.setVisible(false);
    }
    
>>>>>>> origin/pretty_combat
}


