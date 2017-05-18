 
import java.lang.System;
import java.util.Scanner;

public class BattleSystem
{   public static int attack, speed, health, choice, mpcost;
    public static int Enemy, NMEattack, NMEhealth, NMEspeed;
    public static boolean burnt = false;
    // ^^^ bunch of ints
    static Scanner kb = new Scanner(System.in);
    
    public static void Fight ()
    {
        /*
         * these are all various enemies that exist within the game.
         * They progressively get more and more difficult to defeat
         */
        health = 25;
        Enemy = 5;
        if (Enemy == 1)
        {
            System.out.println("A small Chair-Spider attacked!");
            NMEattack = 2;
            NMEhealth = 10;
            NMEspeed = 7;
        }
        
        if (Enemy == 2)
        {
            System.out.println("A Cyknnig attack?!");
            NMEattack = 3;
            NMEhealth = 12;
            NMEspeed = 5;
        }
        
        if (Enemy == 3)
        {
            System.out.println("A Salatongue emerged!");
            NMEattack = 2;
            NMEhealth = 14;
            NMEspeed = 7;
        }
        
        
        if (Enemy == 4)
        {
            System.out.println("Am Armored Chair-Spider appeared!");
            NMEattack = 5;
            NMEhealth = 15;
            NMEspeed = 3;
        }
        
        
        if (Enemy == 5)
        {
            System.out.println("A rare case of Melongitas attacks!");
            NMEattack = 3;
            NMEhealth = 23;
            NMEspeed = 5;
        }
        
        if (Enemy == 6)
        {
            System.out.println("Who?");
            NMEattack = 7;
            NMEhealth = 30;
            NMEspeed = 5;
        }
        
        while (NMEhealth >= 0)
        {
            
            action(); // Enemy encounter begins
            System.out.println("\f"); 
            
        }
    }
    
    public static void action()
    {
        // player chooses their action
        System.out.println(" ");
        System.out.println("1- Attack");
        System.out.println("2- Magic");
        System.out.println("3- Supply");
        System.out.println("4- Wait");
        choice = kb.nextInt();
        switch (choice)
        {   // what happens when the player chooses things
            case 1:
            System.out.println("\f");
            System.out.println("Select an action");
            System.out.println(" ");
            System.out.println("1- Light");
            System.out.println("2- Medium");
            System.out.println("3- Heavy");
            choice = kb.nextInt();
            switch (choice)
            {
                case 1:
                attack = 4;
                speed = 9;
                
                case 2: 
                attack = 6;
                speed = 6;
                
                case 3:
                attack = 9;
                speed = 4;
                
            }
            
            if (speed <= NMEspeed)
                {
                    System.out.println("\f");
                    System.out.println("Select an action");
                    System.out.println(" ");
                    System.out.println("The enemy attacked");
                    health = health - NMEattack;
                    System.out.println("Took " + NMEattack + " damage!");
                    System.out.println(" ");
                    System.out.println("Attacked the enemy");
                    NMEhealth = NMEhealth - attack; 
                    System.out.println("Dealt " + attack + " damage!");
                }
                
            if (speed > NMEspeed)
                {
                    System.out.println("\f");
                    System.out.println("Select an action");
                    System.out.println(" ");
                    System.out.println("Attacked the enemy");
                    NMEhealth = NMEhealth - attack; 
                    System.out.println("Dealt " + attack + " damage!");
                    System.out.println(" ");
                    if (NMEhealth >= 0)
                    {
                        System.out.println("The enemy attacked");
                        health = health - NMEattack;
                        System.out.println("Took " + NMEattack + " damage!");
                    }
                }
                
            try
            { 
                Thread.sleep(3000);
            } catch (InterruptedException e){ }
            
            break;
            
            case 2:
            System.out.println("\f");
            System.out.println("Select an action");
            System.out.println(" ");
            System.out.println("1- burn");
            System.out.println("2- frost");
            System.out.println("3- scorch");
            choice = kb.nextInt();
            switch (choice)
            {
                case 1:
                attack = 7;
                burnt = true;
                mpcost = 3;
                
                System.out.println("\f");
                System.out.println("Select an action");
                System.out.println(" ");
                System.out.println("A small fire billows around the enemy");
                NMEhealth = NMEhealth - attack;
                System.out.println("The enemy is burnt!");
                System.out.println("Dealt " + attack + " damage");
                
                break;
                
                case 2:
                attack = 8;
                mpcost = 2;
                
                System.out.println("\f");
                System.out.println("Select an action");
                System.out.println(" ");
                System.out.println("The enemy is hit with a sudden chill");
                NMEhealth = NMEhealth - attack; 
                NMEspeed = NMEspeed - 2;
                System.out.println("The enemy Can't move as fast!");
                System.out.println("Dealt " + attack + " damage!");
                
                break;
                
                case 3:
                attack = 13;
                burnt = true;
                mpcost = 5;
                
                System.out.println("\f");
                System.out.println("Select an action");
                System.out.println(" ");
                System.out.println("fire billows all around the enemy");
                NMEhealth = NMEhealth - attack;
                System.out.println("The enemy is badly burnt!");
                System.out.println("Dealt " + attack + " damage");
                
                break;
            }
            
            if (NMEhealth >= 0)
             {
                 System.out.println(" ");
                 System.out.println("The enemy attacked");
                 health = health - NMEattack;
                 System.out.println("Took " + NMEattack + " damage!");
             }
             
             try
            { 
                Thread.sleep(3000);
            } catch (InterruptedException e){ }
            
            break;
            
        }
    }
}
