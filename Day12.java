import java.util.Scanner;
public class day12 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("--- Program Input Biodata ---");
    //Nama menggunakan String
    System.out.print("Masukkan Nama Lengkap Anda:\n> ");
    String nama = sc.nextLine();
    //NIM menggunakan String
    System.out.print("Masukkan NIM Anda:\n> ");
    String nim = sc.nextLine();
    //Umur menggunakan byte
    System.out.print("Masukkan Umur Anda:\n> ");
    byte umur = sc.nextByte();
    //Kelas menggunakan char
    System.out.print("Masukkan Kelas (A/B/C):\n> ");
    char kelas = sc.next().charAt(0);
    //IPK menggunakan float
    System.out.print("Masukkan IPK Anda:\n> ");
    float ipk = sc.nextFloat();
    
    System.out.println("==============================\n      BIODATA MAHASISWA\n==============================");
    System.out.printf("%-7s : %-5s %n", "Nama", nama);
    System.out.printf("%-7s : %-5s %n", "NIM", nim);
    System.out.printf("%-7s : %-3dtahun %n", "Umur", umur);
    System.out.printf("%-7s : %-5c %n", "Kelas", kelas);
    System.out.printf("%-7s : %-5.2f %n", "IPK", ipk);
}    
}
