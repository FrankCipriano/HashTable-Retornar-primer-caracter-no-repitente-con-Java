package caracter;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Caracter {
  private String cadena;
  private String llave;
  private Integer valor,contador;
  
  public Caracter(){
    
  }
  public Caracter(Integer valor){
    this.valor = valor;
  }
  public Caracter(String llave){
    this.llave = llave;
  }
  public void setValor(Integer valor){
     this.valor=valor;
  }
  public Integer getValor(){
    return valor;
  }
  public void setLlave(String llave){
    this.llave=llave;
  }
  public String getLlave(){
    return llave;
  }
  
  public void ingresar_texto(){
  Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese una cadena de texto");
   cadena = scan.nextLine();
   cadena = cadena.replaceAll("[-,¿:¡;?!%+×()@#]","");
   cadena = cadena.replace(" ","");
  }
  
  //busqueda por HASH
  public void buscar_no_repetido(Hashtable<String,Integer> tabla){
    for(int i=0;i<cadena.length();i++){  
    llave = cadena.toLowerCase().substring(i,i+1);
    Caracter value = new Caracter(1);
    Caracter key = new Caracter(llave);

    if(tabla.containsKey(key.getLlave())){
    contador = tabla.get(key.getLlave());
    Caracter valor = new Caracter(contador);
    valor.aumentar(value);
    tabla.remove(key);
    tabla.put(key.getLlave(),valor.getValor());
    }else{
    tabla.put(key.getLlave(),value.getValor());
    }
   }
  }
 
  public void aumentar(Caracter a){
    this.valor=this.valor+a.getValor();
  }
  
  public void mostrar(Hashtable<String,Integer> tabla){
   Enumeration<String> llaves = tabla.keys();
   Enumeration<Integer> valores = tabla.elements();
System.out.println("Las veces que se repite cada caracter:");
   while(valores.hasMoreElements()){
     System.out.println(llaves.nextElement()+"->"+valores.nextElement());
   }
  }
  @Override
  public String toString(){
    return String.format("%s",this.llave,this.valor);
  }
}
