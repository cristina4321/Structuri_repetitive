public class ex12 {

    // 12. se da un numar 0 <= n <= 11 (lunile anului, unde 0 -> ianuarie, etc).
    // afisati un mesaj spunand in ce anotimp e luna reprezentata de n.
    // la fel, scrieti ambele variante (switch si if).

    public static void main(String[] args) {

        int n = 3;
        String anotimpString = " ";
        String anotimpStringIf = " ";

        //varianta 1 switch

        switch (n) {
            case 0 :
            case 1 : anotimpString = "iarna";
                break;
            case 2 :
            case 3 :
            case 4 : anotimpString = "primavara";
                break;
            case 5 :
            case 6:
            case 7 : anotimpString = "vara";
                break;
            case 8 :
            case 9 :
            case 10 : anotimpString = "toamna";
                break;
            case 11 : anotimpString = "iarna";
                break;
            default:
                System.out.println("Nu exista  //switch");
        }

        if(anotimpString != " ") {
            System.out.println("Anotimpul reprezentat de " + n + " este " + anotimpString + "  //switch");
        }

        //varianta 2 if

        if(n==0 || n==1)
        {
            anotimpStringIf = "iarna";
        }
        else if(n==2 || n==3 || n==4)
        {
            anotimpStringIf = "primavara";

        }
        else if(n==5 || n==6 || n==7)
        {
            anotimpStringIf = "vara";

        }
        else if(n==8 || n==9 || n==10)
        {
            anotimpStringIf = "toamna";

        }
        else if (n==11)
        {
            anotimpStringIf = "iarna";

        }
        else
        {
            System.out.println("Nu exista  //if");
        }

        if(anotimpStringIf != " ")
        {
            System.out.println("Anotimpul reprezentat de " + n + " este " + anotimpStringIf + "  //if");
        }

    }
}
