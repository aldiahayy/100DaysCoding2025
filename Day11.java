import java.util.Scanner;
public class day11 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("---SELAMAT DATANG DI PENDAFTARAN CALON MANTU IDAMAN---");
    //String
    System.out.print("Masukkan nama : ");
    String nama = sc.nextLine();
    //byte
    System.out.print("Masukkan umur : ");
    byte umur = sc.nextByte();
    //short 
    System.out.print("Masukkan bulan lahir : ");
    short bulanLahir= sc.nextShort();
    //int
    System.out.print("Masukkan tahun lahir : ");
    int tahunLahir = sc.nextInt();
    //long
    System.out.print("Masukkan gaji : ");
    long gaji = sc.nextLong();
    //float
    System.out.print("Masukkan berat badan (float) : ");
    float beratBadan = sc.nextFloat();
    //double
    System.out.print("Masukkan tinggi badan (double) : ");
    double tinggiBadan = sc.nextDouble();
    //boolean 
    System.out.print("Apakah kamu siap menikah? (true/false) : ");
    boolean siap = sc.nextBoolean();
    sc.nextLine(); // memberikan Scanner kosong
    //char
    System.out.print("Masukkan kode pendaftaran (minimal 3) : ");
    String in = sc.nextLine();
    char kode = in.charAt(2);
    
    System.out.println("\n----Data Kamu Berhasil Di Input----");
    System.out.printf("%-17s : %-10s %n", "NAMA",nama);
    System.out.printf("%-17s : %-10d %n", "UMUR",umur);
    System.out.printf("%-17s : %-10d %n", "BULAN LAHIR",bulanLahir);
    System.out.printf("%-17s : %-10d %n", "TAHUN LAHIR ",tahunLahir);
    System.out.printf("%-17s : %-10d %n", "GAJI",gaji);
    System.out.printf("%-17s : %-10.2f %n", "BERAT BADAN",beratBadan);
    System.out.printf("%-17s : %-10.2f %n", "TINGGI BADAN",tinggiBadan);
    System.out.printf("%-17s : %-10b %n", "SIAP",siap);
    System.out.printf("%-17s : %-10c %n", "KODE",kode);
    System.out.println("Selamat " + nama + " Data Kamu Sudah Terkirim");
}
}
