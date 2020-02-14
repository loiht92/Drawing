import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");

        choice = scanner.nextInt();


        switch (choice) {
            case 1:
                PrintTheRectangle();
                break;
            case 2:
                PrintTheSquareTriangle();
               break;
            case 3:
                PrintUpsideDownTriangle();
                break;
            case 4:
                PrintIsoscelesTriangle();
                break;
            case 0:
                System.exit(0);

            default:
                System.out.println("No choice !");

        }
    }

    private static void PrintTheRectangle() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void PrintTheSquareTriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void PrintUpsideDownTriangle() {
        for (int i = 5; i>=0 ; i--){
            for (int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void PrintIsoscelesTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++)
                System.out.print(" ");
            {
                for (int j = 0; j < 2 * i + 1; j++) // ve doi xung//
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}













