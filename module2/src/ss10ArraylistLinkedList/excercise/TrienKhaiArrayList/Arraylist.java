package ss10ArraylistLinkedList.excercise.TrienKhaiArrayList;

public class Arraylist<E> {
    public int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    public Arraylist() {
    }

    public Arraylist(int size) {
        this.size = size;
        elements = new Object[size];
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void add(int index, E element) {
        Object temp = elements[index];
        elements[index] = element;
        for (int i = index + 1; i < elements.length; i++) {
            elements[i] = temp;
            temp = elements[i++];
        }
    }

    public E remove(int index) {
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " , Size: " + index);
        }
        E indexRemove;
        indexRemove = (E) elements[index];
        for (int i = 0; i < elements.length; i++) {
            elements[index] = elements[i++];
        }
        return indexRemove;
    }

    public int size() {
        return size;
    }

    public E clone() {
        Object[] cloneElement = new Object[size()];
        for (int i = 0; i < elements.length; i++) {
            cloneElement[i] = elements[i];
        }
        return (E) cloneElement;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean Add(E e) {
        ensureCapacity();
        elements[size] = e;
        size++;
        return false;
    }

    public void ensureCapacity() {
        if (size >= elements.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elements, 0, newData, 0, size);
            elements = newData;
        }
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
