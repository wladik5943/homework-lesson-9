public class Main {
    public static void main(String[] args) {

        Animal animal = createAnimal("cat");

        animal.voice();
        animal.eat("Grass");



    }

    static Animal createAnimal(String animal){
        if(animal.equalsIgnoreCase("dog"))
            return Dog.dogCreate();
        if(animal.equalsIgnoreCase("rabbit"))
            return new Rabbit();
        if(animal.equalsIgnoreCase("tiger"))
            return new Tiger();
        else
            throw new RuntimeException(animal+" не существует");
    }

}