
package servidor;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-11-07T19:06:36.808-03:00
 * Generated source version: 4.0.5
 */

@WebFault(name = "PersistenciaException", targetNamespace = "http://servidor/")
public class PersistenciaException_Exception extends Exception {

    private servidor.PersistenciaException faultInfo;

    public PersistenciaException_Exception() {
        super();
    }

    public PersistenciaException_Exception(String message) {
        super(message);
    }

    public PersistenciaException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PersistenciaException_Exception(String message, servidor.PersistenciaException persistenciaException) {
        super(message);
        this.faultInfo = persistenciaException;
    }

    public PersistenciaException_Exception(String message, servidor.PersistenciaException persistenciaException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = persistenciaException;
    }

    public servidor.PersistenciaException getFaultInfo() {
        return this.faultInfo;
    }
}
