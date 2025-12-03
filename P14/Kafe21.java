package P14;

public class Kafe21 {
    public static void main(String[] args) {
        Menu("Andi", true, "Diskon50%");
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
   

