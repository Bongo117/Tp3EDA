package pilas;

public class Pilas {

    public static void main(String[] args) {
        Pila pilaOrdenada = new Pila(10);

        pilaOrdenada.Pilaordenada(8);
        pilaOrdenada.Pilaordenada(6);
        pilaOrdenada.Pilaordenada(5);
        pilaOrdenada.Pilaordenada(9);
        pilaOrdenada.Pilaordenada(4);
        pilaOrdenada.Pilaordenada(0);
        pilaOrdenada.Pilaordenada(3);
        pilaOrdenada.Pilaordenada(2);

        System.out.println("Pila ordenada de menor a mayor: ");
        pilaOrdenada.mostrarPila(); 
    }
}
    