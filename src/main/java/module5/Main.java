package module5;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Task1
        HashSet<String> hashSet = new HashSet<String>();
        String[] array = {"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        Collections.addAll(hashSet, array);
        for(String item : hashSet){
            System.out.println(item);
        }

        //Task2
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("арбуз", "ягода");
        hashMap.put("банан", "трава");
        hashMap.put("вишня", "ягода");
        hashMap.put("груша", "фрукт");
        hashMap.put("дыня", "овощ");
        hashMap.put("ежевика", "куст");
        hashMap.put("жень-шень", "корень");
        hashMap.put("земляника", "ягода");
        hashMap.put("ирис", "цветок");
        hashMap.put("картофель", "клубень");

        for(Map.Entry<String, String> pair : hashMap.entrySet()){
            System.out.printf("%s - %s%n", pair.getKey(), pair.getValue());
        }

        //Task 3
        HashMap<String, Cat> hashCat = new HashMap<String, Cat>();
        Cat cat1 = new Cat();
        cat1.setName("cat1");
        hashCat.put(cat1.getName(), cat1);
        Cat cat2 = new Cat();
        cat2.setName("cat2");
        hashCat.put(cat2.getName(), cat2);
        Cat cat3 = new Cat();
        cat3.setName("cat3");
        hashCat.put(cat3.getName(), cat3);
        Cat cat4 = new Cat();
        cat4.setName("cat4");
        hashCat.put(cat4.getName(), cat4);
        Cat cat5 = new Cat();
        cat5.setName("cat5");
        hashCat.put(cat5.getName(), cat5);
        Cat cat6 = new Cat();
        cat6.setName("cat6");
        hashCat.put(cat6.getName(), cat6);
        Cat cat7 = new Cat();
        cat7.setName("cat7");
        hashCat.put(cat7.getName(), cat7);
        Cat cat8 = new Cat();
        cat8.setName("cat8");
        hashCat.put(cat8.getName(), cat8);
        Cat cat9 = new Cat();
        cat9.setName("cat9");
        hashCat.put(cat9.getName(), cat9);
        Cat cat10 = new Cat();
        cat10.setName("cat10");
        hashCat.put(cat10.getName(), cat10);

        for (Map.Entry<String, Cat> cat : hashCat.entrySet()){
            System.out.printf("%s, %s%n", cat.getKey(), cat.getValue().getName());
        }

    }
}
