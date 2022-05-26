package com.ud5problema1.superlist;

import java.util.Iterator;

public class SuperList<T> extends ListManager<T> {

    @Override
    public void addElement(T element) {
        list.add(element);
    }

    @Override
    public T removeElement(int position) {
        return list.remove(position);
    }

    @Override
    public void showElements() {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public void showReversedElements() {
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
