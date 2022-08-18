public class Building {

    //fields
    String address;
    int stories;
    int windows;
    int doors;

    //constructor

    public Building(String address, int stories, int windows, int doors) {
        this.address = address;
        this.stories = stories;
        this.windows = windows;
        this.doors = doors;
    }


    //functions
    public void build(){
        System.out.println("This building at address : " + address + " was built");
    }

    @Override
    public String toString(){
        return "This building has " + stories + " stories and " + windows + " windows";
    }
}
