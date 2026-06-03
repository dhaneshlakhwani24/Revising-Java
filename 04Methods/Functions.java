import java.util.Scanner;

public class Functions {
    // creating a method which takes number as input , and print its table.
    static void printingTables(int n){
        for (int i = 1; i <= 10; i++){
            int table = n * i;
            System.out.println(table);
        }
    }

    // creating a method which takes two numbers as input , and returns their sum.
    static int printSum(int a , int b){
        return a+b;
    }

    // creating a funtion which returns larger number among 2 numbers.
    static int printLargerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //creating a function which takes total marks obtained and total maximum marks to calculate percentage.
    static double printPercentage(int obtained, int total) {
        return (obtained * 100.0) / total;
    }

    /*if the funtion is not static , it can be used wsing objects in main method - */

    public static void main(String[] args) { //mainMethod

        // basic syntax of a method/funtion -
        /*
        returnType methodName (parameters){
            //block of code / method body
            }
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int n = sc.nextInt();
        printingTables(n);

        int sum = printSum(10,20);
        System.out.println("The sum is " + sum);

        /* function is returning a value which can be stored in a variable and printed.
        OR
        System.out.println(printSum(20,30)); */

        int largerNumber = printLargerNumber(10,20);
        System.out.println("The largest number is " + largerNumber);

        double percentage = printPercentage(440,500);
        System.out.println("The percentage is " + percentage);
    }
}