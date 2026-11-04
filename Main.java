public class Main {
    public static void main(String[] args) {

        //Animal1 luonti (Sami)
        Animal anim1 = new Animal();

        anim1.color = "Pinkki";
        anim1.laji = "Strutsi";
        anim1.pituus = 144;

        anim1.naytaTiedot();

        //Animal2 luonti (Meri)
        Animal animal2 = new Animal();

        animal2.laji = "Orava";
        animal2.color = "Oranssi";
        animal2.pituus = 24;

        animal2.naytaTiedot();
        animal2.kasvataPituutta();
        animal2.naytaTiedot();

        Animal animal3 = new Animal();

        animal3.laji = "Koira";
        animal3.color = "Pinkki";
        animal3.pituus = 100;

        animal3.naytaTiedot();
        animal3.kasvataPituutta();
        animal3.naytaTiedot();

  
        }



}