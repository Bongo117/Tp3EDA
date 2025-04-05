package pilas;

public class Pila {

    private int[] datos;
    private int tope;
    private int tam;

    public Pila(int i) {
        this.tam = i;
        this.datos = new int[tam];
        this.tope = -1;
    }

    public boolean push(int ingreso) {
        if (!pilaLlena()) {
            tope++;
            datos[tope] = ingreso;
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        if (!pilaVacia()) {
            tope--;
            return datos[tope + 1];
        } else {
            return -1;
        }
    }

    public boolean pilaVacia() {
        return this.tope == -1;
    }

    public boolean pilaLlena() {
        return this.tam - 1 == this.tope;
    }

    public int verTope() {
        if (!pilaVacia()) {
            return datos[tope];
        } else {
            return -1;
        }
    }

    public int getTope() {
        return tope;
    }

    public void mostrarPila() {
        Pila paux = new Pila(tam);
        while (!pilaVacia()) {
            int valor = this.pop();
            System.out.print(valor + " ");
            paux.push(valor);
        }
        System.out.println("");
        while (!paux.pilaVacia()) {
            this.push(paux.pop());
        }
    }

    public static Pila unirOrdenado(Pila p1, Pila p2) {
        Pila copia1 = copiar(p1);
        Pila copia2 = copiar(p2);
        Pila resultado = new Pila(copia1.getTope() + copia2.getTope() + 2);

        while (!copia1.pilaVacia() || !copia2.pilaVacia()) {
            if (!copia1.pilaVacia() && (copia2.pilaVacia() || copia1.verTope() >= copia2.verTope())) {
                resultado.push(copia1.pop());
            } else {
                resultado.push(copia2.pop());
            }
        }

        return resultado;
    }

    public static Pila copiar(Pila original) {
        Pila aux = new Pila(original.tam);
        Pila copia = new Pila(original.tam);

        // Copiamos a aux y a la copia
        while (!original.pilaVacia()) {
            int valor = original.pop();
            aux.push(valor);
        }
        while (!aux.pilaVacia()) {
            int valor = aux.pop();
            original.push(valor); // restauramos
            copia.push(valor);    // copiamos
        }

        return copia;
    }
}
