package module2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Arrays {
    public static void main(String[] args) throws IOException {
        //maxAmong20Nums();
        //reverseArray();
        //createArrayOfStringLenths();
        reverseArrayOfNums();
    }

    private static void reverseArrayOfNums() throws IOException {
        int[] nums = new int[10];
        Reader reader = new InputStreamReader(System.in);
        BufferedReader inputReader = new BufferedReader(reader);
        System.out.println("Please enter 10 numbers:");
        for (int i=9; i>=0; i--){
            String s = inputReader.readLine();
            if(s.trim().matches("[+-]?\\d+")){
                nums[i] = Integer.parseInt(s);
            }else{
                System.out.println("Entered value not a number. there will be one item less in the array.");
            }
        }
        System.out.println("Reversed array is:");
        for (int num : nums){
            System.out.println(num);
        }
    }

    private static void createArrayOfStringLenths() throws IOException {
        String[] lines = new String[10];
        int[] lengths = new int[10];
        Reader reader = new InputStreamReader(System.in);
        BufferedReader inputReader = new BufferedReader(reader);
        for (int i = 0; i < lines.length; i++){
            lines[i] = inputReader.readLine();
            lengths[i] = lines[i].length();
        }
        System.out.println("The lengths of entered lines in the same order as lines were entered:");
        for (int i = 0; i < lengths.length; i++) {
            System.out.println(lengths[i]);
        }
    }

    private static void reverseArray() throws IOException {
        String[] strings = new String[10];
        Reader reader = new InputStreamReader(System.in);
        BufferedReader inputReader = new BufferedReader(reader);
        for (int i=0; i<8; i++){
            strings[i] = inputReader.readLine();
        }

        for (int i = strings.length-1; i>=0; i--){
            System.out.println(strings[i]);
        }
    }

    private static void maxAmong20Nums() throws IOException {
        int[] nums = new int[20];
        nums = initializeArray();
        findMaxNum(nums);
    }

    private static void findMaxNum(int[] nums) {
        int max = nums[0];
        for(int num : nums){
            if(num>max) max = num;
        }
        System.out.printf("The max value is: %d%n", max);
    }

    private static int[] initializeArray() throws IOException {
        int[] nums = new int[20];
        Reader reader = new InputStreamReader(System.in);
        BufferedReader inputReader = new BufferedReader(reader);
        System.out.println("Please enter 20 numbers: \n");
        for (int i=0; i<20; i++){
            String strNum = inputReader.readLine();
            if (strNum.trim().matches("[+-]?\\d+")){
                nums[i] = Integer.parseInt(strNum);
            }else{
                System.out.println("Entered value not a number. There will be one less number in the array.");
            }

        }
        return nums;
    }
}
