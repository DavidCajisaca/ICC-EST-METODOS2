public class Seleccion {
    public void Seleccionascendente(int[]arreglo){
        for(int i = 0; i < arreglo.length; i++){
            int min = i;
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[j] < arreglo[min]){
                    min = j;
                }
            }
           if(i!=min){
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
           }
        }
    }
    public void printarreglo(int[]  arreglo){
        System.out.println("Arreglo clase seleccion");
        for(int i = 0; i < arreglo.length; i++){
            if(i==arreglo.length-1){
                  System.out.print(arreglo[i] + " ");
        }
        else{
                System.out.print(arreglo[i] + " ");
        }
    }
        
    }
    
  

    

    public void ordenardescendente (int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            int max = i;
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[j] > arreglo[max]){
                    max = j;
                }
            }
            if(i!=max){
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }
    public void ordenardesle (int[] arreglo,boolean des){
        //en base a des ejecutar el metodo correspondiente 
        //ordenar ascendente o descendente
        if(des){
            ordenardescendente(arreglo);
        }else {
            Seleccionascendente(arreglo);
        }
    }
}
