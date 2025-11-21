import java.util.Scanner;
public class day75 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan sebuah kata/kalimat: ");
    String kata = sc.nextLine();
    System.out.println("kata asli    : " + kata);
    System.out.println("panjang kata : " + kata.length());
    System.out.println("kata kapital : " + kata.toUpperCase());
    System.out.println("kata kecil   : " + kata.toLowerCase());
}   
}
