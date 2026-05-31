import java.util.*;
import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {
        //1. FOR LOOP -
        // - > used when number of iterations is known.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name - ");
        String name = sc.nextLine();
        //lets print your name 5 times -
        for(int i = 0; i < 5; i++){
            System.out.println(name);
        }
        //lets print each character of the name -
        int length = name.length();
        for(int i = 0; i < length; i++){
            System.out.println(name.charAt(i));
        }

        //2. WHILE LOOP -
        // - > Condition is checked first. If false initially, loop does not run even once.
        // (used when loop depends on condition.)
        // printing 1 to 5 using while loop -
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        //3. DO WHILE LOOP -
        // - > Body runs first. If condition is false initially, loop still runs atleast once.
        // (when code must run at least once.)
        // if your score is less than 50 - low score
//        int score = 15;
//        do {
//            System.out.println("low score.");
//        } while (score > 50);
        // prints atleast one time -

        // NESDTED LOOPS
        for (int i = 0; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // BREAK AND CONTINUE STATEMENT
        // --> AS SOON AS BREAK KEYWORD IS REACHED , FURTHER ITERATION WILL NOT BE EXECUTED. OUT OF THE LOOP!
        for (int i = 0; i <= 10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        // --> CONTINUE KEYWORD SKIPS THE PARTICULAR ITERATION.
        for (int i = 0; i <= 10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }

    }
}