package printing;

/**
 * Created by jayson on 11/7/15.
 * Demonstrates an Is-A relationship (inheritance)
 * Demonstrates a generic class. This is a printer, but could be a black
 * and white printer, or a color printer. That will be specified by the class
 * that composes this class. This is accomplished by adding the <T>
 *
 */
public class Printer<T> implements iMachine {
    private String modelNumber;
    //Composition
    private PaperTray paperTray = new PaperTray();
    private Machine machine;
    private T cartridge;

    public Printer(boolean isOn, String modelNumber, T cartridge) {
        this.modelNumber = modelNumber;
        machine = new Machine(isOn);
        //Stores a reference to the class subtype.
        this.cartridge = cartridge;
    }

    //Demonstrates a method generic. This is not very useful until we restrict the
    //subset of types. Right now its all Object, so only the base Object functions can be called.
    //U represents the type of the object that's passed in to the cartridge parameter.
    public <U> void printUsingCartridge(U cartridge, String message) {
        System.out.println(cartridge.toString());
        System.out.println(message);
        System.out.println(cartridge.toString());
    }

    public void print(int copies) {
        System.out.println(cartridge.toString());
        String onStatus = "";

        if (isOn()) {
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
        System.out.println("Warming up printer");
        machine.TurnOn();
    }

    @Override
    public void TurnOff() {
        machine.TurnOff();
    }

    @Override
    public boolean isOn() {
        return machine.isOn();
    }

    public void print (String text) {
        System.out.println(text);
    }
}
