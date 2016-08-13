package greetings;

import printing.*;

import java.util.*;

public class HelloWorld {


    public static void main(String[] args) {
        //Now that we're using generics, we have to declare the subtype
        //of the printer when we instantiate it.
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.RED);
        printer.loadPaper(11);
        printer.print(3);
        printer.outputPage(2);
    }
}
