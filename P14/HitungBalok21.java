package P14;

import java.util.Scanner;

public class HitungBalok21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
         int p, l, t, L, vol;

         System.out.println("Masukkan Panjang");
         p = Akbar21.nextInt();
         System.out.println("Masukkan Lebar");
         l = Akbar21.nextInt();
         System.out.println("Masukkan Tinggi");
         t = Akbar21.nextInt();

         L =  (p * l);
         System.out.println("Luas Persegi Adalah " + L);
         vol = (t * p * l);
         System.out.println("Volume Balok Adalah " + vol);

         Akbar21.close();
    }
    //static int HitungLuas(int pjg, int lb) {
        //int Luas = pjg * lb;
        //return Luas;
    //}
    //static int HitungVolume(int tinggi, int a, int b) {
        //int Volume = HitungLuas(a, b) * tinggi;
        //return Volume;
    //}
}
