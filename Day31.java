import java.util.Scanner;
public class day31 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Masukkan nilai tes logika : ");
    int nilai = sc.nextInt();
    System.out.print("Masukkan pengalamam coding : ");
    int pengalaman = sc.nextInt();
    
    boolean diterima = nilai >= 80 && pengalaman > 2;
    System.out.println("Apakah kamu diterima sebagai member klub Elite Coder? " + diterima); 
}   
}
