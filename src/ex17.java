public class ex17 {

    public static void main(String[] args) {

        // 17. se da un numar n. sa se calculeze m unde m este suma cifrelor de pe pozitiile pare - suma cifrelor de pe pozitiile impare

        int n = 1234567;
        int invers=0;
        int i=0, k=0, sPar =0, sImpar=0, var=n, countCifre=0;

        while(var!=0) {
            var /= 10;
            countCifre++;
        }

        int [] array = new int[countCifre];
        int newArray [] = new int[countCifre];
        while(n > 0) {
            invers = invers * 10 + n%10;
            int fiecareNumar = invers%10;
            n = n/10;
            array[i++] = fiecareNumar ;
        }

        for(int j=array.length - 1;j>=0;j--)
        {
            newArray[k++] = array[j];
        }

        k =0;

        for(int nr:newArray)
        {
            if(k%2==0)
            {
                sPar = sPar + newArray[k];
            }
            else
            {
                sImpar =  sImpar + newArray[k];
            }
            k++;
        }

        System.out.println("Suma de pe pozitiile pare este: "+ sPar);
        System.out.println("Suma de pe pozitiile impare este: "+ sImpar);
        System.out.println("(Suma cifre poz par - Suma cifre poz impar) m = "+ (sPar - sImpar));

    }
}
