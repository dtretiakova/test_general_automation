package oopExceptions;

public class DogStorage {
    Dog[] dogStorage = new Dog[3];

    public void addDogToStorage(Dog dog) {
        /*try {
           validateDog(dog);

         */

        for (int i = 0; i < dogStorage.length; i++) {
                if (dogStorage[i] == null) {
                    dogStorage[i] = dog;
                    break;
                }
            }
       /* } catch (DogNotValidException e) {
            System.out.println(e.getMessage());
        }

         */

    }

    public Dog findDog(String name) throws DogNotValidException {
        for (int i = 0; i < dogStorage.length; i++) {
            if (dogStorage[i] != null && name.equals(dogStorage[i].getName())) {
                Dog found = dogStorage[i];
                validateDog(found);
                return found;
            }
        }
        throw new DogNotFoundException("Dog with name " + name + " not found");
    }


    public boolean validateDog(Dog dog) throws DogNotValidException {
        if (dog != null && dog.getName() != null && dog.getName().length() >= 3) {
            return true;
        } else {
            throw new DogNotValidException("Dog with name " + dog.getName() + " is not valid");
        }

    }

}
