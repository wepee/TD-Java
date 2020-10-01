package fr.tse.fise2.td3;
public class MysteryExample {

    public static void myMethod(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        Integer inum = new Integer(100);
        //Integer inum = Integer.valueOf(100);
        myMethod(inum);

    }
}
