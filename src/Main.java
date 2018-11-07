import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int g = 50;
        System.out.println("Je hebt: €" + g); /* Je geld */

        System.out.println("Wil iets te eten?"); /* Eet vragen */

        Scanner vend = new Scanner(System.in);

        String a1 = vend.nextLine();
        String lc = a1.toLowerCase();

        int o1 = 0;
        int o2 = 0;

        if (lc.equals("ja")) {
            System.out.println("Warm of koud?"); /* Eet vragen */
            o1 = 1;
            o2 = 0;


        } else if (lc.equals("nee")) {
            System.out.println("Wil je dan iets te drinken?"); /* Drink vragen */
            o1 = 0;
            o2 = 1;
        } else {
            System.out.println("Vul 'ja' of 'nee' in.");
        }
        String a2 = vend.nextLine();
        lc = a2.toLowerCase();

        if (o1 == 1) {
            if (lc.equals("warm")) {
                System.out.println("Vlees of vis?"); /* Eet vragen */
                o1 = 2;
            } else if (lc.equals("koud")) {
                System.out.println("Groente of vis?");
                o1 = 3;
            } else {
                System.out.println("Vul 'warm' of 'koud' in.");
            }
        }
        if (o2 == 1) {
            if (lc.equals("ja")) {
                System.out.println("Warm of koud?"); /* Drink vragen */
                o2 = 2;
            } else if (lc.equals("nee")) {
                System.out.println("Ga dan ergens anders naartoe!");
            } else {
                System.out.println("Vul 'ja' of 'nee' in.");
            }

        }
        if (o2 == 2) {
            if (lc.equals("warm")) {
                System.out.println("Koffie of thee?"); /* Drink vragen */
                o2 = 3;
            } else if (lc.equals("koud")) {
                System.out.println("Frisdrank of sap?");
                o2 = 4;
            } else {
                System.out.println("Vul 'warm' of 'koud' in.");
            }
            String a3 = vend.nextLine();
            lc = a3.toLowerCase();
        }
    }
}



