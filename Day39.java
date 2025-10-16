import java.util.Scanner;
public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>> Menu Makanan <<<");
        System.out.println("1. Bakso (Rp 13.000)");
        System.out.println("2. Mie Ayam (Rp 16.000)");
        System.out.println("3. Nasi Goreng (Rp 15.000)");
        System.out.print("Masukkan nomor pilihan Menu : ");
        int pilihan = sc.nextInt();
        String pesan;

        if (pilihan == 1) {
            pesan = "Anda memesan Bakso dengan harga Rp 13.000";
        } else if (pilihan == 2) {
            pesan = "Anda memesan Mie Ayam dengan harga Rp 16.000";
        } else if (pilihan == 3) {
            pesan = "Anda memesan Nasi Goreng dengan harga Rp 15.000";
        } else {
            pesan = "pilihan Menu tidak valid";
        }
        System.out.println(pesan);
    }
}
