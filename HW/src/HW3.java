import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index to remove: ");
        int idx = sc.nextInt();

        System.out.print("Updated: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i != idx) System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
