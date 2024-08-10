public class Elephant extends Animal{

    private FeedingBehavior feedingBehavior;
    public Elephant(String name){
        super(name, "Elephant");
        this.feedingBehavior = new HerbivoreFeeding();
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant's trumpets");
    }
}
