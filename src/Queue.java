/**
 * Interfície genèrica que defineix les operacions bàsiques d'una cua (queue),
 * estructura de dades que segueix la política FIFO (First In, First Out).
 *
 * @param <E> el tipus d'elements que contindrà la cua
 */
public interface Queue<E> {

    /**
     * Afegeix (encua) un nou element al final de la cua.
     *
     * @param e l'element a afegir a la cua
     * @throws FullQueueException si la cua està plena i no es poden afegir més elements
     */
    public void push(E e) throws FullQueueException;

    /**
     * Extreu (desencua) i retorna l'element situat al capdavant de la cua.
     *
     * @return l'element al capdavant de la cua
     * @throws EmptyQueueException si la cua està buida i no hi ha cap element per extreure
     */
    public E pop() throws EmptyQueueException;

    /**
     * Retorna la quantitat d'elements actuals que hi ha a la cua.
     *
     * @return el nombre d'elements presents a la cua
     */
    public int size();
}
