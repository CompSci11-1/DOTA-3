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
    
    public static Map getMap(Image background, Dimension gridCellSize, Dimension gridSize,
        ArrayList<MapObstacle> obstacles, ArrayList<MapPortal> portals, ArrayList<Point> items){

        Map map = new Map(background, gridCellSize, gridSize);
        
        map.setObstacles(obstacles);
        map.setItems(items);
        map.setPortals(portals);
        
        return map;
    }
    
    public static Map getLevelOneMainMap(){
        Image background = ResourceTools.loadImageFromResource("Resouces/level_one_map.png");
        Dimension gridCellSize = new Dimension(20, 20);
        Dimension gridSize = new Dimension(40, 30);
        
        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
        obstacles.add(new MapObstacle(new Point(0, 0), ObstacleType.WALL));
        //add other obstacles here...
        
        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();
        portals.add(new MapPortal(new Point(0, 0), getStoreMap(), new Point(1, 1)));
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
        
        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
        obstacles.add(new MapObstacle(new Point(0, 0), ObstacleType.WALL));
        //add other obstacles here...
        
        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();
//        portals.add(new MapPortal(new Point(0, 0), getStoreMap(), new Point(1, 1)));
        
        ArrayList<Point> items = new ArrayList<Point>();
        items.add(new Point(0, 0));
        //add other items here
        
        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
}
