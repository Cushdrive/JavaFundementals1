package greetings;

import printing.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class HelloWorld {


    public static void main(String[] args) {
        //Now that we're using generics, we have to declare the subtype
        //of the printer when we instantiate it.
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.RED);

        printer.loadPaper(11);

        PrintingDevice annotation = printer.getClass().getAnnotation(PrintingDevice.class);
        try {
            Method printMethod = printer.getClass().getMethod(annotation.defaultPrintMethod(), int.class);
            printMethod.invoke(printer,annotation.defaultNumberOfCopies());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        printer.outputPage(4);



    }
}
