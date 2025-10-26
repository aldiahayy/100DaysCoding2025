public class day49 {
public static void main(String[] args) {
    int a = 5;
    int b = 7;
    // 1. ternary pada int
    System.out.println(a > b? "1. nilai terbesar adalah " + a : "1. nilai terbesar adalah " + b);
    
    // 2. ternary pada String
    String cek2 = (a > b)? "ya" : "tidak";
    System.out.println("2. apakah " + a + " lebih besar dari " + b + " ? " + cek2);
    
    //3. ternary pada boolean
    boolean cek3 = (a == b)? true : false;
    System.out.println("3. apakah " + a + " itu sama dengan " + b + " ? " + cek3);
    
    //4. ternary pada double
    double c = -2.32;
    double d = 1.54;
    double cek4 = (c > d)? c : d;
    System.out.println("4. nilai terbesar antara " + c + " dan " + d + " adalah " + cek4);
    
    //5. nested ternary
    String hari = "sabtu";
    String cek5 = (hari.equalsIgnoreCase("sabtu"))? "hari libur" : (hari.equalsIgnoreCase("minggu"))? "hari libur" : "hari kerja";
    System.out.println("5. hari " + hari + " adalah " + cek5);
    
    //6. ternary pada char
    char e = 'a';
    char f = 'a';
    char cek6 = ((int) e == (int) f)? '*' : '/';
    double operasi = (cek6 == '/')? e/f : e*f;
    System.out.println("6. hasil dari " + (int)e + cek6 + (int)f + " adalah " + operasi);
}
}
