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
public class ClaseFileWriter {
    public void escribirrArchivo(){
        String path="C:\\Users\\DCA\\Documents\\JavaFundamentalsRepo\\repositorio.txt";
        try(FileWriter fw=new FileWriter(new File(path), true)){
            fw.append("fecha: 03022018");
            fw.close();
        }catch(FileNotFoundException ffe){
            ffe.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
