import java.util.Scanner;
public class day48 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka pertama: ");
    double angka1 = sc.nextDouble();
    System.out.print("Masukkan operator (*|/|+|-|%): ");
    char operator = sc.next().charAt(0);
    System.out.print("Masukkan angka kedua: ");
    double angka2 = sc.nextDouble();
    double hasil = 0;
    String pesan = "";
    boolean cek;
    switch (operator){
        case '*':
            hasil = angka1 * angka2;
            pesan = " x ";
            cek = true;
            break;
        case '/':
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                pesan = " / ";
            }else{
                System.out.println("tidak terdefinisi");
            }
            cek = true;
            break;
        case '+':
            hasil = angka1 + angka2;
            pesan = " + ";
            cek = true;
            break;
        case '-':
            hasil = angka1 - angka2;
            pesan = " - ";
            cek = true;
            break;
        case '%':
            if (angka2 != 0) {
                hasil = angka1 % angka2;
                pesan = " % ";
            }else{
                System.out.println("tidak terdefinisi");
            }
            cek = true;
            break;
        default:
            cek = false;
    }
    if (cek == true) {
        if (angka1 % 1 != 0 || angka2 % 2 != 0){
            System.out.println("hasil dari " + angka1 + pesan + angka2 + " adalah " + hasil);
        }else{
            if (hasil % 1 == 0) {
                System.out.println("hasil dari " + (int)angka1 + pesan + (int)angka2 + " adalah " + (int)hasil);
            }else{
                System.out.println("hasil dari " + angka1 + pesan + angka2 + " adalah " + hasil);
            }
    } 
    }else{
        System.out.println("operator yang anda masukkan tidak ada");
    }
}  
}
