public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        Metodo m = new Metodo();
        int [] arre = {0,10,-10,5,9};
        m.imprimir(arre);
        m.burbuja(arre,true);
        m.imprimir(arre);
        m.burbuja(arre, false);
        m.imprimir(arre);
        // int[] multi=new int [1000];
        // for(int i=0;i<multi.length;i++){
        //     multi[i]=(int)(Math.random()*1000)+1;
        // }
        // m.imprimir(multi);
        Seleccion s = new Seleccion();
        int [] arre2 = {64,25,12,22,11};
        //s.printarreglo(arre2);
       // s.Seleccionascendente(arre2);
        //s.Seleccionascendente(arre);
        //s.printarreglo(arre);
       // s.ordenardescendente(arre2);
       // s.printarreglo(arre2);
        //imprimir dependiendo des
        // s.ordenardesle(multi, true);
        // s.printarreglo(multi);
        // System.out.println("con false ");
        // s.ordenardesle(multi, false);
        // s.printarreglo(multi);

        //metodo de inserccion 
        Inserccion i = new Inserccion();
        i.printarreglo(arre2);
        i.ordenascendente(arre2, true);
        i.printarreglo(arre2);
        System.out.println("\n"+"inserccion sin pasos"); 
        i.printarreglo(arre2);
        i.ordenascendente(arre2, false);
        i.printarreglo(arre2);

    }
}
