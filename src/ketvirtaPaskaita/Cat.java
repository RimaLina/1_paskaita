package ketvirtaPaskaita;

import java.util.Comparator;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private String kind;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (!name.equals(cat.name)) return false;
        return kind.equals(cat.kind);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + kind.hashCode();
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind='" + kind + '\'' +
                '}';
    }

    public Cat(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    @Override
    public int compareTo(Cat o) {
        return name.compareTo(o.getName());
    }
}
