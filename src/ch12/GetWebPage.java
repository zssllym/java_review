package ch12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;


// 原书代码已过时

public class GetWebPage {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);
        String URLString = input.nextLine();
        input.close();
        try {
            URL url = new URL(URLString);
            Scanner webInput = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            webInput.close();
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        // } catch (URISyntaxException ex) {
        //     System.out.println("Syntax Error");
        } catch (IOException ex) {
            System.out.println("IO Error!");
        }
    }
}
