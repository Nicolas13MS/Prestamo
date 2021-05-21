/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author Javier Bustamante Toledo
 * 
 * Situación: Supongamos que tenemos una aplicación que autoriza el prestamo de una 
 * cantidad de dinero (valor numérico) si en importe se encuentra entre 1000 y 15000. 
 * Por lo tanto, 
 *  Todo préstamo por debajo de 1000 carece de interes y 
 *  Por encima de 15000 es una operación con demasiado riesgo.
 * 
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String estudio (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1000 && cantidad <=15000) {
                sRespuesta = "Felicidades, préstamo concedido";
            } else if (cantidad < 1000) {
                sRespuesta = "Préstamo no concedido carece de interes";
            } else {
                sRespuesta= "Préstamo no concedido es una operación con demasiado riesgo";
            }
        return sRespuesta;
    }
}


/*
RESPONDER AQUI EL PUNTO 1 DEL EXÁMEN.

1. Mediante las PRUEBAS DE EQUIVALENCIA intentaré resolver la mayor cantidad de situaciones posibles con el número
de pruebas mínimo, buscando tanto pruebas en la que espero un resultado válido como inválido.

    1.1: Con el valor de préstamo 750 espero un resultado inválido.
    1.2: Con el valor 17000 espero un resultado inválido.
    1.3: Con el valor 10000 espero un resultado válido.

2. Por otro lado, con las PRUEBAS DE VALORES BORDE comprobaré que los límites del rango válido del proyecto
funcionan correctamente.
    
    2.1: Con el valor 1000 espero un resultado válido.
    2.2: Con el valor 15000 espero un resultado válido.


*/