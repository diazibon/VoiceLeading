/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voice.leading;

/**
 *
 * @author Ibon
 */
public class gestionarAcorde {
    
    public static Acorde crearAcorde(String tipo,int grado, Key tono){
        switch (tipo){
        case "TRIADA":
            return new Triada(grado, tono);     
        case "CUATRIADA":
            return new Cuatriada(grado, tono);
        //case "3p4":
        //    return new 3p4(grado, tono);
        //case "4p4":
        //    return new 4p4(grado, tono);
            
        default:
            return new Triada(grado, tono);
        }
        
    }
}

