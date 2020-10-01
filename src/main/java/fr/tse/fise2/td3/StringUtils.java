package fr.tse.fise2.td3;

public class StringUtils {

    public static String clean(String str){
        str = str.toLowerCase();
        str = str.replace(".","");
        str = str.trim();

        return str;
    }

}
