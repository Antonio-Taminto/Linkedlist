import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit mela = new Fruit("Mela");
        Fruit pera = new Fruit("Pera");
        Fruit banana = new Fruit("Banana");
        Fruit fragola = new Fruit("Fragola");


        LinkedList<Fruit> frutti= new LinkedList<>();
        frutti.add(mela);
        frutti.add(pera);
        for(Fruit frutto : frutti){
            System.out.println(frutto.getName());
        }
        System.out.println("---------------------");
        frutti.addFirst(banana);
        for(Fruit frutto : frutti){
            System.out.println(frutto.getName());
        }
        System.out.println("---------------------");
        frutti.addLast(fragola);
        for(Fruit frutto : frutti){
            System.out.println(frutto.getName());
        }


    }
}