
import java.util.*;
public class PatternPractice {
    public static void main(String[] args) {
        //1. Solid Square Pattern - 4x4
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2. Solid Rectangular Pattern - 3x5
        int rows = 4;
        int cols = 5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //3.1 Right-Angled Triangle -
        for(int i=0;i<5;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //3.2 Inverted Right-Angled Traingle -
        for(int i=5;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //3.3 Mirror Image of RIght Angle Triangle -
        // int n = 5 -->
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //4. Solid Rhombus -
        int n2 = 5;
        for(int i=1;i<=n2;i++){
            //loop for spaces
            for(int j=1;j<=n2-i;j++){
                System.out.print(" ");
            }
            //loop for stars
            for(int j=1;j<=n2;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //5. Solid Pyramid Pattern -
        int n3 = 5;
        for(int i=1;i<=n3;i++){
            //loop for spaces
            for(int j=1;j<=n3-i;j++){
                System.out.print("  ");
            }
            //loop for stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //6. Numbered Right Angle Traingle -
        // int n = 5 -->
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //7. Floyd's Traingle -
        int temp = 1;
        // int n = 5 -->
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp +" ");
                temp++;
            }
            System.out.println();
        }

        //8. 0-1 Triangle -
        // int n = 5 -->
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
               int temp2 = i+j;
               if(temp2%2==0){
                   System.out.print("1 ");
               }
               else{
                   System.out.print("0 ");
               }
            }
            System.out.println();
        }

        //9. Number Triangle -
        // int n = 5 -->
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }

        // 10. Hollow Rectangle -
        // rows = 4 ,columns = 5
        for(int i=1;i<=rows;i++) {
            for (int j = 1; j <= cols; j++) {
                if(i==1||j==1||i==rows||j==cols)
                {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


