package P12;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        int Responden = 10, Pertanyaan = 6, Total = 0, RataRata = 0;
        double TotalResponden = 0, RataResponden = 0;
        int [][] HasilSurvey = new int [Responden][Pertanyaan];

        for (int i = 0; i < HasilSurvey.length; i++) {
            System.out.println("Responden Ke - " + (i + 1));

            for (int j = 0; j < HasilSurvey[i].length; j++) {
                System.out.print("Pertanyaan Ke - " + (j + 1) + " Masukkan Rentan Nilai (1 - 5) : ");
                HasilSurvey[i][j] = Akbar21.nextInt();
                TotalResponden += HasilSurvey[i][j];
            }
            RataResponden = TotalResponden / Pertanyaan;
            System.out.println("Nilai Rata Rata Responden " + (i + 1) + " Yaitu : " + RataResponden);
        }
        for (int j = 0; j < Pertanyaan; j++) {
            for (int i = 0; i < Pertanyaan; i++) {
                TotalResponden +=  HasilSurvey[i][j];
            }
            RataResponden = TotalResponden / Responden;
            System.out.println("Rata Rata Pertanyaan " + (j + 1) + " Yaitu " + RataResponden);
        }
        for (int i = 0; i < Responden; i++) {
            for (int j = 0; j < Pertanyaan; j++) {
                Total += HasilSurvey[i][j];
            }
        }
        RataRata = Total / (Responden * Pertanyaan);
        System.out.println("Rata Rata Yaitu : " + RataRata);
        System.out.println();
    }
}
