import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scan.nextInt();

        int[] arr = {5, 51, 22, -6, 9, -20, -1, 99, -50};

        Arrays.sort(arr);

        if (n <= arr[0] || n >= arr[arr.length - 1]) {
            System.out.println("Incorrect entry ! The number is out of this array.");
            System.out.println(Arrays.toString(arr));
        } else {
            int min = n;
            int max = n;

            for (int i : arr) {
                if (n > i)
                    min = i;
                if (i > n) {
                    max = i;
                    break;
                }
            }

            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Closest bigger value = " + max);
            System.out.println("Closest smaller value = " + min);

        }
    }
}