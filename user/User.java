package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class User {
    private static String name ;
    private static boolean gMod = FALSE;
    private static final List<String> command_list = new ArrayList<>();

    public User(final String name) {
        String own_name = "User";
        User.name = name;
    }
    public static String getRoleName(){
        String role_name;
        if (gMod == TRUE){
            role_name = "ADMIN";
        }else {
            role_name ="USER";
        }
        return role_name;
    }
    public static String roleInfo(){
        String info_role = null;
        if (gMod == FALSE){
            info_role = " -> This role is the basic default Role you have when you just join DisCode.";
        }
        if (gMod == TRUE){
            info_role = " -> This role is the Admin Role, you can have access to some hidden commands\nTIPS: Rename yourself god_mod for having access to some documentation for admin role.";
        }

        return (name + " : " + getRoleName() + info_role + "\n");
    }
    public static String reName(){
        System.out.println("Your actual name is :" + name);
        Scanner rename = new Scanner(System.in);
        System.out.println("Enter your new name :");
        name = rename.nextLine();
        return name;
    }
    public static void getInfo() {
        if (gMod == TRUE){
            command_list.add("- $rl : Reading Logs\n");
        }
        command_list.add("- !h : Showing the entire list of commands\n");
        command_list.add("- !ri : Informations of your actual role\n");
        command_list.add("- !n : Showing your own name\n");
        command_list.add("- !rn : Renaming yourself\n");
        command_list.add("\n");
    }

    public static void commands(String input){
        if (Objects.equals(input, "!gm")) {
            gMod = TRUE;
            System.out.println("You are now in God Mod, your role is actually ADMIN");
        }
        if (Objects.equals(input, "!h")) {
            getInfo();
            String result = String.join("", command_list);
            System.out.println(result);
        }
        if (Objects.equals(input, "!ri")) {
            System.out.println(roleInfo());
        }
        if (Objects.equals(input, "!n")){
            System.out.println("Your name is : " + name);
            System.out.println("\n");
        }
        if (Objects.equals(input, "!rn")){
            System.out.println("Your new name :" + reName());
            System.out.println("\n");
        }
        if (Objects.equals(input, "$rl")){
            Admin.readLogs("logs.txt");
            System.out.println("\n");
        }
    }
}
