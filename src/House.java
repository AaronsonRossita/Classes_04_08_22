public class House extends Building {
    // House = subclass , Building = super
    // House = child , Building = parent
    boolean yard;

    public House(String address, int stories, int windows, int doors, boolean yard){
        super(address, stories, windows, doors);
        this.yard = yard;
    }

    @Override
    public String toString() {
        if (yard){
            return "This house has " + windows + " windows & " + stories + " floors & it has a yard";
        }else{
            return "This house has " + windows + " windows & " + stories + " floors & it has no yard";
        }
//        return "This house has " + windows + " windows & " + stories + " floors";
    }

    @Override
    public void build() {
        System.out.println("This house at adrress " + address + " was built.");
    }
}
