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
public class ClaseFailReader {
    
    public void leerArchivo(){
        String path="C:\\Users\\DCA\\Documents\\JavaFundamentalsRepo\\repositorio.txt";
        try(FileReader fr=new FileReader(new File(path))){
            while(fr.ready()){
                char [] word = new char[200];
                fr.read(word);
                System.out.println(word);
            }fr.close();
        }catch(FileNotFoundException ffe){
            ffe.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
