import java.util.Scanner;
public class day77 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan Hashtag: ");
    String hashtag = sc.nextLine();
    
    String akhir = hashtag.trim();
    String akhir1 = akhir.replace("-", " ");
    String akhir2 = akhir1.substring(1);
    String akhir3 = akhir2.toUpperCase();
    
    System.out.println("--- Hasil Data Cleaning ---");
    System.out.println("Tag Asli      : " + hashtag);
    System.out.println("Tag replace   : " + akhir1);
    System.out.println("Tag substring : " + akhir2);
    System.out.println("Tag Bersih    : " + akhir3);
}
}
