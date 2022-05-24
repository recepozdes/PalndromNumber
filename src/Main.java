import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0;
        System.out.println("Number " + temp);
        while (temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            reverseNumber = (reverseNumber * 10) + digit;
        }
        System.out.println("Reverse Number " + reverseNumber);
        if (number == reverseNumber) {
            System.out.println("Number is Palindrom");
            return true;
        } else {
            System.out.println("Number is not Palindrom");
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Palindrom sayı olup olmadığını kontrol edeceğiniz sayıyı giriniz : ");
        int number = scanner.nextInt();
        isPalindrom(number);

    }
}
