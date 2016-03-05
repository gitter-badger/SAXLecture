package saxlecture;

import java.io.FileReader;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Lecture 
{
    public static void main (String args[]) throws Exception
    {
        XMLReader xr = XMLReaderFactory.createXMLReader();
        
        MyHandler handler = new MyHandler();
        xr.setContentHandler((ContentHandler) handler);
        FileReader r = new FileReader("input.xml");
        xr.parse(new InputSource(r));
    } 
}
