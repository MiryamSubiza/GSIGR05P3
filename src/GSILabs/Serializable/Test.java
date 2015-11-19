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

import GSILabs.persistence.XMLParser;
import GSILabs.BModel.*;
import GSILabs.persistence.XMLParsingException;
import java.io.File;


public class Test {
    
    public static void main(String[] args) throws XMLParsingException{

        Artist a4 = new Artist("Nach", "Rapero alicantino", "www.nach.es");
        Artist a5 = new Artist("Alex Papito", "Master BOSS del Karaoke");
        Collective col = new Collective(a4, "Violadores del verso", "Grupo de RAP", "violadoresdelverso.org");
        col.addArtistToCollective(a5);
        Location l3 = new Location("BEC", 18000, "Bilbao", "bilbaoexhibitioncentre.com");
        Concert con = new Concert("Concierto uno", a5, new FechaCompleta("01/02/2016", "22:00"),
            new FechaCompleta("01/02/2016", "22:00"), new FechaCompleta("01/02/2016", "21:00"),
            new FechaCompleta("01/02/2016", "23:45"), l3);        
        Exhibition ex = new Exhibition("Exposición dos", "Exposición de Nach", "Universal music",
            new FechaCompleta("21/08/2016", "17:30"), new FechaCompleta("28/08/2016", "20:00"),
            new FechaCompleta("21/08/2016", "17:30"), new FechaCompleta("28/08/2016", "20:00"),
            a4, "www.universalmusic.es", l3);
        Festival fest = new Festival("Festival uno", con, new FechaCompleta("14/11/2015", "20:00"),
            new FechaCompleta("15/11/2015", "23:50"), new FechaCompleta("14/11/2015", "20:00"),
            new FechaCompleta("15/11/2015", "23:50"));
        Client cli = new Client(73115003, "Alex", "Izu", new FechaCompleta("25/01/1994", "04:00"), "0080909808");
        Ticket t = new Ticket(ex,1,4);
        Sales s = new Sales(t,cli,15.0f,"00838u39", new FechaCompleta("14/11/2015", "20:00"));
        
        // **********************************************************************
        // Para probar la excepcion tienes que ejecutarlo una vez y despues
        // comenta la siguiente linea y modificar el archivo generado por ejemplo
        // quitando alguna etiqueta
        // **********************************************************************
        a4.saveToXML("artist.xml");
        
        File fichero = new File("artist.xml");
        Artist aux = null;
        
        try{
            aux = XMLParser.parseArtist(fichero);
        }
        catch (XMLParsingException e){
            System.out.println("Se ha capturado una XMLParsingException:");
            if(e.getFileName() != null){
                System.out.println(e.getFileNameDescription());
            }
            System.out.println(e.getMessage());            
        }        
        
        System.out.println(aux.toString());          
        
    }
    
}
