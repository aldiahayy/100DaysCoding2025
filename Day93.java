import java.util.Scanner;
public class day93 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan angka desimal: ");
    double angka = sc.nextDouble();
    cihuy(angka);
}
public static double cihuy(double angka){
    System.out.println("Angka asli   : " + angka);
    System.out.println("method ceil  : "+ Math.ceil(angka));
    System.out.println("method floor : "+ Math.floor(angka));
    System.out.println("method round : "+ Math.round(angka)); 
    return angka;
}
}
