import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] vragen;
        vragen = new String[16];

        String[] antwoorden;
        antwoorden = new String[32];


        int g = 50;
        int o1 = 0;
        int o2 = 0;
        int loop;

        String a1;
        String lc;

        loop = 100;

        while (loop == 100) {

        System.out.println("Je hebt: €" + g); /* Je geld */

        System.out.println("Wil iets te eten?"); /* Eet vragen */

        Scanner vend = new Scanner(System.in);

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

        while (loop == 2) {

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
            }
        }

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
                    System.out.println("Tot ziens!");
                    loop = 0;
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'ja' of 'nee' in.");
                }
            }
        }

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
            }
        }

        String a5;

        while (loop == 5) {

            a5 = vend.nextLine();
            lc = a5.toLowerCase();

            if (o2 == 3) {
                if (lc.equals("koffie")) {
                    System.out.println("Cappuccino of americano?"); /* Drink vragen warm */
                    o2 = 5;
                    loop = 15;
                } else if (lc.equals("thee")) {
                    System.out.println("aardbeithee of citroenthee?"); /* Drink vragen warm */
                    o2 = 6;
                    loop = 18;
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'koffie' of 'thee' in."); /*  Drink vragen */
                }
            }
        }

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
                    System.out.println("Appelsap of sinaasappelsap?"); /* drink vragen koud */
                    o2 = 8;
                    loop = 12;
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
                            "  \\___|  \\___/  |_|  \\__,_| " + "\nBedankt voor jou aankoop."); /* eind drink vraag koud cola */
                    o2 = 11;
                    loop = 100;
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
                            "                                    " + "\nBedankt voor jou aankoop."); /* eind drink vraag koud fanta */
                    o2 = 12;
                    loop = 100;
                } else if (lc.equals("nee")) {
                    System.out.println("waarom koos je het dan?"); /* eind drink vraag koud fanta */
                } else if (lc.equals("geld")) {
                    System.out.println("Je hebt: €" + g);
                } else {
                    System.out.println("Vul 'ja' of 'nee' in.");
                }
            }

        }

            String a12;

            while (loop == 12) {

                a12 = vend.nextLine();
                lc = a12.toLowerCase();

                if (o2 == 8) {
                    if (lc.equals("appelsap")) {
                        System.out.println("Dit item kost €2, weet je zeker dat je dit wilt?"); /* drink vraag koud cola */
                        o2 = 13;
                        loop = 13;
                    } else if (lc.equals("sinaasappelsap")) {
                        System.out.println("Dit item kost €2, weet je zeker dat je dit wilt?"); /* drink vraag koud fanta */
                        o2 = 14;
                        loop = 14;
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'appelsap' of 'sinaasappelsap' in.");
                    }
                }
            }

            int appel = 2;
            String a14;

            while (loop == 13) {

                a14 = vend.nextLine();
                lc = a14.toLowerCase();

                if (o2 == 13) {
                    if (lc.equals("ja")) {
                        g = g - appel;
                        System.out.println("                                 | |                      \n" +
                                "   __ _   _ __    _ __     ___  | |  ___    __ _   _ __  \n" +
                                "  / _` | | '_ \\  | '_ \\   / _ \\ | | / __|  / _` | | '_ \\ \n" +
                                " | (_| | | |_) | | |_) | |  __/ | | \\__ \\ | (_| | | |_) |\n" +
                                "  \\__,_| | .__/  | .__/   \\___| |_| |___/  \\__,_| | .__/ \n" +
                                "         | |     | |                              | |    \n" +
                                "         |_|     |_|                              |_|     " + "\nBedankt voor jou aankoop."); /* eind drink vraag koud appel */
                        o2 = 15;
                        loop = 100;
                    } else if (lc.equals("nee")) {
                        System.out.println("waarom koos je het dan?"); /* eind drink vraag koud appel */
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'ja' of 'nee' in.");
                    }
                }

            }

            int sinaas = 2;
            String a15;

            while (loop == 14) {

                a15 = vend.nextLine();
                lc = a15.toLowerCase();

                if (o2 == 14) {
                    if (lc.equals("ja")) {
                        g = g - sinaas;
                        System.out.println("         _                                                                _                       \n" +
                                "       (_)                                                              | |                      \n" +
                                "  ___   _   _ __     __ _    __ _   ___    __ _   _ __    _ __     ___  | |  ___    __ _   _ __  \n" +
                                " / __| | | | '_ \\   / _` |  / _` | / __|  / _` | | '_ \\  | '_ \\   / _ \\ | | / __|  / _` | | '_ \\ \n" +
                                " \\__ \\ | | | | | | | (_| | | (_| | \\__ \\ | (_| | | |_) | | |_) | |  __/ | | \\__ \\ | (_| | | |_) |\n" +
                                " |___/ |_| |_| |_|  \\__,_|  \\__,_| |___/  \\__,_| | .__/  | .__/   \\___| |_| |___/  \\__,_| | .__/ \n" +
                                "                                                 | |     | |                              | |    \n" +
                                "                                                 |_|     |_|                              |_|     " + "\nBedankt voor jou aankoop."); /* eind drink vraag koud sinaas */
                        o2 = 16;
                        loop = 100;
                    } else if (lc.equals("nee")) {
                        System.out.println("waarom koos je het dan?"); /* eind drink vraag koud sinaas */
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'ja' of 'nee' in.");
                    }
                }

            }

            String a16;

            while (loop == 15) {

                a16 = vend.nextLine();
                lc = a16.toLowerCase();

                if (o2 == 5) {
                    if (lc.equals("cappuccino")) {
                        System.out.println("Dit item kost €2, weet je zeker dat je dit wilt?"); /* drink vraag warm cappuccino*/
                        o2 = 17;
                        loop = 16;
                    } else if (lc.equals("americano")) {
                        System.out.println("Dit item kost €3, weet je zeker dat je dit wilt?"); /* drink vraag warm americano*/
                        o2 = 18;
                        loop = 17;
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'cappuccino' of 'americano' in.");
                    }
                }
            }

            int cappuccino = 2;
            String a17;

            while (loop == 16) {

                a17 = vend.nextLine();
                lc = a17.toLowerCase();

                if (o2 == 17) {
                    if (lc.equals("ja")) {
                        g = g - cappuccino;
                        System.out.println("                                                        _                 \n" +
                                "                                                      (_)                \n" +
                                "   ___    __ _   _ __    _ __    _   _    ___    ___   _   _ __     ___  \n" +
                                "  / __|  / _` | | '_ \\  | '_ \\  | | | |  / __|  / __| | | | '_ \\   / _ \\ \n" +
                                " | (__  | (_| | | |_) | | |_) | | |_| | | (__  | (__  | | | | | | | (_) |\n" +
                                "  \\___|  \\__,_| | .__/  | .__/   \\__,_|  \\___|  \\___| |_| |_| |_|  \\___/ \n" +
                                "                | |     | |                                              \n" +
                                "                |_|     |_|                                               " + "\nBedankt voor jou aankoop."); /* eind drink vraag warm cappuccino */
                        o2 = 19;
                        loop = 100;
                    } else if (lc.equals("nee")) {
                        System.out.println("waarom koos je het dan?"); /* eind drink vraag warm cappuccino */
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'ja' of 'nee' in.");
                    }
                }

            }

            int americano = 3;
            String a18;

            while (loop == 17) {

                a18 = vend.nextLine();
                lc = a18.toLowerCase();

                if (o2 == 18) {
                    if (lc.equals("ja")) {
                        g = g - americano;
                        System.out.println("                                    (_)                               \n" +
                                "   __ _   _ __ ___     ___   _ __   _    ___    __ _   _ __     ___  \n" +
                                "  / _` | | '_ ` _ \\   / _ \\ | '__| | |  / __|  / _` | | '_ \\   / _ \\ \n" +
                                " | (_| | | | | | | | |  __/ | |    | | | (__  | (_| | | | | | | (_) |\n" +
                                "  \\__,_| |_| |_| |_|  \\___| |_|    |_|  \\___|  \\__,_| |_| |_|  \\___/ \n" +
                                "                                                                      " + "\nBedankt voor jou aankoop."); /* eind drink vraag warm americano */
                        o2 = 20;
                        loop = 100;
                    } else if (lc.equals("nee")) {
                        System.out.println("waarom koos je het dan?"); /* eind drink vraag warm americano */
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'ja' of 'nee' in.");
                    }
                }

            }

            String a19;

            while (loop == 18) {

                a19 = vend.nextLine();
                lc = a19.toLowerCase();

                if (o2 == 6) {
                    if (lc.equals("aardbeithee")) {
                        System.out.println("Dit item kost €1, weet je zeker dat je dit wilt?"); /* drink vraag warm aardbei*/
                        o2 = 21;
                        loop = 19;
                    } else if (lc.equals("citroenthee")) {
                        System.out.println("Dit item kost €1, weet je zeker dat je dit wilt?"); /* drink vraag warm citroen*/
                        o2 = 22;
                        loop = 20;
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'aardbeithee' of 'citroenthee' in.");
                    }
                }
            }

            int aardbei = 1;
            String a20;

            while (loop == 19) {

                a20 = vend.nextLine();
                lc = a20.toLowerCase();

                if (o2 == 21) {
                    if (lc.equals("ja")) {
                        g = g - aardbei;
                        System.out.println("                              _   _              _     _     _                   \n" +
                                "                            | | | |            (_)   | |   | |                  \n" +
                                "   __ _    __ _   _ __    __| | | |__     ___   _    | |_  | |__     ___    ___ \n" +
                                "  / _` |  / _` | | '__|  / _` | | '_ \\   / _ \\ | |   | __| | '_ \\   / _ \\  / _ \\\n" +
                                " | (_| | | (_| | | |    | (_| | | |_) | |  __/ | |   | |_  | | | | |  __/ |  __/\n" +
                                "  \\__,_|  \\__,_| |_|     \\__,_| |_.__/   \\___| |_|    \\__| |_| |_|  \\___|  \\___|\n" +
                                "                                                                                \n" +
                                "                                                                                 " + "\nBedankt voor jou aankoop."); /* eind drink vraag warm americano */
                        o2 = 23;
                        loop = 100;
                    } else if (lc.equals("nee")) {
                        System.out.println("waarom koos je het dan?"); /* eind drink vraag warm americano */
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'ja' of 'nee' in.");
                    }
                }

            }

            int citroen = 1;
            String a21;

            while (loop == 20) {

                a21 = vend.nextLine();
                lc = a21.toLowerCase();

                if (o2 == 22) {
                    if (lc.equals("ja")) {
                        g = g - citroen;
                        System.out.println("          _   _                                     _     _                   \n" +
                                "        (_) | |                                   | |   | |                  \n" +
                                "   ___   _  | |_   _ __    ___     ___   _ __     | |_  | |__     ___    ___ \n" +
                                "  / __| | | | __| | '__|  / _ \\   / _ \\ | '_ \\    | __| | '_ \\   / _ \\  / _ \\\n" +
                                " | (__  | | | |_  | |    | (_) | |  __/ | | | |   | |_  | | | | |  __/ |  __/\n" +
                                "  \\___| |_|  \\__| |_|     \\___/   \\___| |_| |_|    \\__| |_| |_|  \\___|  \\___|\n" +
                                "                                                                              " + "\nBedankt voor jou aankoop."); /* eind drink vraag warm americano */
                        o2 = 24;
                        loop = 100;
                    } else if (lc.equals("nee")) {
                        System.out.println("waarom koos je het dan?"); /* eind drink vraag warm americano */
                    } else if (lc.equals("geld")) {
                        System.out.println("Je hebt: €" + g);
                    } else {
                        System.out.println("Vul 'ja' of 'nee' in.");
                    }
                }

            }

    }

            }

        }

        /* Eet antwoorden: biefstuk, kip, kibbeling, zalm, aardappel-salade, huzaren-salade, sushi en haring */
        /* drink antwoorden: cappucino=, americano=, aarbei thee=, citroen thee=, cola=, fanta=, appelsap= en sinasappelsap= */








