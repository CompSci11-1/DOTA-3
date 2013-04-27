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
        Image background = ResourceTools.loadImageFromResource("Resources/level_one_map.png");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(20, 70);
        
        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
        obstacles.add(new MapObstacle(new Point(0, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 7), ObstacleType.WALL));

        obstacles.add(new MapObstacle(new Point(59, 2), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(60, 2), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(61, 2), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(59, 3), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(60, 3), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(61, 3), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(59, 4), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(60, 4), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(61, 4), ObstacleType.WATER));
        //add other obstacles here...
        
        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();
        portals.add(new MapPortal(new Point(40, 4), getStoreMap(), new Point(1, 1)));
        //add other portals here...
        
        ArrayList<Point> items = new ArrayList<Point>();
        items.add(new Point(10, 10));
        items.add(new Point(12, 10));
        //add other items here
        
        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
    
    public static Map getStoreMap(){
        //change this image to the store when you get one...
        Image background = ResourceTools.loadImageFromResource("Resources/level_one_map.png");
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
