package servidor;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-11-08T17:33:54.893-03:00
 * Generated source version: 4.0.5
 *
 */
@WebService(targetNamespace = "http://servidor/", name = "Publicador")
@XmlSeeAlso({ObjectFactory.class})
public interface Publicador {

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerInscrpcionesDeportistaRequest", output = "http://servidor/Publicador/obtenerInscrpcionesDeportistaResponse")
    @RequestWrapper(localName = "obtenerInscrpcionesDeportista", targetNamespace = "http://servidor/", className = "servidor.ObtenerInscrpcionesDeportista")
    @ResponseWrapper(localName = "obtenerInscrpcionesDeportistaResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerInscrpcionesDeportistaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerInscrpcionesDeportista(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerVectorClasesRequest", output = "http://servidor/Publicador/obtenerVectorClasesResponse")
    @RequestWrapper(localName = "obtenerVectorClases", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorClases")
    @ResponseWrapper(localName = "obtenerVectorClasesResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorClasesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerVectorClases()
;

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerNicknameRequest", output = "http://servidor/Publicador/obtenerNicknameResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/obtenerNickname/Fault/PersistenciaException")})
    @RequestWrapper(localName = "obtenerNickname", targetNamespace = "http://servidor/", className = "servidor.ObtenerNickname")
    @ResponseWrapper(localName = "obtenerNicknameResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerNicknameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String obtenerNickname(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    ) throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerArrayActividadesEntrenadorRequest", output = "http://servidor/Publicador/obtenerArrayActividadesEntrenadorResponse")
    @RequestWrapper(localName = "obtenerArrayActividadesEntrenador", targetNamespace = "http://servidor/", className = "servidor.ObtenerArrayActividadesEntrenador")
    @ResponseWrapper(localName = "obtenerArrayActividadesEntrenadorResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerArrayActividadesEntrenadorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerArrayActividadesEntrenador(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod(operationName = "AltaActividad")
    @Action(input = "http://servidor/Publicador/AltaActividadRequest", output = "http://servidor/Publicador/AltaActividadResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/AltaActividad/Fault/PersistenciaException")})
    @RequestWrapper(localName = "AltaActividad", targetNamespace = "http://servidor/", className = "servidor.AltaActividad")
    @ResponseWrapper(localName = "AltaActividadResponse", targetNamespace = "http://servidor/", className = "servidor.AltaActividadResponse")
    public void altaActividad(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        java.lang.String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        java.lang.String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        java.lang.String arg7
    ) throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/usuarioExisteRequest", output = "http://servidor/Publicador/usuarioExisteResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/usuarioExiste/Fault/PersistenciaException")})
    @RequestWrapper(localName = "usuarioExiste", targetNamespace = "http://servidor/", className = "servidor.UsuarioExiste")
    @ResponseWrapper(localName = "usuarioExisteResponse", targetNamespace = "http://servidor/", className = "servidor.UsuarioExisteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean usuarioExiste(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    ) throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerVectorClasesActividadRequest", output = "http://servidor/Publicador/obtenerVectorClasesActividadResponse")
    @RequestWrapper(localName = "obtenerVectorClasesActividad", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorClasesActividad")
    @ResponseWrapper(localName = "obtenerVectorClasesActividadResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorClasesActividadResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerVectorClasesActividad(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/claseExisteRequest", output = "http://servidor/Publicador/claseExisteResponse")
    @RequestWrapper(localName = "claseExiste", targetNamespace = "http://servidor/", className = "servidor.ClaseExiste")
    @ResponseWrapper(localName = "claseExisteResponse", targetNamespace = "http://servidor/", className = "servidor.ClaseExisteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean claseExiste(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod(operationName = "AltaUsuario")
    @Action(input = "http://servidor/Publicador/AltaUsuarioRequest", output = "http://servidor/Publicador/AltaUsuarioResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/AltaUsuario/Fault/PersistenciaException")})
    @RequestWrapper(localName = "AltaUsuario", targetNamespace = "http://servidor/", className = "servidor.AltaUsuario")
    @ResponseWrapper(localName = "AltaUsuarioResponse", targetNamespace = "http://servidor/", className = "servidor.AltaUsuarioResponse")
    public void altaUsuario(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        java.lang.String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        java.lang.String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        boolean arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        java.lang.String arg8,
        @WebParam(name = "arg9", targetNamespace = "")
        java.lang.String arg9,
        @WebParam(name = "arg10", targetNamespace = "")
        java.lang.String arg10
    ) throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerArrayActividadesAceptadasEntrenadorRequest", output = "http://servidor/Publicador/obtenerArrayActividadesAceptadasEntrenadorResponse")
    @RequestWrapper(localName = "obtenerArrayActividadesAceptadasEntrenador", targetNamespace = "http://servidor/", className = "servidor.ObtenerArrayActividadesAceptadasEntrenador")
    @ResponseWrapper(localName = "obtenerArrayActividadesAceptadasEntrenadorResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerArrayActividadesAceptadasEntrenadorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerArrayActividadesAceptadasEntrenador(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/modifiarUsuarioRequest", output = "http://servidor/Publicador/modifiarUsuarioResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/modifiarUsuario/Fault/PersistenciaException")})
    @RequestWrapper(localName = "modifiarUsuario", targetNamespace = "http://servidor/", className = "servidor.ModifiarUsuario")
    @ResponseWrapper(localName = "modifiarUsuarioResponse", targetNamespace = "http://servidor/", className = "servidor.ModifiarUsuarioResponse")
    public void modifiarUsuario(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        java.lang.String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        java.lang.String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        boolean arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        java.lang.String arg8,
        @WebParam(name = "arg9", targetNamespace = "")
        java.lang.String arg9
    ) throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerEntrenadorRequest", output = "http://servidor/Publicador/obtenerEntrenadorResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/obtenerEntrenador/Fault/PersistenciaException")})
    @RequestWrapper(localName = "obtenerEntrenador", targetNamespace = "http://servidor/", className = "servidor.ObtenerEntrenador")
    @ResponseWrapper(localName = "obtenerEntrenadorResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerEntrenadorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public servidor.DtEntrenador obtenerEntrenador(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    ) throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerActividadRequest", output = "http://servidor/Publicador/obtenerActividadResponse")
    @RequestWrapper(localName = "obtenerActividad", targetNamespace = "http://servidor/", className = "servidor.ObtenerActividad")
    @ResponseWrapper(localName = "obtenerActividadResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerActividadResponse")
    @WebResult(name = "return", targetNamespace = "")
    public servidor.DtActividad obtenerActividad(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerClaseRequest", output = "http://servidor/Publicador/obtenerClaseResponse")
    @RequestWrapper(localName = "obtenerClase", targetNamespace = "http://servidor/", className = "servidor.ObtenerClase")
    @ResponseWrapper(localName = "obtenerClaseResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerClaseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public servidor.DtClaseDeportiva obtenerClase(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/esEntrenadorRequest", output = "http://servidor/Publicador/esEntrenadorResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/esEntrenador/Fault/PersistenciaException")})
    @RequestWrapper(localName = "esEntrenador", targetNamespace = "http://servidor/", className = "servidor.EsEntrenador")
    @ResponseWrapper(localName = "esEntrenadorResponse", targetNamespace = "http://servidor/", className = "servidor.EsEntrenadorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean esEntrenador(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    ) throws PersistenciaException_Exception;

    @WebMethod(operationName = "AltaClaseDeportiva")
    @Action(input = "http://servidor/Publicador/AltaClaseDeportivaRequest", output = "http://servidor/Publicador/AltaClaseDeportivaResponse", fault = {@FaultAction(className = ClaseRepetidoException_Exception.class, value = "http://servidor/Publicador/AltaClaseDeportiva/Fault/ClaseRepetidoException"), @FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/AltaClaseDeportiva/Fault/PersistenciaException")})
    @RequestWrapper(localName = "AltaClaseDeportiva", targetNamespace = "http://servidor/", className = "servidor.AltaClaseDeportiva")
    @ResponseWrapper(localName = "AltaClaseDeportivaResponse", targetNamespace = "http://servidor/", className = "servidor.AltaClaseDeportivaResponse")
    public void altaClaseDeportiva(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        java.lang.String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        java.lang.String arg6
    ) throws ClaseRepetidoException_Exception, PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/traerPassRequest", output = "http://servidor/Publicador/traerPassResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/traerPass/Fault/PersistenciaException")})
    @RequestWrapper(localName = "traerPass", targetNamespace = "http://servidor/", className = "servidor.TraerPass")
    @ResponseWrapper(localName = "traerPassResponse", targetNamespace = "http://servidor/", className = "servidor.TraerPassResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean traerPass(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    ) throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerDeportistaRequest", output = "http://servidor/Publicador/obtenerDeportistaResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/obtenerDeportista/Fault/PersistenciaException")})
    @RequestWrapper(localName = "obtenerDeportista", targetNamespace = "http://servidor/", className = "servidor.ObtenerDeportista")
    @ResponseWrapper(localName = "obtenerDeportistaResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerDeportistaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public servidor.DtDeportista obtenerDeportista(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    ) throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerVectorActividadesAceptadasEntrenadorRequest", output = "http://servidor/Publicador/obtenerVectorActividadesAceptadasEntrenadorResponse")
    @RequestWrapper(localName = "obtenerVectorActividadesAceptadasEntrenador", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorActividadesAceptadasEntrenador")
    @ResponseWrapper(localName = "obtenerVectorActividadesAceptadasEntrenadorResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorActividadesAceptadasEntrenadorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerVectorActividadesAceptadasEntrenador(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerClasesDeportistaRequest", output = "http://servidor/Publicador/obtenerClasesDeportistaResponse")
    @RequestWrapper(localName = "obtenerClasesDeportista", targetNamespace = "http://servidor/", className = "servidor.ObtenerClasesDeportista")
    @ResponseWrapper(localName = "obtenerClasesDeportistaResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerClasesDeportistaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerClasesDeportista(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod(operationName = "DeportistaEstaEnClase")
    @Action(input = "http://servidor/Publicador/DeportistaEstaEnClaseRequest", output = "http://servidor/Publicador/DeportistaEstaEnClaseResponse")
    @RequestWrapper(localName = "DeportistaEstaEnClase", targetNamespace = "http://servidor/", className = "servidor.DeportistaEstaEnClase")
    @ResponseWrapper(localName = "DeportistaEstaEnClaseResponse", targetNamespace = "http://servidor/", className = "servidor.DeportistaEstaEnClaseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean deportistaEstaEnClase(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerVectorActividadRequest", output = "http://servidor/Publicador/obtenerVectorActividadResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/obtenerVectorActividad/Fault/PersistenciaException")})
    @RequestWrapper(localName = "obtenerVectorActividad", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorActividad")
    @ResponseWrapper(localName = "obtenerVectorActividadResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorActividadResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerVectorActividad()
 throws PersistenciaException_Exception;

    @WebMethod
    @Action(input = "http://servidor/Publicador/actividadExisteRequest", output = "http://servidor/Publicador/actividadExisteResponse")
    @RequestWrapper(localName = "actividadExiste", targetNamespace = "http://servidor/", className = "servidor.ActividadExiste")
    @ResponseWrapper(localName = "actividadExisteResponse", targetNamespace = "http://servidor/", className = "servidor.ActividadExisteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean actividadExiste(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerVectorUsuariosRequest", output = "http://servidor/Publicador/obtenerVectorUsuariosResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/obtenerVectorUsuarios/Fault/PersistenciaException")})
    @RequestWrapper(localName = "obtenerVectorUsuarios", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorUsuarios")
    @ResponseWrapper(localName = "obtenerVectorUsuariosResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorUsuariosResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerVectorUsuarios()
 throws PersistenciaException_Exception;

    @WebMethod(operationName = "AltainscripcionAClase")
    @Action(input = "http://servidor/Publicador/AltainscripcionAClaseRequest", output = "http://servidor/Publicador/AltainscripcionAClaseResponse", fault = {@FaultAction(className = ClaseNoExisteException_Exception.class, value = "http://servidor/Publicador/AltainscripcionAClase/Fault/ClaseNoExisteException")})
    @RequestWrapper(localName = "AltainscripcionAClase", targetNamespace = "http://servidor/", className = "servidor.AltainscripcionAClase")
    @ResponseWrapper(localName = "AltainscripcionAClaseResponse", targetNamespace = "http://servidor/", className = "servidor.AltainscripcionAClaseResponse")
    public void altainscripcionAClase(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2
    ) throws ClaseNoExisteException_Exception;

    @WebMethod(operationName = "CuposDisponiblesEnClase")
    @Action(input = "http://servidor/Publicador/CuposDisponiblesEnClaseRequest", output = "http://servidor/Publicador/CuposDisponiblesEnClaseResponse")
    @RequestWrapper(localName = "CuposDisponiblesEnClase", targetNamespace = "http://servidor/", className = "servidor.CuposDisponiblesEnClase")
    @ResponseWrapper(localName = "CuposDisponiblesEnClaseResponse", targetNamespace = "http://servidor/", className = "servidor.CuposDisponiblesEnClaseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int cuposDisponiblesEnClase(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerListaInscripcionesRequest", output = "http://servidor/Publicador/obtenerListaInscripcionesResponse")
    @RequestWrapper(localName = "obtenerListaInscripciones", targetNamespace = "http://servidor/", className = "servidor.ObtenerListaInscripciones")
    @ResponseWrapper(localName = "obtenerListaInscripcionesResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerListaInscripcionesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerListaInscripciones(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://servidor/Publicador/obtenerVectorActividadesAceptadasRequest", output = "http://servidor/Publicador/obtenerVectorActividadesAceptadasResponse", fault = {@FaultAction(className = PersistenciaException_Exception.class, value = "http://servidor/Publicador/obtenerVectorActividadesAceptadas/Fault/PersistenciaException")})
    @RequestWrapper(localName = "obtenerVectorActividadesAceptadas", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorActividadesAceptadas")
    @ResponseWrapper(localName = "obtenerVectorActividadesAceptadasResponse", targetNamespace = "http://servidor/", className = "servidor.ObtenerVectorActividadesAceptadasResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> obtenerVectorActividadesAceptadas()
 throws PersistenciaException_Exception;
}
