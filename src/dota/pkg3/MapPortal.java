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
public class MapPortal {

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public MapPortal(Point location, Map destinationMap, Point destinationLocation) {
        this.location = location;
        this.destinationMap = destinationMap;
        this.destinationLocation = destinationLocation;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private Point location;
    private Point destinationLocation;
    private Map destinationMap;

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

    /**
     * @return the destinationLocation
     */
    public Point getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * @param destinationLocation the destinationLocation to set
     */
    public void setDestinationLocation(Point destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /**
     * @return the destinationMap
     */
    public Map getDestinationMap() {
        return destinationMap;
    }

    /**
     * @param destinationMap the destinationMap to set
     */
    public void setDestinationMap(Map destinationMap) {
        this.destinationMap = destinationMap;
    }
    //</editor-fold>
}
