public class KovetelmenySzamito {
    public static void main(String[] args) {
        System.out.println(teljesites(10, 12, 15, 20, 5, 5, 3));  // példahívás
    }

    public static String teljesites(double ropegy, double ropketto, double ropharom,
                                    double zh, double cp, int hf, double plusz) { //változók inicializálása.
        double osszeg = ropegy + ropketto + ropharom + zh + cp; //változók összeadása.

        if (osszeg >= 50) { //ha megvan a kettes, hozzáadjuk a plusz és a házi feladatok pontjait.
            osszeg += plusz;
            osszeg += hf;
        }

        //majd így végig megyünk az összes ponthatáron.
        if (osszeg < 50) {
            return "elegtelen";
        } else if (osszeg <= 62) {
            return "elegseges";
        } else if (osszeg <= 75) {
            return "kozepes";
        } else if (osszeg <= 88) {
            return "jo";
        } else {
            return "jeles";
        } //és vissza adjuk, hogy milyen érdemjegyet szerzet a hallgató.
    }
}
