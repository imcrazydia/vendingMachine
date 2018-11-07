import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] vragen;
        vragen = new String[20];

        String[] antwoorden;
        antwoorden = new String[20];


        int g = 50;
        System.out.println("Je hebt: €" + g); /* Je geld */

        System.out.println("Wil iets te eten?"); /* Eet vragen */

        Scanner vend = new Scanner(System.in);

        String a1;
        String lc;

        int o1 = 0;
        int o2 = 0;
        int loop = 0;

        loop = 1;

        while (loop == 1) {

            a1 = vend.nextLine();
            lc = a1.toLowerCase();

        if (lc.equals("ja")) {
            System.out.println("Warm of koud?"); /* Eet vragen */
            o1 = 1;
            loop = 2;

        } else if (lc.equals("nee")) {
            System.out.println("Wil je dan iets te drinken?"); /* Drink vragen */
            o2 = 1;
            loop = 3;
        } else {
            System.out.println("Vul 'ja' of 'nee' in.");
         }
        }

        String a2;

        while (loop == 2){

            a2 = vend.nextLine();
            lc = a2.toLowerCase();

        if (o1 == 1) {
            if (lc.equals("warm")) {
                System.out.println("Vlees of vis?"); /* Eet vragen warm */
                o1 = 2;
                loop = 0;
            } else if (lc.equals("koud")) {
                System.out.println("salade of vis?"); /* Eet vragen koud */
                o1 = 3;
                loop = 0;
            } else {
                System.out.println("Vul 'warm' of 'koud' in.");
            }
        } }

        String a3;

        while (loop == 3) {

            a3 = vend.nextLine();
            lc = a3.toLowerCase();

        if (o2 == 1) {
            if (lc.equals("ja")) {
                System.out.println("Warm of koud?"); /* Drink vragen */
                o2 = 2;
                loop = 4;
            } else if (lc.equals("nee")) {
                System.out.println("Ga dan ergens anders naartoe!");
                loop = 0;
            } else {
                System.out.println("Vul 'ja' of 'nee' in.");
            }
        } }

        String a4;

        while (loop == 4) {

            a4 = vend.nextLine();
            lc = a4.toLowerCase();

        if (o2 == 2) {
            if (lc.equals("warm")) {
                System.out.println("Koffie of thee?"); /* Drink vragen warm */
                o2 = 3;
                loop = 5;
            } else if (lc.equals("koud")) {
                System.out.println("Frisdrank of sap?"); /* Drink vragen koud */
                o2 = 4;
                loop = 0;
            } else {
                System.out.println("Vul 'warm' of 'koud' in.");
            }
        } }

        String a5;

        while (loop == 5) {

            a5 = vend.nextLine();
            lc = a5.toLowerCase();

            if (o2 == 3) {
                if (lc.equals("koffie")) {
                    System.out.println("Cappuccino of americano?"); /* Drink vragen warm */
                    o2 = 5;
                    loop = 0;
                } else if (lc.equals("thee")) {
                    System.out.println("aardbei thee of citroen thee?"); /* Drink vragen warm */
                    o2 = 6;
                    loop = 0;
                } else {
                    System.out.println("Vul 'koffie' of 'thee' in."); /* Drink vragen */
                }
            } }

        }
    }





