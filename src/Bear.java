public class Bear extends Animal {
    public Bear(String newName) {
        super(newName,"fish");
    }

    public void sleep() {

        System.out.println(name + " hibernates for 4 months.");
    }
}
