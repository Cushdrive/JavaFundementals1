package greetings;

import printing.Machine;
import printing.Printer;
import printing.iMachine;
import printing.ColorCartridge;
import printing.BWCartridge;

public class HelloWorld {


    public static void main(String[] args)
    {
        //Now that we're using generics, we have to declare the subtype
        //of the printer when we instantiate it.
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());

        //The method accepts a generic, so we'll just pass it a color cartridge. We could also
        //pass it a black and white cartridge.
        printer.printUsingCartridge(new ColorCartridge(),"Generic message.");

    }

}
