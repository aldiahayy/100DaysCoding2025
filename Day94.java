import java.util.Scanner;
public class day94 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan nama: ");
    String nama = sc.nextLine();
    garisPembatas();
    kotakNama(nama);
    garisPembatas();
    System.out.println("Menu Pilihan:");
    System.out.println("1. New Game");
    System.out.println("2. Load Game");
    System.out.println("3. Exit");
    garisPembatas();
}
public static void garisPembatas(){
    System.out.println("================================");
}
public static void kotakNama(String nama){
    System.out.println("| Welcome, Player " + nama + " |");
}
}
