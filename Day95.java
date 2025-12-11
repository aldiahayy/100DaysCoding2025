import java.util.Scanner;
public class day95 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan panjang: ");
    int panjang = sc.nextInt();
    System.out.print("Masukan simbol : ");
    char simbol = sc.next().charAt(0);
    polaSegitiga(panjang,simbol);
    sc.nextLine();
    System.out.print("masukan nama barang: ");
    String nama = sc.nextLine();
    System.out.print("Masukan harga barang: ");
    int harga = sc.nextInt();
    System.out.print("masukan jumlah barang: ");
    int jumlah = sc.nextInt();
    kasir(nama,harga,jumlah);
}
public static void polaSegitiga(int panjang, char simbol){
    for (int i = 1; i <= panjang; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(simbol+" ");
        }
        System.out.println("");
    }
}
public static void kasir(String barang, int harga, int jumlah){
    System.out.println(">>> Cetak Struk <<<");
    System.out.println("Barang : " + barang);
    System.out.println("Qty    : " + jumlah + " x " + harga);
    System.out.println("Total  : Rp " + (harga*jumlah));
}
}
