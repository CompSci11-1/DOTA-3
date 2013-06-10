/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import audio.AudioPlayer;
import environment.Environment;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author kevin.lawrence
 */
public class MapEnvironment extends Environment implements PortalEventHandler, ItemEventHandler, CombatResultHandler {

    private Map forestEntrance;
    private Map campus;
    private Map forest;
    private Map mapToTown;
    private Map townWithForest;
    private Map houseMap;
    private Map storeMap;
    private Map level_one_map;
    private Map currentMap;
    private Point charXY = this.level_one_map.getGrid().getCellPosition(22, 10);
    private Boolean moved = true;
    private int movedCounter;
    private int stepcount;
    private Character character;
    private Enemy enemy;
    private ArrayList<Attack> moves;
    private ArrayList<Attack> enemyMoves;
    private String MOVE_SOUND = "sounds/step.wav";
    private CombatVisualizer combatVisualizer;
    private JDialog dialog;
    private Map.Direction direction;
    private Attack flame;
    private Attack poke;
    private Attack op;
    private Attack kameha;
    private Boolean stop = false;
    
    public static enum Direction {
        
        UP, DOWN, LEFT, RIGHT
    }

    @Override
    public void initializeEnvironment() {
        enemyMoves = new ArrayList<Attack>();
        enemyMoves.add(new Attack("Bite", 10, 15, 1));
        moves = new ArrayList<Attack>();
        op = new Attack("OP!!!", 100, 100, .05);
        flame = new Attack("Flame", 10, 30, .6);
        poke = new Attack("punch", 5, 10, .8);
        kameha = new Attack("Kamehameha", 30 , 50 , .6);
//        this.flame.attack(new Attack("Flame", 10, 30, .5));
//        this.kameha.attack(new Attack("Kamehameha", 30 , 50 , .8));
//        this.poke.attack(new Attack("poke", 1, 1, 1));
//        this.op.attack(new Attack("OP!!!", 9001, 9001, 1));
        moves.add(flame);
        moves.add(poke);
        moves.add(op);
        setEnemy(new Enemy("Bob", 100, enemyMoves, ResourceTools.loadImageFromResource("Resources/front_idle.png")));
        setCharacter(new Character(100, moves, ResourceTools.loadImageFromResource("Resources/front_idle.png")));
        setEnemy(getEnemy().getBee());
        setBackground(Color.BLACK);
        campus = MapFactory.getCampus();
        campus.setPortalHandler(this);
        campus.setItemHandler(this);
        

        forestEntrance = MapFactory.getForestEntrance();
        forestEntrance.setPortalHandler(this);
        forestEntrance.setItemHandler(this);
        forest = MapFactory.getForest();
        forest.setPortalHandler(this);
        forest.setItemHandler(this);
        townWithForest = MapFactory.getTownWithForest();
        townWithForest.setPortalHandler(this);
        townWithForest.setItemHandler(this);
        mapToTown = MapFactory.getMapToTown();
        mapToTown.setPortalHandler(this);
        mapToTown.setItemHandler(this);
        houseMap = MapFactory.getHouseMap();
        houseMap.setPortalHandler(this);
        houseMap.setItemHandler(this);
        storeMap = MapFactory.getStoreMap();
        storeMap.setPortalHandler(this);
        storeMap.setItemHandler(this);
        
        level_one_map = MapFactory.getLevelOneMainMap();
        level_one_map.setPortalHandler(this);
        level_one_map.setItemHandler(this);
        
        currentMap = level_one_map;

        MapFactory.addPortal(forestEntrance, new Point(16, -1), townWithForest, new Point(8, 40));
        MapFactory.addPortal(forestEntrance, new Point(15, -1), townWithForest, new Point(7, 40));
        MapFactory.addPortal(townWithForest, new Point(8, 40), forestEntrance, new Point(16, -1));
        MapFactory.addPortal(townWithForest, new Point(7, 40), forestEntrance, new Point(15, -1));

        MapFactory.addPortal(level_one_map, new Point(40, 4), storeMap, new Point(5, 11));
        MapFactory.addPortal(storeMap, new Point(5, 11), level_one_map, new Point(40, 5));
        MapFactory.addPortal(level_one_map, new Point(40, 15), houseMap, new Point(6, 9));
        MapFactory.addPortal(houseMap, new Point(6, 9), level_one_map, new Point(40, 15));
        MapFactory.addPortal(level_one_map, new Point(72, 10), mapToTown, new Point(-1, 9));
        MapFactory.addPortal(level_one_map, new Point(72, 9), mapToTown, new Point(-1, 8));
        MapFactory.addPortal(level_one_map, new Point(72, 11), mapToTown, new Point(-1, 10));
        MapFactory.addPortal(mapToTown, new Point(-1, 10), level_one_map, new Point(72, 11));
        MapFactory.addPortal(mapToTown, new Point(-1, 9), level_one_map, new Point(72, 10));
        MapFactory.addPortal(mapToTown, new Point(-1, 8), level_one_map, new Point(72, 9));
        MapFactory.addPortal(mapToTown, new Point(57, 8), campus, new Point(-1, 10));
        MapFactory.addPortal(mapToTown, new Point(57, 9), campus, new Point(-1, 11));
        MapFactory.addPortal(campus, new Point(-1, 10), mapToTown, new Point(57, 8));
        MapFactory.addPortal(campus, new Point(-1, 11), mapToTown, new Point(57, 9));
        MapFactory.addPortal(level_one_map, new Point(20, -1), forest, new Point(17, 44));
        MapFactory.addPortal(level_one_map, new Point(19, -1), forest, new Point(16, 44));
        MapFactory.addPortal(forest, new Point(16, 44), level_one_map, new Point(19, -1));
        MapFactory.addPortal(forest, new Point(17, 44), level_one_map, new Point(20, -1));
        MapFactory.addPortal(forest, new Point(14, -1), forestEntrance, new Point(10, 30));
        MapFactory.addPortal(forest, new Point(15, -1), forestEntrance, new Point(11, 30));
        MapFactory.addPortal(forestEntrance, new Point(11, 30), forest, new Point(15, -1));
        MapFactory.addPortal(forestEntrance, new Point(10, 30), forest, new Point(14, -1));


        AudioPlayer.play(ResourceTools.getResourceAsStream("sounds/compsci1.wav"));

        //AudioPlayer.play(ResourceTools.getResourceAsStream("sounds/compsci1.wav"));


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
        if (this.stop != true) {
        if (e.getKeyCode() == KeyEvent.VK_1) {
            this.currentMap = this.level_one_map;
            this.charXY = this.level_one_map.getGrid().getCellPosition(22, 10);
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            this.currentMap = this.forest;
            this.charXY = this.forest.getGrid().getCellPosition(22, 10);
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            this.currentMap = this.forestEntrance;
            this.charXY = this.forestEntrance.getGrid().getCellPosition(24, 6);
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            this.currentMap = this.townWithForest;
            this.charXY = this.townWithForest.getGrid().getCellPosition(22, 10);
        }
        if (e.getKeyCode() == KeyEvent.VK_5) {
            this.currentMap = this.mapToTown;
            this.charXY = this.mapToTown.getGrid().getCellPosition(22, 10);
        }
        if (e.getKeyCode() == KeyEvent.VK_6) {
            this.currentMap = this.campus;
            this.charXY = this.campus.getGrid().getCellPosition(22, 10);
        }
        if (e.getKeyCode() == KeyEvent.VK_7) {
            this.currentMap = this.storeMap;
            this.charXY = this.storeMap.getGrid().getCellPosition(5, 5);
        }
        if (e.getKeyCode() == KeyEvent.VK_8) {
            this.currentMap = this.houseMap;
            this.charXY = this.houseMap.getGrid().getCellPosition(3, 5);
        }

        //just some event testing code... remove later!
        if (e.isControlDown()) {
            if (e.getKeyCode() == KeyEvent.VK_M) {
                if (currentMap != null) {
                    System.out.println("Validate Move");
                    currentMap.validateCharacterMove(new Point(0, 0), Map.Direction.UP);
                }
            } else if (e.getKeyCode() == KeyEvent.VK_L) {
                if (currentMap != null) {
                    newCombatVisualizer();
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
                this.direction = Map.Direction.UP;
                if (this.currentMap.validateCharacterMove(this.currentMap.getCellLocation(charXY), Map.Direction.UP)) {
                    if (this.stepcount == 1) {
                        this.stepcount = 0;
                        getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/rear_step_1.png"));
                    } else {
                        getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/rear_step_2.png"));
                        this.stepcount += 1;
                    }

                    charXY.y -= 16;
                    this.moved = true;
                    AudioPlayer.play(ResourceTools.getResourceAsStream(MOVE_SOUND));
                }
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                this.direction = Map.Direction.LEFT;
                if (this.currentMap.validateCharacterMove(this.currentMap.getCellLocation(charXY), Map.Direction.LEFT)) {

                    if (this.stepcount == 1) {
                        this.stepcount = 0;
                        getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/left_step_1.png"));
                    } else {
                        getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/left_step_2.png"));
                        this.stepcount += 1;
                    }

                    charXY.x -= 16;
                    this.moved = true;
                    AudioPlayer.play(ResourceTools.getResourceAsStream(MOVE_SOUND));
                }
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                this.direction = Map.Direction.DOWN;
                if (this.currentMap.validateCharacterMove(this.currentMap.getCellLocation(charXY), Map.Direction.DOWN)) {

                    if (this.stepcount == 1) {
                        this.stepcount = 0;
                        getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/front_step_1.png"));
                    } else {
                        getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/front_step_2.png"));
                        this.stepcount += 1;
                    }

                    charXY.y += 16;
                    this.moved = true;
                    AudioPlayer.play(ResourceTools.getResourceAsStream(MOVE_SOUND));
                }
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                this.direction = Map.Direction.RIGHT;
                if (this.currentMap.validateCharacterMove(this.currentMap.getCellLocation(charXY), Map.Direction.RIGHT)) {

                    if (this.stepcount == 1) {
                        this.stepcount = 0;
                        getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/right_step_1.png"));
                    } else {
                        getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/right_step_2.png"));
                        this.stepcount += 1;

                    }

                    charXY.x += 16;
                    this.moved = true;
                    AudioPlayer.play(ResourceTools.getResourceAsStream(MOVE_SOUND));
                }
            }
        }
        }
    }

    private void newCombatVisualizer() {

//        this.combatVisualizer = new CombatVisualizer(this.getCharacter(), Enemy.getBee(), true, this);
        
        this.dialog = new JDialog();


        this.dialog.setModal(true);
        this.dialog.setTitle("Battle!");

        this.combatVisualizer = new CombatVisualizer(this.getCharacter(), this.enemy, this);
        this.dialog.add(this.combatVisualizer);
        this.dialog.setAlwaysOnTop(true);

        this.dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.dialog.setSize(new Dimension(540, 430));
        this.dialog.setVisible(true);
        this.dialog.setFocusable(true);

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
            getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/rear_idle.png"));
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/left_idle.png"));
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/front_idle.png"));
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            getCharacter().setImage(ResourceTools.loadImageFromResource("Resources/right_idle.png"));
        }

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
            this.getCharacter().drawCharacter(graphics, charXY);
        }
    }

    //<editor-fold defaultstate="collapsed" desc="PortalEventHandler Interface">
    @Override
    public void portalEvent(MapPortal portal) {
        System.out.println("Changing map...");
        currentMap = portal.getDestinationMap();
        charXY = this.currentMap.getGrid().getCellPosition(portal.getDestinationLocation());
        AudioPlayer.play(ResourceTools.getResourceAsStream("sounds/transporter.wav"));
    }
    //</editor-fold>

    
    
    //<editor-fold defaultstate="collapsed" desc="ItemEventHandler Interface">
    @Override
    public void itemEvent(MapItem item) {
//        if (item.getEnemy().getName().equals("Blobby")){
//            System.out.println("WOOOOT - found Blobby");
        this.enemy = item.getEnemy();
        newCombatVisualizer();
//            CombatVisualizer cv = new CombatVisualizer(this.getCharacter(), item.getEnemy(), true);
//        }
    }
    //</editor-fold>
    
    /**
     * @return the character
     */
    public Character getCharacter() {
        return character;
    }

    /**
     * @param character the character to set
     */
    public void setCharacter(Character character) {
        this.character = character;
    }

    /**
     * @return the enemy
     */
    public Enemy getEnemy() {
        return enemy;
    }

    /**
     * @param enemy the enemy to set
     */
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
//
//    @Override
//    public void combatEvent(CombatResults combatResults) {
////        this.combatVisualizer.close();
//        System.out.println("HI");
//    }

    @Override
    public void combatResultEvent(CombatResults result) {
        if (result.getVictory()) {
        if(this.enemy.getName() == Enemy.getBee().getName()){
            this.character.setHealth(this.character.getHealth() + 10);
        } 
        
        else if (this.enemy.getName() == Enemy.getSpider().getName()){
            if(!(this.character.getAttacks().contains(this.kameha))){
            this.character.getAttacks().add(this.kameha);
            }
       
            this.character.setHealth(this.character.getHealth() + 20);
            
        }
        
        
        this.dialog.dispose();
        this.currentMap.deleteMapItem(currentMap.getCellLocation(charXY), this.direction);
    }else {
            this.dialog.dispose();
            this.stop = true;
        }
    }

}
