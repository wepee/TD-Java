package fr.tse.fise2.td3;

public class Main {

    public static void main(String[] args) {

        String test = " aldksASA.fczsfe.gsrg ";

        StringUtils.clean(test);

        System.out.println(StringUtils.clean(test));


        StringBuilder nb = new StringBuilder();
        for(int i = 0; i != 100; i++)
            nb.append(i+"-");

        nb.append("100");

        System.out.println(nb.toString());

        Account a1 = new Account("Laurel01", 2145.4);
        Account a2 = new Account("Hardy", 1015.9);
        Account a3 = new Account("Laurel01", 2145.4);
        System.out.println("a1 == a1 ; " + (a1 == a1));
        System.out.println("a1 == a2 ; " + (a1 == a2));
        System.out.println("a1 == a3 ; " + (a1 == a3));
        System.out.println("a2 == a3 ; " + (a2 == a3));
        System.out.println("--------------------");
        System.out.println("a1.equals(a1) ; " + (a1.equals(a1)));
        System.out.println("a1.equals(a2) ; " + (a1.equals(a2)));
        System.out.println("a1.equals(a3) ; " + (a1.equals(a3)));
        System.out.println("a2.equals(a3) ; " + (a2.equals(a3)));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
