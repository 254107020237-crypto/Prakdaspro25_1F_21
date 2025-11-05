package P10;

import java.util.Scanner;

public class P10_Tugas3 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        System.out.print("Jumlah cabang cafe : ");
        int cabang = Akbar21.nextInt();
        System.out.println("===== Input penjualan per cabang =====");

        int totalcabang = 0, totalpenlanggan = 0;
        for (int i = 1; i <= cabang; i++) {
            System.out.println("---- cabang " + i + " ---- ");
            System.out.print("jumlah pelanggan : ");
            int pelanggan = Akbar21.nextInt();
            int totalitem = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("-- pelanggan " + j + "Pesan berapa item : ");
                int item = Akbar21.nextInt();
                totalitem += item;
            }
            System.out.println("Total pelanggan: " + pelanggan);
            System.out.println("Item terjual: " + totalitem);
            totalpenlanggan += pelanggan;
            totalcabang += totalitem;
        }
        System.out.println("Total seluruh cabang : ");
        System.out.println("Pelanggan: " + totalpenlanggan + " orang ");
        System.out.println("Item terjual: " + totalcabang + " item ");
    }
}
