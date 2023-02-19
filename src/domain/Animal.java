package domain;

public class Animal {

    protected String name;

    protected boolean is_a_predator;
    
    protected int weight;

    public Animal() {
        name="generic animal";
        weight=25;
    }
    
    public void sleep()
    {
        System.out.println(name + " sleeping...");
    }

    public void eat() 
    {
        System.out.println(name + " eating...");
    }
        

    public void speak() 
    {
        System.out.println(name + " speaking...");
    }

    public void hunting()
    {
        if (is_a_predator == true)
            System.out.println(name + " hunting...");
        else
            System.out.println(name + " it is not a predator");
    
    }
    
    public void play() 
    {
        System.out.println(name + "is playing...");
    }
    
    public String toString() 
    {
        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg";
    }

 
}
