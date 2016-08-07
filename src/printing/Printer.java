package printing;

/**
 * Created by jayson on 11/7/15.
 */
//Demonstrates an Is-A relationship (inheritance)
public class Printer extends printing.Machine {
    private String modelNumber;
    //Composition
    private PaperTray paperTray = new PaperTray();

    public Printer(boolean isOn, String modelNumber) {
        super(isOn);
        this.modelNumber = modelNumber;
    }

    public void print(int copies) {
        String onStatus = "";
        if (isOn) {
            onStatus = " is On!";
        } else {
            onStatus = " is Off!";
        }

        String texttoPrint = modelNumber + onStatus;

        while (copies > 0 && !paperTray.isEmpty()) {
            System.out.println(texttoPrint);
            copies--;
            paperTray.usePage();
        }

        if (paperTray.isEmpty() && (copies > 0)) {
            System.out.println("Could not complete job. Out of paper!");
        }
    }

    public void loadPaper(int pages) {
        paperTray.addPaper(pages);
    }

    public void printColors() {
        String[] colors = new String[] {"Red","Blue","Green","Yellow","Orange"};

        for (String currentColor : colors ) {
            System.out.println(currentColor);
        }
    }

    @Override
    public void TurnOn() {
        System.out.println("Warming up print engine.");
        super.TurnOn();
    }

    public void print (String text) {
        System.out.println(text);
    }
}
