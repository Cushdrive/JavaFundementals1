package printing;

/**
 * Created by jayson on 8/13/16.
 */
public class ContinuousPrinter extends Thread {
    private Printer<ICartridge> printer = new Printer(true,"IPrint",ColorCartridge.BLUE);
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            printer.printUsingCartridge(ColorCartridge.BLUE,"In Thread" + i);
        }
        super.run();
    }
}
