import java.util.Scanner;
public class day38 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka : ");
    int angka = sc.nextInt();
    if (angka > 0) {
        System.out.println(angka + " adalah angka positif");
    }else if (angka < 0) {
        System.out.println(angka + " adalah angka negatif");
    }else{
        System.out.println("ini adalah angka nol");
    }
}   
}
