public class DecisionMaking {
    public static void main(String[] args) {
        // if - else statement
        int nilai = 85 ;
        if (nilai >= 80) {
            System.out.println("Selamat anda lulus ujian");
        }else {
            System.out.println("maaf, kamu akan mengikuti remedial. Semangat!");

            }

        // if - else if
        int score = 85;
        if (score >= 90){
            System.out.println("Selamat anda lulus ujian");
        }else if (score <= 85){
            System.out.println("maaf, kamu akan mengikuti remedial. Semangat!");
        }else {
            System.out.println("kamu mengulang lagi yaa!");
        }

        //switch
        int umur = 20;
        switch (umur) {
            case 22:
                System.out.println("kamu lulus umur kamu mengikuti persyaratan");
                break;
            case 18:
                System.out.println("maaf kamu belum lulus, umur kamu belum memenuhi syarat");
                break;
        }


        //nested if
        byte angka1 = 75;
        byte angka2 = 50;
        byte angka3 = 45;
        if (angka1 >= 75 && angka2 >= 50){
            System.out.println("kerja bagus, anda lulus");
            if (angka3 == 45);{
                System.out.println("nilai pas rata-rata");
            }
        }





    }
}
