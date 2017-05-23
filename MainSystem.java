import java.lang.System;
import java.util.Scanner;

public class MainSystem
{   public static int attack, health, mp, fp, fatigue, xp, level, speed, choice, mpcost;
    public static int Enemy, NMEattack, NMEhealth, NMEspeed;
    public static boolean burnt = false;
    // ^^^ bunch of ints
    static Scanner kb = new Scanner(System.in);

    public static void main ()
    {
        TitleScreen();
        System.out.println("\f");
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.println("Are you a new player?");
        try
        { 
            Thread.sleep(2000);
        } catch (InterruptedException e){ }
        System.out.println(" ");
        System.out.println("I shouldn't be suprised honestly. Yet still, your presence seems almost unnatural to me.");
         try
        { 
            Thread.sleep(3000);
        } catch (InterruptedException e){ }
        System.out.println(" ");
        System.out.println("Regardless, I presume you are probably wondering what your purpose is here, correct?");
        System.out.println(" ");
        System.out.println("1- Yes");
        System.out.println("2- No");
        choice = kb.nextInt();
        switch (choice)
        {
            case 1:
        
            System.out.println("\f ");
            System.out.println("My name is Mecali. I am the protector of this world you are entering now.");
             try
             { 
            Thread.sleep(3000);
            } catch (InterruptedException e){ }
            System.out.println(" ");
            System.out.println("Some might call me a goddess, some might say that I am an ancient spirit.");
            System.out.println("Either way, my role remains the same.");
            System.out.println(" ");
            try
             { 
            Thread.sleep(4000);
            } catch (InterruptedException e){ }
            System.out.println("Recently, however, things in this world have become quite difficult.");
             try
             { 
            Thread.sleep(5000);
            } catch (InterruptedException e){ }
            System.out.println("\f");
            System.out.println("This is why you are here.");
            System.out.println(" ");
            System.out.println("I want to fix this world, and you are going to help me do it.");
            System.out.println("It is broken, mangle, in complete dissrepair. Impure creatures run amok across the land");
            System.out.println("Spiders, Melons, Cyknnigs, Ghiests, Skullarts, ");
            System.out.println("And worst of all... ");
             try
             { 
            Thread.sleep(9000);
            } catch (InterruptedException e){ }
            System.out.println(" ");
            System.out.println("HUMANS");
            
              try
             { 
            Thread.sleep(4000);
            } catch (InterruptedException e){ }
            System.out.println("\f");
            break;
            
            case 2:
            System.out.println("\f");
            System.out.println("No? Really?");
              try
             { 
            Thread.sleep(3000);
            } catch (InterruptedException e){ }
            System.out.println(" ");
            System.out.println("Very well then, if you insist");
            System.out.println(" ");
              try
             { 
            Thread.sleep(3000);
            } catch (InterruptedException e){ }
            break;
        }
        System.out.println("It is time... ");
        System.out.println(" ");
        try
             { 
            Thread.sleep(3000);
            } catch (InterruptedException e){ }
        System.out.println("Time to erase this impuRE world onCe and for all");
        System.out.println("Time to attoNe for my mSTtakeS");
         try
             { 
            Thread.sleep(4000);
            } catch (InterruptedException e){ }
        System.out.println("\f");
        System.out.println("You WILL assist me with This");
        System.out.println("Resist, AnD you wiLL suffer greaTly");
         try
             { 
            Thread.sleep(3000);
            } catch (InterruptedException e){ }
        System.out.println("\f");
        System.out.println(" ");
        try
             { 
            Thread.sleep(1000);
            } catch (InterruptedException e){ }
        System.out.print("I ");
        try
             { 
            Thread.sleep(1000);
            } catch (InterruptedException e){ }
        System.out.print("W");
        try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("I");
         try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("L");
          try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("L ");
          try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("K");
          try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("I");
         try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("L");
         try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("L ");
         try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("Y");
          try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("O");
          try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("U ");
         try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("A");
         try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("L");
         try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print("L");
         try
         { 
            Thread.sleep(3000);
        } catch (InterruptedException e){ }
        System.out.println("\f");
         try
         { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.println("The air is cool, a light breeze gentlely touching your face,");
        System.out.println("contrasting the warm stone wall behind you.");
        System.out.println("All around you trees of various breeds shimmer and dance in the moonlight, ");
        System.out.println("as if they are alive. ");
        System.out.println(" ");
        try
         { 
            Thread.sleep(4000);
        } catch (InterruptedException e){ }
        System.out.println("Beneath your feet the faint light of circuitry glows within the ground.");
        System.out.println("The circuits can be seen forming a path further down into the woods, ");
        System.out.println("although you cannot see were the path would lead.");
        System.out.println("To the left, something rustles behind the fraudulent greenery.");
        System.out.println(" ");
        try
         { 
            Thread.sleep(4000);
        } catch (InterruptedException e){ }
        System.out.println("1- Follow the path");
        System.out.println("2- Go to the left");
        System.out.println("3- Go to the right");
        choice = kb.nextInt();
        switch (choice)
        {
            case 1:
            System.out.println(" ");
            System.out.println("You continue along the path, unsure of where you truely are.");
            System.out.println("Before long, the feeling of a presence behind begins to grow and ");
            System.out.println("grow, until it feels as if it cant touch you at any second.");
             try
             { 
                 Thread.sleep(4000);
             }    catch (InterruptedException e){ }
            System.out.println(" ");
            System.out.println("1- Turn around");
            System.out.println("2- Run away");
            choice = kb.nextInt();
            switch (choice)
            {
                case 1:
                System.out.println("You turn around, and there is a monster right in front of you!");
                Enemy = 1;
                Fight();
                break;
                
                case 2:
                
            }
        }
        
    }

    public static void Lucius ()
    {
        int hp = 23;
        int mp = 8;
        int ap = 4;
        int ip = 8;
        int fp = 20;
        int xp = 0;
        int level = 1;
    }

    public static void Ena ()
    {
        int hp = 14;
        int mp = 20;
        int ap = 6;
        int fp = 9;
        int xp = 0;
        int level = 1;
    }

    public static void Pita ()
    {
        int hp = 17;
        int mp = 15;
        int ap = 7;
        int fp = 12;
        int xp = 0;
        int level = 1;
    }

    public static void Siren ()
    {
        int hp = 22;
        int mp = 17;
        int ap = 8;
        int fp = 5;
        int xp = 0;
        int level = 1;
    }

    public static void Lilac ()
    {
        int hp = 25;
        int mp = 10;
        int ap = 6;
        int fp = 20;
        int xp = 0;
        int level = 1;
    }

    public static void Jester ()
    {
        int hp = 18;
        int mp = 15;
        int ap = 5;
        int fp = 15;
        int xp = 0;
        int level = 1;
    }

    public static void Coo ()
    {
        int hp = 15;
        int mp = 14;
        int ap = 8;
        int fp = 13;
        int xp = 0;
        int level = 1;
    }

    public static void Beast ()
    {
        int hp = 17;
        int mp = 5;
        int ap = 6;
        int fp = 18;
        int xp = 0;
        int level = 1;
    }

    public static void Mjolnir ()
    {
        int hp = 23;
        int mp = 10;
        int ap = 9;
        int fp = 16;
        int xp = 0;
        int level = 1;
    }

    public static void Fight ()
    {
        /*
         * these are all various enemies that exist within the game.
         * They progressively get more and more difficult to defeat
         */

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

        while (NMEhealth > 0)
        {

            action(); // Enemy encounter begins
            System.out.println("\f"); 
            if (NMEhealth <= 0)
            {
                System.out.println("The Enemy has been slain!");
            }
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
        int i = 1;
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
            System.out.println("4-  <-- ");
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
                
                case 4:
                i = 2;
            }
             if (i== 1)
             {
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
            }
            break;

            case 2:
            System.out.println("\f");
            System.out.println("Select an action");
            System.out.println(" ");
            System.out.println("1- burn");
            System.out.println("2- frost");
            System.out.println("3- scorch");
            System.out.println("4 - <-- ");
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
                
                case 4:
                i = 2;
                break;
            }
             if (i== 1)
             {
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
            }
            break;

        }}
        
        public static void TitleScreen ()
        {
            System.out.println(" /   |-\\    |--    /--    --|--    |-\\        /\\       |");
            System.out.println("/    |-//   |__    |        |      |-/       /__\\      |");
            System.out.println(" \\   |      |      |        |      | \\      /    \\     |");
            System.out.println("/    |      |--    \\ --     |      |  \\    /      \\    |__");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("\t 1- Start Game ");
            System.out.println("\t 2- Exit ");
            choice = kb.nextInt();
            switch (choice)
            {
                case 1:
                break;
            }
        }
   }


