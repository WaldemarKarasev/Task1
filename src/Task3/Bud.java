package Task3;

import java.util.Objects;

public class Bud extends Petal{
    int numOfPetals;

    Bud(){}

    Bud(int numOfPetals, String color) {
        super(color);
        this.numOfPetals = numOfPetals;
    }

    public void bloom() {
        System.out.println("Bud is bloom!");
    }

    public void wither() {
        System.out.println("Bud is wither.");
    }

    public void displayColor() {
        System.out.println(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud bud = (Bud) o;
        return numOfPetals == bud.numOfPetals && color == bud.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfPetals, color.hashCode());
    }
}
