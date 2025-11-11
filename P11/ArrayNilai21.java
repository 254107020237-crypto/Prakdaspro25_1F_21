package P11;

import java.util.Scanner;

public class ArrayNilai21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        int [ ] nilaiAkhir = new int[10];

        for (int i =0; i< nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = Akbar21.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                
            }
            System.out.println("Nilai akhir ke-"+i+" lulus ");
        }
    }
}
