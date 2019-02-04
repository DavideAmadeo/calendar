/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Amadeo_Davide
 */
public class NBValidateXML {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        List link = null;
        Parser dom = new Parser();
        try {
            link = dom.parseDocument("/Users/davide/Desktop/TECNOLOGIE/LABORATORIO/CALENDAR/Consigli_di_classe_Circolari.xml");
            System.out.println("Numero di link: "+link.size());
            for(int i=0; i<link.size(); i++){
                System.out.println(i+" "+link.get(i).toString());
            }
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        Iterator iterator = link.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }
    
}
