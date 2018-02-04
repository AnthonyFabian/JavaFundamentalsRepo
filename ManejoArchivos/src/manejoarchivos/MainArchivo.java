/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.*;

/**
 *
 * @author DCA
 */
public class MainArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            GuardarArchivo guardarArchivo = new GuardarArchivo();
            guardarArchivo.guardarArchivo();
            
            LeerArchivo leerArchivo = new LeerArchivo();
            leerArchivo.leerArchivo();
            
        
            
    }
    
}
