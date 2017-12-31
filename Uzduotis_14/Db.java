package Uzduotis_14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Db<E> implements Iterable<E> {
    private List<E> sarasas = new ArrayList<>();

    ReverseOrder reverseIterator = new ReverseOrder();

    public void add(E element)
    {
        sarasas.add(element);
    }

    @Override
    public Iterator<E> iterator() {
        return sarasas.iterator();
    }

    public class ReverseOrder  implements Iterable<E>
    {
        int cursor =0;

        @Override
        public Iterator<E> iterator() {

            cursor =sarasas.size()-1;

            return new Iterator<E>() {
                @Override
                public boolean hasNext() {
                    return cursor >= 0;
                }

                @Override
                public E next() {
                    return sarasas.get(cursor--);
                }
            };
        }
    }
}
