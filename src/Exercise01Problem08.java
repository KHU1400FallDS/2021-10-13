import java.util.Scanner;

public class Exercise01Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        truthTable(1, n, "");
    }

    private static void truthTable(int column, int n, String currentLine) {
        if (column > n) {
            System.out.println(currentLine);
            return;
        }

        truthTable(column + 1, n, currentLine + "0 ");
        truthTable(column + 1, n, currentLine + "1 ");
    }
}
