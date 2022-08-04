public class Cat extends Animal{

    String noise;

    public Cat(String name, int age, String noise) {
        super(name, age);
        this.noise = noise;
    }

    @Override
    public void sound() {
        System.out.println(name + " says " + noise);
    }

    // this cats name is ___ and its ___ years old
}
