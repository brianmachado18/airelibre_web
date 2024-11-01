
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
    private final static QName _AltaUsuario_QNAME = new QName("http://servidor/", "AltaUsuario");
    private final static QName _AltaUsuarioResponse_QNAME = new QName("http://servidor/", "AltaUsuarioResponse");
    private final static QName _PersistenciaException_QNAME = new QName("http://servidor/", "PersistenciaException");
    private final static QName _Actividad_QNAME = new QName("http://servidor/", "actividad");
    private final static QName _ActividadExiste_QNAME = new QName("http://servidor/", "actividadExiste");
    private final static QName _ActividadExisteResponse_QNAME = new QName("http://servidor/", "actividadExisteResponse");
    private final static QName _ClaseDeportiva_QNAME = new QName("http://servidor/", "claseDeportiva");
    private final static QName _Deportista_QNAME = new QName("http://servidor/", "deportista");
    private final static QName _Entrenador_QNAME = new QName("http://servidor/", "entrenador");
    private final static QName _EsEntrenador_QNAME = new QName("http://servidor/", "esEntrenador");
    private final static QName _EsEntrenadorResponse_QNAME = new QName("http://servidor/", "esEntrenadorResponse");
    private final static QName _Inscripcion_QNAME = new QName("http://servidor/", "inscripcion");
    private final static QName _ModifiarUsuario_QNAME = new QName("http://servidor/", "modifiarUsuario");
    private final static QName _ModifiarUsuarioResponse_QNAME = new QName("http://servidor/", "modifiarUsuarioResponse");
    private final static QName _ObtenerDeportista_QNAME = new QName("http://servidor/", "obtenerDeportista");
    private final static QName _ObtenerDeportistaResponse_QNAME = new QName("http://servidor/", "obtenerDeportistaResponse");
    private final static QName _ObtenerEntrenador_QNAME = new QName("http://servidor/", "obtenerEntrenador");
    private final static QName _ObtenerEntrenadorResponse_QNAME = new QName("http://servidor/", "obtenerEntrenadorResponse");
    private final static QName _ObtenerNickname_QNAME = new QName("http://servidor/", "obtenerNickname");
    private final static QName _ObtenerNicknameResponse_QNAME = new QName("http://servidor/", "obtenerNicknameResponse");
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
     * Create an instance of {@link Deportista }
     * 
     */
    public Deportista createDeportista() {
        return new Deportista();
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
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link DtEntrenador }
     * 
     */
    public DtEntrenador createDtEntrenador() {
        return new DtEntrenador();
    }

    /**
     * Create an instance of {@link LocalTime }
     * 
     */
    public LocalTime createLocalTime() {
        return new LocalTime();
    }

    /**
<<<<<<< Updated upstream
     * Create an instance of {@link DtDeportista }
     * 
     */
    public DtDeportista createDtDeportista() {
        return new DtDeportista();
=======
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
>>>>>>> Stashed changes
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
