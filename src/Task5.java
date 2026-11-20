import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                int s = sc.nextInt();
                if (s >= 0 && s <= 100) { scores[i] = s; break; }
                System.out.println("Invalid score, try again.");
            }
        }

        int passed = 0, failed = 0, sum = 0;
        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            sum += scores[i];
            if (scores[i] >= 60) passed++;
            else failed++;
        }
        System.out.println();
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + ((double) sum / scores.length));
    }
}
