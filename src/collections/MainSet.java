package collections;

import interfaces.Hero;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 101);
            System.out.print(randomNumber + ", ");
            hashSet.add(randomNumber);
            linkedHashSet.add(randomNumber);
            treeSet.add(randomNumber);
        }
        System.out.println();
        System.out.println("HS:" + hashSet); //добавляет по hashCode
        System.out.println("LHS:" + linkedHashSet); //добавляет по порядку добавления
        System.out.println("TS:" + treeSet); // сортирует по возрастанию

//перебираем колекцию и убираем четние
        Iterator<Integer> iter =  linkedHashSet.iterator();
        while (iter.hasNext()){
            Integer i = iter.next();
            if (i % 2 == 0){
                iter.remove();
            }
        }

        System.out.println(linkedHashSet);

        treeSet.removeAll(linkedHashSet);
        System.out.println("TS:" + treeSet);

        treeSet.retainAll(linkedHashSet);
        System.out.println("TS:" + treeSet);

        treeSet.addAll(linkedHashSet);
        System.out.println("TS:" + treeSet);

    }

}
