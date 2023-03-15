public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Корги");
        Cat cat = new Cat("Серая");
        Horse horse = new Horse("Тихая");

        dog.food = "мясо";
        dog.location = "в собачьей будке";
        cat.food = "рыба";
        cat.location = "на подоконнике";
        horse.food = "сено";
        horse.location = "в стойле";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(dog);
        veterinarian.treatAnimal(cat);
        veterinarian.treatAnimal(horse);

    }
}