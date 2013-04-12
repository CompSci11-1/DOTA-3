/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author erickbassett
 */
public class Wall {
    
    private ArrayList<Point> wall = new ArrayList<Point>();
    private Color color = Color.gray;
    private int wallX;
    private int wallY;
    
    
    public void start(Grid masterGrid){
        this.wall.add(masterGrid.getCellPosition(30, 30));
        this.wall.add(masterGrid.getCellPosition(30, 31));
        this.wall.add(masterGrid.getCellPosition(31, 30));
        this.wall.add(masterGrid.getCellPosition(35, 30));
        this.wall.add(masterGrid.getCellPosition(36, 31));
        this.wall.add(masterGrid.getCellPosition(36, 32));
        this.wall.add(masterGrid.getCellPosition(36, 33));
        this.wall.add(masterGrid.getCellPosition(38, 32));
        this.wall.add(masterGrid.getCellPosition(33, 36));
        this.wall.add(masterGrid.getCellPosition(32, 35));
        
    }
    
    public void update(Grid masterGrid){
            this.getWall().set(0, masterGrid.getCellPosition(30, 30));
            this.getWall().set(1, masterGrid.getCellPosition(30, 31));
            this.getWall().set(2, masterGrid.getCellPosition(31, 30));
            this.getWall().set(3, masterGrid.getCellPosition(31, 30));
            this.getWall().set(4, masterGrid.getCellPosition(35, 30));
            this.getWall().set(5, masterGrid.getCellPosition(36, 31));
            this.getWall().set(6, masterGrid.getCellPosition(36, 32));
            this.getWall().set(7, masterGrid.getCellPosition(36, 33));
            this.getWall().set(8, masterGrid.getCellPosition(38, 32));
            this.getWall().set(9, masterGrid.getCellPosition(33, 36));
//            this.getWall().set(10, masterGrid.getCellPosition(32, 35));
    }
    
    
    public boolean hitDetection(Grid masterGrid,String direction, int charX, int charY){
        for (int i = 0; i < this.getWall().size(); i++) {
//        this.getWall().set();
        }
        
        this.getWall().set(0, masterGrid.getCellPosition(30, 30));
        if (direction == "up"){
        for (int i = 0; i < this.getWall().size(); i++) {
            if(this.getWall().get(i).x == charX){
                if(this.getWall().get(i).y == charY - 20){
                return false;
                }
            }
        }
        }
        if (direction == "down"){
        for (int i = 0; i < this.getWall().size(); i++) {
            if(this.getWall().get(i).x == charX){
                if(this.getWall().get(i).y == charY + 20){
                return false;
                }
            }
        }
        }
        if (direction == "left"){
        for (int i = 0; i < this.getWall().size(); i++) {
            if(this.getWall().get(i).x == charX - 20){
                if(this.getWall().get(i).y == charY){
                return false;
                
                }
            }
        }
        }
        if (direction == "right"){
        for (int i = 0; i < this.getWall().size(); i++) {
            if(this.getWall().get(i).x == charX + 20){
                if(this.getWall().get(i).y == charY){
                return false;
                
                }
            }
        }
        }
        return true; 
    }
    
     public void draw(Graphics graphics, Grid masterGrid) {
        for (int i = 0; i < this.getWall().size(); i++) {
            
            graphics.setColor(color);
            for (int j = 0; j < this.getWall().size(); j++) {
            graphics.fillRect(this.getWall().get(i).x, this.getWall().get(i).y, masterGrid.getCellHeight(), masterGrid.getCellWidth());
            }
            }
     }

    /**
     * @return the wall
     */
    public ArrayList<Point> getWall() {
        return wall;
    }

    /**
     * @param wall the wall to set
     */
    public void setWall(ArrayList<Point> wall) {
        this.wall = wall;
    }
    
}
