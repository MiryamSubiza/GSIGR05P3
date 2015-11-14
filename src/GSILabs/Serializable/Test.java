/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GSILabs.Serializable;

/**
 *
 * @author Alex
 */

import GSILabs.BSystem.*;
import GSILabs.BModel.*;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;


public class Test {
    
    public static void main(String[] args){

        Artist a4 = new Artist("Nach", "Rapero alicantino", "www.nach.es");
        Location l3 = new Location("BEC", 18000, "Bilbao", "bilbaoexhibitioncentre.com");
        Exhibition ex = new Exhibition("Exposición dos", "Exposición de Nach", "Universal music",
            new FechaCompleta("21/08/2016", "17:30"), new FechaCompleta("28/08/2016", "20:00"),
            new FechaCompleta("21/08/2016", "17:30"), new FechaCompleta("28/08/2016", "20:00"),
            a4, "www.universalmusic.es", l3);        
        Ticket t = new Ticket(ex,1,4);
        File fichero = new File("ticket.xml");
        t.saveToXML(fichero);
        
        a4.saveToXML("C:/Users/miryam/Desktop/artist.xml");
        
    }
    
}
