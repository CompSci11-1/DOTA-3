/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Grid;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author kevin.lawrence
 */
public class Map {

    //<editor-fold defaultstate="collapsed" desc="Reference: Interfaces and Enums">
    public static enum Direction {
        
        UP, DOWN, LEFT, RIGHT
    }
    
    public static enum MovementEventType {
        
        OBSTACLE, ITEM, PORTAL
    }
    
    public interface MovementEventHander {
        
        public void MovementEvent(Map.MovementEventType me);
        //probably need more information here... like location
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Map(Image background, Dimension gridCellSize, Dimension gridSize) {
        this.background = background;
        
        this.grid = new Grid();
        
        this.grid.setRows(gridSize.width);
        this.grid.setColumns(gridSize.height);
        
        this.grid.setCellWidth(gridCellSize.width);
        this.grid.setCellHeight(gridCellSize.height);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    public static Point getMovementCellLocation(Point currentLocation, Map.Direction movementDirection) {
        Point movementCellLocation = (Point) currentLocation.clone();
        
        switch (movementDirection) {
            case UP:
                movementCellLocation.y -= 1;
                break;
                
            case DOWN:
                movementCellLocation.y += 1;
                break;
                
            case LEFT:
                movementCellLocation.x -= 1;
                break;
                
            case RIGHT:
                movementCellLocation.x += 1;
                break;
        }
        
        return movementCellLocation;
    }
    
    public boolean validateCharacterMove(Point characterCellLocation, Map.Direction direction) {
        
        if (hitTest(getMovementCellLocation(characterCellLocation, direction), getObstacles())) {
            System.out.println("Ouch... that hurt!");
            //put an event handler here... something like
            if (getObstacleHandler() != null) {
                getObstacleHandler().MovementEvent(Map.MovementEventType.OBSTACLE);
            }
            return false;
        }
        
        if (hitTest(getMovementCellLocation(characterCellLocation, direction), getPortalLocations())) {
            System.out.println("Hey... need to go somewhere else!");
            //put an event handler here!
            if (getPortalHandler() != null) {
                //use the getMapPortal method to pass the portal back to the event handler...
                getPortalHandler().MovementEvent(Map.MovementEventType.OBSTACLE);
            }
        }
        
        if (hitTest(getMovementCellLocation(characterCellLocation, direction), getItems())) {
            System.out.println("Hey... found something!");
            //put an event handler here!
            if (getItemHandler() != null) {
                getItemHandler().MovementEvent(Map.MovementEventType.OBSTACLE);
            }
        }
        
        return true;
    }
    
    public static boolean hitTest(Point cellLocation, ArrayList<Point> locations) {
        for (Point location : locations) {
            if (location.equals(cellLocation)) {
                return true;
            }
        }
        return false;
    }
    
    private MapPortal getMapPortal(Point location){
        for (MapPortal portal : getPortals()){
            if (portal.getLocation().equals(location)){
                return portal;
            }
        }
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private Map.MovementEventHander obstacleHandler;
    private Map.MovementEventHander portalHandler;
    private Map.MovementEventHander itemHandler;
    private ArrayList<Point> obstacles = new ArrayList<Point>();
    private ArrayList<MapPortal> portals = new ArrayList<MapPortal>();
    private ArrayList<Point> items = new ArrayList<Point>();
    private Image background;
    private Grid grid;
    
    /**
     * @return the obstacleHandler
     */
    public Map.MovementEventHander getObstacleHandler() {
        return obstacleHandler;
    }
    
    /**
     * @param obstacleHandler the obstacleHandler to set
     */
    public void setObstacleHandler(Map.MovementEventHander obstacleHandler) {
        this.obstacleHandler = obstacleHandler;
    }
    
    /**
     * @return the portalHandler
     */
    public Map.MovementEventHander getPortalHandler() {
        return portalHandler;
    }
    
    /**
     * @param portalHandler the portalHandler to set
     */
    public void setPortalHandler(Map.MovementEventHander portalHandler) {
        this.portalHandler = portalHandler;
    }
    
    /**
     * @return the itemHandler
     */
    public Map.MovementEventHander getItemHandler() {
        return itemHandler;
    }
    
    /**
     * @param itemHandler the itemHandler to set
     */
    public void setItemHandler(Map.MovementEventHander itemHandler) {
        this.itemHandler = itemHandler;
    }
    
    /**
     * @return the obstacles
     */
    public ArrayList<Point> getObstacles() {
        return obstacles;
    }
    
    /**
     * @param obstacles the obstacles to set
     */
    public void setObstacles(ArrayList<Point> obstacles) {
        this.obstacles = obstacles;
    }
    
    /**
     * @return the Point locations of the map portals
     */
    public ArrayList<Point> getPortalLocations() {
        ArrayList<Point> locations = new ArrayList<Point>();
        
        for (MapPortal portal : getPortals()){
            locations.add(portal.getLocation());
        }
        
        return locations;
    }
    
    /**
     * @return the Map Portals
     */
    public ArrayList<MapPortal> getPortals() {
        return portals;
    }
    
    /**
     * @param portals the Map Portals to set
     */
    public void setPortals(ArrayList<MapPortal> portals) {
        this.portals = portals;
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
    
    /**
     * @return the grid
     */
    public Grid getGrid() {
        return grid;
    }
    
    /**
     * @param grid the grid to set
     */
    public void setGrid(Grid grid) {
        this.grid = grid;
    }
    //</editor-fold>


}
