package latihanEvaluasi3;
import java.util.Scanner;
public class bagian1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" * "+angka+" = " + i*angka);
        }
    }
}
package latihanEvaluasi3;
import java.util.Scanner;
public class bagian2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan batas: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Iccang");
        }
    }
}
package latihanEvaluasi3;
import java.util.Scanner;
public class bagian3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kata: ");
        String kata = sc.nextLine();
        System.out.print("Masukan batas: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(kata);
        }
    }
}
