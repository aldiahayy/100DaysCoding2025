import java.util.Scanner;
public class day23 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println(">>>PROGRAM MENGHITUNG LUAS PERSEGI PANJANG<<<");
    System.out.print("Masukkan panjang: ");
    int panjang = sc.nextInt();
    System.out.print("Masukkan lebar: ");
    int lebar = sc.nextInt();
    
    int luas = panjang * lebar;
    System.out.println("Jadi luas persegi panjang dari panjang " + panjang + " cm dan lebar " + lebar + " cm adalah " + luas + " cm");
}
}
