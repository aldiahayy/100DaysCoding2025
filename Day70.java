import java.util.Scanner;
public class day70 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan panjang: ");
    int P = sc.nextInt();
    System.out.print("Masukan lebar: ");
    int L = sc.nextInt();
    for (int i = 1; i <= L; i++) {
        for (int j = 1; j <= P; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
