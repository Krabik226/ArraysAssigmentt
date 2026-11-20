public class Task3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) sum += arr[i];
        double avg = (double) sum / arr.length;

        int count = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] > avg) count++;

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Average: " + avg);
        System.out.println("Numbers above average: " + count);
    }
