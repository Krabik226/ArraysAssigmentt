public class HW1 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};

        System.out.print("Original: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) { arr[i] = 0; count++; }
        }

        System.out.print("Modified: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Replacements: " + count);
    }
}
