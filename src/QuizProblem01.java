import java.util.Arrays;
import java.util.Scanner;

public class QuizProblem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        Integer[] numbers = Arrays.stream(line.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        print(numbers, 0);
    }

    private static void print(Integer[] numbers, int index) {
        if (index >= numbers.length)
            return;

        if (numbers[index] % 2 == 0)
            System.out.print(numbers[index] + " ");

        print(numbers, index + 1);

        if (numbers[index] % 2 == 1)
            System.out.print(numbers[index] + " ");
    }
}
