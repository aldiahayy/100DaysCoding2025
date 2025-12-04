import java.util.Scanner;
public class day88 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan jumlah nilai: ");
    int nilai[] = new int[sc.nextInt()];
    for (int i = 0; i < nilai.length; i++) {
        System.out.print("Masukan nilai ke-"+(i+1)+": ");
        nilai[i] = sc.nextInt();
    }
    System.out.println("\n>>> Daftar Nilai <<<");
    for (int i : nilai) {
        System.out.print(i+" ");
    }
}
}
