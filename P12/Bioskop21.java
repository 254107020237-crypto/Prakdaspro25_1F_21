package P12;

public class Bioskop21 {
    public static void main(String[] args) {
        
        String [] [] Penonton = new String[4][2];

        Penonton [0] [0] = "Amin";
        Penonton [0] [1] = "Bena";
        Penonton [1] [0] = "candra";
        Penonton [1] [1] = "Dela";
        Penonton [2] [0] = "Eka";
        Penonton [2] [1] = "Farhan";
        Penonton [3] [0] = "Gisel";
        Penonton [3] [1] = "Hana";

        System.out.printf("%s \t %s \n", Penonton [0] [0], Penonton [0] [1]);
        System.out.printf("%s \t %s \n", Penonton [1] [0], Penonton [1] [1]);
        System.out.printf("%s \t %s \n", Penonton [2] [0], Penonton [2] [1]);
        System.out.printf("%s \t %s \n", Penonton [3] [0], Penonton [3] [1]);

    }
}
