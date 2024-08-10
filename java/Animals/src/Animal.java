public class Animal {
    private String name;
    private String species;

    public String getName(){
        return name;
    }
    public String getSpecies() {
        return species;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void makeSound(){
        System.out.println("This Animal makes a sound");
    }
}