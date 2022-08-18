import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Object object = new Object();
        Scanner scanner = new Scanner(System.in);

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

        Building building1 = new Building("ktovet",4,20,4);
//        System.out.println(building1);
        House house1 = new House("ktovet",2, 6,2,false);
//        System.out.println(house1);

        Animal anml1 = new Animal("Hatool", 9);
        Animal anml2 = new Animal("Hatool", 10);
        System.out.println(anml1.compareTo(anml2));

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
