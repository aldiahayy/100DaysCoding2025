import java.util.Scanner;
public class day34 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Masukkan peringkat rank : ");
    int peringkat = sc.nextInt();
    System.out.print("Masukkan jumlah main : ");
    int jumlahMain = sc.nextInt();
    System.out.print("Masukkan rasio K/D : ");
    double rasioKD = sc.nextDouble();
    System.out.print("Apakah kamu adalah pemain baru? (true/false) : ");
    boolean isPemainBaru = sc.nextBoolean();
    System.out.print("Apakah kamu memiliki Golden Tiket? (true/false) : ");
    boolean punyaTiketEmas = sc.nextBoolean();
    
    boolean syaratUtama = (peringkat >= 1000) && (jumlahMain % 10 != 0);
    boolean syaratBonus = (rasioKD > 1.5 && isPemainBaru == false) || punyaTiketEmas ;
    boolean lolosKualifikasi = syaratUtama && syaratBonus;
    
    System.out.println("Apakah kamu lolos kualifikasi? " + lolosKualifikasi);
}  
}
