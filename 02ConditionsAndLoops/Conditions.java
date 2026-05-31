import java.util.Scanner;
public class Conditions{
    public static void main(String[] args) {
        //1. IF STATEMENT -
        //if age > / = 18 - eligible to vote
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You're eligible to vote!");
        }
        //2. IF-ELSE STATEMENT -
        //if marks > / = 50 - Student is Pass! , else - Student is Fail!
        System.out.println("Enter your Marks :");
        int marks = sc.nextInt();
        if(marks >= 50){
            System.out.println("Congratulations! You have passed the exam.");
        }
        else{
            System.out.println("You're Fail.");
        }
        //3. IF-ELSE-IF STATEMENT -
        // print days based on user input - 1. Monday , 2. Tuesday , 3. Wedmesday ..... 7.Sunday - else Invalid Input.
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        if(number==1){
            System.out.println("Monday!");
        }
        else if(number==2){
            System.out.println("Tuesday!");
        }
        else if(number==3){
            System.out.println("Wednesday!");
        }
        else if(number==4){
            System.out.println("Thursday!");
        }
        else if(number==5){
            System.out.println("Friday!");
        }
        else if(number==6){
            System.out.println("Saturday!");
        }
        else if(number==7){
            System.out.println("Sunday!");
        }
        else {
            System.out.println("Invalid input!");
        }
        //4. NESTED IF-ELSE STATEMENT-
        // if % > / = 40 - passed and if > 75 passed with Distinction , else - failed.
        System.out.print("Enter your percentage :");
        int percentage = sc.nextInt();

        if (percentage >= 40) {          // First if
            if (percentage > 75) {      // Nested if
                System.out.println("Passed with Distinction!");
            } else {
                System.out.println("Passed!");
            }
        } else {
            System.out.println("Failed!");
        }
        //5.TERNARY OPERATOR
        //SYNTAX - (condition) ? ifTrueReturnThis : elseReturnThis ;
        // if streak is more than 30 days - consistent ; else irregular
        System.out.println("Enter number of days of your streak : ");
        int streak = sc.nextInt();
        String streakStatus = (streak > 30) ? "You're Consistent, Keep Going!" : "Irregular , Work Hard and Be Consistent!";
        System.out.println("Your Streak Status - "+streakStatus);
        //6. SWITCH CASE / SWITCH STATEMENT
        // writing days example in 3. - using switch
        System.out.println("Entered Number is -"+number);
        switch(number){
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                 System.out.println("Wednesday!");
                 break;
            case 4:
                 System.out.println("Thursday!");
                 break;
            case 5:
                 System.out.println("Friday!");
                 break;
            case 6:
                 System.out.println("Saturday!");
                 break;
            case 7:
                 System.out.println("Sunday!");
                 break;
            default:
                 System.out.println("Invalid input!");

        }
    }
}
