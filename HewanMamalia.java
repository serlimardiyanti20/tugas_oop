
package polymorphism;

class Hewan {
    public void suaraHewan() {
        System.out.println("Hewan bersuara");
    }
}
class Tikus extends Hewan { 
    public void suaraHewan() {
        System.out.println("Tikus bersuara : cit cit");
    }
}
class Kucing extends Hewan {
    public void suaraHewan() {
        System.out.println("Kucing bersuara : weong");
    }
}


public class HewanMamalia {

    
    public static void main(String[] args) {

         Hewan hewanSaya = new Hewan();  // membuat object hewan
         Hewan tikusSaya = new Tikus();  // membuat object tikus
         Hewan kucingSaya = new Kucing(); // membuat object kucing
         hewanSaya.suaraHewan();
         tikusSaya.suaraHewan();
         kucingSaya.suaraHewan();
     }
 }
    
    

