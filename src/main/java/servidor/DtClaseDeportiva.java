
package servidor;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtClaseDeportiva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtClaseDeportiva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actividad" type="{http://servidor/}actividad" minOccurs="0"/&gt;
 *         &lt;element name="cupo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha" type="{http://servidor/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="fechaAlta" type="{http://servidor/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="fechaAltaString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora" type="{http://servidor/}localTime" minOccurs="0"/&gt;
 *         &lt;element name="horaString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inscripciones" type="{http://servidor/}inscripcion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtClaseDeportiva", propOrder = {
    "actividad",
    "cupo",
    "fecha",
    "fechaAlta",
    "fechaAltaString",
    "fechaString",
    "hora",
    "horaString",
    "id",
    "imagen",
    "inscripciones",
    "lugar",
    "nombre"
})
public class DtClaseDeportiva {

    protected Actividad actividad;
    protected int cupo;
    protected LocalDate fecha;
    protected LocalDate fechaAlta;
    protected String fechaAltaString;
    protected String fechaString;
    protected LocalTime hora;
    protected String horaString;
    protected int id;
    protected String imagen;
    @XmlElement(nillable = true)
    protected List<Inscripcion> inscripciones;
    protected String lugar;
    protected String nombre;

    /**
     * Gets the value of the actividad property.
     * 
     * @return
     *     possible object is
     *     {@link Actividad }
     *     
     */
    public Actividad getActividad() {
        return actividad;
    }

    /**
     * Sets the value of the actividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actividad }
     *     
     */
    public void setActividad(Actividad value) {
        this.actividad = value;
    }

    /**
     * Gets the value of the cupo property.
     * 
     */
    public int getCupo() {
        return cupo;
    }

    /**
     * Sets the value of the cupo property.
     * 
     */
    public void setCupo(int value) {
        this.cupo = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setFecha(LocalDate value) {
        this.fecha = value;
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
     * Gets the value of the fechaAltaString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAltaString() {
        return fechaAltaString;
    }

    /**
     * Sets the value of the fechaAltaString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAltaString(String value) {
        this.fechaAltaString = value;
    }

    /**
     * Gets the value of the fechaString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaString() {
        return fechaString;
    }

    /**
     * Sets the value of the fechaString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaString(String value) {
        this.fechaString = value;
    }

    /**
     * Gets the value of the hora property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTime }
     *     
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * Sets the value of the hora property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTime }
     *     
     */
    public void setHora(LocalTime value) {
        this.hora = value;
    }

    /**
     * Gets the value of the horaString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraString() {
        return horaString;
    }

    /**
     * Sets the value of the horaString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraString(String value) {
        this.horaString = value;
    }

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

}
