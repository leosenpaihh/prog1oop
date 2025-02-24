import java.util.Scanner;
/**
 * Ebben a feladatban egy egyszerű kis játékot kell implementálni. A játékban két lehetőség van, vagy időt kell átkonvertálni óra:perc:másodperc
 * formátumra, vagy össze kell adni egy szám számjegyeinek az összegét.
 *
 * A játék elején a program main metódusában a felhasználó által adott 1-es vagy 2-es opciókkal kiválasztja, melyik feladatot akarja megoldani.
 * Az 1 jelölje az idő átváltást, a 2-es pedig a számjegyek összeadását.
 *
 * Az időkonvertálás során a felhasználónak meg kell adnia egy időtartamot, amit másodpercben kell érteni.
 * Ezt kell átalakítani óra:perc:másodperc formátumra. Figyelem, a rossz inputokat külön kezelni kell!!!
 *
 * A számjegyek összegzésekor a felhasználótől bekért nemnegatív egész érték számjegyeit kell összegezni.
 *
 * Bár a BIRO nem nézi a main metódusodat, mielőtt a kódod feltöltöd, próbáld azt ki. Sokszor segítség lehet, hogy Javaban minden osztály külön futtatható, ha az megfelelően van implementálva.
 */

public class SimpleGame {

    /**
     * Írj egy metódust, ami egy másodpercben adott időt átkonvertál óra:perc:másodperc alakra
     * @param seconds a másodperc, amit át szeretnénk konvertálni
     * @return string az átalakított időpont a következő formátumban: 23:59:59
     *
     * Példák:
     * - Ha a bemenet 1432, akkor írd ki és térj vissza a következő értékkel: 0:23:52
     * - Ha a bemenet 0, akkor írd ki és térj vissza a következő értékkel: 0:0:0
     * - Ha a bemenet nem érvényes (azaz negatív), akkor írd ki és térj vissza a következő értékkel: -1:-1:-1.
     */
    public String convertTime(int seconds){
        // TODO: ide jön a megvalósításod
        if(seconds == 0){
            return "0:0:0";
        }

        if (seconds == -1){
            return "-1:-1:-1";
        }

        int ora = seconds/3600;
        int perc = (seconds%3600)/60;
        int maradek = seconds % 60;
        return ora + ":" + perc + ":" + maradek;
    }

    /**
     * Írj egy metódust, ami összeadja egy nemnegatív szám számjegyeit.
     * @param integer, aminek a számjegyeit össze szeretnénk adni.
     * @return integer a paraméterben kapott egész számjegyeinek az összege
     *
     * Példák:
     * - Ha a bemenet 565, akkor írd ki és térj vissza 16-tal.
     * - Ha a bemenet 7, akkor írd ki és térj vissza 7-tel.
     * - Ha a bemenet 0, akkor írd ki és térj vissza 0-val.
     */
    public int digitsSum(int input){
        // TODO: ide jön a megvalósításod
        int sum = 0;

        while(input > 0){
            sum += input%10;
            input = input/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Hozz létre egy példányt a SimpleGame osztályból.
        // TODO: ide jön a megvalósításod
        SimpleGame game = new SimpleGame();

        System.out.println("Melyik játékot választod? (1 vagy 2)");
        Scanner olvas = new Scanner(System.in);
        int jatek = olvas.nextInt();

        if (jatek == 1){
            System.out.println("Első játékot választottad.");
            System.out.println(game.convertTime(1423));
        }
        else if (jatek == 2){
            System.out.println("Második játékot választottad.");
            System.out.println(game.digitsSum(565));
        }


        // Kérdezd meg a felhasználót, melyik játékkal akar játszani.
        // Majd kérd be az adott feladatnak megfelelő inputot.

        // Ha a felhasználó az 1-et választotta, akkor kérj tőle egy egész értéket, amire meghívod a SimpleGame objektumon keresztül a convertTime metódust.
        // Ha a felhasználó a 2-öt választotta, akkor kérj tőle egy egész értéket, amire meghívod a SimpleGame objektumon keresztül a digitsSum metódust.
    }
}