public class Animal {
    protected String food;
    protected String location;

    public void makeNoise() {
        System.out.println("Животное спит.");
    }

    public void eat() {
        System.out.println("Животное ест " + food + ".");
    }

    public void sleep() {
        System.out.println("Животное спит.");
    }
}

