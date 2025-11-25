import java.util.Scanner;
public class day79 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String username;
    String password;
    String username2;
    String password2;
    System.out.println(">>> SILAHKAN DAFTARKAN AKUN ANDA <<<");
    while(true){
    System.out.print("Masukan username: ");
    username = sc.nextLine();
    System.out.print("Masukan password: ");
    password = sc.nextLine();
    
    if (username.isEmpty() || password.isEmpty()) {
        System.out.println("Username atau password tidak boleh kosong");
        System.out.println("Silahkan masukan kembali");
    }else{
        System.out.println("Silahkan validasi akun anda");
        break;
    }    
    }
        while(true){
            System.out.print("Masukan ulang username: ");
            username2 = sc.nextLine();
            System.out.print("Masukan ulang password: ");
            password2 = sc.nextLine();
            if (!username2.equals(username) || !password2.equals(password)){
                System.out.println("username atau password salah silahkan masukan kembali");
            }else{
                System.out.println("Login berhasil");
                break;
            }
        }
    }
}
