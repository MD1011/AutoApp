

import java.util.Scanner;


public class Auto {


    private String kennzeichen;
    private int kilometerstandt;
    private int tankvolumen;
    private int tankstandt;
    Scanner scan = new Scanner(System.in);


    public Auto() {
    }


    public void initWerte() {
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

        System.out.println("""

                Mochten Sie ein Kilometerstand fur dieses Fahrzeug anlegen?
                Geben Sie ja oder nein ein.""");
        String x = scan.nextLine();

        switch (x) {
            case "ja" -> {
                System.out.println("Kilometerstand eingeben");
                kilometerstandt = Integer.parseInt(scan.nextLine());
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
        System.out.println("""

                Mochten Sie ein Tankvolumen fur dieses Fahrzeug anlegen?
                Geben Sie ja oder nein ein.""");
        String w = scan.nextLine();
        switch (w) {
            case "ja" -> {
                System.out.println("Tankvolumen eingeben");
                tankvolumen = Integer.parseInt(scan.nextLine());
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

        System.out.println("""

                Mochten Sie den aktuellen Tankstandt fur dieses Fahrzeug anlegen?
                Geben Sie ja oder nein ein.""");
        String x = scan.nextLine();

        switch (x) {
            case "ja" -> {
                System.out.println("Bitte geben Sie ihren aktuellen Tankstand in Prozend (Ohne %-Zeichen) an");
                try {
                    tankstandt = Integer.parseInt(scan.nextLine());
                }catch (NumberFormatException e) {
                    e.printStackTrace();
                    return initTankstandt();
                }

                if (tankstandt >= 0 && tankstandt <= 100) {
                    System.out.println("""
                            \nmochten Sie Ihre Reichweite wissen?\s
                            geben Sie ja ein\s
                            oder nein falls nicht erwunscht""");
                    String p = scan.nextLine();
                    if (p.equals("ja")) {
                        System.out.println("Bitte geben Sie Ihren Durchschnittsverbrauch ein");
                        double y = scan.nextDouble();
                        ThreadReichweite t1 = new ThreadReichweite(tankvolumen,tankstandt,y);
                        ThreadReichweiteGesammt tg1 = new ThreadReichweiteGesammt(tankvolumen, y);
                        t1.start();
                        tg1.start();
                    }
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



    public int getTankstandt(int tankstandt) {
        this.tankstandt = tankstandt;
        return tankstandt;
    }


//__________________________________________________________________//


}
