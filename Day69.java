package pertemuan5;
import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int pilihan;
        int uang =0;
        int uangTambah = 0;
        int totalBelanja=0;
        do{
        System.out.println("Selamat Datang Di Warung Sederhana");
        System.out.println("Menu Makanan: ");
        System.out.println("1. Nasi Goreng (Rp 15.000)");
        System.out.println("2. Mie Ayam (Rp 12.000)");
        System.out.println("3. Bakso (Rp 10.000)");
        System.out.println("4. Es Teh Manis (Rp 5.000)");
        System.out.println("0. Selesai & Bayar");
        System.out.print("Total Belanja Saat Ini: Rp "+ totalBelanja + " Masukkan pilihan menu (0-4):");
        pilihan = sc.nextInt();
        
        switch (pilihan){
            case 1:
                System.out.println("Nasi Goreng berhasil ditambahkan");
                totalBelanja += 15000;
                break;
            case 2:
                System.out.println("Mie Ayam berhasil ditambahkan");
                totalBelanja += 12000;
                break;
            case 3:
                System.out.println("Bakso berhasil ditambahkan");
                totalBelanja += 10000;
                break;
            case 4:
                System.out.println("Es Teh Manis berhasil ditambahkan");
                totalBelanja += 5000;
                break;
            case 0:
                System.out.println("Proses pemesanan selesai. Menghitung total, TOTAL YANG HARUS DIBAYAR: Rp " + totalBelanja);
                System.out.print("Masukan Uang Anda: ");
                uang = sc.nextInt();
                break;
            default:
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
                break;
        }       
        }while(pilihan != 0);
        while (uang < totalBelanja){
            System.out.println("Error: \"Maaf, uang Anda kurang Rp " + (totalBelanja - uang));
            System.out.print("Silakan masukkan jumlah uang yang cukup: Rp ");
            uang = sc.nextInt();  
        }
        if (uang >= totalBelanja) {     
                int kembalian = uang - totalBelanja;
                System.out.println("--- Struk Pembayaran ---");
                System.out.println("Total belanja : Rp "+totalBelanja);
                System.out.println("Uang Bayar    : Rp " + uang);
                System.out.println("Kembalian     : Rp " + kembalian);
                System.out.println("Terima Kasih Telah Berbelanja!");
            }
    }
}
