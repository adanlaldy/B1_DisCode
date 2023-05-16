package servers;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Saloon extends Category{
    private static String name;
    public List<String> chatting;
    public Saloon(String name) {
        super(name);
        this.name = name;
    }
    public static String getName(){
        return name;
    }


    public void add_content(String content){
        chatting.add(content);
    }
}