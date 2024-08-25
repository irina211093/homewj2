//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Graff", "German");
        Dog dog3 = new Dog("Archi", "Laika");

        dog1.printDogInfo();
        dog2.printDogInfo();
        dog3.printDogInfo();

        int totalDogs = Dog.getTotalDogs();
        System.out.println("Total number of dogs: " + totalDogs);
    }

}