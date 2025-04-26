package InnerClasses;


 class LightSwitch{
    private String id;

    public LightSwitch(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }

    public interface Command{
        void execute();
    }

    public void trigger(Command command){
        System.out.println("Swtich "+id+" triggered");
        command.execute();
    }
}


public class AnonymousClass {
    public static void main(String[] args) {

        LightSwitch l1=new LightSwitch("101");
        l1.trigger( new LightSwitch.Command(){
            @Override
            public void execute(){
                System.out.println("Light tunred ON for swtich "+ l1.getId());
            }
        });
    }
}
