import java.util.Scanner;
public class day27 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // soal 1
    System.out.print("Masukkan panjang rumah : ");
    int panjang = sc.nextInt();
    System.out.print("Masukkan lebar rumah : ");
    int lebar = sc.nextInt();
    int keramik = 2*2;
    int luas = panjang * lebar;
    System.out.println("Jadi keramik yang dibutuhkan untuk luas rumah " + luas + " meter adalah " + (luas/keramik) + " keramik");
    System.out.println("");
    
    // soal 2
    System.out.print("Masukkan angka pertama : ");
    int angka1 = sc.nextInt();
    System.out.print("Masukkan angka kedua : ");
    int angka2 = sc.nextInt();
    
    angka1 = angka1 + angka2;
    angka2 = angka1 - angka2;
    angka1 = angka1 - angka2;
    
    System.out.println("angka pertama setelah ditukar : " + angka1);
    System.out.println("angka kedua setelah ditukar : " + angka2);
}
}
