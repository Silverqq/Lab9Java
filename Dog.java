public class Dog extends Animal {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает.");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + food + ".");
    }
}
