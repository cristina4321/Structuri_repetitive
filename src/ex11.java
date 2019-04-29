import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        //11. sa da un numar 0 <= n <= 9 (intre 0 si 9). afisati un mesaj spunand ce numar reprezinta (zero, unu, etc)
        // sau "numar gresit" pentru cazul cand n este in afara intervalului.
        //pentru problema 11, trebuie sa scrieti 2 variante ale programului. una folosind if-esle, una folosind switch.

        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        String mesaj ="Numarul " + n + " se incadreaza intre 0 - 9    //switch";
        String mesaj1 = "Numarul " + n + " se incadreaza intre 0 - 9    //if-else";

        //varianta 1 if-else

        if(n>=0 && n<=9)
        {
            System.out.println(mesaj1);
        }
        else
        {
            System.out.println("Numar gresit   //if-else");
        }

        //varianta 2 switch

        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(mesaj);
                break;

            default:
                System.out.println("Numarul gresit  //switch");

        }

    }


}
