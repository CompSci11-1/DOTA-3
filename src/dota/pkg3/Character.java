/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Grid;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ResourceBundle;

/**
 *
 * @author erickbassett
 */
public class Character {
     
    public void drawCharacter (Graphics graphics,int charX, int charY){
        graphics.drawImage(ResourceTools.loadImageFromResource("Resources/Char1.png"), charX -1, charY -15,20,32, null);
        
        
    }
    
}
