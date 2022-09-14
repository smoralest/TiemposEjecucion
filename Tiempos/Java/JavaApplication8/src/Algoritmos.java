
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class Algoritmos {
    public int[] arr = new int[10000];
    public int aux;
    public Random r = new Random();
    public void burbuja(){
        long inicio = System.currentTimeMillis();
        for(int i =0;i< arr.length; i++){//Arreglo de aleatorios
            arr[i] = (r.nextInt(10))+1;
        }
        
        for(int j=0;j<arr.length;j++){//ordenamiento de aleatorios
            for(int k=0;k<arr.length-1;k++){
                if(arr[k+1]<arr[k]){
                    aux = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1]=aux;
                }
            }
        }
        for(int p=0;p<arr.length;p++){
            System.out.println(arr[p]);
             
        }
        long fin = System.currentTimeMillis();
        float tiempo = (float) ((fin-inicio));
        System.out.println("El tiempo de ejecucion es: "+ tiempo + " milisegundos");
    }
    
public void obtenerBinario(int numero){
   long inicio = System.nanoTime();
   int resto;
   String binario = "";

   do{
      resto = numero%2;
      numero = numero/2; 
      binario += Integer.toString(resto);
   
   }while(numero >= 1); //Bucle hasta que el cociente no se pueda dividir mas
   
   StringBuilder strb = new StringBuilder(binario); //Invierte String del binario
   binario = strb.reverse().toString();
   System.out.println("Numero binario: "+binario);
   long fin = System.nanoTime();
   float tiempo = (float) ((fin-inicio));
   float tiempomil = tiempo/1000000;
   System.out.println("El tiempo de ejecucion es: "+ tiempo + " nanosegundos");
   System.out.println("El tiempo de ejecucion es:"+ tiempomil + " milisegundos");

 }
}
