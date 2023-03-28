package program1toRest;

/**
 * Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */
public class IsPalindrome { //Class name
    public static boolean isPalindromenumber(int number) { // declared Static method
        String numberString = String.valueOf(number);
        if (numberString.startsWith("-")) {

        }
        String gnirtSrebmun = new StringBuffer(numberString).reverse().toString();
        return numberString.equals(gnirtSrebmun);
    }

    public static void main(String[] args) { // declared main method
        System.out.println("Test -1221 " + IsPalindrome.isPalindromenumber(-1221)); // Print statement
        System.out.println("Test 707 " + IsPalindrome.isPalindromenumber(707)); // Print statement
        System.out.println("Test 11212 " + IsPalindrome.isPalindromenumber(11212)); // Print statement

    }

}
