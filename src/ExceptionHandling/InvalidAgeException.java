package ExceptionHandling;

public class InvalidAgeException extends  Exception{
    public InvalidAgeException(){
        super("Age must be more than 18.");
    }
}
