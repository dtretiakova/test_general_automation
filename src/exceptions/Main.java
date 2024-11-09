package exceptions;

import oopExceptions.Dog;
import oopExceptions.DogNotFoundException;
import oopExceptions.DogNotValidException;
import oopExceptions.DogStorage;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Start");

        int[] arr = null;
        try {System.out.println(arr[3]);

        }
        catch (ArrayIndexOutOfBoundsException e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        Dog dog = new oopFinal.Dog();
        try {
            dog.someMethod();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


        try {
            Dog dog2 = (Dog) dog.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("End");

         */

        DogStorage dogStorage = new DogStorage();
        dogStorage.addDogToStorage(new Dog("Re", 4));
        dogStorage.addDogToStorage(new Dog("Baron", 10));



        try {
           Dog found = dogStorage.findDog("Tori");
            System.out.println(found);
        } catch (DogNotValidException e) {
            System.out.println(e.getMessage());
            //dogStorage.findDog("Bid");
        } catch (DogNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
        }
        finally {
            System.out.println("Test finally");
        }


        Dog found2 = null;
        try {
            found2 = dogStorage.findDog("Beries");
        } catch (Exception e) {

        }
        System.out.println(found2);


    }
}
