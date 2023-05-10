package servers;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Category extends Server{
    private String name;
    private ArrayList<Type> catgory_content;
    public Category(String name) {
        super(name);
        this.name = name;
    }
}