import java.util.Scanner;

public class ex5 {
    //   afisati in ordine descrescatoare numerele naturale nenule.

    public static void main(String[] args) {

        int[] array = new int[]{4,0,2,5,7,8,0,6};
        boolean aranjate ;
        int var;

            do {
              aranjate = false;

            for(int i = 0; i< array.length - 1 ;i++)
            {
                    if(array[i]<array[i+1])
                    {

                        var = array[i];
                        array[i] = array[i+1];
                        array[i+1] = var;
                        aranjate = true;
                    }

            }
        }while(aranjate);

        System.out.println("  ");
            for(int n : array)
            {
                if(n!=0)
                {
                System.out.println(n);
                }
            }


    }
}