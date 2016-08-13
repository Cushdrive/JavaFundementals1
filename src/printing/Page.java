package printing;

/**
 * Created by jayson on 8/13/16.
 */
public class Page {
    private String printedText;

    public String getText() {
        return printedText;
    }

    public void setPrintedText(String printedText) {
        this.printedText = printedText;
    }

    public Page(String printedText) {
        this.printedText = printedText;
    }


}
