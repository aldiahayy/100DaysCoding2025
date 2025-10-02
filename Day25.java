public class day25 {
public static void main(String[] args) {
    // pre increment
    int x = 5;
    int y = ++x;
    // post increment
    int a = 5;
    int b = a++;
    System.out.println(">>> pre increment <<<");
    System.out.printf("%-8s : %d %n", "Nilai x", x);
    System.out.printf("%-8s : %d %n", "Nilai y", y);
    
    System.out.println(">>> post increment <<<");
    System.out.printf("%-8s : %d %n", "Nilai a", a);
    System.out.printf("%-8s : %d %n", "Nilai b", b);
}
}
 
