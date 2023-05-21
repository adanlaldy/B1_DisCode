package servers;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Saloon extends Category{
    private static final List<String> chatting_HTML = new ArrayList<>();
    private static final List<String> faq_HTML = new ArrayList<>();
    private static final List<String> chatting_CSS = new ArrayList<>();
    private static final List<String> faq_CSS = new ArrayList<>();
    private static final List<String> chatting_JS_front = new ArrayList<>();
    private static final List<String> faq_JS_front = new ArrayList<>();

    private static final List<String> chatting_Golang = new ArrayList<>();
    private static final List<String> faq_Golang = new ArrayList<>();
    private static final List<String> chatting_JS_back = new ArrayList<>();
    private static final List<String> faq_JS_back = new ArrayList<>();
    private static final List<String> chatting_MySQL = new ArrayList<>();
    private static final List<String> faq_MySQL = new ArrayList<>();
    private static final List<String> chatting_PHP = new ArrayList<>();
    private static final List<String> faq_PHP = new ArrayList<>();
    private static final List<String> chatting_Cpp = new ArrayList<>();
    private static final List<String> faq_Cpp = new ArrayList<>();
    private static final List<String> chatting_java = new ArrayList<>();
    private static final List<String> faq_java = new ArrayList<>();
    private static final List<String> chatting_C_sharp = new ArrayList<>();
    private static final List<String> faq_C_sharp = new ArrayList<>();
    private static final List<String> chatting_python = new ArrayList<>();
    private static final List<String> faq_python = new ArrayList<>();
    private static final List<String> chatting_C = new ArrayList<>();
    private static final List<String> faq_C = new ArrayList<>();


    private static String name;
    public List<String> chatting;
    public Saloon(String name) {
        super(name);
        Saloon.name = name;
    }
    public static String getName(){
        return name;
    }

    public void add_content(String content){
        chatting.add(content);
    }

    public void set_chatting_HTML(String content){
        chatting_HTML.add(content);
    }

    public List<String> get_chatting_HTML(){
        return chatting_HTML;
    }
    public void set_faq_HTML(String content){
        faq_HTML.add(content);
    }

    public List<String> get_faq_HTML(){
        return faq_HTML;
    }
    public void set_chatting_CSS(String content){
        chatting_CSS.add(content);
    }

    public List<String> get_chatting_CSS(){
        return chatting_CSS;
    }
    public void set_faq_CSS(String content){
        faq_CSS.add(content);
    }

    public List<String> get_faq_CSS(){
        return faq_CSS;
    }
    public void set_chatting_JS_front(String content){
        chatting_JS_front.add(content);
    }

    public List<String> get_chatting_JS_front(){
        return chatting_JS_front;
    }
    public void set_faq_JS_front(String content){
        faq_JS_front.add(content);
    }

    public List<String> get_faq_JS_front(){
        return faq_JS_front;
    }

    public void set_chatting_Golang(String content){
        chatting_Golang.add(content);
    }

    public List<String> get_chatting_Golang(){
        return chatting_Golang;
    }
    public void set_faq_Golang(String content){
        faq_Golang.add(content);
    }

    public List<String> get_faq_Golang(){
        return faq_Golang;
    }
    public void set_chatting_JS_back(String content){
        chatting_JS_back.add(content);
    }

    public List<String> get_chatting_JS_back(){
        return chatting_JS_back;
    }
    public void set_faq_JS_back(String content){
        faq_JS_back.add(content);
    }

    public List<String> get_faq_JS_back(){
        return faq_JS_back;
    }
    public void set_chatting_MySQL(String content){
        chatting_MySQL.add(content);
    }

    public List<String> get_chatting_MySQL(){
        return chatting_MySQL;
    }
    public void set_faq_MySQL(String content){
        faq_MySQL.add(content);
    }

    public List<String> get_faq_MySQL(){
        return faq_MySQL;
    }
    public void set_chatting_PHP(String content){
        chatting_PHP.add(content);
    }

    public List<String> get_chatting_PHP(){
        return chatting_PHP;
    }
    public void set_faq_PHP(String content){
        faq_PHP.add(content);
    }

    public List<String> get_faq_PHP(){
        return faq_PHP;
    }
    public void set_chatting_Cpp(String content){
        chatting_Cpp.add(content);
    }

    public List<String> get_chatting_Cpp(){
        return chatting_Cpp;
    }
    public void set_faq_Cpp(String content){
        faq_Cpp.add(content);
    }

    public List<String> get_faq_Cpp(){
        return faq_Cpp;
    }
    public void set_chatting_java(String content){
        chatting_java.add(content);
    }

    public List<String> get_chatting_java(){
        return chatting_java;
    }
    public void set_faq_java(String content){
        faq_java.add(content);
    }

    public List<String> get_faq_java(){
        return faq_java;
    }
    public void set_chatting_C_sharp(String content){
        chatting_C_sharp.add(content);
    }

    public List<String> get_chatting_C_sharp(){
        return chatting_C_sharp;
    }
    public void set_faq_C_sharp(String content){
        faq_C_sharp.add(content);
    }

    public List<String> get_faq_C_sharp(){
        return faq_C_sharp;
    }
    public void set_chatting_python(String content){
        chatting_python.add(content);
    }

    public List<String> get_chatting_python(){
        return chatting_python;
    }
    public void set_faq_python(String content){
        faq_python.add(content);
    }

    public List<String> get_faq_python(){
        return faq_python;
    }
    public void set_chatting_C(String content){
        chatting_C.add(content);
    }

    public List<String> get_chatting_C(){
        return chatting_C;
    }
    public void set_faq_C(String content){
        faq_C.add(content);
    }

    public List<String> get_faq_C(){
        return faq_C;
    }
}