import java.util.HashMap;
import java.util.Scanner;

public class q1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = input.nextLine(); // First String
        System.out.print("Enter second string: ");
        String second = input.nextLine(); // Second String
        input.close();

        HashMap<Character, Integer> mapFirst = new HashMap<Character, Integer>();
        // HashMap for first string characters and their frequencies
        for (Character c : first.toCharArray()) {
            mapFirst.put(c, 1 + mapFirst.getOrDefault(c, 0));
        }

        HashMap<Character, Integer> mapSecond = new HashMap<Character, Integer>();
        // HashMap for second string characters and their frequencies
        for (Character c : second.toCharArray()) {
            mapSecond.put(c, 1 + mapSecond.getOrDefault(c, 0));
        }

        // check if both strings are anagrams
        System.out.print("Anagrams: " + mapFirst.equals(mapSecond));
    }
}