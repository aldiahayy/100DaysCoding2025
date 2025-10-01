import java.util.Scanner;
public class day24 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("<<<PROGRAM MENGHITUNG LUAS LINGKARAN>>>");
    
    System.out.print("Masukkan jari-jari: ");
    int r = sc.nextInt();
    final double PHI = 3.14;
    
    double luas = PHI * (r * r);
    System.out.println("Jadi luas lingkaran dari jari-jari " + r + " cm adalah " + luas + " cm");
}
}
