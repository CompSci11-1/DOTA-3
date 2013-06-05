/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

/**
 *
 * @author erickbassett
 */
public class CombatResults {
    private Boolean victory;

    /**
     * @return the victory
     */
    
    public CombatResults(Boolean victory){
        setVictory(victory);
    }
    
    public Boolean getVictory() {
        return victory;
    }

    /**
     * @param victory the victory to set
     */
    public void setVictory(Boolean victory) {
        this.victory = victory;
    }
    
}
