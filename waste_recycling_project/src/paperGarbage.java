/**
 * Created by makaimark on 2016.10.25..
 */
public class paperGarbage extends Garbage {

    String name;
    boolean isSqueezed;

    paperGarbage(String inputName, boolean isSqueezed) {
        super(inputName);
        this.name = inputName;
        this.isSqueezed = isSqueezed;
    }

    public void squeeze () {
        this.isSqueezed = true;
    }
}
