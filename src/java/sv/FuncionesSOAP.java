/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC01
 */
@WebService(serviceName = "FuncionesSOAP")
public class FuncionesSOAP {

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
    @WebMethod(operationName = "Eurodolar")
    public Double Eurodolar(@WebParam(name = "valor") double valor) {
        //TODO write your implementation code here:
        return valor*1.10;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Potencia")
    public Double Potencia(@WebParam(name = "base") double base, @WebParam(name = "exponente") double exponente) {
        //TODO write your implementation code here:
        return Math.pow(base, exponente) ;
    }



 
    @WebMethod(operationName = "NumeroPrimo")
    public String NumeroPrimo(@WebParam(name = "valorp") double valorp) {
        //TODO write your implementation code here:
        
         if (valorp == 0 || valorp == 1 || valorp == 4) {
    return "NO ES PRIMO";
  }
  for (int x = 2; x < valorp / 2; x++) {
    // Si es divisible por cualquiera de estos números, no
    // es primo
    if (valorp % x == 0)
      return "NO ES PRIMO";
  }
  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
  return "ES PRIMO";
   }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Diccionario")
    public String Diccionario(@WebParam(name = "palabra") String palabra) {
        //TODO write your implementation code here:
        
        
         HashMap<String, String> terminos = new HashMap<>();
        terminos.put("java", "Es un lenguaje de programación");
        terminos.put("String", "Cadena de caracteres");
        terminos.put("int", "Valor numerico");
        terminos.put("cpu", "La unidad central de procesamiento");
        terminos.put("ram", "Random Access Memory");
        terminos.put("netbeans", "Es un entorno de desarrollo integrado de código abierto y gratuito");
        terminos.put("python", "Es un lenguaje de programación");
        terminos.put("Html", "HyperText Markup Language (‘lenguaje de marcado de hipertexto’)");
        terminos.put("brave", "Brave es un navegador web");
        terminos.put("pc", "Un ordenador personal, computador personal u ordenador, conocido como PC");
        terminos.put("teclado", "Es un dispositivo de entrada");
        terminos.put("mouse", "Es un dispositivo apuntador");
        
        

            
      

            
            //String termino = "Este termino no esta almacenado en el Hashmap";
            for (String clave : terminos.keySet()) {
                if (clave.equals(palabra)) {
                    palabra = clave + ": " + terminos.get(clave);
                    return "Respuesta   "+palabra;
                }
            }
            return "Esta palabra "+ palabra +" no se encuentra";
            
        
             }
    

    
    
    }

            
       
             

                
        
        
        
        
    
        
  
    

