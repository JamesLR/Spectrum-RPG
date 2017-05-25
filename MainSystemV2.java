
import java.lang.System;
import java.util.Scanner;

public class MainSystemV2
{
    public static int attack, health, mp, fp, fatigue, xp, level, speed, choice, mpcost;
    public static int Enemy, NMEattack, NMEhealth, NMEspeed;
    public static boolean burnt = false;
    public static boolean hate = false;
    // ^^^ bunch of ints
    static Scanner chk = new Scanner(System.in);

    public static void main ()
    {
        TitleScreen();
        int tutorial = 1;
        while (tutorial == 1)
        {
        System.out.println("\f");
        System.out.println("How to play:");
        System.out.println(" ");
        System.out.println("Basic reading ability is required for full enjoyment");
        System.out.println("The choices you make change how the game progresses");
        System.out.println("To make choices, including actions in combat,a prompt");
        System.out.println("will appear. When this occurs, press the button ");
        System.out.println("corresponding to the action you wish to select ");
        System.out.println("(i.e. 1, 2, 3, or 4).");
        System.out.println("Otherwise, just sit back and wait for more dialogue.");
        System.out.println(" ");
        System.out.println("Understood?");
        System.out.println(" ");
        System.out.println("1- Yes");
        System.out.println("2- No");
        choice = chk.nextInt();
        
        switch (choice)
        {
            case 1:
            System.out.println("\f");
            System.out.println("Good.");
            System.out.println("Then let us start the Game.");
              try
              { 
                  Thread.sleep(4000);
              } catch (InterruptedException e){ }
            System.out.println("\f");
            tutorial = 2;
            break;
            
            case 2:
            System.out.println("\f");
            System.out.println("What, can you not read?");
             try
              { 
                  Thread.sleep(4000);
              } catch (InterruptedException e){ }
            System.out.println(" ");
            System.out.println("...");
            System.out.println("Ugh, fine. Let's try this again.");
             try
              { 
                  Thread.sleep(4000);
              } catch (InterruptedException e){ }
            System.out.println("\f");
        }
        }
        System.out.println("Please select a character.");
        System.out.println(" ");
        System.out.println("1- Lucius ");
        System.out.println("2- Ena ");
        System.out.println("3- Pita");
        System.out.println("4- Lilac");
        System.out.println("5- Siren");
        System.out.println("6- Jester");
        System.out.println("7- Coo ");
        System.out.println("8- Beast");
        System.out.println("9- Mjolnir");
        choice = chk.nextInt();
        switch (choice)
        {
            case 1:
            Lucius();
            case 2: 
            Ena();
            case 3:
            Pita();
            case 4:
            Lilac();
            case 5:
            Siren();
            case 6:
            Jester();
            case 7:
            Coo();
            case 8:
            Beast();
            case 9:
            Mjolnir();
        }
        System.out.println("\f");
        try
        { 
            Thread.sleep(3000);
        } catch (InterruptedException e){ }
        System.out.println("Now loading");
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print(".");
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print(".");
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.println(".");
        try
        { 
            Thread.sleep(3000);
        } catch (InterruptedException e){ }
        System.out.println("\f");
   
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.println("Are you a new player?");
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.println(" ");
        System.out.println("I shouldn't be suprised honestly. Yet still, your presence seems almost unnatural to me.");
         try
        { 
            Thread.sleep(45000);
        } catch (InterruptedException e){ }
        System.out.println(" ");
        System.out.println("Regardless, I presume you are probably wondering what your purpose is here, correct?");
        System.out.println(" ");
        System.out.println("1- Yes");
        System.out.println("2- No");
        choice = chk.nextInt();
        switch (choice)
        {
            case 1:
        
            System.out.println("\f ");
            System.out.println("My name is Mecali. I am the protector of this world you are entering now.");
             try
             { 
            Thread.sleep(4000);
            } catch (InterruptedException e){ }
            System.out.println(" ");
            System.out.println("Some might call me a goddess, some might say that I am an ancient spirit.");
            System.out.println("Either way, my role remains the same.");
            System.out.println(" ");
            try
             { 
            Thread.sleep(6000);
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
            Thread.sleep(12000);
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
            Thread.sleep(4000);
            } catch (InterruptedException e){ }
        System.out.println("Time to erase this impuRE world onCe and for all");
        System.out.println("Time to attoNe for my mSTtakeS");
         try
             { 
            Thread.sleep(6000);
            } catch (InterruptedException e){ }
        System.out.println("\f");
        System.out.println("You WILL assist me with This");
        System.out.println("Resist, AnD you wiLL suffer greaTly");
         try
             { 
            Thread.sleep(6000);
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
        System.out.println("Now loading");
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print(".");
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.print(".");
        try
        { 
            Thread.sleep(1000);
        } catch (InterruptedException e){ }
        System.out.println(".");
        try
        { 
            Thread.sleep(1000);
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
            Thread.sleep(7000);
        } catch (InterruptedException e){ }
        System.out.println("Beneath your feet the faint light of circuitry glows within the ground.");
        System.out.println("The circuits can be seen forming a path further down into the woods, ");
        System.out.println("although you cannot see were the path would lead.");
        System.out.println("To the left, something rustles behind the fraudulent greenery.");
        System.out.println(" ");
        try
         { 
            Thread.sleep(7000);
        } catch (InterruptedException e){ }
        System.out.println("1- Follow the path");
        System.out.println("2- Go to the left");
        System.out.println("3- Go to the right");
        choice = chk.nextInt();
        switch (choice)
        {
            case 1:
            System.out.println("\f");
            System.out.println("You continue along the path, unsure of where you truely are.");
            System.out.println("Before long, the feeling of a presence behind begins to grow and ");
            System.out.println("grow, until it feels as if it cant touch you at any second.");
             try
             { 
                 Thread.sleep(6000);
             }    catch (InterruptedException e){ }
            System.out.println(" ");
            System.out.println("1- Turn around");
            System.out.println("2- Run away");
            choice = chk.nextInt();
            switch (choice)
            {
                case 1:
                System.out.println("\f");
                System.out.println("You turn around, and there is a monster right in front of you!");
                try
                { 
                 Thread.sleep(4000);
                }    catch (InterruptedException e){ }
                
                Enemy = 1;
                Fight();
                try
                { 
                 Thread.sleep(4000);
                }    catch (InterruptedException e){ }
                System.out.println("\f");
                System.out.println("\f");
                System.out.println("After that harrowing encounter, you continue along the path.");
                System.out.println("As you walk, you wonder to yourself why the ground could be damp");
                System.out.println("if there is so much circuitry within it. Wouldn't it just break?");
                System.out.println("And speaking of which, why is there circuitry at all?");
                System.out.println(" ");
                try
                { 
                 Thread.sleep(9000);
                }    catch (InterruptedException e){ }
                System.out.println("What is this place?");
                try
                { 
                 Thread.sleep(3000);
                }    catch (InterruptedException e){ }
                System.out.println("\f");
                System.out.println("Continueing along the path, you come across a strange archway.");
                break;
                
                case 2:
                if (fp >= 15)
                {
                    
                        System.out.println("\f");
                        System.out.println("You run further down the path, the sound of 8 metallic");
                        System.out.println("feet chasing after you.");
                        System.out.println(" ");
                        System.out.println("Eventually, the sound stops. It seems you must have outrun the creature.");
                        System.out.println("Taking a moment to catch your breath, you look up at the area around you.");
                        try
                        { 
                            Thread.sleep(8000);
                        }    catch (InterruptedException e){ }
                        System.out.println("\f");
                        System.out.println("Looking up, you see some sort of glowing archway above you.");
                    }
                    else  
                    {
                        System.out.println("\f");
                        System.out.println("You try to run, but the creature advances upon you quicker than");
                        System.out.println("you can flee.");
                         try
                         { 
                             Thread.sleep(5000);
                            }    catch (InterruptedException e){ }
                        System.out.println("\f");
                        Enemy = 1;
                         Fight();
                          try
                          { 
                              Thread.sleep(3000);
                            }    catch (InterruptedException e){ }
                        System.out.println("\f");
                        System.out.println("As your eyes adjust after the battle, you see a pale blue archway looming overhead.");
                    }
                
            }
            System.out.println("Beyond, the path that you stand upong becomes a large circular area, with what appears to be");
                System.out.println("some sort of fountain at its centre.");
                System.out.println(" ");
            System.out.println("As you approach the fountain, a strange sillhouette fades into view, standing infront of the ");
            System.out.println("She seems calm, and kind. Yet for some reason her presence seems almost...");
            System.out.println("unnerving.");
            System.out.println(" ");
            System.out.println("1- Talk to her ");
            System.out.println("2- Ignore her ");
            choice = chk.nextInt();
            
            switch (choice)
            {
                case 1:
                System.out.println("\f");
                System.out.println("You approach the woman, greating her kindly.");
                try
                          { 
                              Thread.sleep(4000);
                            }    catch (InterruptedException e){ }
                System.out.println(" ");
                System.out.println("\"Good Afternoon!\" the younge woman says as she gestures a short wave. ");
                System.out.println("\"Welcome to the Spring of Memories. The place where everyones consious come to rest!\" ");
                System.out.println(" ");
                System.out.println("1- \"Who are you?\"");
                System.out.println("2- \"What is this place?\"");
                choice = chk.nextInt();
                switch (choice)
                {
                    case 1:
                    System.out.println("\f");
                    System.out.println("\"My name is Mecali. It is my job to protect this Spring, to keep the world safe. ");
                    System.out.println("Because this spring is connected to every living this on this planet, it is ");
                    System.out.println("important that no harm befalls this place.\" ");
                    System.out.println(" ");
                    System.out.println("1- \"You seem Familiar...\" ");
                    System.out.println("2- \"Well, see ya!\" ");
                    choice = chk.nextInt();
                    switch (choice)
                    {
                        case 1:
                        System.out.println("\f");
                        System.out.println("The woman lets out a bit of a giggle. ");
                        System.out.println(" ");
                        System.out.println("\"Heh, you must have a strange memory then. Anyways,  ");
                        break;
                        
                        case 2:
                        System.out.println("\f ");
                        System.out.println("\"Wait wait! Please don't go!\"");
                        System.out.println("The woman pleads");
                        System.out.println("\"I desperately need your help. You see, ");
                        break;
                    }
                    break;
                    
                    case 2:
                    System.out.println("\f ");
                    System.out.println("\"Didn't you here me? This is the spring of memories.\"");
                    System.out.println("The woman seems perplexed, as if she is caught off guard.");
                    try
                          { 
                              Thread.sleep(5000);
                            }    catch (InterruptedException e){ }
                    System.out.println("\"Well, speaking of the spring, I have a favour to ask. Here's the thing,");
                    break;
                }
                System.out.println("This spring is in grave danger. Dark creatures have poisoned its source, ");
                System.out.println("and it is causing great devestation to this world. Because it is my duty to");
                System.out.println("remain her, I cannot venture within the spring to stop this. ");
                System.out.println("Please, you must help me stop this.\" ");
                try
                          { 
                              Thread.sleep(15000);
                            }    catch (InterruptedException e){ }
                 System.out.println("\f ");
                  System.out.println("Before you can even say a word, you feel yourself get pulled into the fountain.");
                   try
                          { 
                              Thread.sleep(4000);
                            }    catch (InterruptedException e){ }
                break;
                
                case 2:
                 System.out.println("\f ");
                System.out.println("You walk past the strange woman, trying your best not to make eye contact.");
                System.out.println("Before you can make it to the other side of the fountain, however, you feel a rough shove from behind,");
                System.out.println("and you fall into the fountain.");
                try
                          { 
                              Thread.sleep(7000);
                            }    catch (InterruptedException e){ }
                System.out.println(" ");
                System.out.println("You probably should not have done that");
                hate = true;
                
                try
                          { 
                              Thread.sleep(4000);
                            }    catch (InterruptedException e){ }
                break;
            }
            break;
            
            case 2:
            System.out.println("\f");
            System.out.println("You begin to go to the left, when suddenly some sort of strange creature appears from beind you "); 
            System.out.println("Look out! "); 
             try
                          { 
                              Thread.sleep(5000);
                            }    catch (InterruptedException e){ }
            System.out.println("\f");
            
            Enemy = 1;
            Fight();
            System.out.println("\f");
            System.out.println("After defeating the attacker, you continue along your way into the forest.");
            System.out.println("the plastic tree branchs strangely manage to still crunch beneath your feet ");
            System.out.println("as you wander into the unknown. It is still dark, but you can somehow see where");
            System.out.println("you are going with ease.");
            try
                          { 
                              Thread.sleep(6000);
                            }    catch (InterruptedException e){ }
            System.out.println("Eventually, you reach a strange wall, a feel a great, hurtful object slam down ");
            System.out.println("Heavily on the back of your head.");
            try
                          { 
                              Thread.sleep(6000);
                            }    catch (InterruptedException e){ }
            System.out.println("\f");                
            break;
            
            case 3:
            System.out.println("\f");
            System.out.println("You wander into the glowing forest. It is dark, cold and lifeless. ");
            System.out.println("You can see the fiberoptic cables peeking out of the leaves off the "); 
            System.out.println("trees. ");
            System.out.println(" ");
             try
                          { 
                              Thread.sleep(5000);
                            }    catch (InterruptedException e){ }
            System.out.println("Strangely enough, however, the forest almost seems to be repating itself.  ");
            System.out.println("All the trees are the same, all the rocks are the same. ");
            System.out.println("Everything is the same. ");
             try
                          { 
                              Thread.sleep(6000);
                            }    catch (InterruptedException e){ }
            System.out.println(" ");
            System.out.println("Before you know it, you feel a huge thunk on the back of your head, and");
            System.out.println("everything goes dark.");
             try
                          { 
                              Thread.sleep(6000);
                            }    catch (InterruptedException e){ }
        }
        System.out.println("\f");
        System.out.println("You wake up in a strange location.");
        System.out.println("Straw-like fire swirls deep below. The ground you stand upon like ");
        System.out.println("leather. The islands of ground around you are all in such strange shapes. ");
        System.out.println("For some reason, it almost gives you a sense of nostalgia.  ");
        System.out.println(" ");
        System.out.println("1- Go forward");
        System.out.println("2- Go left");
        choice = chk.nextInt();
        switch (choice)
        {
            case 1:
             if (hate = false)
             {
                 Enemy = 1;
                 Fight();
                }
             else 
             { Enemy = 4;
                 Fight();
                }
            System.out.println("\f");
            System.out.println("Going forward, you have 2 more paths two go through.");
            System.out.println("Which do you choose?");
            System.out.println(" ");
            System.out.println("1- Forward");
            System.out.println("2- Right");
            choice = chk.nextInt();
            switch (choice)
            {
                case 1:
                if (hate = false)
             {
                 Enemy = 2;
                 Fight();
                }
             else 
             { Enemy = 4;
                 Fight();
                }
               System.out.println("\f");
                System.out.println("You continue along the path, it is unstable and dangerous.");
                System.out.println("You stumble a bit on the rugged terrain, hurting your foot, but pull ");
                System.out.println("yourself back together as another monster approaches.");
                try
                          { 
                              Thread.sleep(8000);
                            }    catch (InterruptedException e){ }
               if (hate = false)
             {
                 Enemy = 3;
                 Fight();
                }
             else 
             { Enemy = 5;
                 Fight();
                }
             System.out.println("\f");
                System.out.println("You continue along, unsure of where exactly you are heading,");
                System.out.println("when suddenly you find your awnser.");
                System.out.println(" ");
                 try
                          { 
                              Thread.sleep(5000);
                            }    catch (InterruptedException e){ }
             System.out.println("A strange, dark cloud can be seen in the distance, seemingly");
             System.out.println("at the centre of this mad place.");
              try
                          { 
                              Thread.sleep(5000);
                            }    catch (InterruptedException e){ }
                    if (hate = false)
             {
                 Enemy = 3;
                 Fight();
                }
             else 
             { Enemy = 4;
                 Fight();
                }         
                 System.out.println("\f");
             break;
             
             case 2:
             if (hate = false)
             {
                 Enemy = 2;
                 Fight();
                }
             else 
             { Enemy = 4;
                 Fight();
                }
              System.out.println("\f");
                System.out.println("You continue along to the right, the area filled with ");
             System.out.println("Roaming monsters. One jumps out at you as you try to understand");
             System.out.println("just where it is your supposed to go.");
             try
                          { 
                              Thread.sleep(8000);
                            }    catch (InterruptedException e){ }
              System.out.println("\f");
              if (hate = false)
             {
                 Enemy = 2;
                 Fight();
                }
             else 
             { Enemy = 4;
                 Fight();
                }
             System.out.println("\f");
             System.out.println("In the corner of your eye, you notice a dark cloud swirling not too ");
             System.out.println("far away.");
             System.out.println("You make your way over to it.");
             try
                          { 
                              Thread.sleep(8000);
                            }    catch (InterruptedException e){ }
             System.out.println("\f");
              if (hate = false)
             {
                 Enemy = 3;
                 Fight();
                }
             else 
             { Enemy = 5;
                 Fight();
                }
             System.out.println("\f");
             break;
            }
            case 2:
            if (hate = false)
             {
                 Enemy = 2;
                 Fight();
                }
             else 
             { Enemy = 4;
                 Fight();
                }
            System.out.println("\f");
            System.out.println("As you run through this nightmare of a place, you see a dark, ");
            System.out.println("mysterious cloud off in the distance.");
            System.out.println("You begin to make your way over to it.");
             try
                          { 
                              Thread.sleep(10000);
                            }    catch (InterruptedException e){ }
             System.out.println("\f");
              if (hate = false)
             {
                 Enemy = 3;
                 Fight();
                }
             else 
             { Enemy = 5;
                 Fight();
                }
             System.out.println("\f");
             System.out.println("There is not much further until the cloud.");
             System.out.println("Exhausted, you slow down slighty, but continue to press");
             System.out.println("on.");
             try
                          { 
                              Thread.sleep(8000);
                            }    catch (InterruptedException e){ }
             System.out.println("\f");
              if (hate = false)
             {
                 Enemy = 2;
                 Fight();
                }
             else 
             { Enemy = 4;
                 Fight();
                }
             System.out.println("\f");
        }
        System.out.println("\f");
        System.out.println("You finally make your way over to the cloud.");
        System.out.println("A familiar voice calls out to you.");
         try
                          { 
                              Thread.sleep(8000);
                            }    catch (InterruptedException e){ }
        System.out.println("\f");
        System.out.println("\"Listen to me.\" she calls.");
        System.out.println("This location you are in noe exists withing the smpring of memories, the centre ");
        System.out.println("of this world. This darkness you see before your eyes is the corruption that threatens");
        System.out.println("everything that matters. ");
        System.out.println("You must destroy the heart of the spring. If you do not, it will");
        System.out.println("tear itself appart from within. Do this, and this world may be saved.\"");
        System.out.println(" ");
        try
                          { 
                              Thread.sleep(8000);
                            }    catch (InterruptedException e){ }
        System.out.println("1- Agree ");
        System.out.println("2- Decline ");
        choice = chk.nextInt();
        
        switch(choice)
        {
            case 1:
            System.out.println("\f");
            try
                          { 
                              Thread.sleep(1000);
                            }    catch (InterruptedException e){ }
            System.out.println("\"Very good.\" ");
            System.out.println(" ");
            try
                          { 
                              Thread.sleep(2500);
                            }    catch (InterruptedException e){ }
            System.out.println("\"Now it is time. Prepare yourself. The springs heart will hold nothing back as it ");
            System.out.println("tries to stop you ");
            try
                          { 
                              Thread.sleep(6000);
                            }    catch (InterruptedException e){ }
            System.out.println("\f");
            Enemy = 6;
            Fight();
        }
    }

    public static void Lucius ()
    {
        String name = new String ("Lucius");
        health = 23;
        mp = 8;
        fp = 20;
        xp = 0;
        level = 1;
    }

    public static void Ena ()
    {
        String name =  new String ("Ena");
        health = 14;
        mp = 20;
        fp = 9;
        xp = 0;
       level = 1;
    }

    public static void Pita ()
    {
        String name =  new String ("Pita");
        health = 17;
        mp = 15;
        fp = 12;
        xp = 0;
        level = 1;
    }

    public static void Siren ()
    {
        String name =  new String ("Siren");
        health = 22;
        mp = 17;
        fp = 5;
        xp = 0;
        level = 1;
    }

    public static void Lilac ()
    {
        String name =  new String ("Lilac");
        health = 25;
        mp = 10;
        fp = 20;
        xp = 0;
        level = 1;
    }

    public static void Jester ()
    {
        String name =  new String ("Jester");
        health = 18;
        mp = 15;
        fp = 15;
        xp = 0;
        level = 1;
    }

    public static void Coo ()
    {
        String name =  new String ("Coo");
        health = 15;
        mp = 14;
        fp = 13;
        xp = 0;
        level = 1;
    }

    public static void Beast ()
    {
        String name =  new String ("Beast");
        health = 17;
        mp = 5;
        fp = 18;
        xp = 0;
        level = 1;
    }

    public static void Mjolnir ()
    {
        String name =  new String ("Mjolnir");
        health = 23;
        mp = 10;
        fp = 16;
        xp = 0;
        level = 1;
    }

    public static void Fight ()
    {
        /*
         * these are all various enemies that exist within the game.
         * They progressively get more and more difficult to defeat
         */

        if (Enemy == 1)
        {
            Monsters();
            System.out.println("A small Chair-Spider attacked!");
            NMEattack = 2;
            NMEhealth = 10;
            NMEspeed = 7;
        }

        if (Enemy == 2)
        {
            Monsters();
            System.out.println("A Cyknnig attack?!");
            NMEattack = 3;
            NMEhealth = 12;
            NMEspeed = 5;
        }

        if (Enemy == 3)
        {
            Monsters();
            System.out.println("A Salatongue emerged!");
            NMEattack = 2;
            NMEhealth = 14;
            NMEspeed = 7;
        }

        if (Enemy == 4)
        {
            Monsters();
            System.out.println("Am Armored Chair-Spider appeared!");
            NMEattack = 5;
            NMEhealth = 15;
            NMEspeed = 3;
        }

        if (Enemy == 5)
        {
            Monsters();
            System.out.println("A rare case of Melongitas attacks!");
            NMEattack = 3;
            NMEhealth = 23;
            NMEspeed = 5;
        }

        if (Enemy == 6)
        {
            Monsters();
            System.out.println("Its the heart of the world!");
            NMEattack = 7;
            NMEhealth = 33;
            NMEspeed = 5;
        }
        
        if (Enemy == 7)
        {
            Monsters();
            System.out.println("...........");
            NMEattack = 7;
            NMEhealth = 40;
            NMEspeed = 5;
        }
        
        if (Enemy == 8)
        {
            Monsters();
            System.out.println("Its time to end this.");
            NMEattack = 8;
            NMEhealth = 50;
            NMEspeed = 5;
        }

        while (NMEhealth > 0)
        {

            action(); // Enemy encounter begins
            System.out.println("\f"); 
            Monsters();
            System.out.println(" ");
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
        choice = chk.nextInt();
        switch (choice)
        {   // what happens when the player chooses things
            case 1:
 
            System.out.println("\f");
            Monsters();
            System.out.println(" ");
            System.out.println("Select an action");
            System.out.println(" ");
            System.out.println("1- Light");
            System.out.println("2- Medium");
            System.out.println("3- Heavy");
            System.out.println("4-  <-- ");
            choice = chk.nextInt();
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
             if (i== 2)
             {
            if (speed <= NMEspeed)
            {
                System.out.println("\f");
                Monsters();
                System.out.println(" ");
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
                Monsters();
                System.out.println(" ");
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
            Monsters();
            System.out.println(" ");
            System.out.println("Select an action");
            System.out.println(" ");
            System.out.println("1- burn");
            System.out.println("2- frost");
            System.out.println("3- scorch");
            System.out.println("4 - <-- ");
            choice = chk.nextInt();
            switch (choice)
            {
                case 1:
                attack = 7;
                burnt = true;
                mpcost = 3;

                System.out.println("\f");
                Monsters();
                System.out.println(" ");
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
                Monsters();
                System.out.println(" ");
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
                Monsters();
                System.out.println(" ");
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
             if (i== 2)
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
            System.out.println("  /   |-\\    |--    /--    --|--    |-\\        /\\       |");
            System.out.println(" /    |-//   |__    |        |      |-/       /__\\      |");
            System.out.println("  \\   |      |      |        |      | \\      /    \\     |");
            System.out.println(" /    |      |--    \\ --     |      |  \\    /      \\    |__");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("\t 1- Start Game ");
            System.out.println("\t 2- Exit ");
            choice = chk.nextInt();
            switch (choice)
            {
                case 1:
                break;
                
                case 2:
                System.out.println("\f");
                System.exit(0);
            }
        }
   
    public static void Monsters()
    {
        if (Enemy == 1)
        {
            System.out.println(" ");
            System.out.println("       ____");
            System.out.println("      / oo \\");
            System.out.println("  ___/ oo  /");
            System.out.println(" (0_0___)_/");
            System.out.println(" //   \\\\ \\\\");
            System.out.println("//     \\\\ \\\\");
            System.out.println("^       ^  ^");
            System.out.println(" ");
        }
        
        if (Enemy == 2)
        {
            
            System.out.println(" ");
            System.out.println("     |");
            System.out.println(" _\\| | |/_");
            System.out.println("   \\ | /");
            System.out.println("    (:)");
            System.out.println("  _/   \\_");
            System.out.println("  /|    |\\");
            System.out.println(" ");
        }
        
        if (Enemy == 3)
        {
            System.out.println(" ");
            System.out.println("              ^");
            System.out.println("      _______//");
            System.out.println("  ___/  ____ /");
            System.out.println(" /..  /  \\  \\");
            System.out.println(" \\----");
            System.out.println("   /  \\");
            System.out.println(" ");
        }
        
        if (Enemy == 4)
        {
            System.out.println(" ");
            System.out.println("       ____");
            System.out.println("      / <> \\");
            System.out.println("  \\/_/ <>  /");
            System.out.println(" (ovo___)_/");
            System.out.println(" //^  \\\\ \\\\");
            System.out.println("//     \\\\ \\\\");
            System.out.println("^       ^  ^");
            System.out.println(" ");
        }
        
        if (Enemy == 5)
        {
            System.out.println(" ");
            System.out.println("    \\/ ");
            System.out.println("    /\\");
            System.out.println("   (00)");
            System.out.println("   /()\\ ");
            System.out.println("    /\\");
            System.out.println("   ||||");
            System.out.println("   ^^^^");
            System.out.println(" ");
        }
        
        if (Enemy == 6)
        {
            System.out.println(" ");
            System.out.println("     __");
            System.out.println("    /  \\");
            System.out.println("   /    \\");
            System.out.println("  |  <>  |");
            System.out.println("   \\     /");
            System.out.println("    \\   /");
            System.out.println("     | |");
            System.out.println(" ");
        }
    }
}
