public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println(name + " says woof");
    }
}
