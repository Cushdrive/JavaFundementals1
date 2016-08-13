package greetings;

import printing.*;

import java.util.*;

public class HelloWorld {


    public static void main(String[] args)
    {
        //Now that we're using generics, we have to declare the subtype
        //of the printer when we instantiate it.
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());
//        Printer<ColorCartridge> printer2 = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());

        //The method accepts a generic, so we'll just pass it a color cartridge. We could also
        //pass it a black and white cartridge.
        //printer.printUsingCartridge(new ColorCartridge(),"Generic message.");
        //printOne(printer);

/*        try {
            printer.print(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        finally {
            printer.TurnOff();
        }*/

//        printer.loadPaper(10);
//        printer.print(5);
//        //printer.outputPage(3);
//
//        Set<Integer> mySet = new HashSet<Integer>();
//        mySet.add(1);
//        mySet.add(2);
//        mySet.add(3);
//        System.out.println(mySet.size());
//
//        for (Integer i:mySet) {
//            printer.outputPage(i);
//        }

//        Queue<String> myQueue = new LinkedList<String>();
//        myQueue.offer("A");
//        myQueue.offer("B");
//        myQueue.offer("C");
//
//        while(myQueue.peek() != null) {
//            System.out.println(myQueue.poll().toString());
//        }

        Map<String,List<Integer>> testScores = new HashMap<String,List<Integer>>();
        List<Integer> joescores = new ArrayList<Integer>();
        joescores.add(80);
        joescores.add(90);
        joescores.add(97);
        testScores.put("Joe",joescores);

        List<Integer> amyscores = new ArrayList<Integer>();
        amyscores.add(80);
        amyscores.add(90);
        amyscores.add(97);
        testScores.put("Amy",amyscores);

        List<Integer> fredscores = new ArrayList<Integer>();
        fredscores.add(80);
        fredscores.add(90);
        fredscores.add(97);
        testScores.put("Fred",fredscores);

        printScores("Fred",testScores);
        printScores("Joe",testScores);
        printScores("Amy",testScores);
    }

    private static void printScores(String studentName, Map<String,List<Integer>> scoresMap){
        List<Integer> scores = scoresMap.get(studentName);

        System.out.println(studentName + " Scores:\n");
        for (int score:scores) {
            System.out.println(score + "\n");
        }
    }

/*    private static void printOne(Printer<? extends ICartridge> printer) {
        String fillPercentage = printer.getCartridge().getFillPercentage();
        printer.print(-11);
        System.out.println(fillPercentage);
    }*/

}
