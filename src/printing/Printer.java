package printing;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jayson on 11/7/15.
 * Demonstrates an Is-A relationship (inheritance)
 * Demonstrates a generic class. This is a printer, but could be a black
 * and white printer, or a color printer. That will be specified by the class
 * that composes this class. This is accomplished by adding the <T>
 *
 *     By using the keyword extends in the generic, you restrict the types of objects that can be used.
 *
 */
@PrintingDevice(defaultPrintMethod = "print", defaultNumberOfCopies = 5)
public class Printer<T extends ICartridge> implements iMachine {
    private String modelNumber;
    //Composition
    private PaperTray paperTray = new PaperTray();
    private Machine machine;
    private T cartridge;
    //private List<Page> pages = new ArrayList<Page>();
    //The Integer is the type of the Key in the map, and Page is the type of the value in the map.
    private Map<Integer,Page> pages = new HashMap<Integer,Page>();
    private String HOME;

    public Printer(boolean isOn, String modelNumber, T cartridge) {
        this.modelNumber = modelNumber;
        machine = new Machine(isOn);
        //Stores a reference to the class subtype.
        this.cartridge = cartridge;
        HOME = System.getProperty("user.home");
    }

    public T getCartridge() {
        return cartridge;
    }

    //Demonstrates a method generic. This is not very useful until we restrict the
    //subset of types. Right now its all Object, so only the base Object functions can be called.
    //U represents the type of the object that's passed in to the cartridge parameter. We further
    //restrict the generic type by using the extend keyword.
    public <U extends ICartridge> void printUsingCartridge(U cartridge, String message) {
        System.out.println(message);
        //System.out.println(cartridge.toString());
    }

    public void print(int copies) {
        checkCopies(copies);

        System.out.println(cartridge.toString());
        String onStatus = "";

        if (isOn()) {
            onStatus = " is On!";
        } else {
            onStatus = " is Off!";
        }

        String texttoPrint = getTextFromFile();

        int pageNumber = 1;

        while (copies > 0 && !paperTray.isEmpty()) {
            //pages.add(new Page(texttoPrint));
            pages.put(pageNumber,new Page(texttoPrint + ": " + pageNumber));

            pageNumber++;
            copies--;
            paperTray.usePage();
        }

        if (paperTray.isEmpty() && (copies > 0)) {
            System.out.println("Could not complete job. Out of paper!");
        }
    }

    private String getTextFromFile() {
        FileReader reader = null;
        BufferedReader bReader = null;
        CapitalizationReader capReader = null;

        try {
            String path = HOME + "/temp/test.txt";
            reader = new FileReader(path);
            bReader = new BufferedReader(reader);
            capReader = new CapitalizationReader(bReader);
            String line, allText = "";

            while((line = capReader.readLine()) != null) {
                allText += line + "\n";
            }
            return allText;
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                capReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    //Demonstrates how to iterate through a List and do something useful.
    public void outputPage(int pageNumber) {
        System.out.println(pages.get(pageNumber).getText());
//        PrintWriter writer = null;
//
//        try{
//            String path = HOME + "/temp/test2.txt";
//            writer = new PrintWriter(new FileWriter(path));
//            writer.println(pages.get(pageNumber).getText());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (writer != null){
//                writer.close();
//            }
//        }
    }

    private void checkCopies(int copies) {
        if (copies < 0) {
            throw new IllegalArgumentException("Can't print less than 0 copies.");
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
        System.out.println("Printer is off.");
    }

    @Override
    public boolean isOn() {
        return machine.isOn();
    }

    public void print (String text) {
        System.out.println(text);
    }
}
