public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound(){
        System.out.println("rrrr");
    }

    public boolean compareTo(Animal a){
        if (this.age == a.age && this.name.equals(a.name)){
            return true;
        }else{
            return false;
        }
    }

}
