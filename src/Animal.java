public class Animal {
    String name;
    String favoriteFood;
    static int total = 0;
    public Animal() {

    }

    public Animal(String setName, String setFavoriteFood) {
        name = setName;
        favoriteFood = setFavoriteFood;
        total += 1;
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours.");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            this.sleep();
        }
        this.sleep();
    }


}
