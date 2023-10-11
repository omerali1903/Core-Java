package practices.day07;

import java.util.Scanner;

public class C03_Method {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen bir cümle giriniz:");
            String cumle = scanner.nextLine();
            sesliHarfleriBul(cumle);
        }

        public static void sesliHarfleriBul(String cumle) {
            String sesliHarfler = "aeiouAEIOU";
            System.out.print("Cümledeki sesli harfler: ");
            for (int i = 0; i < cumle.length(); i++) {
                char c = cumle.charAt(i);
                if (sesliHarfler.indexOf(c) != -1) {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }




