package ml.bibek.ten.template.sort;

public class Duck implements Comparable<Duck> {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck o) {
        /**
         * This compareTo method act as a template to provide the implementation
         * in the Arrays.sort() method
         */
        if (weight < o.weight) return -1;
        else if (weight > o.weight) return 1;
        else return 0;
        // return Integer.compare(weight, o.weight);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
