# UD5-2_Moises_Fernandez_Muina_Problema1 (5 puntos)

Enunciado del problema:

En este ejercicio tendrás que crear una clase denominada SuperList que extienda a la siguiente clase abstracta:

import java.util.ArrayList;

public abstract class ListManager<T> {

    ArrayList<T> list = new ArrayList<T>();

    public abstract void addElement(T element);
    public abstract T removeElement(int position);
    public abstract void showElements();
    public abstract void showReversedElements();

    @Override
    public String toString() {
        String output = "-> ";

        for ( T value: list ) {
            output += value.toString() + " | ";
        }
        return output;
    }
}

A la hora de implementar sus métodos abstractos debes lograr que estos tengan el siguiente comportamiento:

addElement(T element): Debe añadir un elemento al final de la lista.

removeElement(int position): Debe eliminar el elemento que se encuentra en la posición position de la lista y devolverlo.

showElements(): Debe mostrar por pantalla cada elemento de la lista en el orden en el que ha sido insertado seguido de un salto de línea. Debe implementarse con iteradores.

showReversedElements(): Debe mostrar por pantalla cada elemento de la lista en el orden inverso al que fue insertado seguido de un salto de línea.


Crea un pequeño programa que instancie un objeto de tipo SuperList para almacenar enteros.
Inserta cuatro elementos en la instancia de SuperList, elimina el que ocupa la posición 3 y luego muestra la lista haciendo uso de los dos métodos que has programado a tal efecto.
