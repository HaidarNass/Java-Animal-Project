public class Monkey extends Animal{

    private FeedingBehavior feedingBehavior;

    public Monkey(String name){
        super(name, "Monkey");
        this.feedingBehavior = new HerbivoreFeeding();
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey's woo woo");
    }
}
