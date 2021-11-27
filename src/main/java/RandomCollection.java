import java.util.*;

public class RandomCollection {
    public static void RandomNum(){
//        რანდომ კლასის ინიცირება
        Random random = new Random();

//        რანდომ რიცხვის დაგენირება 0 დან 3 ის რეინჯში
        int random_num = random.nextInt(3);

//        დაგენერირებული რიცხვის დაპრინტვა
        System.out.println("რენდომ რიცხვია: "+random_num);

//        HashMap სტრუქტურის ცვლადი რომლის key=Integer -ია ხოლო value=CollectionNames -ს
        HashMap<Integer, CollectionNames> collectionsMap = new HashMap<>();

//        collectionsMap-ისთვის პარამეტრების key, value -ს გადაცემა
        collectionsMap.put(0, CollectionNames.LIST);
        collectionsMap.put(1, CollectionNames.MAP);
        collectionsMap.put(2, CollectionNames.SET);

//        CollectionNames ტიპის ცვლადში ინახება და კონსოლში იპრინტება რენდომ ენუმერაციის წევრი
        CollectionNames collectionNames = collectionsMap.get(random_num);

        System.out.println("რენდომ ენუმერაციის წევრი: "+collectionNames);


        switch (collectionNames){
//            თუ ცვლადი CollectionNames.LIST -ის ტოლია მაშინ შეიქმნება ArrayList და დაიპრინტება მისი ველიუები
            case LIST:
                ArrayList<String> cars = new ArrayList<>();
                cars.add("mercedes-benz");
                cars.add("BMW");
                cars.add("Ford");
                cars.add("Mazda");

                for (int i = 0; i < cars.size(); i++) {
                    System.out.println(cars.get(i));
                }
                break;
//            თუ ცვლადი CollectionNames.MAP -ის ტოლია მაშინ შეიქმნება HashMap და დაიპრინტება მისი ველიუები
            case MAP:
                HashMap<String, String> food = new HashMap<>();
                food.put("Desert", "cake");
                food.put("Vegetable", "carrot");
                food.put("Fruit", "apple");

                for (String i : food.values()) {
                    System.out.println(i);
                }
                break;
//            თუ ცვლადი CollectionNames.SET -ის ტოლია მაშინ შეიქმნება HashSet და დაიპრინტება მისი ველიუები
            case SET:
                HashSet<String> programing_language = new HashSet<>();
                programing_language.add("C");
                programing_language.add("Python");
                programing_language.add("Java");
                programing_language.add("Php");

                for (String i : programing_language) {
                    System.out.println(i);
                }
                break;
        }
    }
}
