package module2;

import java.util.Scanner;

public class ReferenceTypes {
    public static void main(String[] args) {
//        getStringStat();
//        replaceSubstring();
        findLongest();
    }

    private static void findLongest() {
        System.out.println("Please enter the sequence of words");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        if (line.trim().isEmpty()){
            System.out.println("No words found in the provided line");
            return;
        }

        String[] elements = line.split("\\s");
        int max = 0;
        String longestWord = null;
        for (String word : elements){
            if(word.length() > max){
                max = word.length();
                longestWord = word;
            }
        }
        System.out.printf("The longest word in the line is: %s%n", longestWord);
    }

    private static void replaceSubstring() {
        System.out.println("Please enter a string to process: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Please enter a substring to replace: ");
        String toReplace = scanner.nextLine();
        System.out.println("Please enter a replacement string: ");
        String replacement = scanner.nextLine();
        scanner.close();

        String newStart;
        String newEnding;
        String newStr;
        int iStart = str.indexOf(toReplace);
        if (iStart != -1){
            newEnding = str.substring(iStart+toReplace.length());
            if (iStart > 0){
                newStart = str.substring(0, iStart);
                newStr = newStart + replacement + newEnding;
            } else{
                newStr = replacement + newEnding;
            }
            System.out.println("Updated string is --->");
            System.out.println(newStr);
        } else {
            System.out.println("There is no such substring in the initial string for replacement.");
        }
    }

    private static void getStringStat() {
        String str = "The low sun, with slanting rays, illuminated the western slopes of the peaks. Creating an impression of unbroken monolithic magic of nature.";
        System.out.println("The string is: " + str);
        System.out.printf("Starts with char: '%s'%n", str.charAt(0));
        System.out.printf("Ends with char: '%s'%n", str.charAt(str.length()-1));
        System.out.printf("The middle char is: '%s'%n", str.charAt(str.length()/2));
        int index = str.indexOf('.');
        if (index != -1) {
            System.out.println(str.substring(0, index+1));
        } else {
            System.out.println("The string doesn't include any '.' signs.\n");
        }
        System.out.printf("The count of white spaces: %d%n", countSpaces(str));
    }

    private static int countSpaces(String str) {
        int count = 0;
        for(int index=0; index<str.length();index++){
            if(str.charAt(index) == ' ') count++;
        }
        return count;
    }


}
