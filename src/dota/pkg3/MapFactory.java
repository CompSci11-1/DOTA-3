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
import map.Obstacle;

/**
 *
 * @author kevin.lawrence
 */
public class MapFactory {

    public static Map getMap(Image background, Dimension gridCellSize, Dimension gridSize,
            ArrayList<MapObstacle> obstacles, ArrayList<MapPortal> portals, ArrayList<Point> items) {

        Map map = new Map(background, gridCellSize, gridSize);

        map.setObstacles(obstacles);
        map.setItems(items);
        map.setPortals(portals);

        return map;
    }
    
    public static void addPortal(Map startMap, Point startLocation, Map destinationMap, Point destinationLocation){
        startMap.getPortals().add(new MapPortal(startLocation, destinationMap, destinationLocation));
    }

    public static Map getLevelOneMainMap() {
        Image background = ResourceTools.loadImageFromResource("Resources/level_one_map.png");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(20, 70);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
      obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(1, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 6), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(2, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(-1, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(1, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(3, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(4, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(5, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(5, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(4, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(3, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(1, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 14), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 15), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 15), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 14), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(63, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(64, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(65, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(66, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(67, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(68, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(69, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(12, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(13, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(14, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(15, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(16, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(17, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(18, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(20, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(21, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(23, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(24, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(26, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(27, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(28, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(29, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(30, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(31, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(35, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(37, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(38, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(39, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(40, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(42, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(43, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(44, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(45, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(46, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(48, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(49, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(50, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(51, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(52, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(53, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(54, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(55, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(56, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(58, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(62, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(63, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(64, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(65, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(66, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(67, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 17), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 16), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 15), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 14), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(68, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(69, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(70, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(71, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(70, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(71, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 19), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 17), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 16), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 15), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 14), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(10, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(9, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(8, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(12, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(13, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(14, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(15, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(16, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(17, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(18, 1), ObstacleType.WALL));
//        obstacles.add(new MapObstacle(new Point(19, 1), ObstacleType.WALL));
//        obstacles.add(new MapObstacle(new Point(20, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(21, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(23, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(24, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(26, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(27, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(28, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(29, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(30, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(31, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(35, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(37, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(38, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(39, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(40, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(42, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(43, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(44, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(45, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(46, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(48, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(49, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(50, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(51, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(52, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(53, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(54, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(55, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(56, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(20, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(21, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(23, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(24, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(10, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(9, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(8, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(5, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(4, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(3, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(18, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(21, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(39, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(39, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(39, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(42, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 17), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 16), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 15), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 14), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(35, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(37, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(38, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(39, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(40, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(42, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(43, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(44, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(45, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(46, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(46, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 14), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 17), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 5), ObstacleType.WALL));
        
        
        
        
        
        obstacles.add(new MapObstacle(new Point(6, 12), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 12), ObstacleType.BUSH));
        
        
        


        obstacles.add(new MapObstacle(new Point(59, 15), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(60, 15), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(61, 15), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(59, 19), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(60, 19), ObstacleType.WATER));
        obstacles.add(new MapObstacle(new Point(61, 19), ObstacleType.WATER));

        //add other obstacles here...

        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();
        
        ArrayList<Point> items = new ArrayList<Point>();
        items.add(new Point(10, 10));
        items.add(new Point(12, 10));
        items.add(new Point(0,9));
        //add other items here

        Map levelOneMap = getMap(background, gridCellSize, gridSize, obstacles, portals, items);

//        addPortal(levelOneMap, new Point(40, 4), getStoreMap(), new Point(6,6));
        //add other portals here...

        return levelOneMap;
    }

    public static Map getStoreMap() {
        //change this image to the store when you get one...
        Image background = ResourceTools.loadImageFromResource("Resources/Generic_Store.png");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(20, 20);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
        obstacles.add(new MapObstacle(new Point(1, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(3, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(4, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(5, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(8, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(9, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(10, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(12, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(12, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(1, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(1, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(3, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(1, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(3, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(1, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(3, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(4, 11), ObstacleType.WALL));
//        obstacles.add(new MapObstacle(new Point(5, 14), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(8, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(9, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(10, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(12, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(10, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(11, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(10, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(8, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(8, 9), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(8, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(7, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(8, 6), ObstacleType.WALL));

        //add other obstacles here...


        ArrayList<Point> items = new ArrayList<Point>();
        items.add(new Point(12, 2));
        items.add(new Point(11, 2));
        items.add(new Point(10, 2));
        //add other items here

        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();


        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
    public static Map getHouseMap() {
        //change this image to the store when you get one...
        Image background = ResourceTools.loadImageFromResource("Resources/generic_house.DIB");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(20, 20);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
   obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
        

        //add other obstacles here...


        ArrayList<Point> items = new ArrayList<Point>();

        //add other items here

        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();


        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
        public static Map getMapToTown() {
        //change this image to the store when you get one...
        Image background = ResourceTools.loadImageFromResource("Resources/level_one_map_to_town.png");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(100, 30);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
   obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(3, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(4, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(8, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(10, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(12, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(12, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(10, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(8, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(4, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 12), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(4, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(8, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(12, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(13, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(13, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(13, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(13, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(13, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(14, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(14, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(14, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(14, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(14, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 12), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 9), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 6), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(16, 6), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(16, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(16, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(16, 3), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(17, 3), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(18, 3), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(18, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(17, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(16, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(14, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(13, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(12, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(10, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(8, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 2), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 3), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(8, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(10, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(10, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(8, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 3), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 2), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(4, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 2), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 3), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 4), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 6), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(4, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(8, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(10, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(12, 7), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(10, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(8, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(7, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(6, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(5, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(4, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(3, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(9, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(12, 8), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(11, 1), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(15, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(0, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(1, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(20, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(21, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(23, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(24, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(26, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(27, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(28, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(29, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(30, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(31, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(35, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(37, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(38, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(39, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(40, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(42, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(43, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(44, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(45, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(46, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(48, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(49, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(50, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(51, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(52, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(53, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(54, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(55, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(56, 0), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 14), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 15), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 17), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(56, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(55, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(54, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(53, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(52, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(51, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(50, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(49, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(48, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(46, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(45, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(44, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(43, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(42, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(40, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(39, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(38, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(35, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(31, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(30, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(29, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(28, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(27, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(26, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(25, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(24, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(23, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(21, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(10, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(6, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(2, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(1, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(0, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(37, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(20, 18), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(20, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(21, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 6), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 7), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(22, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(21, 8), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(41, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(42, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(43, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(44, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(44, 4), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(43, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(48, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(52, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(52, 2), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(52, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(51, 3), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(36, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(35, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(34, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 10), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 11), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 12), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(32, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(33, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(57, 16), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 1), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(44, 5), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(35, 13), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(19, 9), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(19, 10), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(19, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(18, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(17, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(16, 11), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(16, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(17, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(18, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(19, 13), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(19, 14), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(19, 15), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(19, 16), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(19, 17), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(33, 10), ObstacleType.WALL));

        //add other obstacles here...


        ArrayList<Point> items = new ArrayList<Point>();

        //add other items here

        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();


        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
     public static Map getTownWithForest() {
        //change this image to the store when you get one...
        Image background = ResourceTools.loadImageFromResource("Resources/town_to_forest.png");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(100, 30);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
   obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
  
obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(35, 15), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(12, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(11, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(10, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(9, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(8, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(7, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 31), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 31), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 30), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 30), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 29), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 28), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 25), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 24), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 23), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(18, 23), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(19, 23), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(19, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(23, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(24, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(25, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(25, 23), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(26, 23), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(26, 24), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 24), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 25), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 28), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 29), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 30), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 30), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 31), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(30, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(30, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(31, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(32, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 33), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 34), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 35), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 36), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 37), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 38), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 39), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 40), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(5, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 31), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 14), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 14), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(30, 15), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(31, 15), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(31, 16), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(31, 17), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(31, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(31, 19), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(32, 19), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(32, 20), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(32, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(34, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(35, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(36, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(37, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(38, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(39, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 15), ObstacleType.WALL));
   
   obstacles.add(new MapObstacle(new Point(33, 22), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 23), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 24), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 25), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 26), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 28), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 29), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 30), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 31), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 32), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(32, 31), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(20, 17), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(21, 17), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(22, 17), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(23, 17), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(23, 16), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(23, 15), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(24, 15), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(25, 15), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(25, 14), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(0, 19), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(1, 19), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 19), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 20), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 23), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 24), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 25), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(25, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(24, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(23, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(22, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(21, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(20, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(19, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(19, 14), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(19, 15), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(19, 16), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 16), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 16), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 17), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 19), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 20), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 20), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 20), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(12, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(12, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(11, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(10, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(10, 23), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(10, 24), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(10, 25), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(10, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(9, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(8, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(7, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(5, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 26), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 25), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 24), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 23), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 22), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 21), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 20), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 19), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(2, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(1, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(0, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(9, 39), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(9, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(10, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(11, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(12, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(13, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(14, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(15, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(16, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(17, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(17, 37), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(17, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(18, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(19, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(20, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(21, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(22, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(23, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(24, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(25, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(26, 36), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(26, 37), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(26, 38), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(26, 39), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(32, 9), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 9), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 10), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 11), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 12), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 14), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 15), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 16), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 17), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(33, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 9), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 8), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(26, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(25, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(24, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(23, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(22, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(21, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(20, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(19, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(18, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 8), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 8), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 8), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 9), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 10), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 10), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 11), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 12), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 14), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 14), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 15), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 16), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 17), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(12, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(11, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(5, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(32, 8), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(32, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(32, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(32, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(31, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(30, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(26, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(25, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(24, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(23, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(22, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(22, 4), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(21, 4), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(20, 4), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(19, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(18, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(12, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(11, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(11, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(10, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(9, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(9, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(8, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(7, 6), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 7), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 8), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 9), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 10), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 11), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(5, 11), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(5, 12), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(5, 13), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(5, 14), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(5, 15), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 16), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 17), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 29), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(31, 32), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(18, 16), ObstacleType.WALL));

   
        

        //add other obstacles here...


        ArrayList<Point> items = new ArrayList<Point>();

        //add other items here

        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();


        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
    public static Map getForest() {
        //change this image to the store when you get one...
        Image background = ResourceTools.loadImageFromResource("Resources/illusion_forest.png");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(49, 48);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
   obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13,0), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13,0), ObstacleType.WALL));     

        //add other obstacles here...


        ArrayList<Point> items = new ArrayList<Point>();

        //add other items here

        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();


        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
    public static Map getForestEntrance() {
        //change this image to the store when you get one...
        Image background = ResourceTools.loadImageFromResource("Resources/forest_entrance.png");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(100, 30);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
//<editor-fold defaultstate="collapsed" desc="Forest Entrance Objects">
   obstacles.add(new MapObstacle(new Point(10, 31), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(11, 31), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(12, 30), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(9, 28), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(9, 30), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(9, 29), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(12, 29), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(12, 28), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(13, 28), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(14, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(15, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(16, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(17, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(18, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(19, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(20, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(21, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(22, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(23, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(24, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(25, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(26, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(27, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(28, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 27), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(30, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(31, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(32, 26), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(32, 25), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 25), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(34, 24), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(34, 23), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(35, 23), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(36, 23), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(37, 23), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(38, 22), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(37, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(36, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(35, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(34, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(33, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(32, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(29, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(28, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(27, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(26, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(25, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(24, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(22, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(21, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(20, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(19, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(18, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(17, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(16, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(15, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(14, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(13, 21), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(12, 20), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(11, 20), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(11, 19), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(10, 18), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(9, 18), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(8, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(7, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(6, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 18), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 17), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 16), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(3, 15), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(4, 14), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(4, 13), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(4, 12), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(5, 12), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(6, 11), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(6, 10), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(7, 10), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(8, 9), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(9, 9), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(10, 8), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(10, 7), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(10, 6), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(9, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(8, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(8, 4), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(7, 3), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(6, 3), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(5, 4), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(5, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(4, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(3, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(2, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 6), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 7), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 8), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 9), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 10), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 11), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 12), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 13), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 14), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 15), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 16), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 17), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 18), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 19), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 20), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 21), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 22), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 23), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 24), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 25), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 26), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(1, 27), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(2, 28), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(3, 28), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(4, 28), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(5, 28), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(6, 28), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(7, 28), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(8, 28), ObstacleType.WALL));
   obstacles.add(new MapObstacle(new Point(29, 20), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(29, 19), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(29, 18), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(29, 17), ObstacleType.WATER));  
   obstacles.add(new MapObstacle(new Point(28, 17), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(27, 17), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(26, 17), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(25, 17), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(24, 17), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 16), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 15), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 14), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 13), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 12), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 11), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 10), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(23, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(26, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(26, 10), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(26, 11), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(26, 12), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(26, 13), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(26, 14), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(27, 14), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(28, 14), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(29, 14), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(30, 14), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(31, 14), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(32, 15), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(32, 16), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(32, 17), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(32, 18), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(32, 19), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(32, 20), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(22, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(21, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(20, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(19, 8), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(18, 8), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(17, 8), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(16, 8), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(15, 7), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(14, 7), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(13, 6), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(13, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(13, 4), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(13, 3), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(12, 3), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(11, 2), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(11, 1), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(10, 1), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(9, 0), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(27, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(28, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(29, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(30, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(31, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(32, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(33, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(34, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(35, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(36, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(37, 9), ObstacleType.WATER));
   obstacles.add(new MapObstacle(new Point(38, 8), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(38, 7), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(38, 6), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(37, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(36, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(35, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(34, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(32, 5), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(32, 4), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(32, 3), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(32, 2), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(33, 2), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(34, 1), ObstacleType.BUSH));
   obstacles.add(new MapObstacle(new Point(34, 0), ObstacleType.BUSH));
   //</editor-fold>
   
        

        //add other obstacles here...


        ArrayList<Point> items = new ArrayList<Point>();

        //add other items here

        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();


        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
    public static Map getCampus() {
        //change this image to the store when you get one...
        Image background = ResourceTools.loadImageFromResource("Resources/brentwood_campus.png");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(100, 30);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
   obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
        

        //add other obstacles here...


        ArrayList<Point> items = new ArrayList<Point>();

        //add other items here

        ArrayList<MapPortal> portals = new ArrayList<MapPortal>();


        return getMap(background, gridCellSize, gridSize, obstacles, portals, items);
    }
       
}
