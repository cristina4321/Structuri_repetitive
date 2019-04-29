public class ex16 {

    //16. sa da un numar n. sa se calculeze suma cifrelor de pe pozitiile pare ale numarului. ex : n = 1234, suma => 1 + 3 = 4

    public static void main(String[] args) {

        int n = 1234;
        int invers=0;
        int i=0, k=0, s =0, var=n, countCifre=0;

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
                s = s+ newArray[k];
            }
            k++;
        }

        System.out.println("Suma de pe pozitiile pare este: "+ s);

        /* sau varianta 2
          int n =1234;
        int countCifre = 0;
        int var = n;
        int sum = 0;

        // First, count the number of digits
        while(var!=0) {
            var /= 10;
            countCifre++;
        }

        // If the number of digits is odd, throw away the least significant digit
        if(countCifre % 2 == 0) {
            n /= 10;
        }

        // Keep adding the least significant digit, and throwing away two digits until you're done.
        while(n!=0){
            sum += n % 10;
            n = n/100;
        }
        System.out.println("Suma de pe pozitiile pare este  " + sum);

         */
    }
}

