import java.util.Scanner;
public class day44 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("=== Input Data Mahasiswa ===");
    System.out.print("Masukkan Nama Mahasiswa : ");
    String nama = sc.nextLine();
    System.out.println("\n--- Mata Kuliah 1 ---");
    System.out.print("Masukkan Nama Mata Kuliah : ");
    String mataKuliah1 = sc.nextLine();
    System.out.print("Masukkan Nilai (0-100) : ");
    int nilai1 = sc.nextInt();
    sc.nextLine();
    System.out.println("\n--- Mata Kuliah 2 ---");
    System.out.print("Masukkan Nama Mata Kuliah : ");
    String mataKuliah2 = sc.nextLine();
    System.out.print("Masukkan Nilai (0-100) : ");
    int nilai2 = sc.nextInt();
    
    String predikat1;
    String predikat2;
    if (nilai1 <= 60) {
        predikat1 = "E";
    }else if (nilai1 <= 70) {
        predikat1 = "D";
    }else if (nilai1 <= 80) {
        predikat1 = "C";
    }else if (nilai1 <= 90) {
        predikat1 = "B";
    }else{
        predikat1 = "A";
    }
    
    if (nilai2 <= 60) {
        predikat2 = "E";
    }else if (nilai2 <= 70) {
        predikat2 = "D";
    }else if (nilai2 <= 80) {
        predikat2 = "C";
    }else if (nilai2 <= 90) {
        predikat2 = "B";
    }else{
        predikat2 = "A";
    }
    
    String status;
    int sks;
    if (!predikat1.equalsIgnoreCase("E") && !predikat2.equalsIgnoreCase("E")) {
        status = "Lulus";
        sks = 24;
    }else{
        status = "Tidak Lulus";
        sks = 20;
    }
    double rataRata = (nilai1 + nilai2)/2;
    System.out.println("\n=== HASIL PEMBELAJARAN SEMESTER ===");
    System.out.println("Nama Mahasiwa : " + nama);
    System.out.println("\n--- Rincian Nilai ---");
    System.out.println("Mata Kuliah : " + mataKuliah1 + ", Nilai : " + nilai1 + ", Predikat : " + predikat1);
    System.out.println("Mata Kuliah : " + mataKuliah2 + ", Nilai : " + nilai2 + ", Predikat : " + predikat2);
    System.out.println("\n--- Status Akhir ---");
    System.out.printf("Status Semester      : %s %n", status);
    System.out.printf("Berhak mengambil SKS : %d %n", sks);
    System.out.printf("Nilai rata-rata      : %.2f %n", rataRata);
}
}
