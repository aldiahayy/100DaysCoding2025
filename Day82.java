import java.util.Scanner;
public class day82{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Berapa tamu yang ingin dicatat? ");
    String bukuTamu [] = new String[sc.nextInt()];
    sc.nextLine();
    for (int i = 0; i < bukuTamu.length; i++) {
        System.out.print("Masukan nama tamu ke-"+(i+1)+": ");
        bukuTamu[i] = sc.nextLine();
    }
    System.out.println("\n>>> Daftar Tamu Hadir <<<");
    for (int i = 0; i < bukuTamu.length; i++) {
        System.out.println((i+1)+". " + bukuTamu[i]);
    }
}
}
