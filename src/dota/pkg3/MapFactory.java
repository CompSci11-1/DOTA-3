/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author kevin.lawrence
 */
public class MapFactory {
    
<<<<<<< HEAD
    public static Map getMap(Image background, Dimension gridCellSize, Dimension gridSize,
            ArrayList<Point> obstacles, ArrayList<Point> portals, ArrayList<Point> items){

        Map map = new Map(background, gridCellSize, gridSize);
        
        map.setObstacles(obstacles);
        map.setItems(items);
        map.setPortals(portals);
        
        return map;
    }
=======
//    public static Map getStore(Grid masterGrid){
////        Map store = new Map();
////        store.setBackground(ResourceTools.loadImageFromResource("Resources/Route with Grid.DIB"));
////        store.getWalls().add(new Point(3,4));
//        
////        return store;
//    }
            
>>>>>>> origin/master
    
    public static Map getLevelOneMainMap(){
//        Image background = ResourceTools.loadImageFromResource("Resouces/level_one_map.DIB");
        Image background = ResourceTools.loadImageFromResource("Resouces/Route with grid.DIB");
        Dimension gridCellSize = new Dimension(20, 20);
        Dimension gridSize = new Dimension(40, 30);
        
        ArrayList<Point> obstacles = new ArrayList<Point>();
        obstacles.add(new Point(0, 0));
        //add other obstacles here...
        
        ArrayList<Point> portals = new ArrayList<Point>();
        portals.add(new Point(0, 0));
        //add other portals here...
        
        ArrayList<Point> items = new ArrayList<Point>();
        items.add(new Point(0, 0));
        //add other items here
        
        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
    
    public static Map getStoreMap(){
        Image background = ResourceTools.loadImageFromResource("Resouces/store_map.DIB");
        Dimension gridCellSize = new Dimension(20, 20);
        Dimension gridSize = new Dimension(10, 15);
        
        ArrayList<Point> obstacles = new ArrayList<Point>();
        obstacles.add(new Point(0, 0));
        //add other obstacles here...
        
        ArrayList<Point> portals = new ArrayList<Point>();
        portals.add(new Point(0, 0));
        //add other portals here...
        
        ArrayList<Point> items = new ArrayList<Point>();
        items.add(new Point(0, 0));
        //add other items here
        
        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
}
