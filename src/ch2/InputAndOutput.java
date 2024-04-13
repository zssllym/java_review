package ch2;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input: ");
        String content = input.nextLine();
        System.out.println("This is what you input:");
        System.out.println(content);
        input.close();
    }
}
