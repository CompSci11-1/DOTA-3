/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import image.ResourceTools;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author erickbassett
 */
public class Enemy {
    private String name;
    private int health;
    private ArrayList<Attack> attacks;
    private Image enemyImage;
    
    
    public Enemy(String name, int health, ArrayList<Attack> attacks, Image enemyImage){
        this.name = name;
        this.health = health;
        this.attacks = attacks;
        this.enemyImage = enemyImage;
    }
    
    public int randomAttack(){
        System.out.println(this.attacks.size());
        int attackNumber = (int) Math.round(Math.random() * (this.attacks.size() - 1));
//        attackNumber += 1;
        return attackNumber;
    }
    
    public Attack getAttack(int attackNumber){
        return this.attacks.get(attackNumber);
    }
    
    public void clearAttacks(){
        this.attacks.clear();
    }
    
//    public Enemy getBlob(){
//        this.attacks.add(new Attack("Bounce", 5, 10, 1));
//        this.attacks.add(new Attack("Tackle", 10, 20,.7));
//        this.attacks.add(new Attack("Super Beam", 80, 100, .3));
//        this.setName("Blob");
//        this.setHealth(50);
//        this.setAttacks(attacks);
////        blob.attacks.add(new Attack("Bounce", 5, 10, 1));
////        blob.attacks.add(new Attack("Tackle", 10, 20,.7));
////        blob.attacks.add(new Attack("Super Beam", 80, 100, .3));
//        this.setEnemyImage(ResourceTools.loadImageFromResource("Resources/front_idle.png"));
//        
//        
//        return new Enemy(this.getName(), this.getHealth(),this.getAttacks(),this.getEnemyImage());
//    }
    
    public static Enemy getBee(){
        ArrayList<Attack> beeAttacks = new ArrayList<Attack>();
        beeAttacks.add(new Attack("Sting", 10, 15, 1));
        beeAttacks.add(new Attack("Tackle", 5, 10, 1));
        beeAttacks.add(new Attack("Super Beam", 80, 100, .3));

        return new Enemy("Bee", 30, beeAttacks , ResourceTools.loadImageFromResource("Resources/Bee.png"));
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the attacks
     */
    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    /**
     * @param attacks the attacks to set
     */
    public void setAttacks(ArrayList<Attack> attacks) {
        this.attacks = attacks;
    }

    /**
     * @return the enemyImage
     */
    public Image getEnemyImage() {
        return enemyImage;
    }

    /**
     * @param enemyImage the enemyImage to set
     */
    public void setEnemyImage(Image enemyImage) {
        this.enemyImage = enemyImage;
    }
}
