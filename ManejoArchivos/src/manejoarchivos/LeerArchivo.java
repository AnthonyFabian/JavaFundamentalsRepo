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
public class LeerArchivo {
    
    public void leerArchivo(){
        
        String file = "C:\\Users\\DCA\\Desktop\\manejoArchivos\\index.txt";
        
        try(InputStream fis = new FileInputStream(file)){
            int b = fis.read();
            System.out.println(b);
            fis.close();
        }catch(FileNotFoundException ffe){
            ffe.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
