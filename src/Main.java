import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] vragen;
        vragen = new String[16];

        String[] antwoorden;
        antwoorden = new String[32];


        int g = 50;
        System.out.println("Je hebt: €" + g); /* Je geld */

        System.out.println("Wil iets te eten?"); /* Eet vragen */

        Scanner vend = new Scanner(System.in);

        String a1;
        String lc;

        int o1 = 0;
        int o2 = 0;
        int loop;

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
        } else if (lc.equals("geld")) {
            System.out.println("Je hebt: €" + g);
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
                loop = 6;
            } else if (lc.equals("koud")) {
                System.out.println("salade of vis?"); /* Eet vragen koud */
                o1 = 3;
                loop = 7;
            } else if (lc.equals("geld")) {
                System.out.println("Je hebt: €" + g);
            } else {
                System.out.println("Vul 'warm' of 'koud' in.");
            }
        } }

        String a6;

        while (loop == 6) {

            a6 = vend.nextLine();
            lc = a6.toLowerCase();

            if (o1 == 2) {
                if (lc.equals("vlees")) {
                    System.out.println("Biefstuk of kip"); /* Eet vragen warm */
                    o1 = 4;
                    loop = 0;
                } else if (lc.equals("vis")) {
                    System.out.println("Kibbeling of zalm?"); /* Eet vragen warm */
                    o1 = 5;
                    loop = 0;
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'vlees' of 'vis' in.");
                }
            }
        }

        String a7;

        while (loop == 7) {

            a7 = vend.nextLine();
            lc = a7.toLowerCase();

            if (o1 == 3) {
                if (lc.equals("salade")) {
                    System.out.println("Aardappel-salade of huzaren-salade"); /* Eet vragen koud */
                    o1 = 6;
                    loop = 0;
                } else if (lc.equals("vis")) {
                    System.out.println("Sushi of haring?"); /* Eet vragen koud */
                    o1 = 7;
                    loop = 0;
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'salade' of 'vis' in.");
                }
            }
        }

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
            } else if (lc.equals("geld")) {
                System.out.println("Je hebt: €" + g);
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
                loop = 8;
            } else if (lc.equals("geld")) {
                System.out.println("Je hebt: €" + g);
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
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'koffie' of 'thee' in."); /*  Drink vragen */
                }
            } }

        String a8;

        while (loop == 8) {

            a8 = vend.nextLine();
            lc = a8.toLowerCase();

            if (o2 == 4) {
                if (lc.equals("frisdrank")) {
                    System.out.println("Cola of fanta?"); /* drink vragen koud */
                    o2 = 7;
                    loop = 9;
                } else if (lc.equals("sap")) {
                    System.out.println("Appelsap of sinasappelsap?"); /* drink vragen koud */
                    o2 = 8;
                    loop = 0;
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'frisdrank' of 'sap' in.");
                }
            }
        }

        String a9;

        while (loop == 9) {

            a9 = vend.nextLine();
            lc = a9.toLowerCase();

            if (o2 == 7) {
                if (lc.equals("cola")) {
                    System.out.println("Dit item kost €2, weet je zeker dat je dit wilt?"); /* drink vraag koud cola */
                    o2 = 9;
                    loop = 10;
                } else if (lc.equals("fanta")) {
                    System.out.println("Dit item kost €2, weet je zeker dat je dit wilt?"); /* drink vraag koud fanta */
                    o2 = 10;
                    loop = 11;
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'cola' of 'fanta' in.");
                }
            }
        }
        int coke = 2;
        String a10;

        while (loop == 10) {

            a10 = vend.nextLine();
            lc = a10.toLowerCase();

            if (o2 == 9) {
                if (lc.equals("ja")) {
                    g = g - coke;
                    System.out.println("" +
                            "                 _         \n" +
                            "                | |        \n" +
                            "   ___    ___   | |   __ _ \n" +
                            "  / __|  / _ \\  | |  / _` |\n" +
                            " | (__  | (_) | | | | (_| |\n" +
                            "  \\___|  \\___/  |_|  \\__,_| " + "Bedankt voor jou aankoop, \nJe hebt nog: €" + g + "\nwil je nog iets kopen?"); /* eind drink vraag koud cola */
                    o2 = 11;
                    loop = 0;
                } else if (lc.equals("nee")) {
                    System.out.println("waarom koos je het dan?"); /* eind drink vraag koud cola */
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'ja' of 'nee' in.");
                }
            }

                }

        int fantas = 2;
        String a11;

        while (loop == 11) {

            a11 = vend.nextLine();
            lc = a11.toLowerCase();

            if (o2 == 10) {
                if (lc.equals("ja")) {
                    g = g - fantas;
                    System.out.println("   __                   _           \n" +
                            "  / _|                 | |          \n" +
                            " | |_    __ _   _ __   | |_    __ _ \n" +
                            " |  _|  / _` | | '_ \\  | __|  / _` |\n" +
                            " | |   | (_| | | | | | | |_  | (_| |\n" +
                            " |_|    \\__,_| |_| |_|  \\__|  \\__,_|\n" +
                            "                                    " + "Bedankt voor jou aankoop, \nJe hebt nog: €" + g + "\nwil je nog iets kopen?"); /* eind drink vraag koud fanta */
                    o2 = 12;
                    loop = 0;
                } else if (lc.equals("nee")) {
                    System.out.println("waarom koos je het dan?"); /* eind drink vraag koud fanta */
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'ja' of 'nee' in.");
                }
            }

        }

            }

        }

        /* Eet antwoorden: biefstuk, kip, kibbeling, zalm, aardappel-salade, huzaren-salade, sushi en haring */
        /* drink antwoorden: cappucino, americano, aarbei thee, citroen thee, cola=, fanta, appelsap en sinasappelsap */








