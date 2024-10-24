
package servidor;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deportista complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deportista"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servidor/}usuario"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esProfesional" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inscripciones" type="{http://servidor/}inscripcion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deportista", propOrder = {
    "esProfesional",
    "inscripciones"
})
public class Deportista
    extends Usuario
{

    protected boolean esProfesional;
    @XmlElement(nillable = true)
    protected List<Inscripcion> inscripciones;

    /**
     * Gets the value of the esProfesional property.
     * 
     */
    public boolean isEsProfesional() {
        return esProfesional;
    }

    /**
     * Sets the value of the esProfesional property.
     * 
     */
    public void setEsProfesional(boolean value) {
        this.esProfesional = value;
    }

    /**
     * Gets the value of the inscripciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inscripciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInscripciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inscripcion }
     * 
     * 
     */
    public List<Inscripcion> getInscripciones() {
        if (inscripciones == null) {
            inscripciones = new ArrayList<Inscripcion>();
        }
        return this.inscripciones;
    }

}
