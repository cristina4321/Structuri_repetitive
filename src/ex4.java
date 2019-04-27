import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
       // 4. se dau n numere naturale. sa se calculeze cate dintre ele sunt pare si cate impare.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti marime array:");
        int marime_array = sc.nextInt();

        int j=0;
        int n=0;
        int nr;
        System.out.println("Introduceti " + marime_array + "  numere: ");

        int [] array = new int[marime_array];

        int nrPare =0;
        int nrImpare = 0;
        for(int i=0;i < marime_array;i++)
        {
            n++;
            System.out.print("nr " + n  + ": ");
            nr = sc.nextInt();
            array[j++] = nr;
        }
        System.out.println(" ");

        for(int element: array)
        {
            if(element %2 == 0)
            {
                nrPare++;
            }
            else
            {
                nrImpare++;
            }
        }

        if(nrImpare>0)
        {
            System.out.println("Exista " + nrImpare + " nr impare" );
        }
        else
        {
            System.out.println("Nu s-a gasit numar impar");
        }

        if(nrPare>0)
        {
            System.out.println("Exista " + nrPare + " nr pare" );
        }
        else
        {
            System.out.println("Nu s-a gasit numar par");
        }




    }

}
