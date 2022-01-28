

import java.util.Scanner;


public class Auto {


    private String kennzeichen;
    private int kilometerstandt;
    private int tankvolumen;
    private int tankstandt;
    Scanner scan = new Scanner(System.in);


    public Auto() {
    }

    public void start() {
        initKennzeichen();
        initKilomerestand();
        initTankvolumen();
        initTankstandt();
    }


//__________________________________________________________________//

    public String initKennzeichen() {
        System.out.println("Mochten Sie eine neues Kennnzeichen fur dieses Fahrzeug anlegen? \n" +
                "Geben Sie ja oder nein ein.");
        String x = scan.nextLine();

        switch (x) {
            case "ja" -> {
                System.out.println("Kennzeichen eingeben");
                kennzeichen = scan.nextLine();
                return kennzeichen;
            }
            case "nein" -> {
                System.out.println("Kein Kennzeichen hinterlegt");
                return kennzeichen;
            }
            default -> {
                System.out.println("Nur Ja oder Nein gultig");
                return initKennzeichen();
            }
        }
    }

    public void getKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        System.out.println(kennzeichen);
    }

    //__________________________________________________________________//

    public int initKilomerestand() {

        System.out.println("Mochten Sie ein Kilometerstand fur dieses Fahrzeug anlegen?\n" +
                "Geben Sie ja oder nein ein.");
        String x = scan.nextLine();

        switch (x) {
            case "ja" -> {
                System.out.println("Kilometerstand eingeben");
                kilometerstandt = scan.nextInt();
                return kilometerstandt;
            }
            case "nein" -> {
                System.out.println("Kein Kilometerstad hinterlegt");
                return kilometerstandt;
            }
            default -> {
                System.out.println("keine gultige eingabe");
                return initKilomerestand();
            }
        }
    }

    public void getKilomerestand(int kilomerestand) {
        this.kilometerstandt = kilomerestand;
        System.out.println(kilomerestand);
    }

    //__________________________________________________________________//

    public int initTankvolumen() {
        System.out.println("Mochten Sie ein Tankvolumen fur dieses Fahrzeug anlegen?\n" +
                "Geben Sie ja oder nein ein.");
        String w = scan.nextLine();
        switch (w) {
            case "ja" -> {
                System.out.println("Tankvolumen eingeben");
                tankvolumen = scan.nextInt();
                return tankvolumen;
            }
            case "nein" -> {
                System.out.println("Kein Tankvolumen hinterlegt");
                return tankvolumen;
            }
            default -> {
                System.out.println("keine gultige eingabe");
                return initTankvolumen();
            }
        }
    }

    public void getTankvolumen(int tankvolumen) {
        this.tankvolumen = tankvolumen;
    }

    //__________________________________________________________________//

    public int initTankstandt() {

        System.out.println("Mochten Sie den aktuellen Tankstandt fur dieses Fahrzeug anlegen?\n" +
                "Geben Sie ja oder nein ein.");
        String x = scan.nextLine();

        switch (x) {
            case "ja" -> {
                System.out.println("Bitte geben Sie ihren aktuellen Tankstand in Prozend (Ohne %-Zeichen) an");
                tankstandt = scan.nextInt();
                if (tankstandt >= 0 && tankstandt <= 100) {
                    System.out.println("""
                            mochten Sie Ihre Reichweite wissen?\s
                            geben Sie ja ein\s
                            oder nein falls nicht erwunscht""");
                    String p = scan.nextLine();
                    if (p.equals("ja")) {
                        System.out.println("Bitte geben Sie Ihren Durchschnittsverbrauch ein");
                        double y = scan.nextDouble();
                        int reichweite = (int) (tankstandt / y) * 100;
                        System.out.println("Die Reichweiter betragt: " + reichweite + "Km.");
                    }
                    return tankstandt;
                } else {
                    System.out.println("Keine gultige Eingabe");
                    initTankstandt();
                }
                return tankstandt;
            }
            case "nein" -> {
                System.out.println("Kein Tankstandt hinterlegt");
                return tankstandt;
            }
            default -> {
                System.out.println("keine gultige eingabe");
                return initTankstandt();
            }
        }
    }


    public void getTankstandt(int tankstandt) {
        this.tankstandt = tankstandt;
    }
//__________________________________________________________________//


}
