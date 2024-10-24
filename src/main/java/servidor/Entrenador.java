
package servidor;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entrenador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entrenador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servidor/}usuario"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sitioWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actividades" type="{http://servidor/}actividad" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrenador", propOrder = {
    "disciplina",
    "sitioWeb",
    "actividades"
})
public class Entrenador
    extends Usuario
{

    protected String disciplina;
    protected String sitioWeb;
    @XmlElement(nillable = true)
    protected List<Actividad> actividades;

    /**
     * Gets the value of the disciplina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Sets the value of the disciplina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplina(String value) {
        this.disciplina = value;
    }

    /**
     * Gets the value of the sitioWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitioWeb() {
        return sitioWeb;
    }

    /**
     * Sets the value of the sitioWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitioWeb(String value) {
        this.sitioWeb = value;
    }

    /**
     * Gets the value of the actividades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actividades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActividades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actividad }
     * 
     * 
     */
    public List<Actividad> getActividades() {
        if (actividades == null) {
            actividades = new ArrayList<Actividad>();
        }
        return this.actividades;
    }

}
