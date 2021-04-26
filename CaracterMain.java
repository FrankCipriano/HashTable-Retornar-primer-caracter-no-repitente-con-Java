//4.	Realice una función que retorne el primer carácter que no se repita dentro de una cadena recibida

package caracter;

import java.util.Hashtable;

public class CaracterMain {
  public static void main(String args[]){
  //Clase_sin_objetos();
  clase_con_objeto();
  }
  
  
  //-----------------------------------------
  public static void Clase_sin_objetos(){
    Hashtable<String,Integer> tabla = new Hashtable();
  Hash libro = new Hash();
  libro.ingresar_cadena();
  libro.buscar_no_repetido(tabla);
  libro.mostrar(tabla);
  }
  
  
  //-----------------------------------------
  public static void clase_con_objeto(){
    Hashtable<String,Integer> tabla = new Hashtable();
    Caracter diccionario = new Caracter();
    diccionario.ingresar_texto();
    diccionario.buscar_no_repetido(tabla);
    diccionario.mostrar(tabla);
  }
}
