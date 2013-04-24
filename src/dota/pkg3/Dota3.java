/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dota.pkg3;

import environment.ApplicationStarter;
import environment.Environment;
import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JFrame;

/**
 *
 * @author erickbassett
 */
public class Dota3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        startDotaEnvironment();
        newWindow();
        
    }
    
//    private static void startDotaEnvironment(){
//        String[] args = new String[0];
//        String appName = "Dota 3";
//        Dimension appSize = new Dimension(1200, 700);
////        Dimension appSize = new Dimension(900, 500);
////        Image background = ResourceTools.loadImageFromResource("");
//
//        Environment environment = new DotaEnvironment();
//        ApplicationStarter.run(args, appName, appSize, environment);
//    }
     private static void newWindow() {
        JFrame frame = new JFrame("Menu");

        MainMenu cp = new MainMenu();
        frame.add(cp);
        frame.setAlwaysOnTop(false);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(new Dimension(400, 350));
        frame.setVisible(true);
    }
}
