/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minigame;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author ch.schaefer
 */


public class Minigame {

    public static void main(String[] args) {
        
    
        Point spielerPosition = new Point ( 10, 9);
        Point schlangePosition = new Point ( 15, 5);
        Point goldPosition = new Point ( 8, 6);
        Point tuerPosition = new Point ( 2, 5);
        boolean weiter = true;
        boolean goldEingesammelt = false; 
        while(weiter){
        for (int y =0;y<10;y++)
        {
        for (int x =0;x<40;x++)
        {
        Point p = new Point ( x, y);
        if (p.equals(spielerPosition))
        System.out.print("P");
        else if(p.equals(schlangePosition))
        System.out.print("S");
        else if (p.equals(goldPosition))
        System.out.print("G");      
        else if (p.equals(tuerPosition))
        System.out.print("T");
        else 
        System.out.print(".");
        
            }//for (int x =0;x<40;x++)
        System.out.println();
   
        }// for (int y =0;y<10;y++)
         if(schlangePosition.equals(spielerPosition))
         {
             weiter = false;
             System.out.println("Die Schlange hat dich erwischt! ");
         }
         if(spielerPosition.equals(goldPosition)){
         goldEingesammelt = true; 
         goldPosition = new Point (1,1);
         }
         if (spielerPosition.equals(tuerPosition)&& goldEingesammelt){
         weiter = false;
         System.out.println("Gewonnen");
         }
         
         
         
         
        bewegeSpieler(spielerPosition);
          bewegeSchlange(schlangePosition, spielerPosition);
        
        }//public static void main(String[] args)
    }
   
     private static void bewegeSchlange(Point schlangePosition, Point spielerPosition) {
        if (spielerPosition.x < schlangePosition.x)
        schlangePosition.x--;
        else if (spielerPosition.x > schlangePosition.x)
            schlangePosition.x++;
         if (spielerPosition.y < schlangePosition.y)
        schlangePosition.y--;
        else if (spielerPosition.y > schlangePosition.y)
            schlangePosition.y++;
         
         
    }
    
    private static void bewegeSpieler(Point spielerPosition) {
       Scanner scan = new Scanner ( System.in);
       String input = scan.next();
       
         if (input.equals("w")) {
            if (spielerPosition.y > 0)
                spielerPosition.y--;
        } else if (input.equals("s")) {
            if (spielerPosition.y < 9)
                spielerPosition.y++;
        } else if (input.equals("a")) {
            if (spielerPosition.x > 0)
                spielerPosition.x--;
        } else if (input.equals("d")) {
            if (spielerPosition.x < 39 )
                spielerPosition.x++;
               
       }
    }

    

    }//public class Minigame

