import java.lang.System;
import java.util.Scanner;

public class Person {
    String gender;
    String personality;
    String name;
    int age;
    boolean inSchool;

    //not so important
    boolean firstDayOfSchool;
    public Person(String g, String p, String n){
        this.gender = g;
        this.personality = p;
        this.name = n;
    }
    public Person(String name){
        String personality;
        double temp = Math.floor(Math.random()*6);
        if(temp == 0.0) personality = "spaz";
        else if(temp == 1.0) personality = "dumb";
        else if(temp == 2.0) personality = "smart";
        else if(temp == 3.0) personality = "kind";
        else if(temp == 4.0) personality = "jerk";
        else personality = "kind";
        this.personality = personality;

        String gender;
        temp = Math.random();
        if(temp >= 0.5) gender = "M";
        else gender = "F";
        this.gender = gender;

        this.name = name;
    }


    public void ageUp(){ this.age = ++this.age;}


    public void event(){
        if(this.age < 2) System.out.println("When you are older, some cooler stuff will happen!");

        if (this.inSchool == true && this.age == 5 && this.firstDayOfSchool == true){
            System.out.println("Good morning class");
        }
    }


    public void command(String c){
        String input;
        Scanner scan = new Scanner(System.in);
        if (c.equalsIgnoreCase("talk")){
            //Before options have real meanings.
            if (this.age < 2){
                System.out.println("You have successfully used a command! We will fast forward you to the second year of your life.");
                this.age = 2;
            }


            //actual value to words.
            if (this.inSchool == true && this.age == 5 && this.firstDayOfSchool == true){
                if(this.personality.equalsIgnoreCase("jerk")){
                    String string1 = "You smell bad.";
                    String string2 = "You stink.";
                    String string3 = "P.U.";
                    System.out.printf("1: %s%n2: %s%n3: %s%n",string1,string2,string3);
                    input = scan.nextLine();
                    if(input.equals("1"))System.out.println(string1);
                    else if(input.equals("2"))System.out.println(string2);
                    else if(input.equals("3"))System.out.println(string3);
                    else Main.crash();
                    System.out.println(this.name + ", that was not very nice of you to say, now was it?");

                    string1 = "Sorry :(";
                    string2 = "My nose is burning like the Whitehouse in 1814";
                    System.out.printf("1: %s%n2: %s%n",string1,string2);
                    input = scan.nextLine();
                    if(input.equals("1")) {
                        System.out.println(string1);
                        System.out.printf("It's alright, everybody makes mistakes.%nRight class?%nClass:everybody does!%n");
                    }
                    else if(input.equals("2")){
                        System.out.println(string2);
                        System.out.println("Would you like me to call your parents " + this.name + "?");
                    }
                    this.firstDayOfSchool = false;
                }

                else if(this.personality.equalsIgnoreCase("smart") || this.personality.equalsIgnoreCase("dumb") || this.personality.equalsIgnoreCase("kind") || this.personality.equalsIgnoreCase("calm")){
                    String string1 = "Good morning teacher!";
                    System.out.println("1: " + string1);
                    input = scan.nextLine();
                    if(input.equals("1"))System.out.println(string1);
                    else Main.crash();
                    this.firstDayOfSchool = false;
                }
                else{
                    String string1 = "Ggggogggoood morning teeeeeeacherrrrr";
                    System.out.println("1: " + string1);
                    input = scan.nextLine();
                    if(input.equals("1"))System.out.println(string1);
                    else Main.crash();
                    this.firstDayOfSchool = false;
                }
            }
            if (this.age == 2){
                String word1 = "Ball";
                String word2 = "Ma-Ma";
                String word3 = "Da-Da";
                System.out.printf("1: %s%n2: %s%n3: %s%n", word1, word2, word3);
                input = scan.nextLine();

                if (!input.equalsIgnoreCase("1")&&!input.equalsIgnoreCase("2")&&!input.equalsIgnoreCase("3"))Main.crash();
                else if (input.equalsIgnoreCase("1")){System.out.println(word1);System.out.println(this.name +" said a word!");}
                else if (input.equalsIgnoreCase("2")){System.out.println(word2);System.out.println(this.name +" said a word!");}
                else if (input.equalsIgnoreCase("3")){System.out.println(word3);System.out.println(this.name +" said a word!");}
                System.out.println("Fast-forward to kindergarten(5 years of age)");
                this.age = 5;
                this.inSchool = true;
                this.firstDayOfSchool = true;
            }
        }
    }
    /*public Person(String gender, String personalityF,String personalityM,String name){
        double temp = Math.floor(Math.random()*6);
        if(temp == 0.0) personality = "spaz";
        if(temp == 5.0) personality = "kind";
        if(temp == 1.0) personality = "dumb";
        if(temp == 2.0) personality = "smart";
        if(temp == 3.0) personality = "kind";
        if(temp == 4.0) personality = "jerk";
    }*/
}
