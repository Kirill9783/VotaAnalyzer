import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class LoaderNew {

    public static void main(String[] args) throws Exception {

        String fileName = "res/data-1572M.xml";

        long start = System.currentTimeMillis();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        XMLHandlerNew handler = new XMLHandlerNew();

        parser.parse(new File(fileName), handler);

        System.out.println("Parsing duration: " + (System.currentTimeMillis() - start) + " ms" +"\n");

        DBConnectionNew.printVoterCounts();
    }
}