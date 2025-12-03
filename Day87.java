import java.util.Scanner;
public class day87 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String []buku = {"Harry Potter", "Lord of the Rings", "Alchemist", "Sherlock Holmes", "Hobbit"};
    System.out.print("Masukan judul buku yang dicari: ");
    String cari = sc.nextLine();
    int indeks = -1;
    boolean cek = false;
    for (int i = 0; i < buku.length; i++) {
        if (buku[i].equalsIgnoreCase(cari)) {
            indeks = i;
            cek = true;
            break;
        }
    }
    if (cek) {
         System.out.println("Buku ditemukan di indeks ke-"+(indeks)+" tumpukan ke "+(indeks+1));
    }else{
        System.out.println("Maaf, buku tidak ada di tumpukan.");
    }
}   
}
