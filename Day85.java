import java.util.Scanner;
public class day85 {
public static void main(String[] args) {
    String[] namaSiswa = {"Ai", "Aika", "Kayla", "Yanto", "Zerlina"};
    String namaPalingAkhir = namaSiswa[0];
    System.out.println(">>> Daftar Nama Siswa <<<");
    for (int i = 0; i < namaSiswa.length; i++) {
        System.out.println((i+1)+". "+namaSiswa[i]);
        if (namaSiswa[i].compareTo(namaPalingAkhir) > 0) {
            namaPalingAkhir = namaSiswa[i];
        }
    }
    System.out.println("-------------------------");
    System.out.println("Siswa Absen Terakhir(Max): " + namaPalingAkhir);
    Scanner sc = new Scanner(System.in);
    System.out.print("\nMasukan banyak nilai: ");
    int nilai[] = new int[sc.nextInt()];
    for (int i = 0; i < nilai.length; i++) {
        System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+": ");
        nilai[i] = sc.nextInt();
    }
    int max = nilai[0];
    System.out.println("\n>>> Daftar Nilai <<<");
    for (int i = 0; i < nilai.length; i++) {
        System.out.println("Nilai mahasiswa ke-"+(i+1)+": "+nilai[i]);
        if (nilai[i]>max) {
            max=nilai[i];
        }
    }
    System.out.println("Nilai Tertinggi: " + max);
}
}
