package P12;

import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        double TotalPerSiswa = 0;
        int JumlahMahasiswa, JumlahMatkul;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        JumlahMahasiswa = Akbar21.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        JumlahMatkul = Akbar21.nextInt();
        int [][] Nilai = new int[JumlahMahasiswa][JumlahMatkul];

        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Input Nilai Mahasiswa ke - " + (i + 1));
            
            for (int j = 0; j < Nilai[i].length; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + " : ");
                Nilai [i][j] = Akbar21.nextInt();
                TotalPerSiswa += Nilai[i][j];
            }
            System.out.println("Nilai Rata Rata : " + TotalPerSiswa/JumlahMatkul);
        }
        System.out.println("===========================================");
        System.out.println("Rata Rata Nilai Setiap Mata Kuliah : ");
        
        for (int j = 0; j < JumlahMatkul; j++) {
            double TotalPerMatkul = 0;

            for (int i = 0; i < JumlahMahasiswa; i++) {
                TotalPerMatkul += Nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + " : " + TotalPerMatkul/JumlahMahasiswa);
        }
    }
}
