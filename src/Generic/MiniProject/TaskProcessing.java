package Generic.MiniProject;


import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;


interface Processor<T>{
    T process(T input) throws DataProcessingException;
}

class DataProcessingException extends Exception{
    private Object data;

    public DataProcessingException(String message,Object data){
        super(message);
        this.data=data;
    }

    @SuppressWarnings("unchecked")
    public <T> T getData(){
        return (T) data;
    }
}

class StringProcessor implements Processor<String> {

    @Override
    public String process(String input) throws DataProcessingException {
         if(input==null){
             throw new DataProcessingException("Input can't be null : ",input);
         }

         return "Process Input : "+input.toUpperCase();
    }
}


class DataProcessor{

    public static <T> void processData(List<? super T> results,Processor<T> processor, T input){
       try{
           T result=processor.process(input);
           results.add(result);
       }catch(DataProcessingException e){
           System.out.println("Error : "+e.getMessage()+" Data : "+e.getData());
       }
    }
}
public class TaskProcessing {
    public static void main(String[] args) {

        List<String> results=new ArrayList<>();
        Processor<String> stringProcessor=new StringProcessor();

        DataProcessor.processData(results,stringProcessor,null);
        DataProcessor.processData(results,stringProcessor,"Hello");
        DataProcessor.processData(results,stringProcessor,"Radhe");
         System.out.println(results);
    }
}
