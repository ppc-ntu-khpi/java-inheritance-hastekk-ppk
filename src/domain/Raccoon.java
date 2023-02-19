package domain;

public class Raccoon extends Animal {

    private String kind;

    public Raccoon(String name, int weight, String kind, boolean is_a_predator) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
        this.is_a_predator = is_a_predator;
    }

    public Raccoon() {
        this("Fluffy",4,"just a raccoon", true);
    }

    public Raccoon(String name) {
        this(name,4,"just a raccoon", true);
    }
            
    public String toString() 
    {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is raccoon!";
    }
}
