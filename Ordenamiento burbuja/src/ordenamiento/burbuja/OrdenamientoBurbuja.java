/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento.burbuja;

/**
 *
 * @author Katherine Andrea López Muñoz
 * 5090-18-81
 */
import java.util.Scanner;
public class OrdenamientoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t\tOrdenamiento de Burbuja");
        System.out.print("\n Ingrese cantidad de elementos a ingresar: ");
        int tam = new Scanner(System.in).nextInt();
        
        int arr[] = new int[tam];
        System.out.println();
        
        int j = 0;
        for (int i = 0 ; i < arr.length;i++)
        {
            j+=1;
            System.out.print("Elemento " + j + " : ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        burbuja(arr);
    }
 
    
    static void burbuja(int arreglo[])
    {
        for(int i=0; i < arreglo.length - 1; i++)
        {
            for(int j=0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]+"\n");
        }
    }
    
}
