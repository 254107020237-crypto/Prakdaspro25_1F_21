package P12;

import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        double TotalPerSiswa=0, TotalPerMatkul =0;
        int [][] Nilai = new int[4][3];

        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Input Nilai Mahasiswa ke -" + (i + 1));

            for (int j = 0; j < Nilai[i].length; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + " : ");
                Nilai [i][j] = Akbar21.nextInt();
            }
        }
        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Input Nilai Mata Kuliah ke - : " + (i + 1));
            TotalPerSiswa = 0;

            for (int j = 0; j < Nilai[i].length; j++) {
                System.out.println("Nilai Mata Kuliah  " + (j+1) + " : ");
                Nilai[i][j] = Akbar21.nextInt();
                TotalPerSiswa += Nilai[i][j];
            }
            System.out.println("Nilai Rata Rata : " + TotalPerSiswa/3);
        }
        System.out.println("\n==============================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah :");

        for (int j = 0; j < 3; j++) {
            TotalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                TotalPerMatkul+= Nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + TotalPerMatkul / 4);
        }
    }
}
