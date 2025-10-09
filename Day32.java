import java.util.Scanner;
public class day32 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Apakah kamu seorang anggota premium? (true/false) : ");
    boolean anggotaPremium = sc.nextBoolean();
    System.out.print("Apakah kamu memiliki undangan khusus? (true/false) : ");
    boolean undanganKhusus = sc.nextBoolean();
    
    boolean dapatAksesVip = anggotaPremium || undanganKhusus;
    System.out.println("Apakah kamu mendapatkan Akses VIP? " + dapatAksesVip);
}    
}
