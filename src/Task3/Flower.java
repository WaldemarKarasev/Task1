package Task3;

public class Flower extends Bud {
    int numOfBuds;

    Flower() {}

    Flower(int numOfBuds, int numOfPetals, String color){
        super(numOfPetals, color);
        this.numOfBuds = numOfBuds;
    }


    @Override
    public void bloom() {
        System.out.println("Flower is bloom!");
    }

    @Override
    public void wither() {
        System.out.println("Flower is wither.");
    }

    @Override
    public void displayColor() {
        System.out.println("Flower color is " + color);
    }

    @Override
    public int hashCode() {
        int result = 42;
        return 23*result + numOfBuds + numOfPetals + color.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower bud = (Flower) o;
        return numOfBuds == bud.numOfBuds && numOfPetals == bud.numOfPetals &&
                color == bud.color;
    }

    @Override
    public String toString() {
        return "The Fower has " + numOfBuds + " buds which has " + numOfPetals +
                " petals the color of the petal is " + color;
    }

}
