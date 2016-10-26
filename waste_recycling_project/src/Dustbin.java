/**
 * Created by makaimark on 2016.10.25..
 */

import java.util.*;

public class Dustbin {

    String color;
    List<paperGarbage> paperContent;
    List<plasticGarbage> plasticContent;
    List<Garbage> houseWasteContent;

    Dustbin(String color){
        this.color = color;
        this.paperContent = new ArrayList<>();
        this.plasticContent = new ArrayList<>();
        this.houseWasteContent = new ArrayList<>();
    }

    public void emptyContent(){
        this.paperContent = Collections.emptyList();
        this.plasticContent = Collections.emptyList();
        this.houseWasteContent = Collections.emptyList();
    }

    public void throwOutGarbage(Garbage garbage) throws DustbinContentException{
        if ( garbage instanceof paperGarbage ){
            if ( ((paperGarbage) garbage).isSqueezed) {
                this.paperContent.add((paperGarbage) garbage);
            } else {
                throw new DustbinContentException();
            }
        } else if ( garbage instanceof plasticGarbage ) {
            if ( ((plasticGarbage) garbage).isClean) {
                this.plasticContent.add((plasticGarbage) garbage);
            } else {
               throw new DustbinContentException();
            }
        } else if ( garbage instanceof Garbage ){
            this.houseWasteContent.add(garbage);
        } else {
           throw new DustbinContentException();
        }
    }
}
