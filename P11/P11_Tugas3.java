package P11;

import java.util.Scanner;

public class P11_Tugas3 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "ChocoLate Ice"};
        String[] arrSmenu = {"NasiGoreng", "Miegoreng", "RotiBakar", "KentangGoreng", "TehTarik", "Cappucino", "ChocoLateIce"}; 
        String key;
        boolean ditemukan = false; 
        String NamaPelanggan;
        int JumlahNasiGoreng, JumlahMieGoreng, JumlahRotiBakar, JumlahKentangGoreng, JumlahTehTarik, JumlahCappucino, JumlahChocolateIce, TotalHarga;
        int HargaNasiGoreng = 20000;
        int HargaMiegoreng = 20000;
        int HargaRotiBakar = 15000;
        int HargaKentangGoreng = 15000;
        int HargaTehTarik = 10000;
        int HargaCappucino = 10000;
        int HargaChocolateIce = 15000;
        
        System.out.print("Masukkan menu yang ingin dicari : ");
        key = Akbar21.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu [i].equalsIgnoreCase(key)) {
                System.out.println("Makanan "+key+" tersedia");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Makanan tersedia di menu!");
        } 
        System.out.print("Masukkan nama pelanggan : ");
        NamaPelanggan = Akbar21.nextLine();

        System.out.println("daftar menu :");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("Item : ");
        System.out.print("Jumlah Nasi Goreng : ");
        JumlahNasiGoreng = Akbar21.nextInt();
        System.out.print("Jumlah Mie Goreng : ");
        JumlahMieGoreng = Akbar21.nextInt();
        System.out.print("Jumlah Roti Bakar : ");
        JumlahRotiBakar = Akbar21.nextInt();
        System.out.print("Jumlah Kentang Goreng : ");
        JumlahKentangGoreng = Akbar21.nextInt();
        System.out.print("Jumlah Teh Tarik : ");
        JumlahTehTarik = Akbar21.nextInt();
        System.out.print("Jumlah Cappucino : ");
        JumlahCappucino = Akbar21.nextInt();
        System.out.print("Jumlah ChocolateIce : ");
        JumlahChocolateIce = Akbar21.nextInt();
        
        TotalHarga = (JumlahNasiGoreng * HargaNasiGoreng) + (JumlahMieGoreng * HargaMiegoreng) + (JumlahRotiBakar * HargaRotiBakar) + (JumlahKentangGoreng * HargaKentangGoreng) + (JumlahTehTarik * HargaTehTarik) + (JumlahCappucino * HargaCappucino) + (JumlahChocolateIce * HargaChocolateIce);
        Akbar21.nextLine();
    
        System.out.println("-------- Nota Pembelian --------");
        System.out.println("Nama Pelanggan : "+NamaPelanggan);
        System.out.println("--------------------------------");
        System.out.println("------------- Item -------------");

        if (JumlahNasiGoreng > 0) {
             System.out.println("Nasi goreng : " + JumlahNasiGoreng + " x Rp " + 20000 + " = Rp " + (JumlahNasiGoreng * 20000));
        }
        if (JumlahMieGoreng > 0) {
             System.out.println("Mie goreng : " + JumlahMieGoreng + " x Rp " + 20000 + " = Rp " + (JumlahMieGoreng * 20000));
        }
        if (JumlahRotiBakar > 0) {
             System.out.println("Roti Bakar : " + JumlahRotiBakar + " x Rp " + 15000 + " = Rp " + (JumlahRotiBakar * 15000));
        }
        if (JumlahKentangGoreng > 0) {
             System.out.println("kentang Goreng : " + JumlahKentangGoreng + " x Rp " + 15000 + " = Rp " + (JumlahKentangGoreng * 15000));
        }
        if (JumlahTehTarik > 0) {
             System.out.println("Teh Tarik : " + JumlahTehTarik + " x Rp " + 10000 + " = Rp " + (JumlahTehTarik * 10000));
        }
        if (JumlahCappucino > 0) {
            System.out.println("Cappucino : " + JumlahCappucino + " x Rp " + 10000 + " = Rp " + (JumlahCappucino * 10000));
        }
        if (JumlahChocolateIce > 0) {
            System.out.println("Chocolate Ice : " + JumlahChocolateIce + " x Rp " + 15000 + " = Rp " + (JumlahChocolateIce * 15000));
        }
        System.out.println("--------------------------------");
        System.out.println("Total yang harus dibayar: Rp " + TotalHarga);
        System.out.println("--------------------------------");

    }
}
