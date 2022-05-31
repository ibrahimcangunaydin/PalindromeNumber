import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number) {

        int tempNumber = number, reverseNumber = 0, lastNumber;

        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }

        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int number;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        number = inp.nextInt();
        System.out.println(isPalindrome(number));
    }
}
