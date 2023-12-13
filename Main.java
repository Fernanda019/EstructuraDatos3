public class Main
{
    public static void main(String[] args)
    {
        ABB arbol = new ABB();

        Nodo raizArbolABB = arbol.regresaRaiz();
        //10, 5, 20, 30, 15
        arbol.insertarValor(10);
        arbol.insertarValor(5);
        arbol.insertarValor(20);
        arbol.insertarValor(30);
        arbol.insertarValor(15);
        System.out.println("");
        
        arbol.muestraAcostado(0, arbol.regresaRaiz());
        
        System.out.println("");
        arbol.inOrden(arbol.regresaRaiz());
        System.out.println("recorrido inorden ");
                
        arbol.preOrden(arbol.regresaRaiz());
        System.out.println("recorrido preorden ");
                
        arbol.postOrden(arbol.regresaRaiz());
        System.out.println("recorrido postorden ");
                
        //Comprobar si el nodo se elimino
        arbol.eliminarNodo(20);
        arbol.inOrden(arbol.regresaRaiz());
        System.out.println("recorrido inorden ");
                
        arbol.muestraAcostado(0, arbol.regresaRaiz());
    }
}
