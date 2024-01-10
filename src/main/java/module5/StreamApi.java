package module5;

import java.util.*;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(" ");
        list.add("");
        for (int i = 0; i < 48; i++) list.add(generateRandomString());
        //for (String str : list) System.out.println(str);

        System.out.println("\nThe length og each srting:\n");
        list.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("\nNot empty strings which don't contain 'd':\n");
        list.stream()
                .filter(s -> !s.isEmpty() && !s.contains("d"))
                .forEach(System.out::println);

        System.out.println("\nSorted array:\n");
        list.stream()
                .sorted()
                .forEach(System.out::println);


    }

    private static String generateRandomString() {
        String characters = "     ABCDEFGHIJKLMNOPQRSTUVWXYZ     abcdefghijklmnopqrstuvwxyz 0123456789 ";

        Random random = new Random();
        int length = random.nextInt(51);

        StringBuilder randomString = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }
}
