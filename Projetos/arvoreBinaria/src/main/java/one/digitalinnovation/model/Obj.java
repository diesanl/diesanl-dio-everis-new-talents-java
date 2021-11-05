package one.digitalinnovation.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {

    Integer value;

    public Obj(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(value, obj.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Obj other) {
        int i = 0;

        if (this.value > other.value) {
            i = 1;
        } else if (this.value < other.value)
            i = -1;
        return i;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
