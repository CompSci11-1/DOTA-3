/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import image.ResourceTools;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author erickbassett
 */
public class CombatPanel extends javax.swing.JPanel {

    /**
     * Creates new form CombatPanel
     */
    
    public CombatPanel() {
        initComponents();
        initData();
    }
    
    
    
//    private ArrayList<Attack> moves;
    private Enemy enemy;
//    private ArrayList<Attack> enemyMoves;
    private Character character;
    private Boolean enemyVictory = false;
    private Boolean friendVictory = false;
    private EndCombatEventHandler CombatHandler;
    private CombatResults combatResults;
    
    
    private void initData(){
//        this.character = new Character(this.character.getHealth(), this.character.getAttacks(), this.character.getImage());
        
        
//        this.character.moves.add(new Attack("Flame", 10, 30, .5));
        hideAttacks();
        setBackground(ResourceTools.loadImageFromResource("Resources/tlotest2wi5.jpg"));
        setAttackButton(ResourceTools.loadImageFromResource("Resources/Attack.png"));
        this.jbtnReturn.setVisible(false);
        this.combatResults = new CombatResults(true);
//        this.setEnemy(new Enemy("Bob", 100, enemyMoves, ResourceTools.loadImageFromResource("Resources/front_idle.png")));
//        enemyMoves = new ArrayList<Attack>();
//        enemyMoves.add(new Attack("Bite", 10, 15, 1));
//        this.getEnemy().setAttacks(enemyMoves);
//        jlblEnemyHealth.setText(String.valueOf(this.getEnemy().getHealth()));
//        jlblYourHealth.setText(String.valueOf(character.getHealth()));
//        jlblEnemyImage.setIcon(new ImageIcon(ResourceTools.loadImageFromResource("Resources/front_idle.png")));
    }
    
    
    
    
    private void hideAttacks(){
//       this.jPanel1.setVisible(true);
//       this.jPanel2.setVisible(false); 
    }
    
    private void displayAttacks(){  
//        this.jPanel1.setVisible(false);
//        this.jPanel2.setVisible(true);
        if (this.character.getAttacks() != null){
            DefaultListModel listModel = new DefaultListModel();
            
            for(Attack attack : this.character.getAttacks()){
                listModel.addElement(attack.getDisplay());
            }
            this.jList1.setModel(listModel);
        }
    }
    
    private void victory(){
        setjlblMoves1("You have won!");
        setjlblMoves2("");
        setjlblMoves3("");
        setjlblMoves4("");
        setjlblMoves5("");
        setjlblMoves6("");
        this.combatResults.setVictory(true);
        this.jbtnReturn.setVisible(true);
    }
    
    private void defeat(){
        setjlblMoves1("You have lost!");
        setjlblMoves2("");
        setjlblMoves3("");
        setjlblMoves4("");
        setjlblMoves5("");
        setjlblMoves6("");
    }
    
    
    private void showMoves(Attack friendlyAttack, int friendlyDamage, Attack enemyAttack, int enemyDamage, String enemyName){
        this.setjlblMoves6(this.getjlblMoves4());
        this.setjlblMoves4(this.getjlblMoves2());
        if(friendlyDamage >= 0){
        this.setjlblMoves2("You used " + friendlyAttack.getName() + " dealing " + friendlyDamage);
        } else {
            this.setjlblMoves2("You missed!");
        }
        
        this.setjlblMoves5(this.getjlblMoves3());
        this.setjlblMoves3(this.getjlblMoves1());
        if(enemyDamage >= 0){
        this.setjlblMoves1(enemyName + " used " + enemyAttack.getName() + " dealing " + enemyDamage);
        } else {
            this.setjlblMoves1(enemyName + " used " + enemyAttack.getName() + " and missed!");
        }
    }
    
