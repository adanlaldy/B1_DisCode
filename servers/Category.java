package servers;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Category extends Server{
    private ArrayList<Type> catgory_content;
    public Category(String name) {
        super(name);
    }
}