/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturadato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam112
 */

public class LecturaDato {
    
        public static String cadena() throws IOException{
        
        String cadena;
        
        InputStreamReader objeto = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(objeto);
        
        cadena = teclado.readLine();
        
        return cadena;
        
    }
        
        public static int datoInt() throws IOException{

            int entrada;

            entrada = Integer.parseInt(cadena());
            
            return entrada;

    }
        
        public static float datoFloat() throws IOException{
            
            float entrada;
            
            entrada = Float.parseFloat(cadena());
            
            return entrada;
            
        }
        
}
