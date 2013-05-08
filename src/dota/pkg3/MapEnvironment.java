/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.Environment;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author kevin.lawrence
 */
public class MapEnvironment extends Environment implements PortalEventHandler {

    private Map storeMap;
    private Map level_one_map;
    private Map currentMap;
    private Character character;
    private Point charXY = this.level_one_map.getGrid().getCellPosition(22, 10);
    private int charY = 0;
    private Boolean moved = true;
    private int movedCounter;
    private int stepcount;

    @Override
    public void initializeEnvironment() {
        setBackground(Color.BLACK);
        storeMap = MapFactory.getStoreMap();
        storeMap.setPortalHandler(this);
        level_one_map = MapFactory.getLevelOneMainMap();
        level_one_map.setPortalHandler(this);
        currentMap = level_one_map;
        character = new Character(ResourceTools.loadImageFromResource("Resources/front_idle.png"));

//            public static void addPortal(Map startMap, Point startLocation, Map destinationMap, Point destinationLocation){

        MapFactory.addPortal(level_one_map, new Point(40, 4), storeMap, new Point(5, 10));
        MapFactory.addPortal(storeMap, new Point(5, 10), level_one_map, new Point(40, 5));
//        MapFactory.addPortal(storeMap, this.storeMap.getGrid().getCellPosition(5, 14), level_one_map, level_one_map.getGrid().getCellPosition(16, 16));
    }

    @Override
    public void timerTaskHandler() {
        if (this.moved != null) {
            if (this.moved) {
                this.movedCounter += 1;
                if (this.movedCounter >= 2) {
                    this.moved = false;
                    this.movedCounter = 0;
                }
            }
        }
//        throw new UnsupportedOperationException("Not supported yet.");
    }
//validateLocation(Point cellLocation)

    @Override
    public void keyPressedHandler(KeyEvent e) {

        //just some event testing code... remove later!
        if (e.isControlDown()) {
            if (e.getKeyCode() == KeyEvent.VK_M) {
                if (currentMap != null) {
                    System.out.println("Validate Move");
                    currentMap.validateCharacterMove(new Point(0, 0), Map.Direction.UP);
                }
            } else if (e.getKeyCode() == KeyEvent.VK_L) {
                if (currentMap != null) {
//                    System.out.println("Validate Location");
//                    currentMap.validateLocation(new Point(0, 0));
                }
            } else if (e.getKeyCode() == KeyEvent.VK_G) {
                if (currentMap != null) {
                    System.out.println("Toggle Grid");
                    currentMap.toggleGrid();
                }
            } else if (e.getKeyCode() == KeyEvent.VK_E) {
                if (currentMap != null) {
                    System.out.println("Toggle Grid Editor");
                    currentMap.toggleGridEditor();
                }
            }
        }
        if (!(this.moved)) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                if (this.currentMap.validateCharacterMove(this.currentMap.getCellLocation(charXY), Map.Direction.UP)) {
                    if (this.stepcount == 1) {
                        this.stepcount = 0;
                        character = new Character(ResourceTools.loadImageFromResource("Resources/rear_step_1.png"));
                    } else {
                        character = new Character(ResourceTools.loadImageFromResource("Resources/rear_step_2.png"));
                        this.stepcount += 1;
                    }

                    charXY.y -= 16;
                    this.moved = true;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                if (this.currentMap.validateCharacterMove(this.currentMap.getCellLocation(charXY), Map.Direction.LEFT)) {

                    if (this.stepcount == 1) {
                        this.stepcount = 0;
                        character = new Character(ResourceTools.loadImageFromResource("Resources/left_step_1.png"));
                    } else {
                        character = new Character(ResourceTools.loadImageFromResource("Resources/left_step_2.png"));
                        this.stepcount += 1;
                    }

                    charXY.x -= 16;
                    this.moved = true;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                if (this.currentMap.validateCharacterMove(this.currentMap.getCellLocation(charXY), Map.Direction.DOWN)) {

                    if (this.stepcount == 1) {
                        this.stepcount = 0;
                        character = new Character(ResourceTools.loadImageFromResource("Resources/front_step_1.png"));
                    } else {
                        character = new Character(ResourceTools.loadImageFromResource("Resources/front_step_2.png"));
                        this.stepcount += 1;
                    }

                    charXY.y += 16;
                    this.moved = true;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                if (this.currentMap.validateCharacterMove(this.currentMap.getCellLocation(charXY), Map.Direction.RIGHT)) {

                    if (this.stepcount == 1) {
                        this.stepcount = 0;
                        character = new Character(ResourceTools.loadImageFromResource("Resources/right_step_1.png"));
                    } else {
                        character = new Character(ResourceTools.loadImageFromResource("Resources/right_step_2.png"));
                        this.stepcount += 1;
                    }

                    charXY.x += 16;
                    this.moved = true;
                }
            }
        }
    }

    private void validateCellAtSystemCoordinate(Point systemCoordinate) {
        if (currentMap != null) {
            System.out.printf("Validating system coordinate [%d, %d]\n", systemCoordinate.x, systemCoordinate.y);
            Point cellLocation = currentMap.getCellLocation(systemCoordinate);
            System.out.printf("    Cell Location [%d, %d]\n", cellLocation.x, cellLocation.y);
            currentMap.validateLocation(cellLocation);
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            character = new Character(ResourceTools.loadImageFromResource("Resources/rear_idle.png"));
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            character = new Character(ResourceTools.loadImageFromResource("Resources/left_idle.png"));
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            character = new Character(ResourceTools.loadImageFromResource("Resources/front_idle.png"));
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            character = new Character(ResourceTools.loadImageFromResource("Resources/right_idle.png"));
        }

//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        if (e.isControlDown()) {
            validateCellAtSystemCoordinate(e.getPoint());
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        if (currentMap != null) {
//            graphics.drawImage(currentMap.getBackground(), 10, 10, null);
            currentMap.drawMap(graphics);
            this.character.drawCharacter(graphics, charXY);
        }
    }

    //<editor-fold defaultstate="collapsed" desc="PortalEventHandler Interface">
    @Override
    public void portalEvent(MapPortal portal) {
        System.out.println("Changing map...");
        currentMap = portal.getDestinationMap();
        charXY = this.currentMap.getGrid().getCellPosition(portal.getDestinationLocation());
    }
    //</editor-fold>
}
