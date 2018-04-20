import java.util.ArrayList;

public class Zookeeper extends Animal{
    String name;

    public Zookeeper(String realName) {
        name = realName;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food) {
        System.out.println(name + " is feeding " + food + " to " + animals.size() + " animals.");
        System.out.println(Animal.total);
    }

}
