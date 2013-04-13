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
     
    public void drawCharacter (Grid masterGrid,Graphics graphics, int charX, int charY){
        graphics.setColor(Color.blue);
        graphics.fillOval(charX, charY, 20, 20);
        
    }
    
}
