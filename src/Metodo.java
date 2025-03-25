public class Metodo {
public void burbuja(int[] arreglo,boolean des){
    int n = arreglo.length;
    for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - i - 1; j++){
            System.out.println("i="+i+" j="+j);
            if (des){
                if (arreglo[j] > arreglo[j + 1]){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            } else {
                if (arreglo[j] < arreglo[j + 1]){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
    }
}
}
public void imprimir(int [] arreglo){
    for(int i = 0; i < arreglo.length; i++){
        System.out.print(arreglo[i] + "  ");
    }
    System.out.println();
}
public void ordenascendente (int [] arreglo){
    for(int i = 0; i < arreglo.length; i++){
        for(int j = 0; j < arreglo.length - i - 1; j++){
            if(arreglo[j] > arreglo[j + 1]){
                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }
} 
}
