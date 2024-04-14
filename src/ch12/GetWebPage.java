package ch12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;


// 原书代码已过时

public class GetWebPage {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);
        String URLString = input.nextLine();
        input.close();
        Scanner webInput = null;
        try {
            // URL url = new URL(URLString);
            URL url = URI.create(URLString).toURL();
            webInput = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("IO Error!");
        } catch (Exception ex) {
            System.out.println("Exception");
            ex.printStackTrace();
        } finally {
            if (webInput != null) {
                webInput.close();
            }
            System.out.println("End of program");
        }
    }
}
