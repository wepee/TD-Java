package fr.tse.fise2.td4;

import fr.tse.fise2.td3.Account;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AccountUtils {
    public static void main(String[] args) {
        final int k = 100;
        List<Account> accounts = AccountUtils.randomAccount(k);

        for(int i=0;i<100;i++)
            System.out.println(accounts.get(i).toString());

        Account max = Collections.max(accounts);
        System.out.println(max);

    }

    public static String RandomString(int size) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();

    }


    public static Account randomAccountGenerator() {
        int randInt = new Random().nextInt(10) + 10;

        String generatedString = RandomString(randInt);

        Double randDouble = new Random().nextDouble() * 25000 - 5000;

        return new Account(generatedString, randDouble);
    }

    public static List<Account> randomAccount(final int k) {

        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < k; i++)
            accounts.add(randomAccountGenerator());

        return accounts;
    }

}
