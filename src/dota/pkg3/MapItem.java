/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import java.awt.Point;

/**
 *
 * @author erickbassett
 */
public class MapItem {
    
    public MapItem (Point location, Enemy enemy){
        this.location = location;
        this.enemy = enemy;
    }
    
    private Point location;
    private Enemy enemy;

    /**
     * @return the location
     */
    public Point getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Point location) {
        this.location = location;
    }

    /**
     * @return the enemy
     */
    public Enemy getEnemy() {
        return enemy;
    }

    /**
     * @param enemy the enemy to set
     */
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
    
}
