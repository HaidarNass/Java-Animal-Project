public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Simba");
        Elephant elephant = new Elephant("Dumbo");
        Monkey monkey = new Monkey("George");


        zoo.addAnimals(lion);
        zoo.addAnimals(elephant);
        zoo.addAnimals(monkey);


        zoo.displayAnimalReport();
    }
}
