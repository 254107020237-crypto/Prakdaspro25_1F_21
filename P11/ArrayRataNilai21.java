package P11;

import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        int [ ] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int mhslulus=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = Akbar21.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
            ++mhslulus;
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata - rata nilai = "+rata2);
        System.out.println("banyak Mahasiswa lulus yaitu : " + mhslulus +  " orang ");
    }
}
