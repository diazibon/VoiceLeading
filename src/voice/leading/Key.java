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
public class Key {
    public static String escalaBase="CDEFGAB";
    public static String quintas[]={"Cb","Gb","Db","Ab","Eb","Bb","F","C","G","D","A","E","B","F#","C#"};
    
    private String tonic;
    
    protected Note escala[]= new Note[7];    
    
    /*public Key(){
    
        for (int x=0; x<escala.length; x++){
            this.escala[x]=new Note(escalaBase.substring(x,x+1));
        }
    }*/
    
    public Key(String tono){
        
        String notasAlteradas[]=Key.getNotasAlteradas(Key.getAlteraciones(tono));
        int indice=0;
        boolean found=false;
        String alteracion=null;
        
        tonic=tono;
        
        if (Key.getAlteraciones(tono)>0){
            alteracion="#";
        }else if (Key.getAlteraciones(tono)<0) {
            alteracion="b";
        }
        for (int x=0;x<escalaBase.length();x++){
            if (escalaBase.substring(x,x+1).equals(tono.substring(0, 1))){
                indice=x;
                //System.out.println(indice);
            }
        }
        for (int x=0; x<escala.length; x++){ 
            for (String a : notasAlteradas){
                if (escalaBase.substring(indice, indice+1).equals(a.substring(0, 1))){
                    //System.out.println(a);
                    this.escala[x]=new Note(a.substring(0, 1)+alteracion);
                    found=true;
                }
            }
            if (found==false){
                this.escala[x]=new Note(escalaBase.substring(indice, indice+1));
            }
            found=false;
            indice=(indice+1)%7;
        }
}
    
    public static int getAlteraciones(String tono){
        
        for(int x=0;x<quintas.length;x++){
            if (tono.equals(quintas[x])){
                return (x-7);
            }
        }
        return 0;
    }    
    
    public static String[] getNotasAlteradas(int alteraciones){
        String notasAlteradas[];
        
        if (alteraciones>0){
            notasAlteradas=new String[alteraciones];
            for (int x=0;x<alteraciones;x++){
                notasAlteradas[x]=quintas[x+6];
            } 
        } else {
                notasAlteradas=new String[-alteraciones];
                int posicion=5;
                for (int x=0;x<-alteraciones;x++){
                    notasAlteradas[x]=quintas[posicion];
                    posicion--;
                    }
            
        }
        return notasAlteradas;
    }
    
    
    public Note[] getEscala(){
        return escala;
    }
    
}