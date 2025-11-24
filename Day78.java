import java.util.Scanner;
public class day78 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(">>> DAFTAR AKUN BARU <<<");
    System.out.print("Masukan Username: ");
    String username = sc.nextLine();
    username = username.trim();
    if (username.isEmpty()) {
        System.out.print("ERROR: Username tidak boleh kosong!");
    }else if (username.length() > 12) {
        System.out.print("ERROR: Username terlalu panjang (maks 12)!");
    }else{
        System.out.print("Masukan Password: ");
        String password = sc.nextLine();
       
        sc.nextLine();
        if (password.length() < 8) {
            System.out.print("ERROR: Password minimal 8 karakter!");
        }else if(password.toLowerCase().contains("admin")) {
            System.out.print("ERROR: Password tidak boleh mengandung kata 'admin'!");
        }else{
            char kapital = password.charAt(0);
            if (!(kapital >= 'A' && kapital <= 'Z')) {
              System.out.print("ERROR: Huruf pertama password harus kapital!");
            }else{
              System.out.print("Ulangi Password: ");
              String ulang = sc.nextLine();
              
                if (!ulang.equals(password)) {
                   System.out.print("ERROR: Password tidak cocok!"); 
                }else{
                   System.out.println("\nSUKSES: Pendaftaran Berhasil!");
                   System.out.println("Username '" + username.toLowerCase() + "' telah aktif.");
                }
            }
        }   
    }
    }
}
