package Collections.MapInterface;

import java.util.WeakHashMap;

public class Weakhashmap {
    public static void main(String[] args) {

        WeakHashMap<String,Image> map=new WeakHashMap<>();
        map.put(new String("img1"),new Image("Image 1"));
        map.put(new String("img2"),new Image("Image 2"));
        System.out.println(map);
        System.gc();// suggest to jvm to remove weakhashamp

        try{
            Thread.sleep(5000);
        }catch (Exception e){}

        System.out.println(map);
    }
}

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
