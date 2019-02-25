package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String HtmlSource = "";
        int input = 0;

        String site = "";
        Scanner sc = new Scanner(System.in);
        Boolean getright = false;
        Read use = new Read();
        GetHref use2 = new GetHref();
        while (true) {
            System.out.println("Welcome to the menu!");
            System.out.println("1 -Start Program!");
            System.out.println("2 -About Program!");
            System.out.println("3 -Get the source site code that you enter!");
            System.out.println("4 -Exit");
            System.out.println("Please Enter \"1\", \"2\" ,\"3\" or \"4\" ");

            input = sc.nextInt();
            if (input == 1) {
                try {
                    System.out.println("Please enter your Site URL completely");
                    System.out.println("for example like this : https://www.google.com");
                    System.out.println("if you enter from www.... http:// will be default at the first");

                    site = sc.nextLine();
                    if (!site.startsWith("http://"))
                        site = "http://" + site;

                    HtmlSource = use.getWebPabeSource(site);
                    use2.Ghref(HtmlSource, site);
                    use2.SendHref();
                } catch (IllegalArgumentException err) {
                    sc = new Scanner(System.in);

                    site = sc.nextLine();
                    if (!site.startsWith("http://"))
                        site = "http://" + site;

                    HtmlSource = use.getWebPabeSource(site);
                    use2.Ghref(HtmlSource, site);
                    use2.SendHref();

                }
            } else if (input == 2) {
                about use3 = new about();
                use3.read();
            } else if (input == 3) {
                System.out.println(HtmlSource);

            } else if (input == 4) {
                break;
            }


        }


    }
}
