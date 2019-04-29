public class ex1 {

    //1. sa se scrie un program folosind o structura repetitiva, care sa afiseze urmatorul rezultat
    //# ##  ###   ####   ###  ##  #

    public static void main(String[] args) {

        char c = '#';
        int j = 0, i, v;

        for (i = 0; i < 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.print(" ");
        }


        for (int k = i - 1; k > 0; k--) {
            for (v = 0; v < k; v++) {
                System.out.print(c);
            }
            System.out.print(" ");
        }
    }
}