public class Main {

    public static void main(String[] args) {

        Item obj1 = new Item();
        obj1.id = 1;
        obj1.name = "chair";
        obj1.price = 150;

        Item obj2 = new Item(2,"sofa",350);
//        System.out.println(obj2.id);
//        System.out.println(obj1);

        Item obj3 = new Item(4);
        Item obj4 = new Item("table");

        Item obj5 = new Item(0,null,0.0);
        Item obj6 = new Item();

//        obj1.printPrice();
//        obj2.printPrice();
//        Item.printClassName();

        Cat cat1 = new Cat("Hatool",9,"maaaaah");
        Cat cat2 = new Cat("Mitzy",5,"meow");
//        cat1.sound();
//        cat2.sound();

    }

    //overload
    public static void func1(int x){

    }
    public static void func1(String s){

    }
    public static void func1(double d){

    }
    public static void func1(float f){

    }


}
