package Classes;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtScanner {
    protected static ArrayList<String> textMain;
    protected static ArrayList<String> textAboutBox;
    protected static ArrayList<String> textsMenuControl;
    protected static ArrayList<String> textsBitMapItem;
    protected static ArrayList<String> textsSlideViewComp;
    protected static ArrayList<Integer> integersSlideViewComp;
    protected static ArrayList<String> textsTextItem;
    protected static ArrayList<String> textsSlideViewFrame;
    protected static ArrayList<String> textsXMLAccessor;
    protected static ArrayList<Integer> textsSlide;
    protected static ArrayList<String> textsDemoPresentationReader;

    private static ArrayList<String> readTxtUsingScanner(String fileName) throws IOException {
        ArrayList<String> texts = new ArrayList<String>();
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        //read line by line
        while(scanner.hasNext()){
            //process each line
            texts.add(scanner.nextLine());
        }
        scanner.close();
        return texts;
    }

    private static ArrayList<Integer> readIntegersUsingScanner(String fileName) throws IOException {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        //read line by line
        while(scanner.hasNext()){
            //process each line
            integers.add(scanner.nextInt());
        }
        scanner.close();
        return integers;
    }

    static {
        try {
            textMain = readTxtUsingScanner("textMain.txt");
            textAboutBox = readTxtUsingScanner("AboutTxt.txt");
            textsMenuControl = readTxtUsingScanner("MenuControlTxt.txt");
            textsBitMapItem = readTxtUsingScanner("textsBitMapItem.txt");
            textsSlideViewComp = readTxtUsingScanner("textsSlideViewComp.txt");
            integersSlideViewComp = readIntegersUsingScanner("integersSlideViewComp.txt");
            textsTextItem = readTxtUsingScanner("textsTextItem.txt");
            textsSlideViewFrame = readTxtUsingScanner("textsSlideViewFrame.txt");
            textsXMLAccessor = readTxtUsingScanner("textsXMLAccessor.txt");
            textsSlide = readIntegersUsingScanner("textsSlide.txt");
            textsDemoPresentationReader = readTxtUsingScanner("textsDemoPresentationReader.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}