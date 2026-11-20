public class HW2 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 30, 15, 30};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];

        int second = Integer.MIN_VALUE;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max && arr[i] > second) { second = arr[i]; found = true; }
        }

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Largest: " + max);
        if (found) System.out.println("Second largest: " + second);
        else System.out.println("No second largest distinct number.");
    }
}
