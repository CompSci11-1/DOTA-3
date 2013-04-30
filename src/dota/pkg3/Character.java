/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Grid;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ResourceBundle;

/**
 *
 * @author erickbassett
 */
public class Character {
    private Image image;
    
    public Character(Image image){
        this.image = image;
    }
    public void drawCharacter (Graphics graphics,Point charXY){
//        graphics.drawImage(ResourceTools.loadImageFromResource("Resources/Char1.png"), charX -1, charY -15,20,32, null);
        graphics.drawImage(image, charXY.x -1, charXY.y -15,20,32, null);
        
        
    }
    
}
