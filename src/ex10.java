public class ex10 {

    //10. se da un sir de numere naturale, sa se calculeze suma primelor 5 elemente pare.
    public static void main(String[] args) {

        int nrPare=0;
        int[]arrayNrNaturale = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int suma = 0;
        int countNrPare = 0;
        for (int i=0;i<arrayNrNaturale.length;i++)
        {
            if (arrayNrNaturale[i] % 2 == 0 && countNrPare<5)
            {
                suma = suma + arrayNrNaturale[i];
                System.out.println(arrayNrNaturale[i]);
                countNrPare ++;
            } else {
                continue;
            }
        }

        System.out.println("Suma primelor 5 elemente pare este: " + suma);

    }
}