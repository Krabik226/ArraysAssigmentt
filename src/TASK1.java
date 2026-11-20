public class TASK1 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 8, -1, 0, 12, -7, 4, 2};
        int pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) pos++;
            else if (arr[i] < 0) neg++;
            else zero++;
        }

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}
