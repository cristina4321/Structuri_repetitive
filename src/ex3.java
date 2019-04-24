import java.util.*;
import java.io.IOException;
import java.util.Arrays;

public class ex3 {

    public static void main(String[] args) {
        //3. se dau n numere naturale (creati voi un array de tipul int, de marime n, umplut cu valori la intamplare).
        //sa se afiseze cel mai mare numar impar din array, sau mesajul "no" in cazul in care toate numerele sunt pare.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti marime array:");
        int marime_array = sc.nextInt();


        int j=0;
        int n=0;
        int nr;
        System.out.println("Introduceti " + marime_array + "  numere: ");

        int [] array = new int[marime_array];

        for(int i=0;i < marime_array;i++)
        {
            n++;
            System.out.print("nr " + n  + ": ");
            nr = sc.nextInt();
            array[j++] = nr;
        }
        System.out.println(" ");


        List <Integer> arrayNrImpare = new ArrayList<>();

        System.out.print("Elementul/elementele impare sunt: ");
        int c=0;
        for(int element: array)
        {
            if(element %2 != 0)
            {
                System.out.print(" " + element  + ", ");
                arrayNrImpare.add(element);
            }
        }

        // System.out.println(arrayNrImpare.size());

        if(arrayNrImpare.size()>0) {

            int max = Collections.max(arrayNrImpare);
            System.out.println("\nMaxim impar din array = " + max);
        }
        else
        {
            System.out.println("Nu s-a gasit maxim impar");
        }






    }


}
