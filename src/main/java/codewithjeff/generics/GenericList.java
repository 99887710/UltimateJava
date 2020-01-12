package codewithjeff.generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[])new Object[10];
    private int count = 0;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private int index;
        private GenericList<T> list;

        public ListIterator(GenericList list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.count;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
