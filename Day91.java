import java.util.Scanner;
public class day91 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan Nama Pertama: ");
    String nama = sc.nextLine();
    System.out.print("Masukan Jumlah Jam Kerja Pertama: ");
    int jumlahJamKerja = sc.nextInt();
    sc.nextLine();
    System.out.print("Masukan Nama Kedua: ");
    String nama1 = sc.nextLine();
    System.out.print("Masukan Jumlah Jam Kerja Kedua: ");
    int jumlahJamKerja1 = sc.nextInt();
    System.out.println(hitungGaji(nama, jumlahJamKerja));
    System.out.println(hitungGaji(nama1, jumlahJamKerja1));
}
public static String hitungGaji(String nama, int jumlahJamKerja){
    return "Karyawan "+nama+" bekerja " +jumlahJamKerja+" jam, mendapatkan gaji Rp "+ (jumlahJamKerja * 50000);
}  
}
