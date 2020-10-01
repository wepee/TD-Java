package fr.tse.fise2.td4;

import java.util.*;

public class VegetablesGuava {

    Map<String, List<String>> vegetables = new HashMap<String, List<String>>();

    public static void main(String[] args) {

        Vegetables vege = new Vegetables();

        vege.addVegetable("tomatoes","Evergreen");
        vege.addVegetable("tomatoes","Roma");
        vege.addVegetable("tomatoes","Black Crimea");
        vege.addVegetable("tomatoes","Evergreen");
        vege.addVegetable("carrot","jsp");

        vege.display();

    }

    public void addVegetable(String key, String specie) {

        if (vegetables.containsKey(key)) {
            List<String> oldList = vegetables.get(key);
            if (!oldList.contains(specie)) {
                oldList.add(specie);
                vegetables.replace(key,oldList);
            }
        } else {
            List<String> list = new ArrayList<String>();
            list.add(specie);
            vegetables.put(key, list);

        }
    }
    public void display() {
        System.out.println("Vegetables");

        Iterator it = vegetables.entrySet().iterator();
        while (it.hasNext()) {
            int i=1;
            Map.Entry m = (Map.Entry) it.next();
            System.out.println( i + " : "+m.getKey()+", Specie: "+m.getValue());
            i++;
    }
}


}
