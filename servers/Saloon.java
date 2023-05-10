package servers;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Saloon extends Category{
    private String userText;
    private List<String> chatting;
    public Saloon(String name) {
        super(name);
    }
    public void set_user_text(String content){
        userText = content;
    }

    public void add_content(){
        chatting.add(userText);
    }
}