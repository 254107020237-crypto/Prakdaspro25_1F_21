package P11;

import java.util.Scanner;

public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        System.out.print("Masukkan nilai yang akan di input : ");
        int nilai = Akbar21.nextInt();
        int [] arrNilai = new int [nilai];
        int key = 0;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke - " + (i+1)+ " : ");
            arrNilai [i] = Akbar21.nextInt();
        }
        System.out.print("Masukkan nilai yang di cari : ");
        key = Akbar21.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+key+" Ketemu nilai mahasiswa ke- "+hasil);
        System.out.println();
    }
}
