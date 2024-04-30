public class Rose extends Flower{
    //instance variable
    private boolean hasThorns;
    //constructor
    public Rose(String name, String color, int numOfPetals, double height, boolean hasThorns){
        //super constructor
        super(name,color,numOfPetals,height);
        this.hasThorns = hasThorns;
    }
    @Override
    public String toString(){
        return String.format("%b",hasThorns);
    }
}
