/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Grid;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author erickbassett
 */
public class Character {
     
    public void drawCharacter (Graphics graphics){
        graphics.setColor(Color.blue);
        graphics.fillOval(10, 10, 20, 20);
        
    }
    
}
