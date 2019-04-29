import java.util.Scanner;

public class ex18 {

    //18. se da un caracter n (char). sa afiseze daca n este o litera ce reprezinta punctele cardinale.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        char n = sc.next().charAt(0);
        System.out.println(" ");

        n = Character.toUpperCase(n);

        switch (n) {
            case 'N':
                System.out.print(n);
                break;
            case 'S':
                System.out.print(n);
                break;
            case 'E':
                System.out.print(n);
                break;
            case 'V':
                System.out.print(n);
                break;
            default:
                System.out.print(n +" nu reprezinta punctele cardinale");
        }

    }
}
