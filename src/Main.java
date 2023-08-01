import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("vvedite n m:");
             Scanner znachenie = new Scanner(System.in);
        int n = znachenie.nextInt();
        int m = znachenie.nextInt();
        int result[] = new int[n];

        System.out.println("vvedite " + m + "par chisel");
        for (int i = 0; i < 2*m; i++) {
             int perekrestok = znachenie.nextInt();
             result[perekrestok - 1]++; //замена значения в ячейке на то, которое ввел пользователь и
            }                           // добавляем светофор (когда ++)
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        }
    }

