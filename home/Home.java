package home;

import exceptions.Only_numbers;
import logs.AppClass;
import logs.LogsReader;
import logs.MyLogHandler;
import servers.Category;
import servers.Saloon;
import servers.Server;
import servers.Upper_saloon;
import user.User;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Home {
    private static boolean exit;

    private static int chat_or_faq(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select the " + name + " type saloon:\n(1) Chatting\n(2) FAQ\n(3) Return\nYour choice: ");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            try{
                Only_numbers.check_input_3_max(choice);
            }catch (Only_numbers e){
                System.err.println(e);
            }
        } else {
            System.err.println("Error : you have to enter a number");
        }
        return choice;
    }

    private static int web_category_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a category:\n(1) Front-end\n(2) Back-end\n(3) Return\nYour choice: ");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            try{
                Only_numbers.check_input_3_max(choice);
            }catch (Only_numbers e){
                System.err.println(e);
            }
        } else {
            System.err.println("Error : you have to enter a number");
        }
        return choice;
    }

    private static int upper_front_saloon_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a web front saloon:\n(1) HTML\n(2) CSS\n(3) JS_front\n(4) Return\nYour choice: ");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            try{
                Only_numbers.check_input_4_max(choice);
            }catch (Exception e){
                System.err.println(e);
            }
        } else {
            System.err.println("Error : you have to enter a number");
        }
        return choice;
    }

    private static int upper_back_saloon_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a web back saloon:\n(1) Golang\n(2) JS_back\n(3) MySQL\n(4) PHP\n(5) Return\nYour choice: ");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            try{
                Only_numbers.check_input_5_max(choice);
            }catch (Exception e){
                System.err.println(e);
            }
        } else {
            System.err.println("Error : you have to enter a number");
        }
        return choice;
    }

    private static int poo_category_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a category:\n(1) C++\n(2) Java\n(3) Return\nYour choice: ");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            try{
                Only_numbers.check_input_3_max(choice);
            }catch (Exception e){
                System.err.println(e);
            }
        } else {
            System.err.println("Error : you have to enter a number");
        }
        return choice;
    }

    private static int app_category_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a category:\n(1) C#\n(2) Python\n(3) C\n(4) Return\nYour choice: ");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            try{
                Only_numbers.check_input_4_max(choice);
            }catch (Exception e){
                System.err.println(e);
            }
        } else {
            System.err.println("Error : you have to enter a number");
        }
        return choice;
    }

    public static void home() throws Only_numbers {
        System.out.println("--Welcome to DisCode, the Discord for the dedicated to computer coding enthusiasts.\nOnce connected, you will be able to integrate rooms, sorted by categories, themselves located on a server to be able to read information or request/share it.--\n");
        // demande à l'utilisateur de rentrer son nom
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        User user1 = new User(scanner.nextLine());
        System.out.println("Welcome to inside of DisCode !!");
        while (!exit) {
            server_choice();
        }
        System.out.println("See you soon! :]");
    }

    private static void server_choice() throws Only_numbers {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a server between:\n(1) Web\n(2) POO\n(3) Application\n(4) Exit\nYour choice: ");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            try{
                Only_numbers.check_input_4_max(choice);
            }catch (Exception e){
                System.err.println(e);
            }
        } else {
            System.err.println("Error : you have to enter a number");
        }
        switch (choice) {
            case 1:
                web_choice();
                break;
            case 2:
                poo_choice();
                break;
            case 3:
                app_choice();
                break;
            case 4:
                exit = true;
                break;
        }
    }

    private static void web_choice() throws Only_numbers {
        switch (web_category_choice()) {
            case 1:
                switch (upper_front_saloon_choice()) {
                    case 1:
                        if (chat_or_faq("HTML") == 1) {
                            web_saloon_choice(1);
                        } else {
                            web_saloon_choice(2);
                        }
                        break;
                    case 2:
                        if (chat_or_faq("CSS") == 1) {
                            web_saloon_choice(3);
                        } else {
                            web_saloon_choice(4);
                        }
                        break;
                    case 3:
                        if (chat_or_faq("JS_front") == 1) {
                            web_saloon_choice(5);// redirection vers le saloon js_front_chatting_saloon
                        } else {
                            web_saloon_choice(6);// redirection vers le saloon js_front_faq_saloon
                        }
                        break;
                    case 4:
                        // Return
                        break;
                }
                break;
            case 2:
                switch (upper_back_saloon_choice()) {
                    case 1:
                        if (chat_or_faq("Golang") == 1) {
                            web_saloon_choice(7);// redirection vers le saloon Golang_chatting_saloon
                        } else {
                            web_saloon_choice(8);// redirection vers le saloon Golang_faq_saloon
                        }
                        break;
                    case 2:
                        if (chat_or_faq("JS_back") == 1) {
                            web_saloon_choice(9);// redirection vers le saloon JS_back_chatting_saloon
                        } else {
                            web_saloon_choice(10);// redirection vers le saloon JS_back_faq_saloon
                        }
                        break;
                    case 3:
                        if (chat_or_faq("MySQL") == 1) {
                            web_saloon_choice(11);// redirection vers le saloon MySQL_chatting_saloon
                        } else {
                            web_saloon_choice(12);// redirection vers le saloon MySQL_faq_saloon
                        }
                        break;
                    case 4:
                        if (chat_or_faq("PHP") == 1) {
                            web_saloon_choice(13);// redirection vers le saloon PHP_chatting_saloon
                        } else {
                            web_saloon_choice(14);// redirection vers le saloon PHP_faq_saloon
                        }
                        break;
                    case 5:
                        // Return
                        break;
                }
                break;
        }
    }

    private static void poo_choice() throws Only_numbers {
        switch (poo_category_choice()) {
            case 1:
                if (chat_or_faq("C++") == 1) {
                    poo_saloon_choice(1);//redirection vers  c++ chatting
                } else {
                    poo_saloon_choice(2);//redirection vers c++ faq
                }
                break;
            case 2:
                if (chat_or_faq("Java") == 1) {
                    poo_saloon_choice(3);//redirection vers  java chatting
                } else {
                    poo_saloon_choice(4);//redirection vers java faq
                }
                break;
            case 3:
                // Return
                break;
        }
    }

    private static void app_choice() throws Only_numbers {
        switch (app_category_choice()) {
            case 1:
                if (chat_or_faq("C#") == 1) {
                    app_saloon_choice(1);//redirection vers C# chatting
                } else {
                    app_saloon_choice(2);// redirection vers c# faq
                }
                break;
            case 2:
                if (chat_or_faq("Python") == 1) {
                    app_saloon_choice(3);//redirection vers Python chatting
                } else {
                    app_saloon_choice(4);// redirection vers Python faq
                }
                break;
            case 3:
                if (chat_or_faq("C") == 1) {
                    app_saloon_choice(5);//redirection vers C chatting
                } else {
                    app_saloon_choice(6);// redirection vers c faq
                }
                break;
            case 4:
                // Return
                break;
        }
    }

    private static void web_saloon_choice(int choice) {
        Server web_server = new Server("Web");

        //<-----------CATEGORIES PAS UTILISEE---------->
        Category front_end = new Category("Front End");
        Category back_end = new Category("Back End");
        //<<------------------------------------------->

        Upper_saloon html = new Upper_saloon("HTML");
        Upper_saloon css = new Upper_saloon("CSS");
        Upper_saloon js_front = new Upper_saloon("JavaScript-FRONT");
        Upper_saloon golang = new Upper_saloon("Golang");
        Upper_saloon js_back = new Upper_saloon("JavaScript-BACK");
        Upper_saloon my_sql = new Upper_saloon("MySQL");
        Upper_saloon php = new Upper_saloon("PHP");
        Saloon html_chatting = new Saloon("HTML-Chatting");
        Saloon html_faq = new Saloon("HTML-FAQ");
        Saloon css_chatting = new Saloon("CSS-Chatting");
        Saloon css_faq = new Saloon("CSS-FAQ");
        Saloon js_front_chatting = new Saloon("JS Front-Chatting");
        Saloon js_front_faq = new Saloon("JS Front-FAQ");
        Saloon go_chatting = new Saloon("GO-Chatting");
        Saloon go_faq = new Saloon("GO-FAQ");
        Saloon js_back_chatting = new Saloon("JS Back-Chatting");
        Saloon js_back_faq = new Saloon("JS Back-FAQ");
        Saloon mysql_chatting = new Saloon("MYSQL-Chatting");
        Saloon mysql_faq = new Saloon("MYSQL-FAQ");
        Saloon php_chatting = new Saloon("PHP-Chatting");
        Saloon php_faq = new Saloon("PHP-FAQ");

        //<--------JE SAIS PAS------------------------------->
        LogManager.getLogManager().reset();
        Logger rootLogger = LogManager.getLogManager().getLogger("");
        rootLogger.addHandler(new MyLogHandler());
        AppClass appClass = new AppClass();
        //<--------------CE QUE C'EST----------------------------->

        switch (choice) {
            case 1:
                System.out.println("Welcome to the Front-End chat! Enjoy!");
                Scanner scanner = new Scanner(System.in);
                String userInput;

                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    rootLogger.info("Message in " + web_server.getName() + "->" + html.getName() + "->" + html_chatting.getName() + ": \"" + userInput + "\"");
                    try {
                        html_chatting.add_content(userInput);
                    } catch (NullPointerException ignored) {

                    } finally {
                        System.out.print("");
                    }
                }
                scanner.close();
                break;
            case 2:
                //JE SAIS PAS C'EST QUOI
                LogsReader.readLogs("logs.txt");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
        }
    }

    private static void poo_saloon_choice(int choice) {
        Server poo_server = new Server("POO");
        Category cpp = new Category("C++");
        Category java = new Category("JAVA");
        Saloon cpp_chatting = new Saloon("CPP-Chatting");
        Saloon cpp_faq = new Saloon("CPP-FAQ");
        Saloon java_chatting = new Saloon("JAVA-Chatting");
        Saloon java_faq = new Saloon("JAVA-FAQ");
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    private static void app_saloon_choice(int choice) {
        Server app_server = new Server("Application");
        Category c_sharp = new Category("C#");
        Category python = new Category("Python");
        Category c_language = new Category("C");
        Saloon c_sharp_chatting = new Saloon("C#-Chatting");
        Saloon c_sharp_faq = new Saloon("C#-FAQ");
        Saloon python_chatting = new Saloon("Python-Chatting");
        Saloon python_faq = new Saloon("Python-FAQ");
        Saloon c_chatting = new Saloon("C-Chatting");
        Saloon c_faq = new Saloon("C-FAQ");
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
