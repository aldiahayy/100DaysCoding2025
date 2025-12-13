import java.util.Scanner;
public class day97 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan panjang sisi: ");
    int sisi = sc.nextInt();
    System.out.println(">>> Program Hitung Luas Persegi <<<");
    System.out.println("Luas Persegi dengan sisi " + sisi + " adalah " + hitungLuasPersegi(sisi));
}
public static int hitungLuasPersegi(int sisi){
    return sisi * sisi;
}
}
