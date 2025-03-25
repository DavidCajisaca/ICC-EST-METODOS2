public class Inserccion {
public void ordenascendente(int[] arreglo,boolean pasos){
    for(int i = 1; i < arreglo.length; i++){
        int aux = arreglo[i];
        int j = i - 1;
        if(pasos){
        System.out.println("\n "+"i: "+i+" j: "+j+" aux: "+aux);
        }
        while(j >= 0 && arreglo[j] > aux){
            if(pasos){
            System.out.println("compara " + arreglo[j] + " con " + aux);
            }
            arreglo[j + 1] = arreglo[j];
            j--;
           
        }
        arreglo[j + 1] = aux;
        if(pasos){
            System.out.println("\n"+"insertar aux: "+aux+" en la posicion "+(j+1));
         }   
    }
     
    }

    

public void  printarreglo(int[] arreglo){
    System.out.println("Arreglo clase inserccion");
    for(int i = 0; i < arreglo.length; i++){
        System.out.print(arreglo[i] + " ");
    }
}

}
