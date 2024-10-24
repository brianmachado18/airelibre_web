
package servidor;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actividad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actividad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duracionHoras" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaAlta" type="{http://servidor/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entrenador" type="{http://servidor/}entrenador" minOccurs="0"/&gt;
 *         &lt;element name="clasesDeportivas" type="{http://servidor/}claseDeportiva" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actividad", propOrder = {
    "id",
    "nombre",
    "descripcion",
    "duracionHoras",
    "costo",
    "lugar",
    "fechaAlta",
    "estado",
    "imagen",
    "entrenador",
    "clasesDeportivas"
})
public class Actividad {

    protected int id;
    protected String nombre;
    protected String descripcion;
    protected int duracionHoras;
    protected int costo;
    protected String lugar;
    protected LocalDate fechaAlta;
    protected String estado;
    protected String imagen;
    protected Entrenador entrenador;
    @XmlElement(nillable = true)
    protected List<ClaseDeportiva> clasesDeportivas;

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
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the duracionHoras property.
     * 
     */
    public int getDuracionHoras() {
        return duracionHoras;
    }

    /**
     * Sets the value of the duracionHoras property.
     * 
     */
    public void setDuracionHoras(int value) {
        this.duracionHoras = value;
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
     * Gets the value of the lugar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Sets the value of the lugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

    /**
     * Gets the value of the fechaAlta property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Sets the value of the fechaAlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setFechaAlta(LocalDate value) {
        this.fechaAlta = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the imagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Sets the value of the imagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Gets the value of the entrenador property.
     * 
     * @return
     *     possible object is
     *     {@link Entrenador }
     *     
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Sets the value of the entrenador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entrenador }
     *     
     */
    public void setEntrenador(Entrenador value) {
        this.entrenador = value;
    }

    /**
     * Gets the value of the clasesDeportivas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clasesDeportivas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasesDeportivas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseDeportiva }
     * 
     * 
     */
    public List<ClaseDeportiva> getClasesDeportivas() {
        if (clasesDeportivas == null) {
            clasesDeportivas = new ArrayList<ClaseDeportiva>();
        }
        return this.clasesDeportivas;
    }

}
