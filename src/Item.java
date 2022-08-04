public class Item {

    //1. fields שדות
    int id;
    String name;
    double price;

    //2. constructor בנאי
    public Item() {
    }

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    //3. functions

    public void printPrice(){
        System.out.println(price);
    }

    public static void printClassName(){
        System.out.println("The class name is Item");
    }

    @Override
    public String toString(){
        return "This item is named " + name + " and the price is " + price;
    }
}
