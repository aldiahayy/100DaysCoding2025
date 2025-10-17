import java.util.Scanner;
public class day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan operasi (*|/|+|-) : ");
        char operasi = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua : ");
        double angka2 = sc.nextDouble();
        double kalkulator = 0;
        String pesan = "";
        boolean cek = false;

        if (operasi == '*') {
            kalkulator = angka1 * angka2;
            pesan = " x ";
            cek = true;
        } else if (operasi == '/') {
            if (angka2 != 0) {
            kalkulator = angka1 / angka2;
            pesan = " / ";
            cek = true;
            } else {
            pesan = "salah";
            }
        } else if (operasi == '+') {
            kalkulator = angka1 + angka2;
            pesan = " + ";
            cek = true;
        } else if (operasi == '-') {
            kalkulator = angka1 - angka2;
            pesan = " - ";
            cek = true;
        } else {
            cek = false;
        }
        if (cek == true) {
            System.out.println("Jadi hasil dari " + angka1 + pesan + angka2 + " adalah " + kalkulator);
        }else if (pesan.equalsIgnoreCase("salah")) {
            System.out.println("tidak terdefinisi");
        }else{
            System.out.println("operasi yang dimasukkan tidak ada");    

        }
    }
}
