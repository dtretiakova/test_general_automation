package collectionsExersizes;

import java.util.*;


//Своя созданная коллекция.
public class OwnArrayList implements List<Dog> {
    private int size = 3;
    private Dog[] dogs = new Dog[size];


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Dog> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Dog dog) {
        if (size >= dogs.length) {
            extend();
        }
        dogs[size++] = dog;
        return true;
    }

    private void extend() {
        Dog[] newArrayCopy = new Dog[dogs.length * 2];
        System.arraycopy(dogs, 0, newArrayCopy, 0, dogs.length);
        dogs = newArrayCopy;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++){
            if (dogs[i].equals(o)) {
                System.arraycopy(dogs, i + 1, dogs, i, size - i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Dog> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Dog> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Dog get(int index) {
        return null;
    }

    @Override
    public Dog set(int index, Dog element) {
        return null;
    }

    @Override
    public void add(int index, Dog element) {
        if (size >= dogs.length) {
            extend();
        }
        System.arraycopy(dogs, index, dogs,index + 1, size - index);
        dogs[index] = element;
        size++;
    }

    @Override
    public Dog remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Dog> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Dog> listIterator(int index) {
        return null;
    }

    @Override
    public List<Dog> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public String toString() {
        return "OwnArrayList{" +
                "dogs=" + Arrays.toString(dogs) +
                '}';
    }
}
