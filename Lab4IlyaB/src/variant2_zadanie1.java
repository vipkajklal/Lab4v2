import java.util.InputMismatchException;
import java.util.Scanner;

public class variant2_zadanie1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Количество строк в двухмерном массиве: ");
            int a = sc.nextInt();
            System.out.println("Количество столбцов в двухмерном массиве: ");
            int b = sc.nextInt();
            int[][] matrix = new int[a][b];
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    System.out.println("Введите значение matrix[" + i + "][" + j + "] ");
                    int data = sc.nextInt();
                    matrix[i - 1][j - 1] = data;
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Номер столбца");
            int k = sc.nextInt();
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][k - 1]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет столбца с таким номером");
        }
    }
}

