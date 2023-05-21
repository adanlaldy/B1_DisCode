package home;

import exceptions.Only_numbers;
import logs.MyLogHandler;
import servers.Saloon;
import servers.Upper_saloon;
import user.User;

import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Home {

    // on a pas géré l'exception si on fait juste la commande "entrée" dans le terminal
    private static boolean exit;

    private static int chat_or_faq(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select the " + name + " type saloon:\n(1) Chatting\n(2) FAQ\n(3) Return\nYour choice: ");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            try {
                Only_numbers.check_input_3_max(choice);
            } catch (Only_numbers e) {
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
            try {
                Only_numbers.check_input_3_max(choice);
            } catch (Only_numbers e) {
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
            try {
                Only_numbers.check_input_4_max(choice);
            } catch (Exception e) {
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
            try {
                Only_numbers.check_input_5_max(choice);
            } catch (Exception e) {
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
            try {
                Only_numbers.check_input_3_max(choice);
            } catch (Exception e) {
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
            try {
                Only_numbers.check_input_4_max(choice);
            } catch (Exception e) {
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
        System.out.println("/!\\ TIPS : DOn't forget to wright \"!h\" for having the list of commands on DisCode ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        User user1 = new User(scanner.nextLine());
        if (User.getRoleName().equals("god_mod")) {
            System.out.println("This is the github link to pull the source code and get the god_mod ->: https://github.com/adanlaldy/DisCode");
        }
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
            try {
                Only_numbers.check_input_4_max(choice);
            } catch (Exception e) {
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
            case 1 -> {
                switch (upper_front_saloon_choice()) {
                    case 1 -> {
                        switch (chat_or_faq("HTML")){
                            case 1 -> {
                                web_saloon_choice(1);
                            }
                            case 2 -> {
                                web_saloon_choice(2);
                            }
                            case 3 -> {
                                upper_front_saloon_choice();
                            }
                        }
                    }
                    case 2 -> {
                        switch (chat_or_faq("CSS")){
                            case 1 -> {
                                web_saloon_choice(3);
                            }
                            case 2 -> {
                                web_saloon_choice(4);
                            }
                            case 3 -> {
                                upper_front_saloon_choice();
                            }
                        }
                    }
                    case 3 -> {
                        switch (chat_or_faq("JS_front")){
                            case 1 -> {
                                web_saloon_choice(5);
                            }
                            case 2 -> {
                                web_saloon_choice(6);
                            }
                            case 3 -> {
                                upper_front_saloon_choice();
                            }
                        }
                    }
                    case 4 -> web_category_choice();
                }
            }
            case 2 -> {
                switch (upper_back_saloon_choice()) {
                    case 1 -> {
                        switch (chat_or_faq("Golang")){
                            case 1 -> {
                                web_saloon_choice(7);
                            }
                            case 2 -> {
                                web_saloon_choice(8);
                            }
                            case 3 -> {
                                upper_back_saloon_choice();
                            }
                        }
                    }
                    case 2 -> {
                        switch (chat_or_faq("JS_back")){
                            case 1 -> {
                                web_saloon_choice(9);
                            }
                            case 2 -> {
                                web_saloon_choice(10);
                            }
                            case 3 -> {
                                upper_back_saloon_choice();
                            }
                        }
                    }
                    case 3 -> {
                        switch (chat_or_faq("MySQL")){
                            case 1 -> {
                                web_saloon_choice(11);
                            }
                            case 2 -> {
                                web_saloon_choice(12);
                            }
                            case 3 -> {
                                upper_back_saloon_choice();
                            }
                        }
                    }
                    case 4 -> {
                        switch (chat_or_faq("PHP")){
                            case 1 -> {
                                web_saloon_choice(13);
                            }
                            case 2 -> {
                                web_saloon_choice(14);
                            }
                            case 3 -> {
                                upper_back_saloon_choice();
                            }
                        }
                    }
                    case 5 -> web_category_choice();
                }
                web_choice();
            }
        }
    }

    private static void poo_choice() throws Only_numbers {
        switch (poo_category_choice()) {
            case 1:
                switch (chat_or_faq("C++")){
                    case 1 -> {
                        poo_saloon_choice(1);//redirection vers  c++ chatting
                    }
                    case 2 -> {
                        poo_saloon_choice(2);//redirection vers c++ faq
                    }
                    case 3 -> {
                        poo_category_choice();
                    }
                }
                break;
            case 2:
                switch (chat_or_faq("Java")){
                    case 1 -> {
                        poo_saloon_choice(3);//redirection vers  c++ chatting
                    }
                    case 2 -> {
                        poo_saloon_choice(4);//redirection vers c++ faq
                    }
                    case 3 -> {
                        poo_category_choice();
                    }
                }
                break;
            case 3:
                server_choice();
                break;
        }
    }

    private static void app_choice() throws Only_numbers {
        switch (app_category_choice()) {
            case 1:
                switch (chat_or_faq("C#")){
                    case 1 -> {
                        app_saloon_choice(1);
                    }
                    case 2 -> {
                        app_saloon_choice(2);
                    }
                    case 3 -> {
                        app_category_choice();
                    }
                }
                break;
            case 2:
                switch (chat_or_faq("Python")){
                    case 1 -> {
                        app_saloon_choice(3);
                    }
                    case 2 -> {
                        app_saloon_choice(4);
                    }
                    case 3 -> {
                        app_category_choice();
                    }
                }
                break;
            case 3:
                switch (chat_or_faq("C")){
                    case 1 -> {
                        app_saloon_choice(5);
                    }
                    case 2 -> {
                        app_saloon_choice(6);
                    }
                    case 3 -> {
                        app_category_choice();
                    }
                }
                break;
            case 4:
                server_choice();
                break;
        }
    }

    private static <i> void web_saloon_choice(int choice) {
        Upper_saloon html = new Upper_saloon("HTML");
        Upper_saloon css = new Upper_saloon("CSS");
        Upper_saloon js_front = new Upper_saloon("JavaScript-FRONT");
        Upper_saloon golang = new Upper_saloon("Golang");
        Upper_saloon js_back = new Upper_saloon("JavaScript-BACK");
        Upper_saloon my_sql = new Upper_saloon("MySQL");
        Upper_saloon php = new Upper_saloon("PHP");

        //<--------SET UP FOR LOGS------------------------------->
        LogManager.getLogManager().reset();
        Logger rootLogger = LogManager.getLogManager().getLogger("");
        rootLogger.addHandler(new MyLogHandler());
        //<------------------------------------------------------>

        switch (choice) {
            case 1:
                int i = 1;
                int lastIndex = html.get_chatting_HTML().size() - 1;
                System.out.println("\nWelcome to the HTML chat! Enjoy!\n");
                String result = String.join("", html.get_chatting_HTML());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->FRONT-END->HTML->HTML-CHATTING : " + html.get_chatting_HTML().get(i));
                    i++;
                    i++;
                }
                Scanner scanner = new Scanner(System.in);
                String userInput;
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->FRONT-END->HTML->HTML-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->FRONT-END->HTML->HTML-CHATTING : \"" + userInput + "\"");
                    }
                    html.set_chatting_HTML("\n");
                    html.set_chatting_HTML(userInput);
                }
                break;
            case 2:
                i = 1;
                lastIndex = html.get_faq_HTML().size() - 1;
                System.out.println("\nWelcome to the HTML FAQ! Enjoy!\n");
                result = String.join("", html.get_faq_HTML());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->FRONT-END->HTML->HTML-FAQ : " + html.get_faq_HTML().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->FRONT-END->HTML->HTML-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->FRONT-END->HTML->HTML-FAQ : \"" + userInput + "\"");
                    }
                    html.set_faq_HTML("\n");
                    html.set_faq_HTML(userInput);
                }
                break;
            case 3:
                i = 1;
                lastIndex = css.get_chatting_CSS().size() - 1;
                System.out.println("\nWelcome to the CSS chat! Enjoy!\n");
                result = String.join("", css.get_chatting_CSS());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->FRONT-END->CSS->CSS-CHATTING : " + css.get_chatting_CSS().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->FRONT-END->CSS->CSS-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->FRONT-END->CSS->CSS-CHATTING : \"" + userInput + "\"");
                    }
                    css.set_chatting_CSS("\n");
                    css.set_chatting_CSS(userInput);
                }
                break;
            case 4:
                i = 1;
                lastIndex = css.get_faq_CSS().size() - 1;
                System.out.println("\nWelcome to the CSS FAQ! Enjoy!\n");
                result = String.join("", css.get_faq_CSS());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->FRONT-END->CSS->CSS-FAQ : " + css.get_faq_CSS().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->FRONT-END->CSS->CSS-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->FRONT-END->CSS->CSS-FAQ : \"" + userInput + "\"");
                    }
                    css.set_faq_CSS("\n");
                    css.set_faq_CSS(userInput);
                }
                break;
            case 5:
                i = 1;
                lastIndex = js_front.get_chatting_JS_front().size() - 1;
                System.out.println("\nWelcome to the JS_front chat! Enjoy!\n");
                result = String.join("", js_front.get_chatting_JS_front());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->FRONT-END->JS_front->JS_front-CHATTING : " + js_front.get_chatting_JS_front().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->FRONT-END->JS_front->JS_front-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->FRONT-END->JS_front->JS_front-CHATTING : \"" + userInput + "\"");
                    }
                    js_front.set_chatting_JS_front("\n");
                    js_front.set_chatting_JS_front(userInput);
                }
                break;
            case 6:
                i = 1;
                lastIndex = js_front.get_faq_JS_front().size() - 1;
                System.out.println("\nWelcome to the JS_front FAQ! Enjoy!\n");
                result = String.join("", js_front.get_faq_JS_front());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->FRONT-END->JS_front->JS_front-FAQ : " + js_front.get_faq_JS_front().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->FRONT-END->JS_front->JS_front-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->FRONT-END->JS_front->JS_front-FAQ : \"" + userInput + "\"");
                    }
                    js_front.set_faq_JS_front("\n");
                    js_front.set_faq_JS_front(userInput);
                }
                break;
            case 7:
                i = 1;
                lastIndex = golang.get_chatting_Golang().size() - 1;
                System.out.println("\nWelcome to the Golang chat! Enjoy!\n");
                result = String.join("", golang.get_chatting_Golang());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->BACK-END->Golang->Golang-CHATTING : " + golang.get_chatting_Golang().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->BACK-END->Golang->Golang-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->BACK-END->Golang->Golang-CHATTING : \"" + userInput + "\"");
                    }
                    golang.set_chatting_Golang("\n");
                    golang.set_chatting_Golang(userInput);
                }
                break;
            case 8:
                i = 1;
                lastIndex = golang.get_faq_Golang().size() - 1;
                System.out.println("\nWelcome to the Golang FAQ! Enjoy!\n");
                result = String.join("", golang.get_faq_Golang());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->BACK-END->Golang->Golang-FAQ : " + golang.get_faq_Golang().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->BACK-END->Golang->Golang-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->BACK-END->Golang->Golang-FAQ : \"" + userInput + "\"");
                    }
                    golang.set_faq_Golang("\n");
                    golang.set_faq_Golang(userInput);
                }
                break;
            case 9:
                i = 1;
                lastIndex = js_back.get_chatting_JS_back().size() - 1;
                System.out.println("\nWelcome to the JS_back chat! Enjoy!\n");
                result = String.join("", js_back.get_chatting_JS_back());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->BACK-END->JS_back->JS_back-CHATTING : " + js_back.get_chatting_JS_back().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->BACK-END->JS_back->JS_back-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->BACK-END->JS_back->JS_back-CHATTING : \"" + userInput + "\"");
                    }
                    js_back.set_chatting_JS_back("\n");
                    js_back.set_chatting_JS_back(userInput);
                }
                break;
            case 10:
                i = 1;
                lastIndex = js_back.get_faq_JS_back().size() - 1;
                System.out.println("\nWelcome to the JS_back FAQ! Enjoy!\n");
                result = String.join("", js_back.get_faq_JS_back());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->BACK-END->JS_back->JS_back-FAQ : " + js_back.get_faq_JS_back().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->BACK-END->JS_back->JS_back-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->BACK-END->JS_back->JS_back-FAQ : \"" + userInput + "\"");
                    }
                    js_back.set_faq_JS_back("\n");
                    js_back.set_faq_JS_back(userInput);
                }
                break;
            case 11:
                i = 1;
                lastIndex = my_sql.get_chatting_MySQL().size() - 1;
                System.out.println("\nWelcome to the MySQL chat! Enjoy!\n");
                result = String.join("", my_sql.get_chatting_MySQL());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->BACK-END->MySQL->MySQL-CHATTING : " + my_sql.get_chatting_MySQL().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->BACK-END->MySQL->MySQL-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->BACK-END->MySQL->MySQL-CHATTING : \"" + userInput + "\"");
                    }
                    my_sql.set_chatting_MySQL("\n");
                    my_sql.set_chatting_MySQL(userInput);
                }
                break;
            case 12:
                i = 1;
                lastIndex = my_sql.get_faq_MySQL().size() - 1;
                System.out.println("\nWelcome to the MySQL FAQ! Enjoy!\n");
                result = String.join("", my_sql.get_faq_MySQL());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->BACK-END->MySQL->MySQL-FAQ : " + my_sql.get_faq_MySQL().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->BACK-END->MySQL->MySQL-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->BACK-END->MySQL->MySQL-FAQ : \"" + userInput + "\"");
                    }
                    my_sql.set_faq_MySQL("\n");
                    my_sql.set_faq_MySQL(userInput);
                }
                break;
            case 13:
                i = 1;
                lastIndex = php.get_chatting_PHP().size() - 1;
                System.out.println("\nWelcome to the PHP chat! Enjoy!\n");
                result = String.join("", php.get_chatting_PHP());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->BACK-END->PHP->PHP-CHATTING : " + php.get_chatting_PHP().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->BACK-END->PHP->PHP-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->BACK-END->PHP->PHP-CHATTING : \"" + userInput + "\"");
                    }
                    php.set_chatting_PHP("\n");
                    php.set_chatting_PHP(userInput);
                }
                break;
            case 14:
                i = 1;
                lastIndex = php.get_faq_PHP().size() - 1;
                System.out.println("\nWelcome to the PHP FAQ! Enjoy!\n");
                result = String.join("", php.get_faq_PHP());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in WEB-SERVER->BACK-END->PHP->PHP-FAQ : " + php.get_faq_PHP().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in WEB-SERVER->BACK-END->PHP->PHP-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in WEB-SERVER->BACK-END->PHP->PHP-FAQ : \"" + userInput + "\"");
                    }
                    php.set_faq_PHP("\n");
                    php.set_faq_PHP(userInput);
                }
                break;
        }
    }

    private static void poo_saloon_choice(int choice) {
        Saloon cpp_chatting = new Saloon("CPP-Chatting");
        Saloon cpp_faq = new Saloon("CPP-FAQ");
        Saloon java_chatting = new Saloon("JAVA-Chatting");
        Saloon java_faq = new Saloon("JAVA-FAQ");

        //<--------SET UP FOR LOGS------------------------------->
        LogManager.getLogManager().reset();
        Logger rootLogger = LogManager.getLogManager().getLogger("");
        rootLogger.addHandler(new MyLogHandler());
        //<------------------------------------------------------>

        switch (choice) {
            case 1:
                int i = 1;
                int lastIndex = cpp_chatting.get_chatting_Cpp().size() - 1;
                System.out.println("\nWelcome to the C++ chat! Enjoy!\n");
                String result = String.join("", cpp_chatting.get_chatting_Cpp());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in POO->C++->C++-CHATTING : " + cpp_chatting.get_chatting_Cpp().get(i));
                    i++;
                    i++;
                }
                Scanner scanner = new Scanner(System.in);
                String userInput;
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in POO->C++->C++-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in POO->C++->C++-CHATTING : \"" + userInput + "\"");
                    }
                    cpp_chatting.set_chatting_Cpp("\n");
                    cpp_chatting.set_chatting_Cpp(userInput);
                }
                break;
            case 2:
                i = 1;
                lastIndex = cpp_faq.get_faq_Cpp().size() - 1;
                System.out.println("\nWelcome to the C++ FAQ! Enjoy!\n");
                result = String.join("", cpp_faq.get_faq_Cpp());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in POO->C++->C++-FAQ : " + cpp_faq.get_faq_Cpp().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in POO->C++->C++-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in POO->C++->C++-FAQ : \"" + userInput + "\"");
                    }
                    cpp_faq.set_faq_Cpp("\n");
                    cpp_faq.set_faq_Cpp(userInput);
                }
                break;
            case 3:
                i = 1;
                lastIndex = java_chatting.get_chatting_java().size() - 1;
                System.out.println("\nWelcome to the Java chat! Enjoy!\n");
                result = String.join("", java_chatting.get_chatting_java());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in POO->Java->Java-CHATTING : " + java_chatting.get_chatting_java().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in POO->Java->Java-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in POO->Java->Java-CHATTING : \"" + userInput + "\"");
                    }
                    java_chatting.set_chatting_java("\n");
                    java_chatting.set_chatting_java(userInput);
                }
                break;
            case 4:
                i = 1;
                lastIndex = java_faq.get_faq_java().size() - 1;
                System.out.println("\nWelcome to the Java FAQ! Enjoy!\n");
                result = String.join("", java_faq.get_faq_java());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in POO->Java->Java-FAQ : " + java_faq.get_faq_java().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in POO->Java->Java-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in POO->Java->Java-FAQ : \"" + userInput + "\"");
                    }
                    java_faq.set_faq_java("\n");
                    java_faq.set_faq_java(userInput);
                }
                break;
        }
    }

    private static void app_saloon_choice(int choice) {
        Saloon c_sharp_chatting = new Saloon("C#-Chatting");
        Saloon c_sharp_faq = new Saloon("C#-FAQ");
        Saloon python_chatting = new Saloon("Python-Chatting");
        Saloon python_faq = new Saloon("Python-FAQ");
        Saloon c_chatting = new Saloon("C-Chatting");
        Saloon c_faq = new Saloon("C-FAQ");

        //<--------SET UP FOR LOGS------------------------------->
        LogManager.getLogManager().reset();
        Logger rootLogger = LogManager.getLogManager().getLogger("");
        rootLogger.addHandler(new MyLogHandler());
        //<------------------------------------------------------>

        switch (choice) {
            case 1:
                int i = 1;
                int lastIndex = c_sharp_chatting.get_chatting_C_sharp().size() - 1;
                System.out.println("\nWelcome to the C# chat! Enjoy!\n");
                String result = String.join("", c_sharp_chatting.get_chatting_C_sharp());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in Application->C#->C#-CHATTING : " + c_sharp_chatting.get_chatting_C_sharp().get(i));
                    i++;
                    i++;
                }
                Scanner scanner = new Scanner(System.in);
                String userInput;
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in Application->C#->C#-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in Application->C#->C#-CHATTING : \"" + userInput + "\"");
                    }
                    c_sharp_chatting.set_chatting_C_sharp("\n");
                    c_sharp_chatting.set_chatting_C_sharp(userInput);
                }
                break;
            case 2:
                i = 1;
                lastIndex = c_sharp_faq.get_faq_C_sharp().size() - 1;
                System.out.println("\nWelcome to the C# FAQ! Enjoy!\n");
                result = String.join("", c_sharp_faq.get_faq_C_sharp());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in Application->C#->C#-FAQ : " + c_sharp_faq.get_faq_C_sharp().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in Application->C#->C#-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in Application->C#->C#-FAQ : \"" + userInput + "\"");
                    }
                    c_sharp_faq.set_faq_C_sharp("\n");
                    c_sharp_faq.set_faq_C_sharp(userInput);
                }
                break;
            case 3:
                i = 1;
                lastIndex = python_chatting.get_chatting_python().size() - 1;
                System.out.println("\nWelcome to the Python chat! Enjoy!\n");
                result = String.join("", python_chatting.get_chatting_python());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in Application->Python->Python-CHATTING : " + python_chatting.get_chatting_python().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in Application->Python->Python-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in Application->Python->Python-CHATTING : \"" + userInput + "\"");
                    }
                    python_chatting.set_chatting_python("\n");
                    python_chatting.set_chatting_python(userInput);
                }
                break;
            case 4:
                i = 1;
                lastIndex = python_faq.get_faq_python().size() - 1;
                System.out.println("\nWelcome to the Python FAQ! Enjoy!\n");
                result = String.join("", python_faq.get_faq_python());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in Application->Python->Python-FAQ : " + python_faq.get_faq_python().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in Application->Python->Python-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in Application->Python->Python-FAQ : \"" + userInput + "\"");
                    }
                    python_faq.set_faq_python("\n");
                    python_faq.set_faq_python(userInput);
                }
                break;
            case 5:
                i = 1;
                lastIndex = c_chatting.get_chatting_C().size() - 1;
                System.out.println("\nWelcome to the C chat! Enjoy!\n");
                result = String.join("", c_chatting.get_chatting_C());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in Application->C->C-CHATTING : " + c_chatting.get_chatting_C().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in Application->C->C-CHATTING : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in Application->C->C-CHATTING : \"" + userInput + "\"");
                    }
                    c_chatting.set_chatting_C("\n");
                    c_chatting.set_chatting_C(userInput);
                }
                break;
            case 6:
                i = 1;
                lastIndex = c_faq.get_faq_C().size() - 1;
                System.out.println("\nWelcome to the C FAQ! Enjoy!\n");
                result = String.join("", c_faq.get_faq_C());
                System.out.println(result);
                while (i <= lastIndex) {
                    rootLogger.info("Message in Application->C->C-FAQ : " + c_faq.get_faq_C().get(i));
                    i++;
                    i++;
                }
                scanner = new Scanner(System.in);
                while (!(userInput = scanner.nextLine()).equals("exit")) {
                    User.commands(userInput);
                    String first_char = String.valueOf(userInput.charAt(0));
                    if (!(first_char.equals("!"))) {
                        rootLogger.info("Message in Application->C->C-FAQ : \"" + userInput + "\"");
                    } else {
                        rootLogger.info("Command in Application->C->C-FAQ : \"" + userInput + "\"");
                    }
                    c_faq.set_faq_C("\n");
                    c_faq.set_faq_C(userInput);
                }
                break;
        }
    }
}
