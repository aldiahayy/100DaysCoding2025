import java.util.Scanner;
public class day64 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan angka: ");
    int angka = sc.nextInt();
    System.out.print("Masukan pangkat: ");
    int pangkat = sc.nextInt();
    int hasil = 1;
    for (int i = 1; i <= pangkat; i++) {
        hasil = hasil * angka;
    }
    System.out.println("Jadi hasil dari " + angka +"^" + pangkat + " adalah " + hasil);
}
}
