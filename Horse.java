public class Horse extends Animal {
    private String personality;

    public Horse(String personality) {
        this.personality = personality;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет.");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food + ".");
    }
}
