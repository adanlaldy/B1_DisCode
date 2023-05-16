package user;

public class User {
    private static String name ;

    public User(final String name) {
        User.name = name;
    }
    public static String getRoleName(){
        return name;
    }
    public String getUserPosition (String pos){
        return pos;
    }
    public String getInfo (String info){
        return info;
    }
    public static String roleInfo(){
        String info_role = "USER -> This role is the basic default Role you have when you just join DisCode.";
        return ("\n" + getRoleName()+ " : " + info_role + "\n");
    }
}
