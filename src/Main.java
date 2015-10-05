import java.util.Scanner;

public class Main {
    public static void crash(){
        System.out.println("There was an error");
        System.exit(1);
    }
    public static void main(String[] args){
        //Init vars
        boolean isAlive = true;
        Scanner scan = new Scanner(System.in);
        byte month = 1;


        //Start designing your character
        System.out.printf("You will be designing your character today%n%nStage 1. Please enter your gender(M/F).%n>");
        String gender = scan.nextLine();
        if(!gender.equalsIgnoreCase("F") && !gender.equalsIgnoreCase("M"))crash();


        System.out.printf("Stage 2. Please enter your personality(spaz/calm/dumb/smart/kind/jerk).%n>");
        String personality = scan.nextLine();
        if(!personality.equalsIgnoreCase("spaz") && !personality.equalsIgnoreCase("calm") && !personality.equalsIgnoreCase("dumb")&& !personality.equalsIgnoreCase("jerk")&& !personality.equalsIgnoreCase("kind")&& !personality.equalsIgnoreCase("smart"))crash();


        System.out.printf("Stage 2. Please enter your name.%n>");
        String name = scan.nextLine();

        //init character
        Person character = new Person(gender, personality, name);

        //tutorial
        System.out.printf("In this game you have various commands.%n");
        System.out.println("You have just been born, try talking by using, 'talk'.");
        if(scan.nextLine().toLowerCase().equals("talk")){
            System.out.printf("What you see here is based on your personality%nEnter the numbers for each message%n1.GOO GOO GA GA%n2.GOO GOO GA GA%n3.GOO GOO GA GA%n4.GOO GOO GA GA%n");
            String tutIn = scan.nextLine();
            if (tutIn.equals("1")) System.out.println("GOO GOO GA GA.");
            else if (tutIn.equals("2")) System.out.println("GOO GOO GA GA.");
            else if (tutIn.equals("3")) System.out.println("GOO GOO GA GA.");
            else if (tutIn.equals("4")) System.out.println("GOO GOO GA GA.");
            else crash();
        } else crash();


        //Life loop
        while (isAlive == true){
            month++;
            System.out.println();
            character.event();
            String currentCommand = scan.nextLine();
            character.command(currentCommand);

            //time
            if (month == 12){
                month = 1;
                character.ageUp();
            }
        }


        //death
        if(isAlive == false){
            System.out.println("You are now dead");
            System.exit(0);
        }
    }
}
