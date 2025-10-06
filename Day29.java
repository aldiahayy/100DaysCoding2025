import java.util.Scanner;
public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>> SELAMAT DATANG DI WAHANA KEMATIAN <<<");
        System.out.println("  === Silahkan Masukkan Persyaratan ===");
        System.out.print("Masukkan tinggi badan : ");
        int tb = sc.nextInt();
        System.out.print("Masukkan berat badan : ");
        int bb = sc.nextInt();
        
        System.out.printf("%-15s : %d cm %n", "Tinggi Badan", tb);
        System.out.printf("%-15s : %d kg %n", "Berat Badan", bb);
              
        boolean deteksiTb = tb > 150;
        boolean deteksiBb = bb < 80;
        System.out.println("Apakah kamu diizinkan naik? " + (deteksiTb && deteksiBb));
        }
    }
