public class ex19 {

    public static void main(String[] args) {
        //19. se da un numar care reprezeinta CNP-ul unei persoane si are urmatorul format => SAALLZZJJNNNC.
        // sa se scrie un program care afiseaza sexul, luna si anul nasterii unei, stiind ca :
        //S => sexul : masculin / feminin
        //1 / 2 - nascuti intre 1 ianuarie 1900 si 31 decembrie 1999
        //3 / 4 - nascuti intre 1 ianuarie 1800 si 31 decembrie 1899
        //5 / 6 - nascuti intre 1 ianuarie 2000 si 31 decembrie 2099
        //7 / 8 - pentru persoanele straine rezidente in Romania.  adica 1900 si 1999
        //AA => numar format din 2 cifre si reprezinta ultimele 2 cifre din anul nasterii
        //LL => luna (exemplu 05 => mai)
        //ZZ => ziua (exemplu 09 = 9)
        //exemplu : cnp = 1900510...... se va afisa mesajul "baiat nascut pe 10 mai 1990"
        //	  cnp = 2890205...... se va afisa mesajul "fata nascuta pe 5 februarie 1989"

        long cnp = 2890205170029L;
        //long cnp = 1900510170029L;

        long n1 = cnp;
        long n2 = cnp ;
        while (cnp!=0){
            n2 = n1;
            n1 = cnp;
            cnp /= 1000000;
        }

        int sex = (int)n2 / 1000000 % 10;
        int an = (int)n2 / 10000 % 100;
        int luna = (int)n2 / 100 % 100;
        int zi = (int)n2  / 1 % 100;
        String lunaCNP = " ", gen = " " ;
        int anCNP = 0, err = 0;

        switch (luna) {
            case 1:
                lunaCNP = "ianuarie";
                break;
            case 2:
                lunaCNP = "februarie";
                break;
            case 3:
                lunaCNP = "martie";
                break;
            case 4:
                lunaCNP = "aprilie";
                break;
            case 5:
                lunaCNP = "mai";
                break;
            case 6:
                lunaCNP = "iunie";
                break;
            case 7:
                lunaCNP = "iulie";
                break;
            case 8:
                lunaCNP = "august";
                break;
            case 9:
                lunaCNP = "septembrie";
                break;
            case 10:
                lunaCNP = "octombrie";
                break;
            case 11:
                lunaCNP = "noiembrie";
                break;
            case 12:
                lunaCNP = "decembrie";
                break;
        }

        switch (sex) {
            case 1: case 2:
                anCNP=1900+an;
                break;
            case 3: case 4:
                anCNP=1800+an;
                break;
            case 5: case 6:
                anCNP=2000+an;
                break;
            case 7: case 8:
                anCNP=1900+an;
                break;
        }

        switch (sex)  // am folosit switch si nu if-else nr par , impar
        // pentru ca .. poate fi si un mod de validare, gen cnp-ul sa nu inceapa cu 0 sau 9 :).. va respecta strict case-urile :)
        {
            case 1: case 3: case 5: case 7:
            gen = "baiat";
            break;
            case 2: case 4: case 6: case 8:
            gen = "fata";
            break;

            default:
                err = 1;
        }

        String data = zi + " " + lunaCNP + " " + anCNP;

        if(err!=1) {
            if (gen == "fata") {
                System.out.println(gen + " nascuta pe " + data);
            } else {
                System.out.println(gen + " nascut pe " + data);
            }
        }
    }
}
