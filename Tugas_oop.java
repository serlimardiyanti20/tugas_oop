
package tugas_oop;
class laptop{
String merk;
String warna;
Integer tahun;
Integer harga;



}

public class Tugas_oop {

    
    public static void main(String[] args) {
      laptop person1 = new laptop();
      person1.merk  ="Lenovo";
      person1.warna ="Silver";
      person1.tahun =2022;
      person1.harga = 10000000;
    
        System.out.println(person1.merk);
        System.out.println(person1.warna);
        System.out.println(person1.tahun);
        System.out.println(person1.harga);
    
    }


}
