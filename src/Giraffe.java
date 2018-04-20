public class Giraffe extends Animal {

    public Giraffe(String newName) {
        super(newName,"leaves");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food);
            System.out.println(name + " sleeps for 8 hours.");
        } else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }

    }

}
