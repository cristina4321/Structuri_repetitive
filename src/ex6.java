import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

       // 6.  afisati in ordine crescatoare, primele n numere naturale impare

                Scanner sc = new Scanner(System.in);
                int i=0,var;
                int [] arrayNrImpare = new int [] {3,7,21,33,45,5,1};
                System.out.println("Introduceti cate numere impare (n) doriti sa afisati:");
                int n = sc.nextInt();
                System.out.println(" ");
                boolean aranjare;

                do
                {
                    aranjare = false;
                    for( i = 0; i< arrayNrImpare.length - 1 ;i++)
                    {
                        if(arrayNrImpare[i]>arrayNrImpare[i+1])
                        {
                            var = arrayNrImpare[i];
                            arrayNrImpare[i] = arrayNrImpare[i+1];
                            arrayNrImpare[i+1]= var;
                            aranjare = true;

                        }

                    }
                }while(aranjare);

                for(int j=0;j<n;j++)
                {
                    System.out.println(arrayNrImpare[j]);
                }

            }
}
