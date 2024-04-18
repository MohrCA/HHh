/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hhh;

import java.util.Arrays;



/**
 *
 * @author Cristian
 */
public class UnidosNoMezclados {
     private Integer[] pila1;
    private Integer[] pila2;
    private Integer[] pila3;
    private int size;
    private int cursor;

    public UnidosNoMezclados() {
    }

    
    
    
    public UnidosNoMezclados(int size) {
        this.pila1 = new Integer[size];
        this.pila2 = new Integer[size];
        this.pila3 = new Integer[size];
        this.size = size;
        this.cursor = -1;
    }

  
     public void push(Integer[]pila,int entero){
        if(!PilaLlena()){
            cursor++;
            pila[cursor] = entero;
//            
        }else{System.out.println("La pila esta llena y no se puede agregar mas elementos");}
    }
     
     
    public Integer pop(Integer[]pila){
        if(!pilaVacia(pila)){
            int retorno = verElemento(pila);
            pila[cursor] = null;
            cursor--;
//            
            return retorno;
        }
        System.out.println("La pila esta vacia y no se puede quitar mas elementos");
        return null;
        
//       
    }
    
    
    
    public boolean pilaVacia(Integer[]pila){

        return cursor < 0;
    }
    
    
    
    public boolean PilaLlena(){
        return cursor == size -1;
//        return pila.size() == this.size;

    }
    public Integer verElemento(Integer[]pila){
        if(!pilaVacia(pila)){
            System.out.println(pila[cursor]);
            return pila[cursor];
//            System.out.println(pila.getLast());
//              return pila.getLast();
        }
        System.out.println("La pila esta vacia y no se puede quitar mas elementos");
        return null;
    }
    

   
    public void llenarPilas(Integer[] pila) {
        // LLENADO DEL ARREGLO CON UN BUCLE FOR
        for (int i = 0; i < pila.length; i++) {
            pila[i] = (int) (Math.random() * 100) + 1;
        }
            System.out.println(Arrays.toString(pila));
    }

    

    
     public void ordenarPilas(Integer[]pila) {

        for (int i = 0; i < pila.length - 1; i++) {
            // Últimos i elementos ya están ordenados, así que no necesitamos compararlos
            for (int j = 0; j < pila.length - i - 1; j++) {
                // Comparamos el elemento actual con el siguiente
                if (pila[j] > pila[j + 1]) {
                    // Si el elemento actual es mayor que el siguiente, los intercambiamos
                    int temporal = pila[j];
                    pila[j] = pila[j + 1];
                    pila[j + 1] = temporal;
                }

            }

        }
        
        System.out.println(Arrays.toString(pila));

    }
    
    public Integer[] mostrarPila(Integer[]pila){
      
        return pila;
    }
    
    

    

   public void unirPilas(Integer[] pila1, Integer[] pila2, Integer[] pilaFinal) {
   
    int index1 = pila1.length - 1;
    int index2 = pila2.length - 1;
    int indexFinal = 0;

    
    while (index1 >= 0 || index2 >= 0) {
       
        if (index1 >= 0 && index2 >= 0) {
             
            if (pila1[index1] >= pila2[index2]) {
                pilaFinal[indexFinal++] = pila1[index1--];
            } else {
                pilaFinal[indexFinal++] = pila2[index2--];
            }
        } else if (index1 >= 0) { 
            pilaFinal[indexFinal++] = pila1[index1--];
        } else if (index2 >= 0) { 
            pilaFinal[indexFinal++] = pila2[index2--];
        }
    }
   
    Integer[] inversaFinal = new Integer[pilaFinal.length];
    for (int i = 0; i < pilaFinal.length; i++) {
        inversaFinal[i] = pilaFinal[pilaFinal.length - 1 - i];
    }
    System.out.println(Arrays.toString(inversaFinal));
}
}