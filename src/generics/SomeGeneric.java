package generics;

/* Для того чтоб класс стал generic нужно поставить <T> T - type, наш класс будет работать с типом но какой тип ми не знаем
(Параметризирований) Generic отфильтровивает не верние типи на етапе компиляции, а NON Generic по ссилке типа object берет все что угодно
и ошибки возникают уже в процессе виполенения программи (в процессе виполенения програми вибрасивает exception)
Смисл Generic - исключает тупие ошибки которие могут возникнуть во время виполнения програми
 */

public class SomeGeneric<T> {
    private T t;

    public SomeGeneric(T t) {
        this.t = t;
    }

    public T get(){
        return t;
    }

    public void showType(){
        System.out.println("Object type " + t.getClass());
    }
}
