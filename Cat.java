public class Cat extends Animal {
    private String color;

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает.");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + food + ".");
    }
}
