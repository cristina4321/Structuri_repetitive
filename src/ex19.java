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

        String nrCNP = "2890205170029";
        //  String nrCNP = "1900510170029";
        int anExtras = Integer.parseInt(nrCNP.substring(1,3));
        int luna = Integer.parseInt(nrCNP.substring(3,5));
        int zi = Integer.parseInt(nrCNP.substring(5,7));

        int len = nrCNP.length();
        int [] arrayCNP = new int[len];

        for(int i=0;i<nrCNP.length();i++)
        {
            arrayCNP[i] = Integer.valueOf(nrCNP.charAt(i)+"");
        }

        String lunaCNP= " ";

        switch (luna)
        {
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

        String gen=" ";

        switch (arrayCNP[0])
        {
            case 1: case 3: case 5: case 7:
            gen = "baiat";
            break;
            case 2: case 4: case 6: case 8:
            gen = "fata";
            break;
        }

        int anCNP =0;

        switch (arrayCNP[0])
        {
            case 1: case 2:
            anCNP=1900+anExtras;
            break;
            case 3: case 4:
            anCNP=1800+anExtras;
            break;
            case 5: case 6:
            anCNP=2000+anExtras;
            break;
            case 7: case 8:
            anCNP=1900+anExtras;
            break;

        }

        String rezultat = gen + " nascut pe " + zi + " " + lunaCNP + " " + anCNP;
        String data = zi + " " + lunaCNP + " " + anCNP;
        if(gen=="fata")
        {
            System.out.println (gen + " nascuta pe " + data);
        }
        else
        {
            System.out.println (gen + " nascut pe " + data);
        }
    }
}
