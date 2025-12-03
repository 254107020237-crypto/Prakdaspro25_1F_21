package P14;

import java.util.Scanner;

public class NilaiMahasiswa21 {
   public class InputNilaiMhs {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        System.out.print(" Masukkan Jumlah Elemen (N) : ");
        int N = Akbar21.nextInt();

        int [] Data = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan Nilai elemen Ke - " + (i + 1) + " : ");
            Data[i] = Akbar21.nextInt();
        }
        System.out.println("\nNilai Keseluruhan Mahasiswa : ");
        for ( int Nilai : Data) {
            System.out.println(Nilai);
        }
        int totalNilai = hitungTotal(Data);
        System.out.println("\nTotal nilai semua mahasiswa = " + totalNilai);
    }
    public static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;   
        }
        return total;
    }
   } 
}