    private void processAttack(){
        if(!(this.friendVictory)){
            if (!(this.enemyVictory)){
        if (jList1.getSelectedIndex() != -1){
            Attack friendlyAttack = this.character.getAttacks().get(jList1.getSelectedIndex());
            int friendlyDamage = this.character.getAttacks().get(jList1.getSelectedIndex()).attack(this.character.getAttacks().get(jList1.getSelectedIndex()));
            if (friendlyDamage != -1){
                this.getEnemy().setHealth(this.getEnemy().getHealth() - friendlyDamage);
            jlblEnemyHealth.setText(String.valueOf(this.getEnemy().getHealth()));
            } else {
                System.out.println("miss!");
            }
            if (this.enemy.getHealth() <= 0){
                this.enemy.setHealth(0);
                jlblEnemyHealth.setText(String.valueOf(this.getEnemy().getHealth()));
                this.friendVictory = true;
            }
            if (!(this.friendVictory)){
            int enemyAttackNumber = this.getEnemy().randomAttack();
            System.out.println("enemy attack:" + enemyAttackNumber);
            Attack enemyAttack = this.getEnemy().getAttacks().get(enemyAttackNumber);
            int enemyDamage = this.getEnemy().getAttacks().get(enemyAttackNumber).attack(this.enemy.getAttack(enemyAttackNumber));
            if (enemyDamage != -1){
            this.character.setHealth(this.character.getHealth() - enemyDamage);
            jlblYourHealth.setText(String.valueOf(this.character.getHealth()));
            } else {
                System.out.println("enemy miss!");
            }
            showMoves(friendlyAttack, friendlyDamage, enemyAttack, enemyDamage, this.getEnemy().getName());
            if (this.character.getHealth() <= 0){
                this.character.setHealth(0);
                jlblYourHealth.setText(String.valueOf(this.getCharacter().getHealth()));
                defeat();
                this.enemyVictory = true;
            }
            } else {
                victory();
            }
            
//            System.out.printf("Selected attack = #%d %s\n",jList1.getSelectedIndex(), jList1.getSelectedValue().toString());
//            System.out.printf("Look up attack as %s\n", this.moves.get(jList1.getSelectedIndex()).getDisplay());
        }  
            }
        }
    }
    
    
    
    
    public void setEnemyName(String enemyName) {
        this.jlblEnemyName.setText(enemyName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlblEnemyName = new javax.swing.JLabel();
        jlblEnemyHealth = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnAttack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlistMoves = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jlblMoves6 = new javax.swing.JLabel();
        jlblMoves5 = new javax.swing.JLabel();
        jlblMoves4 = new javax.swing.JLabel();
        jlblMoves3 = new javax.swing.JLabel();
        jlblMoves2 = new javax.swing.JLabel();
        jlblMoves1 = new javax.swing.JLabel();
        jlblEnemyImage = new javax.swing.JLabel();
        jlblYourHealth = new javax.swing.JLabel();
        jbtnReturn = new javax.swing.JButton();
        jlblBackground = new javax.swing.JLabel();

        jlblEnemyName.setText("jLabel1");
        jlblEnemyName.setBounds(90, 20, 45, 16);
        jLayeredPane1.add(jlblEnemyName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlblEnemyHealth.setBounds(160, 20, 60, 20);
        jLayeredPane1.add(jlblEnemyHealth, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbtnAttack.setText("Attack");
        jbtnAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAttackActionPerformed(evt);
            }
        });
        jbtnAttack.setBounds(80, 360, 85, 29);
        jLayeredPane2.add(jbtnAttack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlistMoves.setViewportView(jList1);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jlistMoves, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jlistMoves, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel2.setBounds(30, 270, 190, 90);
        jLayeredPane2.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlblMoves6.setBounds(310, 260, 220, 20);
        jLayeredPane2.add(jlblMoves6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlblMoves5.setBounds(310, 280, 210, 20);
        jLayeredPane2.add(jlblMoves5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlblMoves4.setBounds(310, 300, 210, 20);
        jLayeredPane2.add(jlblMoves4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlblMoves3.setBounds(310, 320, 210, 20);
        jLayeredPane2.add(jlblMoves3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlblMoves2.setBounds(310, 340, 210, 20);
        jLayeredPane2.add(jlblMoves2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlblMoves1.setBounds(310, 360, 210, 20);
        jLayeredPane2.add(jlblMoves1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlblEnemyImage.setBounds(170, 30, 250, 190);
        jLayeredPane2.add(jlblEnemyImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlblYourHealth.setText("jLabel1");
        jlblYourHealth.setBounds(350, 20, 45, 16);
        jLayeredPane2.add(jlblYourHealth, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbtnReturn.setText("Return");
        jbtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReturnActionPerformed(evt);
            }
        });
        jbtnReturn.setBounds(220, 360, 85, 29);
        jLayeredPane2.add(jbtnReturn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlblBackground.setText("jLabel1");
        jlblBackground.setBounds(0, -20, 640, 450);
        jLayeredPane2.add(jlblBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(0, 0, 640, 450);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAttackActionPerformed
        processAttack();
        hideAttacks();
    }//GEN-LAST:event_jbtnAttackActionPerformed

    private void jbtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReturnActionPerformed
        CombatResults combatResults = new CombatResults(true);
        getCombatHandler().combatEvent(combatResults);
    }//GEN-LAST:event_jbtnReturnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnAttack;
    private javax.swing.JButton jbtnReturn;
    private javax.swing.JLabel jlblBackground;
    private javax.swing.JLabel jlblEnemyHealth;
    private javax.swing.JLabel jlblEnemyImage;
    private javax.swing.JLabel jlblEnemyName;
    private javax.swing.JLabel jlblMoves1;
    private javax.swing.JLabel jlblMoves2;
    private javax.swing.JLabel jlblMoves3;
    private javax.swing.JLabel jlblMoves4;
    private javax.swing.JLabel jlblMoves5;
    private javax.swing.JLabel jlblMoves6;
    private javax.swing.JLabel jlblYourHealth;
    private javax.swing.JScrollPane jlistMoves;
    // End of variables declaration//GEN-END:variables
/**
     * @return the character
     */
    public Character getCharacter() {
        return character;
    }
        
    public void setAttackButton(Image image){
        jbtnAttack.setIcon(new ImageIcon(image));
    }
    

    public void setBackground(Image image){
        jlblBackground.setIcon(new ImageIcon(image));
    }
    
    public void setCharacter(Character character) {
        this.character = character;
        jlblYourHealth.setText(String.valueOf(character.getHealth()));
        displayAttacks();
    }

    public void setjlblMoves6(String input){
        jlblMoves6.setText(input);
    }
    
    public String getjlblMoves6(){
        return jlblMoves6.getText();
    }
    
    public void setjlblMoves5(String input){
        jlblMoves5.setText(input);
    }
    
    public String getjlblMoves5(){
        return jlblMoves5.getText();
    }
    public void setjlblMoves4(String input){
        jlblMoves4.setText(input);
    }
    
    public String getjlblMoves4(){
        return jlblMoves4.getText();
    }
    public void setjlblMoves3(String input){
        jlblMoves3.setText(input);
    }
    
    public String getjlblMoves3(){
        return jlblMoves3.getText();
    }
    public void setjlblMoves2(String input){
        jlblMoves2.setText(input);
    }
    
    public String getjlblMoves2(){
        return jlblMoves2.getText();
    }
    public void setjlblMoves1(String input){
        jlblMoves1.setText(input);
    }
    
    public String getjlblMoves1(){
        return jlblMoves1.getText();
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
        jlblEnemyHealth.setText(String.valueOf(this.getEnemy().getHealth()));
        jlblEnemyImage.setIcon(new ImageIcon(this.enemy.getEnemyImage()));
    }

    /**
     * @return the CombatHandler
     */
    public EndCombatEventHandler getCombatHandler() {
        return CombatHandler;
    }

    /**
     * @param CombatHandler the CombatHandler to set
     */
    public void setCombatHandler(EndCombatEventHandler CombatHandler) {
        this.CombatHandler = CombatHandler;
    }

    
    
}
