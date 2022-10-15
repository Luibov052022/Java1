import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int j = (i * (i + 1)) / 2;
            System.out.print(j + " ");
        }
    }
}