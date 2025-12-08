import java.util.Scanner;
public class day92 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan panjang: ");
    int p = sc.nextInt();
    System.out.print("Masukan lebar: ");
    int l = sc.nextInt();
    System.out.println("luas : "+luas(p, l));
}
public static int luas(int p, int l){
    return p * l;
}   
}
