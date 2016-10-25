/**
 * Created by makaimark on 2016.10.25..
 */
public class plasticGarbage extends Garbage{
    String name;
    boolean isClean;

    plasticGarbage(String name, boolean isClean){
        super(name);
        this.name = name;
        this.isClean = isClean;
    }

    public void clean(){
        this.isClean = true;
    }
}
