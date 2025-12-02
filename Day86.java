import java.util.Scanner;
public class day86 {
public static void main(String[] args) {
    String[] namaSiswa = {"Ai", "Aika", "Kayla", "Yanto", "Zerlina"};
    String namaPalingAwal = namaSiswa[0];
    System.out.println(">>> Daftar Nama Siswa <<<");
    for (int i = 0; i < namaSiswa.length; i++) {
        System.out.println((i+1)+". "+namaSiswa[i]);
        if (namaSiswa[i].compareTo(namaPalingAwal) < 0) {
            namaPalingAwal = namaSiswa[i];
        }
    }
    System.out.println("-------------------------");
    System.out.println("Siswa Absen Pertama(Min): " + namaPalingAwal);
    Scanner sc = new Scanner(System.in);
    System.out.print("\nMasukan banyak nilai: ");
    int nilai[] = new int[sc.nextInt()];
    for (int i = 0; i < nilai.length; i++) {
        System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+": ");
        nilai[i] = sc.nextInt();
    }
    int min = nilai[0];
    System.out.println("\n>>> Daftar Nilai <<<");
    for (int i = 0; i < nilai.length; i++) {
        System.out.println("Nilai Mahasiwa Ke-"+(i+1)+": " + nilai[i]);
        if (nilai[i] < min) {
            min = nilai[i];
        }
    }
    System.out.println("Nilai terendah: " + min);
}
}
