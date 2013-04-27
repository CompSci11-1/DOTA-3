/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import java.awt.Point;

/**
 *
 * @author kevin.lawrence
 */
public class MapObstacle {

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public MapObstacle(Point location, ObstacleType type){
        this.location = location;
        this.type = type;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private ObstacleType type = ObstacleType.WALL;
    private Point location = new Point(0,0);
    /**
     * @return the type
     */
    public ObstacleType getType() {
        return type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType(ObstacleType type) {
        this.type = type;
    }
    
    /**
     * @return the location
     */
    public Point getLocation() {
        return location;
    }
    
    /**
     * @param location the location to set
     */
    public void setLocation(Point location) {
        this.location = location;
    }
    //</editor-fold>    
}
