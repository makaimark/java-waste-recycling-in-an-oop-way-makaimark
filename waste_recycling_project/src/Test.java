/**
 * Created by makaimark on 2016.10.25..
 */
public class Test {

    public static void main(String[] args) throws DustbinContentException {
        Dustbin bin = new Dustbin("red");
        paperGarbage paper = new paperGarbage("newspaper", false);
        System.out.println("Paper is squeezed: " + paper.isSqueezed);
        //paper.squeeze();
        System.out.println("Paper is squeezed: " + paper.isSqueezed);
        bin.throwOutGarbage(paper);

        System.out.println("Bin paper content: " + bin.paperContent);
        bin.emptyContent();
        System.out.println("Bin paper content: " + bin.paperContent);
    }
}
