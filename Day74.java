import java.util.Scanner;
public class day74 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pilihan;
    int total = 0;
    do{ 
        System.out.println("\n--- DAFTAR MENU ---");
        System.out.println("1. Nasi kuning Rp 10.000");
        System.out.println("2. Es Teh Panas Rp 5.000");
        System.out.println("3. Kopi Susu Rp 5.000");
        System.out.println("4. Bakso Kuah Rp 10.000");
        System.out.println("5. Selesaikan Pembayaran");
        System.out.print("Pilihan menu yang akan anda pesan: ");
        pilihan = sc.nextInt();
        
        switch (pilihan){
            case 1:
                System.out.println("Nasi kuning berhasil dipesan harga Rp 10.000");
                total += 10000;
                break;
            case 2:
                System.out.println("Es Teh Panas berhasil dipesan harga Rp 5.000");
                total += 5000;
                break;
            case 3:
                System.out.println("Kopi Susu berhasil dipesan harga Rp 5.000");
                total += 5000;
                break;
            case 4:
                System.out.println("Bakso Kuah berhasil dipesan harga Rp 10.000");
                total += 10000;
                break;
            case 5:
                if (total == 0) {
                    System.out.println("tidak jadi belanja");
                }else{
                System.out.println("Anda memilih menu pembayaran");
                System.out.println("Total yang anda harus bayar adalah Rp " + total);
                }
                break;
            default:
                System.out.println("Pilihan menu tidak ada");
                break;
        }
    }while(pilihan != 5);
}
}
