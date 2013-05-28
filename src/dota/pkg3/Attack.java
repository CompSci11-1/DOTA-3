/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

/**
 *
 * @author erickbassett
 */
public class Attack {
    private String name;
    private int minimumDamage;
    private int maximumDamage;
    private double hitChance;
    
    
    
    public Attack(String name, int minimumDamage, int maximumDamage, double hitChance){
        this.name = name;
        this.minimumDamage = minimumDamage;
        this.maximumDamage = maximumDamage;
        this.hitChance = hitChance;
    }

    public void addAttack(Attack attack){
        
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public int attack(Attack attack){
        int damage = 0;
        if(this.hitChance >= (Math.random())){
            damage = (int) (Math.round(this.minimumDamage + (Math.random() * (this.maximumDamage - this.minimumDamage))));
        } else {
            damage = -1;
        }
        return damage;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the minimumDamage
     */
    public int getMinimumDamage() {
        return minimumDamage;
    }
    
    public String getDisplay() {
        return String.format("%s [%d - %d: %.0f%%]", name, minimumDamage, maximumDamage, hitChance * 100);
    }

    /**
     * @param minimumDamage the minimumDamage to set
     */
    public void setMinimumDamage(int minimumDamage) {
        this.minimumDamage = minimumDamage;
    }

    /**
     * @return the maximumDamage
     */
    public int getMaximumDamage() {
        return maximumDamage;
    }

    /**
     * @param maximumDamage the maximumDamage to set
     */
    public void setMaximumDamage(int maximumDamage) {
        this.maximumDamage = maximumDamage;
    }

    /**
     * @return the hitChance
     */
    public double getHitChance() {
        return hitChance;
    }

    /**
     * @param hitChance the hitChance to set
     */
    public void setHitChance(double hitChance) {
        this.hitChance = hitChance;
    }

}
