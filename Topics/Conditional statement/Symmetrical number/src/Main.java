import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;

        int userRandom = number / 3;

        if (firstDigit == lastDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(userRandom);
        }
    }
}