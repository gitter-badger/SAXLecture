package saxlecture;



import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{
    
    public void startDocument ()
    {
	System.out.println("Start document");
    }

    public void endDocument ()
    {
	System.out.println("End document");
    }

    public void startElement (String uri, String name,String qName, Attributes atts)
    {
	System.out.print("<" + name+" " +atts.getQName(0)+"=" +atts.getValue(0)+" " + atts.getQName(1) + "=" + atts.getValue(1)+">");
    }

    public void endElement (String uri, String name, String qName)
    {
        System.out.println("</" + qName + ">");
    }

    public void characters (char ch[], int start, int length)
    {
	
	for (int i = start; i < start + length; i++) 
        {
	    switch (ch[i])
            {
	   
	    case '\n':
		System.out.print("\n");
		break;
                case ' ':
                    System.out.print("***********");
                    break;    
	    default:
		System.out.print(ch[i]);
		break;
	    }
	}
	      
    }   
        
}
