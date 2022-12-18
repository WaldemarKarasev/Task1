package Task3;

public class Main {
    public static void main(String[] args) {

        Flower flower1 = new Flower(4, 6, "red");
        Flower flower2 = new Flower(8, 5, "blue");
        Flower flower3 = new Flower(4, 6, "red");

        System.out.println(flower1.toString());
        System.out.println(flower2.toString());
        System.out.println(flower3.toString());

        System.out.println("flowerr1 equals flower2: " + flower1.equals(flower2));
        System.out.println("flowerr1 equals flower3: " + flower1.equals(flower3));

        System.out.println("flower1.hashCode() = " + flower1.hashCode());


    };
}
