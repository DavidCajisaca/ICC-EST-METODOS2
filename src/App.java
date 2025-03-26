public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----Metodo burbuja---- ");
        Metodo m = new Metodo();
        int [] arre = {64,25,12,22,11};
        System.out.println("Arreglo original");

        m.imprimir(arre);
        System.out.println("Arreglo ordenado ascendentemente ");
        m.ordenascendente(arre);
        m.imprimir(arre);
        System.out.println("---Metodo seleccion----");
        Seleccion s = new Seleccion();
        int [] arre2 = {64,25,12,22,11};
        System.out.println("Arreglo original");
        s.printarreglo(arre2);
        System.out.println("\n"+"Arreglo ordenado descendentemente");
        s.Seleccionascendente(arre2);
        s.printarreglo(arre2);
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
        System.out.println("\n");
        System.out.println("----Metodo inserccion----"); 
        Inserccion i = new Inserccion();
        i.printarreglo(arre2);
        i.ordenascendente(arre2, true);
        i.printarreglo(arre2);
        System.out.println("\n"+"inserccion sin pasos"); 
      
        i.ordenascendente(arre2, false);
        i.printarreglo(arre2);

    }
}
