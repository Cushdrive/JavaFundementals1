package greetings;

import printing.*;

import java.io.File;
import java.io.IOException;

public class HelloWorld {


    public static void main(String[] args)
    {
        //Checked Exception demo
        File file = new File("C:\\test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Now that we're using generics, we have to declare the subtype
        //of the printer when we instantiate it.
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());
//        Printer<ColorCartridge> printer2 = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());

        //The method accepts a generic, so we'll just pass it a color cartridge. We could also
        //pass it a black and white cartridge.
        //printer.printUsingCartridge(new ColorCartridge(),"Generic message.");
        //printOne(printer);

        try {
            printer.print(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        finally {
            printer.TurnOff();
        }

    }

/*    private static void printOne(Printer<? extends ICartridge> printer) {
        String fillPercentage = printer.getCartridge().getFillPercentage();
        printer.print(-11);
        System.out.println(fillPercentage);
    }*/

}
