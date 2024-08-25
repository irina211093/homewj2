
public class Dog {
    static int totalDogs = 0;

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        totalDogs += 1;
    }

    public void printDogInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static int getTotalDogs() {
        return totalDogs;
    }

}
