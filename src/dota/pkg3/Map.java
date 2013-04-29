/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Grid;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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
        
        this.grid.setColor(Color.PINK);
        this.grid.setPosition(new Point(0,0));
        
        this.grid.setRows(gridSize.width);
        this.grid.setColumns(gridSize.height);
        
        this.grid.setCellWidth(gridCellSize.width);
        this.grid.setCellHeight(gridCellSize.height);
        
        //set default event handlers... let the user override these as required
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Methods">
    
    public void drawMap(Graphics graphics){
        if (this.background != null){
            graphics.drawImage(background, this.position.x, this.position.y, null);

        }
            if ((grid != null) && (showGrid)){
                grid.paintComponent(graphics);
            }
            
        if (showGridEditor){
//    private ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
//    private ArrayList<MapPortal> portals = new ArrayList<MapPortal>();
//    private ArrayList<Point> items = new ArrayList<Point>();

            for (MapObstacle obstacle : obstacles) {
                Point systemCoordinate = grid.getCellPosition(obstacle.getLocation());
                systemCoordinate.x += (grid.getCellWidth() / 4);
                systemCoordinate.y += (grid.getCellHeight() * 3 / 4) ;
                
                graphics.drawString("O", systemCoordinate.x, systemCoordinate.y);
            }
            
            for (MapPortal portal : portals) {
                Point systemCoordinate = grid.getCellPosition(portal.getLocation());
                systemCoordinate.x += (grid.getCellWidth() / 4);
                systemCoordinate.y += (grid.getCellHeight() * 3 / 4) ;
                
                graphics.drawString("P", systemCoordinate.x, systemCoordinate.y);
            }
            
            for (Point item : items) {
                Point systemCoordinate = grid.getCellPosition(item);
                systemCoordinate.x += (grid.getCellWidth() / 4);
                systemCoordinate.y += (grid.getCellHeight() * 3 / 4) ;
                
                graphics.drawString("I", systemCoordinate.x, systemCoordinate.y);
            }
            
 
        }    
        
    }
    
    public Point getCellLocation(Point systemCoordinate){
        if (this.grid != null){
            return this.grid.getCellLocationFromSystemCoordinate(systemCoordinate);
        }
        return new Point(0, 0);
    }
    
    
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
    
    public void obstacleEvent(MapObstacle obstacle){
        System.out.println("Ouch... that hurt!");
//        AudioPlayer.play(ResourceTools.getResourceAsStream("Resources/ouch_bump.wav"));
    }
    
    public void portalEvent(MapPortal portal){
        System.out.println("Scotty, beam us up!");
//        AudioPlayer.play(ResourceTools.getResourceAsStream("Resources/transporter.wav"));
    }
    
    public boolean validateCharacterMove(Point currentLocation, Map.Direction direction) {
        return validateLocation(getMovementCellLocation(currentLocation, direction));
    } 
    
    public boolean validateLocation(Point cellLocation) {
        MapObstacle obstacle = getMapObstacle(cellLocation);
        
        if (obstacle != null) {
            /* Note that this implementation provide a default obstacle event 
             * handler "this.obstacleEvent(obstacle)" - see method above - that
             * can be overridden if the user of this class passes in another
             * class that implements the ObstacleEventHandler interface.
             */ 
            if (getObstacleHandler() != null) {
                getObstacleHandler().obstacleEvent(obstacle);
            } else {
                this.obstacleEvent(obstacle);
            }
            return false;
        }
        
        MapPortal portal = getMapPortal(cellLocation);
        if (portal != null) {           
            if (getPortalHandler() != null){
                getPortalHandler().portalEvent(portal);
            } else {
                this.portalEvent(portal);
            }
        }
        
//        if (hitTest(cellLocation, getPortalLocations())) {
//            System.out.println("Hey... need to go somewhere else!");
//            //put an event handler here!
//            if (getPortalHandler() != null) {
//                //use the getMapPortal method to pass the portal back to the event handler...
//                getPortalHandler().MovementEvent(Map.MovementEventType.OBSTACLE);
//            }
//        }
        
        if (hitTest(cellLocation, getItems())) {
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

    private MapObstacle getMapObstacle(Point location){
        for (MapObstacle obstacle : getObstacles()){
            if (obstacle.getLocation().equals(location)){
                return obstacle;
            }
        }
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private ObstacleEventHandler obstacleHandler;
    private PortalEventHandler portalHandler;
    private Map.MovementEventHander itemHandler;
    private ArrayList<MapObstacle> obstacles = new ArrayList<MapObstacle>();
    private ArrayList<MapPortal> portals = new ArrayList<MapPortal>();
    private ArrayList<Point> items = new ArrayList<Point>();
    private Image background;
    private Grid grid;
    private Point position = new Point(0, 0);
    private boolean showGrid;
    private boolean showGridEditor;
    
    /**
     * @return the position of the image
     */
    public Point getPosition() {
        return position;
    }
    
    /**
     * @param position the position of the image to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }
    
    /**
     * @return the obstacleHandler
     */
    public ObstacleEventHandler getObstacleHandler() {
        return obstacleHandler;
    }
    
    /**
     * @param obstacleHandler the obstacleHandler to set
     */
    public void setObstacleHandler(ObstacleEventHandler obstacleHandler) {
        this.obstacleHandler = obstacleHandler;
    }
    
    /**
     * @return the portalHandler
     */
    public PortalEventHandler getPortalHandler() {
        return portalHandler;
    }
    
    /**
     * @param portalHandler the portalHandler to set
     */
    public void setPortalHandler(PortalEventHandler portalHandler) {
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
     * @return the Point locations of the map obstacles
     */
    public ArrayList<Point> getObstacleLocations() {
        ArrayList<Point> locations = new ArrayList<Point>();
        
        for (MapObstacle obstacle : getObstacles()){
            locations.add(obstacle.getLocation());
        }
        
        return locations;
    }
    
    /**
     * @return the obstacles
     */
    public ArrayList<MapObstacle> getObstacles() {
        return obstacles;
    }
    
    /**
     * @param obstacles the obstacles to set
     */
    public void setObstacles(ArrayList<MapObstacle> obstacles) {
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
    
    /**
     * @return the showGrid
     */
    public boolean isShowGrid() {
        return showGrid;
    }

    /**
     * @param showGrid the showGrid to set
     */
    public void setShowGrid(boolean showGrid) {
        this.showGrid = showGrid;
    }
    
    /**
     * change the showGrid flag on/off
     */
    public void toggleGrid() {
        showGrid = !showGrid;
    }

    /**
     * @return the showGridEditor
     */
    public boolean isShowGridEditor() {
        return showGridEditor;
    }

    /**
     * @param showGridEditor the showGridEditor to set
     */
    public void setShowGridEditor(boolean showGridEditor) {
        this.showGridEditor = showGridEditor;
    }

    /**
     * change the showGridEditor flag on/off
     */
    public void toggleGridEditor() {
        showGridEditor = !showGridEditor;
    }



    //</editor-fold>


}
