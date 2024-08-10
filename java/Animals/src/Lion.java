public class Lion extends Animal {

    private FeedingBehavior feedingBehavior;

    public Lion(String name){
        super(name,"Lion");
        this.feedingBehavior = new CarnivoreFeeding();
    }

    @Override
    public void makeSound() {
        System.out.println("Lion's Roars");
    }
}
