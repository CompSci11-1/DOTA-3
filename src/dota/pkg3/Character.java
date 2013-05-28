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
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 *
 * @author erickbassett
 */
public class Character {
    private Image image;
    private int health;
    private ArrayList<Attack> attacks;
    
    
    
    public Character(int health, ArrayList<Attack> attacks, Image image){
        this.health = health;
        this.attacks = attacks;
        this.image = image;
    }
    public void drawCharacter (Graphics graphics,Point charXY){
//        graphics.drawImage(ResourceTools.loadImageFromResource("Resources/Char1.png"), charX -1, charY -15,20,32, null);
        graphics.drawImage(getImage(), charXY.x -1, charXY.y -15,20,32, null);
        
        
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the attacks
     */
    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    /**
     * @param attacks the attacks to set
     */
    public void setAttacks(ArrayList<Attack> attacks) {
        this.attacks = attacks;
    }
    
}
