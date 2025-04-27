package Generic;

public class GenericException {
    public static void main(String[] args) {

        try{
            throw  new CustomException("Radhe");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        try{
            throw new CustomException(123);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}


class CustomException extends Exception{

    public <T>  CustomException(T value){
        super("Exception related to value : "+ value.toString()+" of type: "+value.getClass().getName());
    }
}
