import java.util.Scanner;
public class day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka(N): ");
        int N = sc.nextInt();
        int hasil = 1;
        System.out.print(N + "! = ");
        for (int i = N; i >= 1; i--) {
            hasil *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + hasil);
        System.out.println("hasil dari " + N + "! adalah " + hasil);
    }
}
