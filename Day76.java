import java.util.Scanner;
public class day76 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.print("Masukan username: ");
        String username = sc.nextLine();
        if (username.equalsIgnoreCase("EXIT")) {
            System.out.println("Program berhenti");
            break;
        }
        System.out.print("Masukan komentar: ");
        String komentar = sc.nextLine();
        
        if (username.isEmpty() || komentar.isEmpty()) {
            System.out.println("Data tidak boleh kosong!");
            continue;
        }
        if (username.equals("joker")) {
            System.out.println("User ini telah dibanned");
            continue;   
        }
        if (komentar.toLowerCase().contains("kasar") ||
            komentar.toLowerCase().contains("bodoh") ||
            komentar.toLowerCase().contains("promo")) {
            System.out.println("Komentar mengandung kata terlarang!");
        }else{
            System.out.println("Komentar berhasil dipublikasikan");
        }
    }
}
}
