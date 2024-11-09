package oopExceptions;

public class DogNotValidException extends Exception{
//checked exception
    public DogNotValidException(String message){
      super(message);
  }

}
