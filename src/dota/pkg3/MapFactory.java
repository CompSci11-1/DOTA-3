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
        Image background = ResourceTools.loadImageFromResource("Resources/Route (2).bmp");
        Dimension gridCellSize = new Dimension(16, 16);
        Dimension gridSize = new Dimension(20, 70);

        ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
      obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.BUSH));
        obstacles.add(new MapObstacle(new Point(1, 5), ObstacleType.BUSH));
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
        obstacles.add(new MapObstacle(new Point(47, 15), ObstacleType.WALL));
        obstacles.add(new MapObstacle(new Point(47, 16), ObstacleType.WALL));
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
   obstacles.add(new MapObstacle(new Point(0, 5), ObstacleType.WALL));
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
        Image background = ResourceTools.loadImageFromResource("Resources/House with grid (2).bmp");
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
}
