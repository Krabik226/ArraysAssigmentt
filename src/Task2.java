public class Task2 {
    public static void main(String[] args) {
        int[] arr = {12, 5, 28, 3, 19, 7, 15, 9};
        int max = arr[0], min = arr[0];
        int maxIdx = 0, minIdx = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { max = arr[i]; maxIdx = i; }
            if (arr[i] < min) { min = arr[i]; minIdx = i; }
        }

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Largest: " + max + " at index " + maxIdx);
        System.out.println("Smallest: " + min + " at index " + minIdx);
    }
}
