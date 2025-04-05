package pilas;

public class Pilas {

    public static void main(String[] args) {
        Pila p1 = new Pila(5);
        p1.push(100);
        p1.push(80);
        p1.push(60);

        Pila p2 = new Pila(5);
        p2.push(90);
        p2.push(70);
        p2.push(50);

        System.out.println("Pila 1:");
        p1.mostrarPila();

        System.out.println("Pila 2:");
        p2.mostrarPila();

        Pila resultado = Pila.unirOrdenado(p1, p2);

        System.out.println("Pila resultado (ordenada mayor a menor):");
        resultado.mostrarPila();
    }
}


