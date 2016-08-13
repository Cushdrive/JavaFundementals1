package greetings;

import printing.*;

import java.io.IOException;
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
        printer.print(3);
        printer.outputPage(2);

        Path path = Paths.get("/Users/jayson/temp/newfile.txt");

        //Creating a file
        try {
            Files.createFile(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        try {
//            Files.deleteIfExists(path);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        try {
            Files.move(path,Paths.get("/Users/jayson/temp/movedfile.txt"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
