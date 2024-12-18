
package servidor;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servidor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AltaActividad_QNAME = new QName("http://servidor/", "AltaActividad");
    private final static QName _AltaActividadResponse_QNAME = new QName("http://servidor/", "AltaActividadResponse");
    private final static QName _AltaClaseDeportiva_QNAME = new QName("http://servidor/", "AltaClaseDeportiva");
    private final static QName _AltaClaseDeportivaResponse_QNAME = new QName("http://servidor/", "AltaClaseDeportivaResponse");
    private final static QName _AltaUsuario_QNAME = new QName("http://servidor/", "AltaUsuario");
    private final static QName _AltaUsuarioResponse_QNAME = new QName("http://servidor/", "AltaUsuarioResponse");
    private final static QName _AltainscripcionAClase_QNAME = new QName("http://servidor/", "AltainscripcionAClase");
    private final static QName _AltainscripcionAClaseResponse_QNAME = new QName("http://servidor/", "AltainscripcionAClaseResponse");
    private final static QName _ClaseNoExisteException_QNAME = new QName("http://servidor/", "ClaseNoExisteException");
    private final static QName _ClaseRepetidoException_QNAME = new QName("http://servidor/", "ClaseRepetidoException");
    private final static QName _CuposDisponiblesEnClase_QNAME = new QName("http://servidor/", "CuposDisponiblesEnClase");
    private final static QName _CuposDisponiblesEnClaseResponse_QNAME = new QName("http://servidor/", "CuposDisponiblesEnClaseResponse");
    private final static QName _DeportistaEstaEnClase_QNAME = new QName("http://servidor/", "DeportistaEstaEnClase");
    private final static QName _DeportistaEstaEnClaseResponse_QNAME = new QName("http://servidor/", "DeportistaEstaEnClaseResponse");
    private final static QName _PersistenciaException_QNAME = new QName("http://servidor/", "PersistenciaException");
    private final static QName _Actividad_QNAME = new QName("http://servidor/", "actividad");
    private final static QName _ActividadExiste_QNAME = new QName("http://servidor/", "actividadExiste");
    private final static QName _ActividadExisteResponse_QNAME = new QName("http://servidor/", "actividadExisteResponse");
    private final static QName _ClaseDeportiva_QNAME = new QName("http://servidor/", "claseDeportiva");
    private final static QName _ClaseExiste_QNAME = new QName("http://servidor/", "claseExiste");
    private final static QName _ClaseExisteResponse_QNAME = new QName("http://servidor/", "claseExisteResponse");
    private final static QName _Deportista_QNAME = new QName("http://servidor/", "deportista");
    private final static QName _DtActividad_QNAME = new QName("http://servidor/", "dtActividad");
    private final static QName _DtEntrenador_QNAME = new QName("http://servidor/", "dtEntrenador");
    private final static QName _Entrenador_QNAME = new QName("http://servidor/", "entrenador");
    private final static QName _EsEntrenador_QNAME = new QName("http://servidor/", "esEntrenador");
    private final static QName _EsEntrenadorResponse_QNAME = new QName("http://servidor/", "esEntrenadorResponse");
    private final static QName _Inscripcion_QNAME = new QName("http://servidor/", "inscripcion");
    private final static QName _ModifiarUsuario_QNAME = new QName("http://servidor/", "modifiarUsuario");
    private final static QName _ModifiarUsuarioResponse_QNAME = new QName("http://servidor/", "modifiarUsuarioResponse");
    private final static QName _ObtenerActividad_QNAME = new QName("http://servidor/", "obtenerActividad");
    private final static QName _ObtenerActividadResponse_QNAME = new QName("http://servidor/", "obtenerActividadResponse");
    private final static QName _ObtenerArrayActividadesAceptadasEntrenador_QNAME = new QName("http://servidor/", "obtenerArrayActividadesAceptadasEntrenador");
    private final static QName _ObtenerArrayActividadesAceptadasEntrenadorResponse_QNAME = new QName("http://servidor/", "obtenerArrayActividadesAceptadasEntrenadorResponse");
    private final static QName _ObtenerArrayActividadesEntrenador_QNAME = new QName("http://servidor/", "obtenerArrayActividadesEntrenador");
    private final static QName _ObtenerArrayActividadesEntrenadorResponse_QNAME = new QName("http://servidor/", "obtenerArrayActividadesEntrenadorResponse");
    private final static QName _ObtenerClase_QNAME = new QName("http://servidor/", "obtenerClase");
    private final static QName _ObtenerClaseResponse_QNAME = new QName("http://servidor/", "obtenerClaseResponse");
    private final static QName _ObtenerClasesDeportista_QNAME = new QName("http://servidor/", "obtenerClasesDeportista");
    private final static QName _ObtenerClasesDeportistaResponse_QNAME = new QName("http://servidor/", "obtenerClasesDeportistaResponse");
    private final static QName _ObtenerDeportista_QNAME = new QName("http://servidor/", "obtenerDeportista");
    private final static QName _ObtenerDeportistaResponse_QNAME = new QName("http://servidor/", "obtenerDeportistaResponse");
    private final static QName _ObtenerEntrenador_QNAME = new QName("http://servidor/", "obtenerEntrenador");
    private final static QName _ObtenerEntrenadorResponse_QNAME = new QName("http://servidor/", "obtenerEntrenadorResponse");
    private final static QName _ObtenerInscrpcionesDeportista_QNAME = new QName("http://servidor/", "obtenerInscrpcionesDeportista");
    private final static QName _ObtenerInscrpcionesDeportistaResponse_QNAME = new QName("http://servidor/", "obtenerInscrpcionesDeportistaResponse");
    private final static QName _ObtenerListaInscripciones_QNAME = new QName("http://servidor/", "obtenerListaInscripciones");
    private final static QName _ObtenerListaInscripcionesResponse_QNAME = new QName("http://servidor/", "obtenerListaInscripcionesResponse");
    private final static QName _ObtenerNickname_QNAME = new QName("http://servidor/", "obtenerNickname");
    private final static QName _ObtenerNicknameResponse_QNAME = new QName("http://servidor/", "obtenerNicknameResponse");
    private final static QName _ObtenerVectorActividad_QNAME = new QName("http://servidor/", "obtenerVectorActividad");
    private final static QName _ObtenerVectorActividadResponse_QNAME = new QName("http://servidor/", "obtenerVectorActividadResponse");
    private final static QName _ObtenerVectorActividadesAceptadas_QNAME = new QName("http://servidor/", "obtenerVectorActividadesAceptadas");
    private final static QName _ObtenerVectorActividadesAceptadasEntrenador_QNAME = new QName("http://servidor/", "obtenerVectorActividadesAceptadasEntrenador");
    private final static QName _ObtenerVectorActividadesAceptadasEntrenadorResponse_QNAME = new QName("http://servidor/", "obtenerVectorActividadesAceptadasEntrenadorResponse");
    private final static QName _ObtenerVectorActividadesAceptadasResponse_QNAME = new QName("http://servidor/", "obtenerVectorActividadesAceptadasResponse");
    private final static QName _ObtenerVectorClases_QNAME = new QName("http://servidor/", "obtenerVectorClases");
    private final static QName _ObtenerVectorClasesActividad_QNAME = new QName("http://servidor/", "obtenerVectorClasesActividad");
    private final static QName _ObtenerVectorClasesActividadResponse_QNAME = new QName("http://servidor/", "obtenerVectorClasesActividadResponse");
    private final static QName _ObtenerVectorClasesResponse_QNAME = new QName("http://servidor/", "obtenerVectorClasesResponse");
    private final static QName _ObtenerVectorUsuarios_QNAME = new QName("http://servidor/", "obtenerVectorUsuarios");
    private final static QName _ObtenerVectorUsuariosResponse_QNAME = new QName("http://servidor/", "obtenerVectorUsuariosResponse");
    private final static QName _TraerPass_QNAME = new QName("http://servidor/", "traerPass");
    private final static QName _TraerPassResponse_QNAME = new QName("http://servidor/", "traerPassResponse");
    private final static QName _Usuario_QNAME = new QName("http://servidor/", "usuario");
    private final static QName _UsuarioExiste_QNAME = new QName("http://servidor/", "usuarioExiste");
    private final static QName _UsuarioExisteResponse_QNAME = new QName("http://servidor/", "usuarioExisteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servidor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AltaActividad }
     * 
     */
    public AltaActividad createAltaActividad() {
        return new AltaActividad();
    }

    /**
     * Create an instance of {@link AltaActividadResponse }
     * 
     */
    public AltaActividadResponse createAltaActividadResponse() {
        return new AltaActividadResponse();
    }

    /**
     * Create an instance of {@link AltaClaseDeportiva }
     * 
     */
    public AltaClaseDeportiva createAltaClaseDeportiva() {
        return new AltaClaseDeportiva();
    }

    /**
     * Create an instance of {@link AltaClaseDeportivaResponse }
     * 
     */
    public AltaClaseDeportivaResponse createAltaClaseDeportivaResponse() {
        return new AltaClaseDeportivaResponse();
    }

    /**
     * Create an instance of {@link AltaUsuario }
     * 
     */
    public AltaUsuario createAltaUsuario() {
        return new AltaUsuario();
    }

    /**
     * Create an instance of {@link AltaUsuarioResponse }
     * 
     */
    public AltaUsuarioResponse createAltaUsuarioResponse() {
        return new AltaUsuarioResponse();
    }

    /**
     * Create an instance of {@link AltainscripcionAClase }
     * 
     */
    public AltainscripcionAClase createAltainscripcionAClase() {
        return new AltainscripcionAClase();
    }

    /**
     * Create an instance of {@link AltainscripcionAClaseResponse }
     * 
     */
    public AltainscripcionAClaseResponse createAltainscripcionAClaseResponse() {
        return new AltainscripcionAClaseResponse();
    }

    /**
     * Create an instance of {@link ClaseNoExisteException }
     * 
     */
    public ClaseNoExisteException createClaseNoExisteException() {
        return new ClaseNoExisteException();
    }

    /**
     * Create an instance of {@link ClaseRepetidoException }
     * 
     */
    public ClaseRepetidoException createClaseRepetidoException() {
        return new ClaseRepetidoException();
    }

    /**
     * Create an instance of {@link CuposDisponiblesEnClase }
     * 
     */
    public CuposDisponiblesEnClase createCuposDisponiblesEnClase() {
        return new CuposDisponiblesEnClase();
    }

    /**
     * Create an instance of {@link CuposDisponiblesEnClaseResponse }
     * 
     */
    public CuposDisponiblesEnClaseResponse createCuposDisponiblesEnClaseResponse() {
        return new CuposDisponiblesEnClaseResponse();
    }

    /**
     * Create an instance of {@link DeportistaEstaEnClase }
     * 
     */
    public DeportistaEstaEnClase createDeportistaEstaEnClase() {
        return new DeportistaEstaEnClase();
    }

    /**
     * Create an instance of {@link DeportistaEstaEnClaseResponse }
     * 
     */
    public DeportistaEstaEnClaseResponse createDeportistaEstaEnClaseResponse() {
        return new DeportistaEstaEnClaseResponse();
    }

    /**
     * Create an instance of {@link PersistenciaException }
     * 
     */
    public PersistenciaException createPersistenciaException() {
        return new PersistenciaException();
    }

    /**
     * Create an instance of {@link Actividad }
     * 
     */
    public Actividad createActividad() {
        return new Actividad();
    }

    /**
     * Create an instance of {@link ActividadExiste }
     * 
     */
    public ActividadExiste createActividadExiste() {
        return new ActividadExiste();
    }

    /**
     * Create an instance of {@link ActividadExisteResponse }
     * 
     */
    public ActividadExisteResponse createActividadExisteResponse() {
        return new ActividadExisteResponse();
    }

    /**
     * Create an instance of {@link ClaseDeportiva }
     * 
     */
    public ClaseDeportiva createClaseDeportiva() {
        return new ClaseDeportiva();
    }

    /**
     * Create an instance of {@link ClaseExiste }
     * 
     */
    public ClaseExiste createClaseExiste() {
        return new ClaseExiste();
    }

    /**
     * Create an instance of {@link ClaseExisteResponse }
     * 
     */
    public ClaseExisteResponse createClaseExisteResponse() {
        return new ClaseExisteResponse();
    }

    /**
     * Create an instance of {@link Deportista }
     * 
     */
    public Deportista createDeportista() {
        return new Deportista();
    }

    /**
     * Create an instance of {@link DtActividad }
     * 
     */
    public DtActividad createDtActividad() {
        return new DtActividad();
    }

    /**
     * Create an instance of {@link DtEntrenador }
     * 
     */
    public DtEntrenador createDtEntrenador() {
        return new DtEntrenador();
    }

    /**
     * Create an instance of {@link Entrenador }
     * 
     */
    public Entrenador createEntrenador() {
        return new Entrenador();
    }

    /**
     * Create an instance of {@link EsEntrenador }
     * 
     */
    public EsEntrenador createEsEntrenador() {
        return new EsEntrenador();
    }

    /**
     * Create an instance of {@link EsEntrenadorResponse }
     * 
     */
    public EsEntrenadorResponse createEsEntrenadorResponse() {
        return new EsEntrenadorResponse();
    }

    /**
     * Create an instance of {@link Inscripcion }
     * 
     */
    public Inscripcion createInscripcion() {
        return new Inscripcion();
    }

    /**
     * Create an instance of {@link ModifiarUsuario }
     * 
     */
    public ModifiarUsuario createModifiarUsuario() {
        return new ModifiarUsuario();
    }

    /**
     * Create an instance of {@link ModifiarUsuarioResponse }
     * 
     */
    public ModifiarUsuarioResponse createModifiarUsuarioResponse() {
        return new ModifiarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerActividad }
     * 
     */
    public ObtenerActividad createObtenerActividad() {
        return new ObtenerActividad();
    }

    /**
     * Create an instance of {@link ObtenerActividadResponse }
     * 
     */
    public ObtenerActividadResponse createObtenerActividadResponse() {
        return new ObtenerActividadResponse();
    }

    /**
     * Create an instance of {@link ObtenerArrayActividadesAceptadasEntrenador }
     * 
     */
    public ObtenerArrayActividadesAceptadasEntrenador createObtenerArrayActividadesAceptadasEntrenador() {
        return new ObtenerArrayActividadesAceptadasEntrenador();
    }

    /**
     * Create an instance of {@link ObtenerArrayActividadesAceptadasEntrenadorResponse }
     * 
     */
    public ObtenerArrayActividadesAceptadasEntrenadorResponse createObtenerArrayActividadesAceptadasEntrenadorResponse() {
        return new ObtenerArrayActividadesAceptadasEntrenadorResponse();
    }

    /**
     * Create an instance of {@link ObtenerArrayActividadesEntrenador }
     * 
     */
    public ObtenerArrayActividadesEntrenador createObtenerArrayActividadesEntrenador() {
        return new ObtenerArrayActividadesEntrenador();
    }

    /**
     * Create an instance of {@link ObtenerArrayActividadesEntrenadorResponse }
     * 
     */
    public ObtenerArrayActividadesEntrenadorResponse createObtenerArrayActividadesEntrenadorResponse() {
        return new ObtenerArrayActividadesEntrenadorResponse();
    }

    /**
     * Create an instance of {@link ObtenerClase }
     * 
     */
    public ObtenerClase createObtenerClase() {
        return new ObtenerClase();
    }

    /**
     * Create an instance of {@link ObtenerClaseResponse }
     * 
     */
    public ObtenerClaseResponse createObtenerClaseResponse() {
        return new ObtenerClaseResponse();
    }

    /**
     * Create an instance of {@link ObtenerClasesDeportista }
     * 
     */
    public ObtenerClasesDeportista createObtenerClasesDeportista() {
        return new ObtenerClasesDeportista();
    }

    /**
     * Create an instance of {@link ObtenerClasesDeportistaResponse }
     * 
     */
    public ObtenerClasesDeportistaResponse createObtenerClasesDeportistaResponse() {
        return new ObtenerClasesDeportistaResponse();
    }

    /**
     * Create an instance of {@link ObtenerDeportista }
     * 
     */
    public ObtenerDeportista createObtenerDeportista() {
        return new ObtenerDeportista();
    }

    /**
     * Create an instance of {@link ObtenerDeportistaResponse }
     * 
     */
    public ObtenerDeportistaResponse createObtenerDeportistaResponse() {
        return new ObtenerDeportistaResponse();
    }

    /**
     * Create an instance of {@link ObtenerEntrenador }
     * 
     */
    public ObtenerEntrenador createObtenerEntrenador() {
        return new ObtenerEntrenador();
    }

    /**
     * Create an instance of {@link ObtenerEntrenadorResponse }
     * 
     */
    public ObtenerEntrenadorResponse createObtenerEntrenadorResponse() {
        return new ObtenerEntrenadorResponse();
    }

    /**
     * Create an instance of {@link ObtenerInscrpcionesDeportista }
     * 
     */
    public ObtenerInscrpcionesDeportista createObtenerInscrpcionesDeportista() {
        return new ObtenerInscrpcionesDeportista();
    }

    /**
     * Create an instance of {@link ObtenerInscrpcionesDeportistaResponse }
     * 
     */
    public ObtenerInscrpcionesDeportistaResponse createObtenerInscrpcionesDeportistaResponse() {
        return new ObtenerInscrpcionesDeportistaResponse();
    }

    /**
     * Create an instance of {@link ObtenerListaInscripciones }
     * 
     */
    public ObtenerListaInscripciones createObtenerListaInscripciones() {
        return new ObtenerListaInscripciones();
    }

    /**
     * Create an instance of {@link ObtenerListaInscripcionesResponse }
     * 
     */
    public ObtenerListaInscripcionesResponse createObtenerListaInscripcionesResponse() {
        return new ObtenerListaInscripcionesResponse();
    }

    /**
     * Create an instance of {@link ObtenerNickname }
     * 
     */
    public ObtenerNickname createObtenerNickname() {
        return new ObtenerNickname();
    }

    /**
     * Create an instance of {@link ObtenerNicknameResponse }
     * 
     */
    public ObtenerNicknameResponse createObtenerNicknameResponse() {
        return new ObtenerNicknameResponse();
    }

    /**
     * Create an instance of {@link ObtenerVectorActividad }
     * 
     */
    public ObtenerVectorActividad createObtenerVectorActividad() {
        return new ObtenerVectorActividad();
    }

    /**
     * Create an instance of {@link ObtenerVectorActividadResponse }
     * 
     */
    public ObtenerVectorActividadResponse createObtenerVectorActividadResponse() {
        return new ObtenerVectorActividadResponse();
    }

    /**
     * Create an instance of {@link ObtenerVectorActividadesAceptadas }
     * 
     */
    public ObtenerVectorActividadesAceptadas createObtenerVectorActividadesAceptadas() {
        return new ObtenerVectorActividadesAceptadas();
    }

    /**
     * Create an instance of {@link ObtenerVectorActividadesAceptadasEntrenador }
     * 
     */
    public ObtenerVectorActividadesAceptadasEntrenador createObtenerVectorActividadesAceptadasEntrenador() {
        return new ObtenerVectorActividadesAceptadasEntrenador();
    }

    /**
     * Create an instance of {@link ObtenerVectorActividadesAceptadasEntrenadorResponse }
     * 
     */
    public ObtenerVectorActividadesAceptadasEntrenadorResponse createObtenerVectorActividadesAceptadasEntrenadorResponse() {
        return new ObtenerVectorActividadesAceptadasEntrenadorResponse();
    }

    /**
     * Create an instance of {@link ObtenerVectorActividadesAceptadasResponse }
     * 
     */
    public ObtenerVectorActividadesAceptadasResponse createObtenerVectorActividadesAceptadasResponse() {
        return new ObtenerVectorActividadesAceptadasResponse();
    }

    /**
     * Create an instance of {@link ObtenerVectorClases }
     * 
     */
    public ObtenerVectorClases createObtenerVectorClases() {
        return new ObtenerVectorClases();
    }

    /**
     * Create an instance of {@link ObtenerVectorClasesActividad }
     * 
     */
    public ObtenerVectorClasesActividad createObtenerVectorClasesActividad() {
        return new ObtenerVectorClasesActividad();
    }

    /**
     * Create an instance of {@link ObtenerVectorClasesActividadResponse }
     * 
     */
    public ObtenerVectorClasesActividadResponse createObtenerVectorClasesActividadResponse() {
        return new ObtenerVectorClasesActividadResponse();
    }

    /**
     * Create an instance of {@link ObtenerVectorClasesResponse }
     * 
     */
    public ObtenerVectorClasesResponse createObtenerVectorClasesResponse() {
        return new ObtenerVectorClasesResponse();
    }

    /**
     * Create an instance of {@link ObtenerVectorUsuarios }
     * 
     */
    public ObtenerVectorUsuarios createObtenerVectorUsuarios() {
        return new ObtenerVectorUsuarios();
    }

    /**
     * Create an instance of {@link ObtenerVectorUsuariosResponse }
     * 
     */
    public ObtenerVectorUsuariosResponse createObtenerVectorUsuariosResponse() {
        return new ObtenerVectorUsuariosResponse();
    }

    /**
     * Create an instance of {@link TraerPass }
     * 
     */
    public TraerPass createTraerPass() {
        return new TraerPass();
    }

    /**
     * Create an instance of {@link TraerPassResponse }
     * 
     */
    public TraerPassResponse createTraerPassResponse() {
        return new TraerPassResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link UsuarioExiste }
     * 
     */
    public UsuarioExiste createUsuarioExiste() {
        return new UsuarioExiste();
    }

    /**
     * Create an instance of {@link UsuarioExisteResponse }
     * 
     */
    public UsuarioExisteResponse createUsuarioExisteResponse() {
        return new UsuarioExisteResponse();
    }

    /**
     * Create an instance of {@link DtDeportista }
     * 
     */
    public DtDeportista createDtDeportista() {
        return new DtDeportista();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link LocalTime }
     * 
     */
    public LocalTime createLocalTime() {
        return new LocalTime();
    }

    /**
     * Create an instance of {@link DtClaseDeportiva }
     * 
     */
    public DtClaseDeportiva createDtClaseDeportiva() {
        return new DtClaseDeportiva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaActividad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaActividad }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "AltaActividad")
    public JAXBElement<AltaActividad> createAltaActividad(AltaActividad value) {
        return new JAXBElement<AltaActividad>(_AltaActividad_QNAME, AltaActividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaActividadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaActividadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "AltaActividadResponse")
    public JAXBElement<AltaActividadResponse> createAltaActividadResponse(AltaActividadResponse value) {
        return new JAXBElement<AltaActividadResponse>(_AltaActividadResponse_QNAME, AltaActividadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaClaseDeportiva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaClaseDeportiva }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "AltaClaseDeportiva")
    public JAXBElement<AltaClaseDeportiva> createAltaClaseDeportiva(AltaClaseDeportiva value) {
        return new JAXBElement<AltaClaseDeportiva>(_AltaClaseDeportiva_QNAME, AltaClaseDeportiva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaClaseDeportivaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaClaseDeportivaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "AltaClaseDeportivaResponse")
    public JAXBElement<AltaClaseDeportivaResponse> createAltaClaseDeportivaResponse(AltaClaseDeportivaResponse value) {
        return new JAXBElement<AltaClaseDeportivaResponse>(_AltaClaseDeportivaResponse_QNAME, AltaClaseDeportivaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "AltaUsuario")
    public JAXBElement<AltaUsuario> createAltaUsuario(AltaUsuario value) {
        return new JAXBElement<AltaUsuario>(_AltaUsuario_QNAME, AltaUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "AltaUsuarioResponse")
    public JAXBElement<AltaUsuarioResponse> createAltaUsuarioResponse(AltaUsuarioResponse value) {
        return new JAXBElement<AltaUsuarioResponse>(_AltaUsuarioResponse_QNAME, AltaUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltainscripcionAClase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltainscripcionAClase }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "AltainscripcionAClase")
    public JAXBElement<AltainscripcionAClase> createAltainscripcionAClase(AltainscripcionAClase value) {
        return new JAXBElement<AltainscripcionAClase>(_AltainscripcionAClase_QNAME, AltainscripcionAClase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltainscripcionAClaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltainscripcionAClaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "AltainscripcionAClaseResponse")
    public JAXBElement<AltainscripcionAClaseResponse> createAltainscripcionAClaseResponse(AltainscripcionAClaseResponse value) {
        return new JAXBElement<AltainscripcionAClaseResponse>(_AltainscripcionAClaseResponse_QNAME, AltainscripcionAClaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaseNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaseNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "ClaseNoExisteException")
    public JAXBElement<ClaseNoExisteException> createClaseNoExisteException(ClaseNoExisteException value) {
        return new JAXBElement<ClaseNoExisteException>(_ClaseNoExisteException_QNAME, ClaseNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaseRepetidoException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaseRepetidoException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "ClaseRepetidoException")
    public JAXBElement<ClaseRepetidoException> createClaseRepetidoException(ClaseRepetidoException value) {
        return new JAXBElement<ClaseRepetidoException>(_ClaseRepetidoException_QNAME, ClaseRepetidoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuposDisponiblesEnClase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CuposDisponiblesEnClase }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "CuposDisponiblesEnClase")
    public JAXBElement<CuposDisponiblesEnClase> createCuposDisponiblesEnClase(CuposDisponiblesEnClase value) {
        return new JAXBElement<CuposDisponiblesEnClase>(_CuposDisponiblesEnClase_QNAME, CuposDisponiblesEnClase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuposDisponiblesEnClaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CuposDisponiblesEnClaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "CuposDisponiblesEnClaseResponse")
    public JAXBElement<CuposDisponiblesEnClaseResponse> createCuposDisponiblesEnClaseResponse(CuposDisponiblesEnClaseResponse value) {
        return new JAXBElement<CuposDisponiblesEnClaseResponse>(_CuposDisponiblesEnClaseResponse_QNAME, CuposDisponiblesEnClaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeportistaEstaEnClase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeportistaEstaEnClase }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "DeportistaEstaEnClase")
    public JAXBElement<DeportistaEstaEnClase> createDeportistaEstaEnClase(DeportistaEstaEnClase value) {
        return new JAXBElement<DeportistaEstaEnClase>(_DeportistaEstaEnClase_QNAME, DeportistaEstaEnClase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeportistaEstaEnClaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeportistaEstaEnClaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "DeportistaEstaEnClaseResponse")
    public JAXBElement<DeportistaEstaEnClaseResponse> createDeportistaEstaEnClaseResponse(DeportistaEstaEnClaseResponse value) {
        return new JAXBElement<DeportistaEstaEnClaseResponse>(_DeportistaEstaEnClaseResponse_QNAME, DeportistaEstaEnClaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistenciaException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersistenciaException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "PersistenciaException")
    public JAXBElement<PersistenciaException> createPersistenciaException(PersistenciaException value) {
        return new JAXBElement<PersistenciaException>(_PersistenciaException_QNAME, PersistenciaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actividad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Actividad }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "actividad")
    public JAXBElement<Actividad> createActividad(Actividad value) {
        return new JAXBElement<Actividad>(_Actividad_QNAME, Actividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActividadExiste }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActividadExiste }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "actividadExiste")
    public JAXBElement<ActividadExiste> createActividadExiste(ActividadExiste value) {
        return new JAXBElement<ActividadExiste>(_ActividadExiste_QNAME, ActividadExiste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActividadExisteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActividadExisteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "actividadExisteResponse")
    public JAXBElement<ActividadExisteResponse> createActividadExisteResponse(ActividadExisteResponse value) {
        return new JAXBElement<ActividadExisteResponse>(_ActividadExisteResponse_QNAME, ActividadExisteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaseDeportiva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaseDeportiva }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "claseDeportiva")
    public JAXBElement<ClaseDeportiva> createClaseDeportiva(ClaseDeportiva value) {
        return new JAXBElement<ClaseDeportiva>(_ClaseDeportiva_QNAME, ClaseDeportiva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaseExiste }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaseExiste }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "claseExiste")
    public JAXBElement<ClaseExiste> createClaseExiste(ClaseExiste value) {
        return new JAXBElement<ClaseExiste>(_ClaseExiste_QNAME, ClaseExiste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaseExisteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaseExisteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "claseExisteResponse")
    public JAXBElement<ClaseExisteResponse> createClaseExisteResponse(ClaseExisteResponse value) {
        return new JAXBElement<ClaseExisteResponse>(_ClaseExisteResponse_QNAME, ClaseExisteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deportista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Deportista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "deportista")
    public JAXBElement<Deportista> createDeportista(Deportista value) {
        return new JAXBElement<Deportista>(_Deportista_QNAME, Deportista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtActividad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DtActividad }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "dtActividad")
    public JAXBElement<DtActividad> createDtActividad(DtActividad value) {
        return new JAXBElement<DtActividad>(_DtActividad_QNAME, DtActividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtEntrenador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DtEntrenador }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "dtEntrenador")
    public JAXBElement<DtEntrenador> createDtEntrenador(DtEntrenador value) {
        return new JAXBElement<DtEntrenador>(_DtEntrenador_QNAME, DtEntrenador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entrenador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entrenador }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "entrenador")
    public JAXBElement<Entrenador> createEntrenador(Entrenador value) {
        return new JAXBElement<Entrenador>(_Entrenador_QNAME, Entrenador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsEntrenador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsEntrenador }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "esEntrenador")
    public JAXBElement<EsEntrenador> createEsEntrenador(EsEntrenador value) {
        return new JAXBElement<EsEntrenador>(_EsEntrenador_QNAME, EsEntrenador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsEntrenadorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsEntrenadorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "esEntrenadorResponse")
    public JAXBElement<EsEntrenadorResponse> createEsEntrenadorResponse(EsEntrenadorResponse value) {
        return new JAXBElement<EsEntrenadorResponse>(_EsEntrenadorResponse_QNAME, EsEntrenadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inscripcion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Inscripcion }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "inscripcion")
    public JAXBElement<Inscripcion> createInscripcion(Inscripcion value) {
        return new JAXBElement<Inscripcion>(_Inscripcion_QNAME, Inscripcion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifiarUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifiarUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "modifiarUsuario")
    public JAXBElement<ModifiarUsuario> createModifiarUsuario(ModifiarUsuario value) {
        return new JAXBElement<ModifiarUsuario>(_ModifiarUsuario_QNAME, ModifiarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifiarUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifiarUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "modifiarUsuarioResponse")
    public JAXBElement<ModifiarUsuarioResponse> createModifiarUsuarioResponse(ModifiarUsuarioResponse value) {
        return new JAXBElement<ModifiarUsuarioResponse>(_ModifiarUsuarioResponse_QNAME, ModifiarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerActividad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerActividad }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerActividad")
    public JAXBElement<ObtenerActividad> createObtenerActividad(ObtenerActividad value) {
        return new JAXBElement<ObtenerActividad>(_ObtenerActividad_QNAME, ObtenerActividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerActividadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerActividadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerActividadResponse")
    public JAXBElement<ObtenerActividadResponse> createObtenerActividadResponse(ObtenerActividadResponse value) {
        return new JAXBElement<ObtenerActividadResponse>(_ObtenerActividadResponse_QNAME, ObtenerActividadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerArrayActividadesAceptadasEntrenador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerArrayActividadesAceptadasEntrenador }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerArrayActividadesAceptadasEntrenador")
    public JAXBElement<ObtenerArrayActividadesAceptadasEntrenador> createObtenerArrayActividadesAceptadasEntrenador(ObtenerArrayActividadesAceptadasEntrenador value) {
        return new JAXBElement<ObtenerArrayActividadesAceptadasEntrenador>(_ObtenerArrayActividadesAceptadasEntrenador_QNAME, ObtenerArrayActividadesAceptadasEntrenador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerArrayActividadesAceptadasEntrenadorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerArrayActividadesAceptadasEntrenadorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerArrayActividadesAceptadasEntrenadorResponse")
    public JAXBElement<ObtenerArrayActividadesAceptadasEntrenadorResponse> createObtenerArrayActividadesAceptadasEntrenadorResponse(ObtenerArrayActividadesAceptadasEntrenadorResponse value) {
        return new JAXBElement<ObtenerArrayActividadesAceptadasEntrenadorResponse>(_ObtenerArrayActividadesAceptadasEntrenadorResponse_QNAME, ObtenerArrayActividadesAceptadasEntrenadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerArrayActividadesEntrenador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerArrayActividadesEntrenador }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerArrayActividadesEntrenador")
    public JAXBElement<ObtenerArrayActividadesEntrenador> createObtenerArrayActividadesEntrenador(ObtenerArrayActividadesEntrenador value) {
        return new JAXBElement<ObtenerArrayActividadesEntrenador>(_ObtenerArrayActividadesEntrenador_QNAME, ObtenerArrayActividadesEntrenador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerArrayActividadesEntrenadorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerArrayActividadesEntrenadorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerArrayActividadesEntrenadorResponse")
    public JAXBElement<ObtenerArrayActividadesEntrenadorResponse> createObtenerArrayActividadesEntrenadorResponse(ObtenerArrayActividadesEntrenadorResponse value) {
        return new JAXBElement<ObtenerArrayActividadesEntrenadorResponse>(_ObtenerArrayActividadesEntrenadorResponse_QNAME, ObtenerArrayActividadesEntrenadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClase }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerClase")
    public JAXBElement<ObtenerClase> createObtenerClase(ObtenerClase value) {
        return new JAXBElement<ObtenerClase>(_ObtenerClase_QNAME, ObtenerClase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerClaseResponse")
    public JAXBElement<ObtenerClaseResponse> createObtenerClaseResponse(ObtenerClaseResponse value) {
        return new JAXBElement<ObtenerClaseResponse>(_ObtenerClaseResponse_QNAME, ObtenerClaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClasesDeportista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClasesDeportista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerClasesDeportista")
    public JAXBElement<ObtenerClasesDeportista> createObtenerClasesDeportista(ObtenerClasesDeportista value) {
        return new JAXBElement<ObtenerClasesDeportista>(_ObtenerClasesDeportista_QNAME, ObtenerClasesDeportista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClasesDeportistaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClasesDeportistaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerClasesDeportistaResponse")
    public JAXBElement<ObtenerClasesDeportistaResponse> createObtenerClasesDeportistaResponse(ObtenerClasesDeportistaResponse value) {
        return new JAXBElement<ObtenerClasesDeportistaResponse>(_ObtenerClasesDeportistaResponse_QNAME, ObtenerClasesDeportistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDeportista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDeportista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerDeportista")
    public JAXBElement<ObtenerDeportista> createObtenerDeportista(ObtenerDeportista value) {
        return new JAXBElement<ObtenerDeportista>(_ObtenerDeportista_QNAME, ObtenerDeportista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDeportistaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDeportistaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerDeportistaResponse")
    public JAXBElement<ObtenerDeportistaResponse> createObtenerDeportistaResponse(ObtenerDeportistaResponse value) {
        return new JAXBElement<ObtenerDeportistaResponse>(_ObtenerDeportistaResponse_QNAME, ObtenerDeportistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEntrenador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEntrenador }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerEntrenador")
    public JAXBElement<ObtenerEntrenador> createObtenerEntrenador(ObtenerEntrenador value) {
        return new JAXBElement<ObtenerEntrenador>(_ObtenerEntrenador_QNAME, ObtenerEntrenador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEntrenadorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEntrenadorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerEntrenadorResponse")
    public JAXBElement<ObtenerEntrenadorResponse> createObtenerEntrenadorResponse(ObtenerEntrenadorResponse value) {
        return new JAXBElement<ObtenerEntrenadorResponse>(_ObtenerEntrenadorResponse_QNAME, ObtenerEntrenadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInscrpcionesDeportista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerInscrpcionesDeportista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerInscrpcionesDeportista")
    public JAXBElement<ObtenerInscrpcionesDeportista> createObtenerInscrpcionesDeportista(ObtenerInscrpcionesDeportista value) {
        return new JAXBElement<ObtenerInscrpcionesDeportista>(_ObtenerInscrpcionesDeportista_QNAME, ObtenerInscrpcionesDeportista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInscrpcionesDeportistaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerInscrpcionesDeportistaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerInscrpcionesDeportistaResponse")
    public JAXBElement<ObtenerInscrpcionesDeportistaResponse> createObtenerInscrpcionesDeportistaResponse(ObtenerInscrpcionesDeportistaResponse value) {
        return new JAXBElement<ObtenerInscrpcionesDeportistaResponse>(_ObtenerInscrpcionesDeportistaResponse_QNAME, ObtenerInscrpcionesDeportistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaInscripciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaInscripciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerListaInscripciones")
    public JAXBElement<ObtenerListaInscripciones> createObtenerListaInscripciones(ObtenerListaInscripciones value) {
        return new JAXBElement<ObtenerListaInscripciones>(_ObtenerListaInscripciones_QNAME, ObtenerListaInscripciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaInscripcionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaInscripcionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerListaInscripcionesResponse")
    public JAXBElement<ObtenerListaInscripcionesResponse> createObtenerListaInscripcionesResponse(ObtenerListaInscripcionesResponse value) {
        return new JAXBElement<ObtenerListaInscripcionesResponse>(_ObtenerListaInscripcionesResponse_QNAME, ObtenerListaInscripcionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNickname }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerNickname }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerNickname")
    public JAXBElement<ObtenerNickname> createObtenerNickname(ObtenerNickname value) {
        return new JAXBElement<ObtenerNickname>(_ObtenerNickname_QNAME, ObtenerNickname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNicknameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerNicknameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerNicknameResponse")
    public JAXBElement<ObtenerNicknameResponse> createObtenerNicknameResponse(ObtenerNicknameResponse value) {
        return new JAXBElement<ObtenerNicknameResponse>(_ObtenerNicknameResponse_QNAME, ObtenerNicknameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividad }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorActividad")
    public JAXBElement<ObtenerVectorActividad> createObtenerVectorActividad(ObtenerVectorActividad value) {
        return new JAXBElement<ObtenerVectorActividad>(_ObtenerVectorActividad_QNAME, ObtenerVectorActividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorActividadResponse")
    public JAXBElement<ObtenerVectorActividadResponse> createObtenerVectorActividadResponse(ObtenerVectorActividadResponse value) {
        return new JAXBElement<ObtenerVectorActividadResponse>(_ObtenerVectorActividadResponse_QNAME, ObtenerVectorActividadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadesAceptadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadesAceptadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorActividadesAceptadas")
    public JAXBElement<ObtenerVectorActividadesAceptadas> createObtenerVectorActividadesAceptadas(ObtenerVectorActividadesAceptadas value) {
        return new JAXBElement<ObtenerVectorActividadesAceptadas>(_ObtenerVectorActividadesAceptadas_QNAME, ObtenerVectorActividadesAceptadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadesAceptadasEntrenador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadesAceptadasEntrenador }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorActividadesAceptadasEntrenador")
    public JAXBElement<ObtenerVectorActividadesAceptadasEntrenador> createObtenerVectorActividadesAceptadasEntrenador(ObtenerVectorActividadesAceptadasEntrenador value) {
        return new JAXBElement<ObtenerVectorActividadesAceptadasEntrenador>(_ObtenerVectorActividadesAceptadasEntrenador_QNAME, ObtenerVectorActividadesAceptadasEntrenador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadesAceptadasEntrenadorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadesAceptadasEntrenadorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorActividadesAceptadasEntrenadorResponse")
    public JAXBElement<ObtenerVectorActividadesAceptadasEntrenadorResponse> createObtenerVectorActividadesAceptadasEntrenadorResponse(ObtenerVectorActividadesAceptadasEntrenadorResponse value) {
        return new JAXBElement<ObtenerVectorActividadesAceptadasEntrenadorResponse>(_ObtenerVectorActividadesAceptadasEntrenadorResponse_QNAME, ObtenerVectorActividadesAceptadasEntrenadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadesAceptadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorActividadesAceptadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorActividadesAceptadasResponse")
    public JAXBElement<ObtenerVectorActividadesAceptadasResponse> createObtenerVectorActividadesAceptadasResponse(ObtenerVectorActividadesAceptadasResponse value) {
        return new JAXBElement<ObtenerVectorActividadesAceptadasResponse>(_ObtenerVectorActividadesAceptadasResponse_QNAME, ObtenerVectorActividadesAceptadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorClases }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorClases }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorClases")
    public JAXBElement<ObtenerVectorClases> createObtenerVectorClases(ObtenerVectorClases value) {
        return new JAXBElement<ObtenerVectorClases>(_ObtenerVectorClases_QNAME, ObtenerVectorClases.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorClasesActividad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorClasesActividad }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorClasesActividad")
    public JAXBElement<ObtenerVectorClasesActividad> createObtenerVectorClasesActividad(ObtenerVectorClasesActividad value) {
        return new JAXBElement<ObtenerVectorClasesActividad>(_ObtenerVectorClasesActividad_QNAME, ObtenerVectorClasesActividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorClasesActividadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorClasesActividadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorClasesActividadResponse")
    public JAXBElement<ObtenerVectorClasesActividadResponse> createObtenerVectorClasesActividadResponse(ObtenerVectorClasesActividadResponse value) {
        return new JAXBElement<ObtenerVectorClasesActividadResponse>(_ObtenerVectorClasesActividadResponse_QNAME, ObtenerVectorClasesActividadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorClasesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorClasesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorClasesResponse")
    public JAXBElement<ObtenerVectorClasesResponse> createObtenerVectorClasesResponse(ObtenerVectorClasesResponse value) {
        return new JAXBElement<ObtenerVectorClasesResponse>(_ObtenerVectorClasesResponse_QNAME, ObtenerVectorClasesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorUsuarios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorUsuarios }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorUsuarios")
    public JAXBElement<ObtenerVectorUsuarios> createObtenerVectorUsuarios(ObtenerVectorUsuarios value) {
        return new JAXBElement<ObtenerVectorUsuarios>(_ObtenerVectorUsuarios_QNAME, ObtenerVectorUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVectorUsuariosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerVectorUsuariosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "obtenerVectorUsuariosResponse")
    public JAXBElement<ObtenerVectorUsuariosResponse> createObtenerVectorUsuariosResponse(ObtenerVectorUsuariosResponse value) {
        return new JAXBElement<ObtenerVectorUsuariosResponse>(_ObtenerVectorUsuariosResponse_QNAME, ObtenerVectorUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerPass }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerPass }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "traerPass")
    public JAXBElement<TraerPass> createTraerPass(TraerPass value) {
        return new JAXBElement<TraerPass>(_TraerPass_QNAME, TraerPass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerPassResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerPassResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "traerPassResponse")
    public JAXBElement<TraerPassResponse> createTraerPassResponse(TraerPassResponse value) {
        return new JAXBElement<TraerPassResponse>(_TraerPassResponse_QNAME, TraerPassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioExiste }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioExiste }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "usuarioExiste")
    public JAXBElement<UsuarioExiste> createUsuarioExiste(UsuarioExiste value) {
        return new JAXBElement<UsuarioExiste>(_UsuarioExiste_QNAME, UsuarioExiste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioExisteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioExisteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servidor/", name = "usuarioExisteResponse")
    public JAXBElement<UsuarioExisteResponse> createUsuarioExisteResponse(UsuarioExisteResponse value) {
        return new JAXBElement<UsuarioExisteResponse>(_UsuarioExisteResponse_QNAME, UsuarioExisteResponse.class, null, value);
    }

}
