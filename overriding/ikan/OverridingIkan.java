
package overriding.ikan;


class Ikan{

   public void swim(){
      System.out.println("Ikan bisa berenang");
   }
}
class Piranha extends Ikan{

   public void swim(){
      System.out.println("Piranha bisa makan daging");
   }
}
public class OverridingIkan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ikan a = new Ikan(); // Ikan sebagai referensi dan objek
      Ikan b = new Piranha(); // Ikan sebagai referensi tetapi Piranha sebagai objek

      a.swim();// menjalankan method pada kelas Ikan

      b.swim();// menjalankan method pada kelas Piranha
     
    } 
  
}
