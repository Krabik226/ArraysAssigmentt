public class HW4 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

        System.out.print("Duplicate numbers: ");
        boolean any = false;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) if (arr[j] == arr[i]) count++;

            if (count > 1) {
                boolean first = true;
                for (int k = 0; k < i; k++) if (arr[k] == arr[i]) { first = false; break; }
                if (first) { System.out.print(arr[i] + " "); any = true; }
            }
        }

        if (!any) System.out.print("None");
        System.out.println();
    }
}
