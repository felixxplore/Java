package Generic;

class Month {

    // Generic used in constructor
    public <T extends  Number> Month(T item){

     }

}


public class Constructors {
    public static void main(String[] args) {

        Month m1=new Month(1);
        Constructors c1=new Constructors();
        c1.displayList(new Integer[]{1,2,3,4,5});
        c1.displayList(new String[]{"Radhe","Radhe","Krishna"});
    }

    public  <T> void displayList(T[] items){
        // method body
        for(T element:items){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
