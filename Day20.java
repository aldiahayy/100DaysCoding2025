import java.util.Scanner;
public class day20 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final String PREFIX_ID = "KRY";
    System.out.print("Masukkan tahun masuk: ");
    int tahunMasuk = sc.nextInt();
    System.out.print("Masukkan nomor urut: ");
    int nomorUrut = sc.nextInt();
    
    // cara 1 menggunakan penggabungan otomatis
    final String ID_KARYAWAN_1 = PREFIX_ID + "-" + tahunMasuk + "-" + nomorUrut;
    System.out.println("ID Karyawan anda adalah " + ID_KARYAWAN_1);
    
    // cara 2 menggunakan valueOf()
    final String ID_KARYAWAN_2 = PREFIX_ID + "-" + String.valueOf(tahunMasuk) + "-" + String.valueOf(nomorUrut);
    System.out.println("ID Karyawan anda adalah " + ID_KARYAWAN_2);
    
    // cara 3 menggunakan toString()
    final String ID_KARYAWAN_3 = PREFIX_ID + "-" + Integer.toString(tahunMasuk, 16) + "-" + Integer.toString(nomorUrut, 8);
    System.out.println("ID Karyawan anda adalah " + ID_KARYAWAN_3);
}
}
