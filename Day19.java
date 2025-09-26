public class day19 {
public static void main(String[] args) {
    int angkaBesarInt = 123456789;
    float angkaBesarFloat = 3.1428571428571f;
    
    short angkaKecilShort = (short)angkaBesarInt;
    int angkaKecilInt = (int)angkaBesarFloat;
    
    System.out.println("Konversi dari integer ke short : " + angkaKecilShort);
    System.out.println("Konversi dari float ke int : " + angkaKecilInt);
    
    long shortKeLong = angkaKecilShort;
    double intKeDouble = angkaKecilInt;
    
    System.out.println("Konversi dari short ke long : " + shortKeLong);
    System.out.println("Konversi dari int ke Double : " + intKeDouble);
    
}
    
}
