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

/**
 *
 * @author erickbassett
 */
public class Dota3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startDotaEnvironment();
    }
    
    private static void startDotaEnvironment(){
        String[] args = new String[0];
        String appName = "Dota 3";
        Dimension appSize = new Dimension(1200, 700);
//        Dimension appSize = new Dimension(900, 500);
//        Image background = ResourceTools.loadImageFromResource("");

        Environment environment = new DotaEnvironment();
        ApplicationStarter.Run(args, appName, appSize, environment);
    }
}
