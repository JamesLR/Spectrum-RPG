 
import java.lang.System;
import java.util.Scanner;

public class BattleSystem
{   public static int attack, speed, health, choice, mpcost;
    public static int NMEattack, NMEhealth, NMEmagic, NMEspeed;
    public static boolean burnt = false;
    // ^^^ bunch of ints
    static Scanner kb = new Scanner(System.in);
    
    public static void Fight ()
    {
        playersAction(); // player starts their turn
    }
    
    public static void playersAction()
    {
        // player chooses their action
        System.out.println("\t 1- Attack");
        System.out.println("\t 2- Magic");
        System.out.println("\t 3- Supply");
        System.out.println("\t 4- Wait");
        choice = kb.nextInt();
        switch (choice)
        {   // what happens when the player chooses things
            case 1:
            System.out.println(" ");
            System.out.println("\t 1- Light");
            System.out.println("\t 2- Medium");
            System.out.println("\t 3- Heavy");
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
            
            if (speed > NMEspeed)
                {
                    System.out.println(" ");
                    System.out.println("The enemy attacked");
                    health = health - NMEattack;
                    System.out.println("Took " + NMEattack + " damage!");
                    System.out.println(" ");
                    System.out.println("Attacked the enemy");
                    NMEhealth = NMEhealth - attack; 
                    System.out.println("Dealt " + attack + " damage!");
                }
                
            if (speed <= NMEspeed)
                {
                    System.out.println(" ");
                    System.out.println("Attacked the enemy");
                    NMEhealth = NMEhealth - attack; 
                    System.out.println("Dealt " + attack + " damage!");
                    System.out.println(" ");
                    System.out.println("The enemy attacked");
                    health = health - NMEattack;
                    System.out.println("Took " + NMEattack + " damage!");
                }
                
            break;
            
            case 2:
            System.out.println(" ");
            System.out.println("\t 1- burn");
            System.out.println("\t 2- frost");
            System.out.println("\t 3- scorch");
            choice = kb.nextInt();
            switch (choice)
            {
                case 1:
                attack = 7;
                burnt = true;
                mpcost = 3;
                
                System.out.println(" ");
                System.out.println("A small fire billows around the enemy");
                NMEhealth = NMEhealth - attack;
                System.out.println("The enemy is burnt!");
                System.out.println("Dealt " + attack + " damage");
                
                break;
                
                case 2:
                attack = 8;
                mpcost = 2;
                
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
                
                System.out.println(" ");
                System.out.println("fire billows all around the enemy");
                NMEhealth = NMEhealth - attack;
                System.out.println("The enemy is badly burnt!");
                System.out.println("Dealt " + attack + " damage");
                
                break;
            }
            
            System.out.println(" ");
            System.out.println("The enemy attacked");
            health = health - NMEattack;
            System.out.println("Took " + NMEattack + " damage!");
            
            break;
            
        }
    }
}
