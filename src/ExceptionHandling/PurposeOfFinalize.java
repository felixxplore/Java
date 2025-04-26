package ExceptionHandling;

class Resource{
    private String resourceName;
    private boolean isResourceOpen;

    public  Resource(String resourceName ){
        this.resourceName=resourceName;
        this.isResourceOpen=true;
        System.out.println("Resource Opened: "+ resourceName);
    }

    public void useResource(){
        if(isResourceOpen){
            System.out.println("Using Resource : "+resourceName);
        }else{
            System.out.println("Resource is closed : "+resourceName);
        }
    }

    @Override
    protected void finalize() throws Throwable{

        try{
            if(isResourceOpen){
            System.out.println("Finalizing Resource : "+resourceName);
            isResourceOpen=false;
        }
        }finally {
            super.finalize();
        }
    }
}
class ModernResource implements AutoCloseable{
    private String resourceName;
    private boolean isResourceOpen;

    public  ModernResource(String resourceName ){
        this.resourceName=resourceName;
        this.isResourceOpen=true;
        System.out.println("Resource Opened: "+ resourceName);
    }

    public void useResource(){
        if(isResourceOpen){
            System.out.println("Using Resource : "+resourceName);
        }else{
            System.out.println("Resource is closed : "+resourceName);
        }
    }


    @Override
    public void close() throws Exception {
        if(isResourceOpen){
            System.out.println("Closing Resource: "+resourceName);
            isResourceOpen=false;
        }
    }
}


public class PurposeOfFinalize {
    public static void main(String[] args) throws Exception {
//        Resource r1=new Resource("file");
//        r1.useResource();
//        r1=null;
//        System.out.println("Suggesting gc...");
//        System.gc();
//        System.out.println("After gc");


         System.out.println("use with try with resource");
        try(ModernResource m1=new ModernResource("file")){
            m1.useResource();
        }
        System.out.println("main method ends.");

    }
}
