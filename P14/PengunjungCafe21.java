package P14;

public class PengunjungCafe21 {
    public static void main(String[] args) {
        DaftarPengunjung("Ali","Budi", "Citra");
        DaftarPengunjung("Andi");
        DaftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
    static void DaftarPengunjung(String...NamaPengunjung) {
          System.out.println("Daftar Nama Pengunjung : ");
          for (int i = 0; i < NamaPengunjung.length; i++) {
            System.out.println(" - " + NamaPengunjung[i]);            
          }  
    }
}
