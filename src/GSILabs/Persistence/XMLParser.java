/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GSILabs.Persistence;

import GSILabs.BModel.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;

/**
 *
 * @author Alex
 */
public class XMLParser {
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Artista si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto artista.
     */
    public static Artist parseArtist(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("artist", Artist.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Artist art = (Artist)xStream.fromXML(str);
        return art;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Artista si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto artista.
     */
    public static Artist parseArtist(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("artist", Artist.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Artist art = (Artist)xStream.fromXML(f);
        return art;
        
    }    
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Client si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto Client.
     */
    public static Client parseClient(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("client", Client.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Client cli = (Client)xStream.fromXML(str);
        return cli;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Client si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto Client.
     */
    public static Client parseClient(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("client", Client.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Client cli = (Client)xStream.fromXML(f);
        return cli;
        
    }
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Collective si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto Collective.
     */
    public static Collective parseCollective(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("collective", Collective.class);
        xStream.alias("artist", Artist.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Collective col = (Collective)xStream.fromXML(str);
        return col;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Collective si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto Collective.
     */
    public static Collective parseCollective(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("collective", Collective.class);
        xStream.alias("artist", Artist.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Collective col = (Collective)xStream.fromXML(f);
        return col;
        
    }
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Concert si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto Concert.
     */
    public static Concert parseConcert(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("concert", Concert.class);
        xStream.alias("artist", Artist.class);
        xStream.alias("collective", Collective.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("location", Location.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Concert c = (Concert)xStream.fromXML(str);
        return c;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Concert si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto Concert.
     */
    public static Concert parseConcert(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("concert", Concert.class);
        xStream.alias("artist", Artist.class);
        xStream.alias("collective", Collective.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("location", Location.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Concert c = (Concert)xStream.fromXML(f);
        return c;
        
    }
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Exhibition si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto Exhibition.
     */
    public static Exhibition parseExhibition(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream .alias("exhibition", Exhibition.class);
        xStream.alias("artist", Artist.class);
        xStream.alias("collective", Collective.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("location", Location.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Exhibition e = (Exhibition)xStream.fromXML(str);
        return e;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Exhibition si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto Exhibition.
     */
    public static Exhibition parseExhibition(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream .alias("exhibition", Exhibition.class);
        xStream.alias("artist", Artist.class);
        xStream.alias("collective", Collective.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("location", Location.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Exhibition e = (Exhibition)xStream.fromXML(f);
        return e;
        
    }
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto FechaCompleta si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto FechaCompleta.
     */
    public static FechaCompleta parseFechaCompleta(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream .alias("fechacompleta", FechaCompleta.class);        
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        FechaCompleta fecha = (FechaCompleta)xStream.fromXML(str);
        return fecha;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto FechaCompleta si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto FechaCompleta.
     */
    public static FechaCompleta parseFechaCompleta(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream .alias("fechacompleta", FechaCompleta.class);       
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        FechaCompleta fecha = (FechaCompleta)xStream.fromXML(f);
        return fecha;
        
    }
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Festival si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto Festival.
     */
    public static Festival parseFestival(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream .alias("festival", Festival.class);
        xStream .alias("concert", Concert.class);
        xStream .alias("exhibition", Exhibition.class);
        xStream.alias("artist", Artist.class);
        xStream.alias("collective", Collective.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("location", Location.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Festival fest = (Festival)xStream.fromXML(str);
        return fest;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Festival si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto Festival.
     */
    public static Festival parseFestival(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream .alias("festival", Festival.class);
        xStream .alias("concert", Concert.class);
        xStream .alias("exhibition", Exhibition.class);
        xStream.alias("artist", Artist.class);
        xStream.alias("collective", Collective.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("location", Location.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Festival fest = (Festival)xStream.fromXML(f);
        return fest;
        
    }
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Location si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto Location.
     */
    public static Location parseLocation(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("location", Location.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Location l = (Location)xStream.fromXML(str);
        return l;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Location si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto Location.
     */
    public static Location parseLocation(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("location", Location.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Location l = (Location)xStream.fromXML(f);
        return l;
        
    }
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Sales si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto Sales.
     */
    public static Sales parseSales(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("sales", Sales.class);
        xStream.alias("ticket", Ticket.class);
        xStream.alias("client", Client.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("artist", Artist.class);
        xStream.alias("concert", Concert.class);
        xStream.alias("festival", Festival.class);
        xStream.alias("exhibition", Exhibition.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Sales s = (Sales)xStream.fromXML(str);
        return s;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Sales si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto Sales.
     */
    public static Sales parseSales(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("sales", Sales.class);
        xStream.alias("ticket", Ticket.class);
        xStream.alias("client", Client.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("artist", Artist.class);
        xStream.alias("concert", Concert.class);
        xStream.alias("festival", Festival.class);
        xStream.alias("exhibition", Exhibition.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Sales s = (Sales)xStream.fromXML(f);
        return s;
        
    }
    
    /**
     * Parsea un string que contenga codigo XML y lo convierte
     * a un objeto Ticket si dicho código está bien escrito
     * @param str string con código XML
     * @return Un objeto Ticket.
     */
    public static Ticket parseTicket(String str){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("ticket", Ticket.class);
        xStream.alias("concert", Concert.class);
        xStream.alias("exhibition", Exhibition.class);
        xStream.alias("festival", Festival.class);
        xStream.alias("location", Location.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("artists", Artist.class);
        xStream.alias("collective", Collective.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Ticket t = (Ticket)xStream.fromXML(str);
        return t;
        
    }
    
    /**
     * Parsea un archivo que contenga codigo XML y lo convierte
     * a un objeto Ticket si dicho código está bien escrito
     * @param f fichero con código XML
     * @return Un objeto Ticket.
     */
    public static Ticket parseTicket(File f){
        
        // Creo el objeto xStream por el cual convertire el string en una
        // objeto de java
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("ticket", Ticket.class);
        xStream.alias("concert", Concert.class);
        xStream.alias("exhibition", Exhibition.class);
        xStream.alias("festival", Festival.class);
        xStream.alias("location", Location.class);
        xStream.alias("fechacompleta", FechaCompleta.class);
        xStream.alias("artists", Artist.class);
        xStream.alias("collective", Collective.class);
        // Habria que poner un try para controlar la XStreamException
        // si el objeto no puede ser deserializable
        Ticket t = (Ticket)xStream.fromXML(f);
        return t;
        
    }
    
}
