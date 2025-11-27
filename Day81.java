public class day81 {
public static void main(String[] args) {
    int nilai[] = {85, 90, 78, 88, 95};
    System.out.println(">>> Data Nilai Awal <<<");
    System.out.println("Nilai Siswa Pertama: " + nilai[0]);
    System.out.println("Nilai Siswa Kedua  : " + nilai[1]);
    System.out.println("\n>>> Update Data <<<");
    System.out.println("Nilai Lama Siswa Ke-3 : " + nilai[2]);
    nilai[2] = 100;
    System.out.println("Nilai Baru Siswa Ke-3 : " + nilai[2]);
    System.out.println("\n>>> Operasi Aritmatika <<<");
    System.out.println("Rata Rata Nilai Siswa 1 & 2 : " + ((nilai[0] + nilai[1])/2.0));
}
}
