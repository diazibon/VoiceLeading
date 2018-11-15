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
public class Note {
    private String pitch;
    private Integer numero;
    private Integer octava;
    
    //private static String quintas[]={"Gb","Db","Ab","Eb","Bb","F","C","G","D","A","E","B"};
    
    /*public Note(String pitch,Integer numero, Integer octava){
        this.pitch=pitch;
        this.numero=numero;
        this.octava=octava;
    }*/
    public Note(){
        this.pitch="C";
        this.numero=0;
        this.octava=3;
    }
    public Note(String nombre){
        this.pitch=nombre;
        this.octava=3;
        this.numero=Note.noteToInt(nombre);
    }
    public Note setNote(String nota){
        this.pitch=nota;
        this.numero=Note.noteToInt(nota);
        this.octava=3;
        return this;
    }
    public static int noteToInt(String nota){
        String[] ns = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};
        String[] nf = {"C","Db","D","Eb","E","F","Gb","G","Ab","A","Bb","B"};
        
        //System.out.println(nota.pitch.substring(1));
        
        if (nota.substring(1).equals("#")){
            for (int x=0;x<ns.length;x++){
                if (nota.equals(ns[x])){
                    return x;              
                }
            }
        }else{
            for (int x=0;x<nf.length;x++){
                if (nota.equals(nf[x])){
                    return x;
                }
            }
        }
        return 0;
    }
    public void setNombre(String nombre){
        this.pitch=nombre;
    }
    public void setNumero(Integer numero){
        this.numero=numero;
    }
    public void setOctava(Integer octava){
        this.octava=octava;
    }
    public String getNombre(){
        return this.pitch;
    }
    public Integer getNumero(){
        return this.numero;
    }
    public Integer getOctava(){
        return this.octava;
    } 
    public String toString(){
        return (this.pitch+this.numero.toString()+this.octava.toString());
    }
    
    public static void sostener(Note nota){
        StringBuffer cadena=new StringBuffer();
        cadena.append(nota.getNombre());
        
        if (nota.getNumero()+1>=12){
            nota.setOctava(nota.getOctava()+1);
        }
        nota.setNumero(nota.getNumero()+1%12);
        if(cadena.substring(cadena.length()-1).equals("b")){
                cadena.deleteCharAt((cadena.length()-1));
        }else{
            cadena.append("#");
        }
        
        nota.setNombre(cadena.toString());

    }
    public static void rebajar(Note nota){
        if (nota.getNumero()-1<0){
            nota.setOctava(nota.getOctava()-1);
            nota.setNumero(12);
        }
        nota.setNumero(nota.getNumero()-1%12);
        
        StringBuffer cadena=new StringBuffer();
        cadena.append(nota.getNombre());
        
        if(cadena.substring(cadena.length()-1).equals("#")){
                cadena.deleteCharAt(cadena.length()-1);
        }else{
            cadena.append("b");
        }
        nota.setNombre(cadena.toString());

    }
    }
