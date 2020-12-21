package by.it.yemialyanava;

public class Garage <T extends Vehicle> {
    T vechile = null;

    public Garage (){
    }

    public void enter(T someVechile){
        this.vechile = someVechile;
    }

    public String toString (){
        return vechile.name;
    }

}
