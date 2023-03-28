package program1toRest;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;

public class ArmstrongNumber { //Class Name
    public static void isArmstrongNumber(int num) {  //Static method
        int number, temp, total = 0;  //define integer
        number = num;
        while (num != 0) {              //While condition
            temp = num % 10;
            total = total + temp * temp * temp;
            num /= 10;

        }
        if (total == number) { // Condition applied
            System.out.println(number + " is a Armstrong number"); //Print statement
        } else {    // else condition applied
            System.out.println(number + "is not a Armstrong number"); // print statement
        }
    }

    public static void main(String[] args) {  // define main method
        Scanner abc = new Scanner(System.in); // Scanner
        System.out.println("Enter any number : "); //print statement
        int a = abc.nextInt();
        isArmstrongNumber(a);
        abc.close();    // Scanner closed
    }
}
