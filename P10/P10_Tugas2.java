package P10;

import java.util.Scanner;

public class P10_Tugas2 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = Akbar21.nextInt();
        if (N < 3) {
            System.out.println("Nilai N minimal harus 3");
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
