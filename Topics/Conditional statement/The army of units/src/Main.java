import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(num < 1 ? "no army" : num <= 19 ? "pack" : num <= 249 ? "throng"
                : num <= 999 ? "zounds" : "legion");



    }
}