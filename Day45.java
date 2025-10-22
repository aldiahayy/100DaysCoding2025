import java.util.Scanner;
public class day45 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println(">>> Nama Nama Hari <<<");
    System.out.println("1. Senin");
    System.out.println("2. Selasa");
    System.out.println("3. Rabu");
    System.out.println("4. Kamis");
    System.out.println("5. Jum'at");
    System.out.println("6. Sabtu");
    System.out.println("7. Minggu");
    System.out.print("Masukkan pilihan hari (1-7): ");
    int hari = sc.nextInt();
    String pesan;
    boolean cek;
    switch(hari){
        case 1:
            pesan = "Senin";
            cek = true;
            break;
        case 2:
            pesan = "Selasa";
            cek = true;
            break;
        case 3:
            pesan = "Rabu";
            cek = true;
            break;
        case 4:
            pesan = "Kamis";
            cek = true;
            break;
        case 5:
            pesan = "Jum'at";
            cek = true;
            break;
        case 6:
            pesan = "Sabtu";
            cek = true;
            break;
        case 7:
            pesan = "Minggu";
            cek = true;
            break;
        default:
            pesan = "Jumlah hari hanya 7";
            cek = false;
            break;
    }
        if (cek == true) {
            System.out.println("Sekarang adalah hari " + pesan);
       }else{
            System.out.println(pesan);
        }
    }
}
