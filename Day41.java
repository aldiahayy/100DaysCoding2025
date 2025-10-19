package evaluasiDua;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Program Hitung Diskon ---");
        System.out.print("Masukkan jumlah barang : ");
        int barang = sc.nextInt();
        System.out.print("Masukkan harga per barang : ");
        double harga = sc.nextDouble();
        System.out.print("Apakah Anda member? (ketik 'true' atau 'false') : ");
        String status = sc.next();

        double beli = barang * harga;
        boolean status2 = Boolean.parseBoolean(status);
        double totalAkhir = beli;
        double diskon = 0;
        boolean deteksi = beli >= 250000 && status2;
        System.out.println("\n--- Ringkasan Pembelian ---");
        System.out.printf("%-17s : Rp %.2f %n", "Total Pembelian", beli);
  
        if (deteksi) {
            diskon = beli * 0.10;
            totalAkhir -= diskon;
            System.out.printf("%-17s : %b %n", "Berhak Diskon 10%", deteksi);
            System.out.printf("%-17s : Rp %.2f %n", "Jumlah Diskon", diskon);
        } else {
            System.out.printf("%-17s : %b %n", "Berhak Diskon 10%", deteksi);
            System.out.printf("%-17s : Rp %.2f %n", "Jumlah Diskon", diskon);
        }
            System.out.printf("%-17s : Rp %.2f %n", "Total Bayar", totalAkhir);
    }
}

package evaluasiDua;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jam mulai pengerjaan : ");
        int s = sc.nextInt();
        System.out.print("Masukkan lama pengerjaan tugas : ");
        int l = sc.nextInt();
        
        int waktu = (s + l) % 24;
        if (waktu < 9) {
            System.out.println((9 - waktu) + " jam");
        } else {
            System.out.println("0 jam");
        }
    }
}

