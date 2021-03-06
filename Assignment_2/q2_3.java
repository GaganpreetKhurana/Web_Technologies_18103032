import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q2_3 {
    public static void sortIteration(String[] arr, int position) {
        Queue<String>[] buckets = new Queue[256];
        for (int i = 0; i < 256; i++) {
            buckets[i] = new LinkedList<String>();
        }

        // Add each string to bucket according to character at 'position'
        for (String i : arr) {
            int index = 0;
            if (position < i.length()) {
                index = i.charAt(position) - 0;
            }
            buckets[index].add(i);
        }

        // Remove strings from buckets to Array arr
        int k = 0;
        for (Queue<String> i : buckets) {
            while (!i.isEmpty()) {
                arr[k] = i.remove();
                k++;
            }
        }
    }

    private static void radixSort(String[] arr) {
        int maxStringLength = 0; // Maximum string length
        for (String i : arr) {
            if (i.length() > maxStringLength) {
                maxStringLength = i.length();
            }
        }
        for (int i = maxStringLength - 1; i > -1; i--) {
            sortIteration(arr, i); // Sort strings for index i
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Strings: ");
        int n = input.nextInt(); // Number of strings
        input.nextLine();
        String[] arr = new String[n]; // Array of strings
        for (int i = 0; i < n; i++) {
            System.out.print("Enter String " + (i + 1) + ": ");
            arr[i] = input.nextLine();
        }
        input.close();
        System.out.println();
        radixSort(arr); // Radix Sort
        System.out.print("Output: ");
        for (String i : arr) {
            System.out.print('\"' + i + '\"' + " ");
        }
        System.out.println();
    }
}