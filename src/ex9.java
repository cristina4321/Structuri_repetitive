public class ex9 {
    //9. se da un numar natural n. sa se afiseze urmatorul mesaj
    //1
    //1 2
    //1 2 3
    //.......
    //1 2 3 ... n
    public static void main(String[] args) {

        int n = 4;
        int var;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}