/*
 * This document is part of the lab material for the subject:
 * Gestion de Sistemas de Informacion
 * to be released at the
 * Universidad Publica de Navarra
 * during the first semester of the Academic Year 2015-2016
 */

package GSILabs.BModel;

import GSILabs.Serializable.XMLRepresentable;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;

/**
 * Información sobre artistas, este tipo de performers son asociados a cada 
 * concierto o exposición
 * @author subiza.79082
 * @author izu.78236
 * @version 03/10/2015
 */
public class Artist implements Performer, XMLRepresentable {
    
    private String name;
    private String workDescription;
    private String webSite = "-";
    
    /**
     * Primer método constructor, inicialización de variables para un artista
     * con página web
     * @param name Nombre artístico único
     * @param workDescription Descripción de su obra o trabajo
     * @param webSite Página web del artista, puede no tener
     */
    public Artist (String name, String workDescription, String webSite) {
        
        this.name = name;
        this.workDescription = workDescription;
        this.webSite = webSite;
        
    }
    
    /**
     * Segundo método constructor, inicialización de variables para un artista
     * sin página web
     * @param name Nombre artístico único
     * @param workDescription Descripción de su obra o trabajo
     */
    public Artist (String name, String workDescription) {
        
        this.name = name;
        this.workDescription = workDescription;
        
    }
    
    /**
     * Establecer nombre artístico
     * @param name Nombre artístico
     */
    public void setName (String name) {
        this.name = name;
    }
    
    /**
     * Obtener nombre artístico
     * @return Nombre artístico
     */
    @Override
    public String getName () {
        return name;
    }
    
    /**
     * Establecer descripción de su obra o trabajo
     * @param workDescription Descripción de su obra o trabajo
     */
    @Override
    public void setWorkDescription (String workDescription) {
        this.workDescription = workDescription;
    }
    
    /**
     * Obtener descripción de su obra o trabajo
     * @return Descripción de su obra o trabajo
     */
    @Override
    public String getWorkDescription () {
        return workDescription;
    }
    
    /**
     * Establecer página web
     * @param webSite Página web
     */
    public void setWebSite (String webSite) {
        this.webSite = webSite;
    }
    
    /**
     * Obtener página web
     * @return Página web
     */
    public String getWebSite () {
        return webSite;
    }
    
    /**
     * Comparación entre dos objetos Artista
     * @param o Objeto a comparar
     * @return True si tienen el mismo nombre. False en caso contrario
     */
    @Override
    public boolean equals (Object o) {
        
        if (o instanceof Artist) {
            Artist a = (Artist)o;
            return this.getName().equalsIgnoreCase(a.getName());
        }
        else return false;

    }
    
    /**
     * Representación por pantalla
     * @return Información a mostrar
     */
    @Override
    public String toString () {
        return "ARTIST\nName: " + name + "\nWork description: " + workDescription + 
                "\nWebsite: " + webSite + "\n";
    }

    @Override
    public String toXML() {
        // Creo el objeto xStream por el cual convertire la clase en un
        // datos en XML
        XStream xStream = new XStream(new DomDriver());
        // Cambio el alias de la clase en XML
        xStream.alias("artist", Artist.class);        
        String xml = xStream.toXML(this);        
        return xml;
    }

    @Override
    public boolean saveToXML(File f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean saveToXML(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
