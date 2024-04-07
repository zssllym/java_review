package ch3;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input: ");
        String choice = input.nextLine();
        switch (choice) {
            case "Hello":
                System.out.println("Hello, too!");
                break;
            case "Bye":
            case "Good Bye":
                System.out.println("Bye");
                break;
            default:
                System.out.println("sorry~~~");
                break;
        }
        input.close();
    }
}
