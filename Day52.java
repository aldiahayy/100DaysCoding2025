import java.util.Scanner;
public class day52 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int angkaRahasia = 7;
    int angka = 0;
    
    while(angka != angkaRahasia){
        System.out.print("Masukkan angka rahasia (1-10): ");
        angka = sc.nextInt();       
    }
    System.out.println("Selamat Tebakan Kamu Benar!!!");
}
}
