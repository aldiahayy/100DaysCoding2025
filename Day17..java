import java.util.Scanner;
public class day17 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Masukkan jumlah permen: ");
    int permen = sc.nextInt();
    System.out.print("Masukkan jumlah murid: ");
    int murid = sc.nextInt();
    System.out.println("Jumlah permen yang diterima setiap murid adalah " + (permen / murid));
    System.out.println("Sisa permen yang tidak terbagi adalah " + (permen % murid));
}
}
