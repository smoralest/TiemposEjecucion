
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */

public class Main {
    public static void main(String[] args)  {
        Algoritmos algoritmo = new Algoritmos();
        //algoritmo.burbuja();
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el valor a convertir en binario: ");
        int decimal = sc.nextInt();
        algoritmo.obtenerBinario(decimal);
    }
}
