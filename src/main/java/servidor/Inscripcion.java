
package servidor;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inscripcion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inscripcion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fechaInscripcion" type="{http://servidor/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="cantidadDesportistas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="deportista" type="{http://servidor/}deportista" minOccurs="0"/&gt;
 *         &lt;element name="claseDeportiva" type="{http://servidor/}claseDeportiva" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inscripcion", propOrder = {
    "id",
    "fechaInscripcion",
    "cantidadDesportistas",
    "costo",
    "deportista",
    "claseDeportiva"
})
public class Inscripcion {

    protected int id;
    protected LocalDate fechaInscripcion;
    protected int cantidadDesportistas;
    protected int costo;
    protected Deportista deportista;
    protected ClaseDeportiva claseDeportiva;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the fechaInscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Sets the value of the fechaInscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setFechaInscripcion(LocalDate value) {
        this.fechaInscripcion = value;
    }

    /**
     * Gets the value of the cantidadDesportistas property.
     * 
     */
    public int getCantidadDesportistas() {
        return cantidadDesportistas;
    }

    /**
     * Sets the value of the cantidadDesportistas property.
     * 
     */
    public void setCantidadDesportistas(int value) {
        this.cantidadDesportistas = value;
    }

    /**
     * Gets the value of the costo property.
     * 
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Sets the value of the costo property.
     * 
     */
    public void setCosto(int value) {
        this.costo = value;
    }

    /**
     * Gets the value of the deportista property.
     * 
     * @return
     *     possible object is
     *     {@link Deportista }
     *     
     */
    public Deportista getDeportista() {
        return deportista;
    }

    /**
     * Sets the value of the deportista property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deportista }
     *     
     */
    public void setDeportista(Deportista value) {
        this.deportista = value;
    }

    /**
     * Gets the value of the claseDeportiva property.
     * 
     * @return
     *     possible object is
     *     {@link ClaseDeportiva }
     *     
     */
    public ClaseDeportiva getClaseDeportiva() {
        return claseDeportiva;
    }

    /**
     * Sets the value of the claseDeportiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaseDeportiva }
     *     
     */
    public void setClaseDeportiva(ClaseDeportiva value) {
        this.claseDeportiva = value;
    }

}
