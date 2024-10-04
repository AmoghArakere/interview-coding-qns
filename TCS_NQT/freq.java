/*You are given an array of strings where each string can appear multiple times. Your task is to count the frequency of each unique string and print the result in the order the strings first appear in the array.
I/P : ["apple", "banana", "apple", "banana", "orange"]
O/P : 
apple 2
banana 2
orange 1
*/

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        LinkedHashMap<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        for (String key : frequencyMap.keySet()) {
            System.out.println(key + " " + frequencyMap.get(key));
        }
    }
}
