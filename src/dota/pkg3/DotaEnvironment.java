/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.ApplicationStarter;
import environment.Environment;
import environment.Grid;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author erickbassett
 */
public class DotaEnvironment extends Environment {
private Boolean combat = true;
    private Grid masterGrid;
    private int gridX = -200;
    private int gridY = -200;
    private Wall stone;
    private int charX = 580;
    private int charY = 340;
    private Boolean moved = true;
    private int movedCounter = 0;
    private Boolean travel = true;
    private Character character;

    public Grid getMasterGrid() {
        return masterGrid;
    }

    public void setMasterGrid(Grid masterGrid) {
        this.masterGrid = masterGrid;
    }

    @Override
    public void initializeEnvironment() {

        setMasterGrid(new Grid());
        if (getMasterGrid() != null) {
            getMasterGrid().setPosition(new Point(this.gridX, this.gridY));
            getMasterGrid().setRows(49);
            getMasterGrid().setColumns(73);
            getMasterGrid().setColor(new Color(255, 0, 225));
            getMasterGrid().setCellHeight(20);
            getMasterGrid().setCellWidth(20);
        }

        this.stone = new Wall();
        this.stone.start(this.masterGrid);
        this.character = new Character();
//        this.stone.setColor(Color.black);
    }

    @Override
    public void timerTaskHandler() {
        getMasterGrid().setPosition(new Point(this.gridX, this.gridY));
        this.stone.update(this.masterGrid);
//        System.out.println("hi");
        if (this.moved != null) {
            if (this.moved) {
                this.movedCounter += 1;
                if (this.movedCounter >= 2) {
                    this.moved = false;
                    this.movedCounter = 0;
                }
            }
        }
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (travel) {
            if (!(this.moved)) {
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    this.moved = true;
                    if (this.stone.hitDetection(this.masterGrid, "up", charX, charY)) {
                        this.gridY = this.gridY + 20;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_A) {
                    this.moved = true;
                    if (this.stone.hitDetection(this.masterGrid, "left", charX, charY)) {
                        this.gridX = this.gridX + 20;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_S) {
                    this.moved = true;
                    if (this.stone.hitDetection(this.masterGrid, "down", charX, charY)) {
                        this.gridY = this.gridY - 20;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_D) {
                    this.moved = true;
                    if (this.stone.hitDetection(this.masterGrid, "right", charX, charY)) {
                        this.gridX = this.gridX - 20;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_L) {
                    combat = true;
                    run();
                } else if (e.getKeyCode() == KeyEvent.VK_K) {
                    combat = false;
                    run();
                }
            }
        }
    }
public static final Dimension DEFAULT_WINDOW_SIZE = new Dimension(900, 600);
    JFrame frame = new JFrame("combat");
    public void run(String[] args, String appName, Dimension appSize, Environment environment) {
//        JFrame frame = new JFrame(appName);
        frame.add(environment);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(appSize);
        frame.setFocusable(true);
        frame.setVisible(combat);
    }

    public void run() {
         Environment environment = new combatEnvironment();
        run(new String[0], "combat", DEFAULT_WINDOW_SIZE, environment);
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (travel) {
            this.stone.draw(graphics, this.masterGrid);
            getMasterGrid().paintComponent(graphics);
            this.character.drawCharacter(graphics, charX, charY);
//        graphics.setColor(Color.blue);
//        graphics.fillOval(charX, charY, 20, 20);
//        graphics.setColor(Color.gray);
//        graphics.fillRect(this.masterGrid.getCellPosition(30, 30).x, this.masterGrid.getCellPosition(30, 30).y, 20, 20);
        }
    }
}
