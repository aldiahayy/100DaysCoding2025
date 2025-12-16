import java.util.Scanner;
public class day100 {
    static int[] arrayBaru;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan panjang array: ");
    int n = sc.nextInt();
    int [] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    retas(arr);
    System.out.println(susunKode(n));
}
public static int retas(int [] arr){
    int n = arr.length;
    arrayBaru = new int[n];
    for (int i = 0; i < arrayBaru.length; i++) {
        arrayBaru[i] = -1;
    }
    int b;
    for (int i = 0; i < arrayBaru.length; i++) {
        b = arr[i] % n;
        while(arrayBaru[b] != -1){
            b = (b + 1) % n;
        }
        arrayBaru[b] = arr[i];
    }
    return n;
}
static String susunKode(int p){
    int panjang = p*(p+1); 
    String sandi = "";
    int a = 0;
    while(sandi.length() < panjang){
        sandi+=arrayBaru[a % p];
        a++;
    }
    return sandi;
}
}

import java.util.Scanner;
public class day100 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan kata: ");
    String kata = sc.nextLine();
    char konver;
    boolean i = false;
    boolean s = false;
    boolean c = false;
    for (int a = 0; a < kata.length(); a++) {
        konver = kata.charAt(a);
        if (konver == 'I' && !i) {
            i = true;
        }else if (konver == 'S' && i && !s) {
            s = true;
        }else if (konver == 'C' && i && s && !c) {
            c = true;
            break;
        }
    }
    if (i&&s&&c) {
        System.out.println("CANTIK");
    }else{
        System.out.println("TIDAK CANTIK");
    }
}
}
