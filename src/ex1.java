public class ex1 {

    public static void main(String[] args) {

 int countn = 0;
 Character caracter = '#';

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(caracter);


            }
            System.out.print(" ");
            countn ++;
           // System.out.println(countn);

            if (countn==5)
            {
                for (int k=3;k>0;k--)
                {
                    for(int n=0;n<k;n++)
                    {
                        System.out.print(caracter );
                    }
                    System.out.print(" ");
                }
            }


        }




    }
}