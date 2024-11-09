package oopExceptions;

public class DogNotFoundException extends IllegalArgumentException{
//unchecked exception
    public DogNotFoundException(String message){
        super(message);
    }

}
