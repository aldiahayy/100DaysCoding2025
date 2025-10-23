import java.util.Scanner;
public class day46 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println(">>> Selamat Datang Di Segelas Kurang <<<");
    System.out.print("Silahkan masukkan nama: ");
    String nama = sc.nextLine();
    System.out.println("=== Daftar Pilih Menu ===");
    System.out.println("1. Teh Hangat (Rp 4000)");
    System.out.println("2. Es Teh     (Rp 5000)");
    System.out.println("3. Kopi Hitam (Rp 6000)");
    System.out.println("4. Kopi Susu  (Rp 7000)");
    System.out.println("5. Air Putih  (Rp 3000)");
    System.out.print("Silahkan pilih menu 1-5: ");
    int pilih = sc.nextInt();
    String pesan = "";
    boolean cek = false;
    int harga = 0;
    switch(pilih){
        case 1:
            pesan = "Teh Hangat";
            harga = 4000;
            cek = true;
            break;
        case 2:
            pesan = "Es Teh";
            harga = 5000;
            cek = true;
            break;
        case 3:
            pesan = "Kopi Hitam";
            harga = 6000;
            cek = true;
            break;
        case 4:
            pesan = "Kopi Susu";
            harga = 7000;
            cek = true;
            break;
        case 5:
            pesan = "Air Putih";
            harga = 3000;
            cek = true;
            break;
        default:
            pesan = "Pilihan menu tidak ada";
            cek = false;
            break;
    }
    if (cek == true) {
        System.out.println("Anda memilih menu " + pesan);
        System.out.print("\nSilahkan masukkan jumlah: ");
        int jumlah = sc.nextInt();
        int total = harga * jumlah;
        System.out.println("--- Detail Pesanan ---");
        System.out.printf("Nama pelanggan    : %s %n", nama);
        System.out.printf("Menu yang dipilih : %s %n", pesan);
        System.out.printf("Jumlah pesanan    : %d %n", jumlah);
        System.out.printf("Total harga       : Rp%, d %n", total);
    }else{
        System.out.println(pesan);
    } 
}  
}
