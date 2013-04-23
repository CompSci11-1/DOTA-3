/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Environment;
import environment.Grid;
import image.ResourceTools;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Evan
 */
public class Route1{
public void drawRoute1(Grid masterGrid,Graphics graphics){
    graphics.drawImage(ResourceTools.loadImageFromResource("Resources/Route with grid.DIB"), masterGrid.getCellPosition(0, 0).x,masterGrid.getCellPosition(0, 0).y, null);
}


    
}
 