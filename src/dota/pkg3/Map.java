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

    public static enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public static enum MovementEventType {
        OBSTACLE, ITEM, PORTAL
    }

    public interface MovementEventHander {
        public void MovementEvent(MovementEventType me);
        //probably need more information here... like location
    }
    
    private MovementEventHander obstacleHandler;
    private MovementEventHander portalHandler;
    private MovementEventHander itemHandler;
    
    private ArrayList<Point> obstacles = new ArrayList<Point>();
    private ArrayList<Point> portals = new ArrayList<Point>();
    private ArrayList<Point> items = new ArrayList<Point>();
    private Image background;
    private Grid grid;

    private Map(Image background, Dimension gridCellSize, Dimension gridSize) {
        this.background = background;

        this.grid = new Grid();

        this.grid.setRows(gridSize.width);
        this.grid.setColumns(gridSize.height);

        this.grid.setCellWidth(gridCellSize.width);
        this.grid.setCellHeight(gridCellSize.height);
    }

    public Point getMovementCellLocation(Point currentLocation, Direction movementDirection){
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
    
    public boolean validateCharacterMove(Point characterCellLocation, Direction direction) {

        if (hitTest(getMovementCellLocation(characterCellLocation, direction), obstacles)) {
            System.out.println("Ouch... that hurt!");
            //put an event handler here... something like
            if (obstacleHandler != null){
                obstacleHandler.MovementEvent(MovementEventType.OBSTACLE);
            }
            return false;
        }

        if (hitTest(getMovementCellLocation(characterCellLocation, direction), portals)) {
            System.out.println("Hey... need to go somewhere else!");
            //put an event handler here!
            if (portalHandler != null){
                portalHandler.MovementEvent(MovementEventType.OBSTACLE);
            }
        }

        if (hitTest(getMovementCellLocation(characterCellLocation, direction), items)) {
            System.out.println("Hey... found something!");
            //put an event handler here!
            if (itemHandler != null){
                itemHandler.MovementEvent(MovementEventType.OBSTACLE);
            }
        }

        return true;
    }
    
    public boolean hitTest(Point cellLocation, ArrayList<Point> locations){
        for (Point location : locations){
            if (location.equals(cellLocation)){
                return true;
            }
        }
        return false;
    }
}