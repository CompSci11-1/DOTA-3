/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Grid;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Evan
 */
public class Map {
    private ArrayList<Point> walls = new ArrayList<Point>();
    private ArrayList<Point> items = new ArrayList<Point>();
    private Image background;
    private Grid grid;

    /**
     * @return the walls
     */
    public ArrayList<Point> getWalls() {
        return walls;
    }

    /**
     * @param walls the walls to set
     */
    public void setWalls(ArrayList<Point> walls) {
        this.walls = walls;
    }

    /**
     * @return the items
     */
    public ArrayList<Point> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Point> items) {
        this.items = items;
    }

    /**
     * @return the background
     */
    public Image getBackground() {
        return background;
    }

    /**
     * @param background the background to set
     */
    public void setBackground(Image background) {
        this.background = background;
    }
}
