import java.util.Scanner;
public class day51 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan batas perkalian: ");
    int batas = sc.nextInt();
    System.out.print("Masukkan angka yang ingin dikalikan: ");
    int angka = sc.nextInt();
    
    for (int i = 1; i <= batas; i++) {
        System.out.println(i + " x " + angka + " = " +(angka * i));       
    }
}   
}
