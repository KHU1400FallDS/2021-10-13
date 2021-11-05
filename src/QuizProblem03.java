import java.util.Scanner;

public class QuizProblem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        hop(n, 1);
    }

    private static void hop(int n, int current) {
        if (current > n)
            return;

        if (current % 5 != 0)
            System.out.print(current + " ");
        else
            System.out.print("HOP ");

        hop(n, current + 1);
    }
}
