package caracter;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Hash {
    private String cadena,llave;
    private int valor;
    
    public Hash(){
      
    }
    public void ingresar_cadena(){
    Scanner capturar = new Scanner(System.in);
    System.out.println("Ingrese una cadena de texto");
    cadena = capturar.nextLine();
    }
    //funcion Hash
    public void buscar_no_repetido(Hashtable<String,Integer> tabla){
    cadena = cadena.replaceAll("[-,;:¿?¡!%@]","");
    cadena = cadena.replace(" ","");
      for(int i=0;i<cadena.length();i++){
        llave=cadena.toLowerCase().substring(i,i+1);
        if(tabla.containsKey(llave)){
        valor = tabla.get(llave);
        valor+=1;
        tabla.remove(llave);
        tabla.put(llave,valor);
        }else{
         tabla.put(llave,1);
        }
      }
      for(int i=0;i<cadena.length();i++){
   llave=cadena.toLowerCase().substring(i,i+1);
   valor=tabla.get(llave);
   if(valor==1){
     System.out.println("El primer caracter no repitente es: "+llave);
     i=cadena.length();
   }
      }
    }
    public void mostrar(Hashtable<String,Integer> tabla){
  Enumeration<String> Llaves = tabla.keys();
 Enumeration<Integer> Valores = tabla.elements();
  System.out.println("Las veces que se repite cada caracter:");
  while(Valores.hasMoreElements()){
    System.out.println(Llaves.nextElement()+"  -> "+Valores.nextElement());
  }
    }
}