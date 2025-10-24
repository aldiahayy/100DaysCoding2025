import java.util.Scanner;
public class day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>> Daftar Nama Hari Kerja/Libur <<<");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jum'at");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.print("Masukkan cek hari (1-7): ");
        int hari = sc.nextInt();
        String pesan = "";
        boolean cek = false;
        switch (hari) {
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
                cek = false;
                break;
            case 7:
                pesan = "Minggu";
                cek = false;
                break;
            default :
                pesan = "salah";
                break;
        }
        if (cek == true) {
            System.out.println("Hari " + pesan + " adalah hari kerja");
        }else if (pesan.equalsIgnoreCase("salah")) {
            System.out.println("Pilihan hari tidak ada");            
        }else{
            System.out.println("Hari " + pesan + " adalah hari libur");
        }
    }
}
