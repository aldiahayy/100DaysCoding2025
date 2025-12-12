import java.util.Scanner;
public class day96 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
    System.out.print("Masukan angka pertama : ");
    int a = sc.nextInt();
    System.out.print("Masukan angka kedua   : ");
    int b = sc.nextInt();
    System.out.println(">>> Hasil Operasi <<<");
    System.out.println("Penjumlahan : " + penjumlahan(a,b));
    System.out.println("Pengurangan : " + pengurangan(a,b));
    System.out.println("Perkalian   : " + perkalian(a,b));
    System.out.println("Pembagian   : " + pembagian(a,b));
}
public static int penjumlahan(int a, int b){
    return a + b;
}
public static int pengurangan(int a, int b){
    return a - b;
}
public static int perkalian(int a, int b){
    return a * b;
}
public static double pembagian(int a, int b){
    return (double)a / b;
}
}
