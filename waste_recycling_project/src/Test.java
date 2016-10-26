/**
 * Created by makaimark on 2016.10.25..
 */
public class Test {

    public static void main(String[] args) throws DustbinContentException {
        Dustbin bin = new Dustbin("red");
        paperGarbage paper = new paperGarbage("newspaper", false);
        System.out.println("Paper is squeezed: " + paper.isSqueezed);
        try {
            bin.throwOutGarbage(paper);
        }
        catch (DustbinContentException e) {
            paper.squeeze();
            bin.throwOutGarbage(paper);
        }
        System.out.println("Bin paper content: " + bin.paperContent);
        bin.emptyContent();
        System.out.println("Bin paper content: " + bin.paperContent);
    }
}
