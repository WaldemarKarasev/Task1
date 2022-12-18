package Task3;

import java.util.Objects;

public class Petal {
    String color;

    Petal(){}

    Petal(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Petal petal = (Petal) o;
        return Objects.equals(color, petal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
