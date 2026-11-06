public class Animal {
    public String laji;
    public String color;
    public int pituus;

    public void naytaTiedot() {
        System.out.println("Eläin: " + color + " " + laji);
        System.out.println("Pituus: " + pituus + " cm");
        
    }

    public void kasvataPituutta() {
        pituus++;
        System.out.println("Pituus kasvoi 1cm");
    }
}