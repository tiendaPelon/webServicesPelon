/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgWS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.MDB;
/**
 *
 * @author danie
 */
@WebService(serviceName = "WSBDpelon")
public class WSBDpelon {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Alta")
    public String Alta(@WebParam(name = "tabla") final String tabla, @WebParam(name = "datos") final String datos) {
        MDB administradorBD = new MDB();
        String leyenda;
        leyenda = administradorBD.registrarAlta(tabla,datos);
        
        return leyenda;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public String editar(@WebParam(name = "tabla") final String tabla, @WebParam(name = "datos") final String datos, @WebParam(name = "condicion") final String condicion) {
        MDB administradorBD = new MDB();
        String leyenda;
        leyenda = administradorBD.modificarRegistro(tabla,datos,condicion);
        
        return leyenda;
    }
}
