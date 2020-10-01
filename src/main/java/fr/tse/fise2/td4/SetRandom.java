package fr.tse.fise2.td4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class SetRandom {
    public static void main(String[] args) {

        int randomNum;
        TreeSet<Integer> set = new TreeSet<Integer>();


        for(int i =0; i<10000;i++){
            randomNum = ThreadLocalRandom. current () . nextInt (0 , 501);
            set.add(randomNum);
        }

        System.out.println(set.size());

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

}
