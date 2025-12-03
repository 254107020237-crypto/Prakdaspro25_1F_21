package P14;

import java.util.Scanner;
public class Kafe21 {
   public static int HitungTotalharga21(int PilihanMenu, int BanyakItem) {
        int [] HargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int HargaTotal = HargaItem[PilihanMenu - 1] * BanyakItem;
        return HargaTotal;
   }
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        Menu("Andi", true, "Diskon 50%");
        System.out.print("\nMasukkan Nomor Yang Ingin Anda Pesan : ");
        int PilihanMenu = Akbar21.nextInt();
        System.out.print("\nJumlah Item Yang Ingin Di Pesan : ");
        int BanyakItem = Akbar21.nextInt();
        System.out.print("Masukkan Kode Diskon : ");
        String KodeDiskon = Akbar21.next();
        
        int TotalHarga = HitungTotalharga21(PilihanMenu, BanyakItem);

        double Diskon = 0;
        if (KodeDiskon.equals("50")) {
            Diskon = 0.50;  
            System.out.println("Selamat Anda Mendapatkan Diskon 50 Persen");
        } else if (KodeDiskon.equals("30")) {
            Diskon = 0.30;  
            System.out.println("Selamat Anda Mendapatkan Diskon 30 Persen");
        } else {
            System.out.println("Kode Promo Invalid");
        }
        double TotalHargaAkhir = TotalHarga - (TotalHarga * Diskon);

        System.out.println("Total Harga Untuk Pesanan Anda : Rp " + (int) TotalHargaAkhir);
    }
    public static void Menu(String NamaPelanggan, Boolean isMember, String KodePromo) {
        System.out.println("Selamat Datang, " + NamaPelanggan + "!");       
         if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian!");
        }
        if (KodePromo.equals("Diskon50%")) {
            System.out.println("Selamat Anda Mendapatkan Diskon 50%");
        } else if (KodePromo.equals("Diskon30%")) {
            System.out.println("Selamat Anda Mendapatkan Diskon 30%");
        } else {
            System.out.println("Kode Promo Invalid");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp. 15,000");
        System.out.println("2. Cappuccino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp. 12,000");
        System.out.println("5. Roti Bakar - Rp. 10,000");
        System.out.println("6. Mie Goreng - Rp. 18,000");
        System.out.println("===========================");
        System.out.println("Silakan Pilih Menu Yang Anda Inginkan. "); 
    }    
}
   

