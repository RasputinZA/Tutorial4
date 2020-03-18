package za.ac.cput.Projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        System.out.println( "Utilising a List:" );
        List plaecList = new ArrayList();
        plaecList.add("Cape Town");
        plaecList.add("Protoria");
        plaecList.add("Worcester");
        plaecList.add(0, "Sandton");
        for(int i=0; i<plaecList.size(); i++)
            System.out.println(plaecList.get(i));

        System.out.println( "\nUtilising a Set:" );
        Set placeSet = new HashSet();
        placeSet.add("Oudtshoorn");
        placeSet.add("Paarl");
        placeSet.add("Durbanville");
        placeSet.add("Kuilsrivier");
        for(int i=0; i<placeSet.size(); i++)
            System.out.println(placeSet.toArray()[i]);

        System.out.println( "\nUtilising map:" );
        Map placeMap = new HashMap();
        placeMap.put("P1", "Swellendam");
        placeMap.put("P2", "Hermanus");

        String input2 = (String) placeMap.get("P2");
        System.out.println( "The object with the Key \"P2\" is "+input2 );

        System.out.println( "\nUtilising generic collection of objects: \"myObject\":" );
        Collection<placeObj> colec = new ArrayList<placeObj>();
        colec.add(new placeObj("Struisbaai"));
        colec.add(new placeObj("Franskraal"));
        for(int i=0; i<colec.size(); i++)
            System.out.println(((ArrayList<placeObj>) colec).get(i).getName());

    }
}
