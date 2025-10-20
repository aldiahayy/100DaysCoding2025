import java.util.Scanner;
public class day43 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Masukkan angka : ");
    int angka = sc.nextInt();
    String pesan;
    
    if (angka % 3 == 0 && angka % 5 == 0) {
        pesan = " adalah kelipatan 3 dan 5";
    }else if (angka % 5 == 0) {
        pesan = " adalah kelipatan 5";
    }else if (angka % 3 == 0) {
        pesan = " adalah kelipatan 3";
    }else{
        pesan = " bukan kelipatan 3 atau 5";
    }
        System.out.println(angka + pesan);
    }
}
