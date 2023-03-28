public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class DigitSumChallenge { //class name
        public static int sumDigits(int number) {
            if (number < 10) { //if the parameter is>=10 then the method should process the number and return sum of all digits.
                return -1; //otherwise return -1 to indicate an invalid value
            }
            int sum = 0;
            while (number > 0) { //The numbers from 0-9 have 1 digit so we don't want to process them;
                int digit = number % 10;//Use n % 10 to extract the least-significant digit.
                sum += digit;
                number /= 10; //Use n = n / 10 to discard the least-significant digit.
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println(sumDigits(125));
            System.out.println(sumDigits(1));
            System.out.println(sumDigits(-125));
            System.out.println(sumDigits(9));
            System.out.println(sumDigits(8888));

        }
    }
}