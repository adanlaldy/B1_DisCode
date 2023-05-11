package home;

import servers.Category;
import servers.Saloon;
import servers.Server;
import servers.Upper_saloon;
import user.User;

import java.util.Scanner;

public class Home {
    private static boolean exit;

    private static int chat_or_faq(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select the " + name + "type saloon :\n(1) Chatting\n(2) FAQ\n(3) Return\nYour choice: ");
        // gérer les exceptions lettres etc
        return Integer.parseInt(scanner.nextLine());
    }

    private static int web_category_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a category:\n(1) Front-end\n(2) Back-end\n(3) Return\nYour choice: ");
        // gérer les exceptions lettres etc
        return Integer.parseInt(scanner.nextLine());
    }

    private static int upper_front_saloon_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a web front saloon:\n(1) HTML\n(2) CSS\n(3) JS_front\n(4) Return\nYour choice: ");
        // gérer les exceptions lettres etc
        return Integer.parseInt(scanner.nextLine());
    }

    private static int upper_back_saloon_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a web back saloon:\n(1) Golang\n(2) JS_back\n(3) MySQL\n(4) PHP\n(5) Return\nYour choice: ");
        // gérer les exceptions lettres etc
        return Integer.parseInt(scanner.nextLine());
    }

    private static int poo_category_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a category:\n(1) C++\n(2) Java\n(3) Return\nYour choice: ");
        // gérer les exceptions lettres etc
        return Integer.parseInt(scanner.nextLine());
    }

    private static int app_category_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a category:\n(1) C#\n(2) Python\n(3) C\n(4) Return\nYour choice: ");
        // gérer les exceptions lettres etc
        return Integer.parseInt(scanner.nextLine());
    }

    public static void home() {
        //----------SERVERS-------------------------
        Server web_server = new Server("Web");
        Server poo_server = new Server("POO");
        Server app_server = new Server("Application");

        //---------CATEGORIES-----------------------
        //---------for WEB--------------------------
        Category front_end = new Category("Front End");
        Category back_end = new Category("Back End");

        //---------for POO--------------------------
        Category cpp = new Category("C++");
        Category java = new Category("JAVA");

        //---------for APP--------------------------
        Category c_sharp = new Category("C#");
        Category python = new Category("Python");
        Category c_language = new Category("C");

        //---------UPPER-SALOON---------------------
        //---------only for WEB---------------------
        //(FRONT)
        Upper_saloon html = new Upper_saloon("HTML");
        Upper_saloon css = new Upper_saloon("CSS");
        Upper_saloon js_front = new Upper_saloon("JavaScript-FRONT");
        //(BACK)
        Upper_saloon golang = new Upper_saloon("Golang");
        Upper_saloon js_back = new Upper_saloon("JavaScript-BACK");
        Upper_saloon my_sql = new Upper_saloon("MySQL");
        Upper_saloon php = new Upper_saloon("PHP");

        //---------SALOONS--------------------------
        //---------for WEB--------------------------
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

        //----------for POO--------------------------
        Saloon cpp_chatting = new Saloon("CPP-Chatting");
        Saloon cpp_faq = new Saloon("CPP-FAQ");

        Saloon java_chatting = new Saloon("JAVA-Chatting");
        Saloon java_faq = new Saloon("JAVA-FAQ");

        //----------for APP---------------------------
        Saloon c_sharp_chatting = new Saloon("C#-Chatting");
        Saloon c_sharp_faq = new Saloon("C#-FAQ");

        Saloon python_chatting = new Saloon("Python-Chatting");
        Saloon python_faq = new Saloon("Python-FAQ");

        Saloon c_chatting = new Saloon("C-Chatting");
        Saloon c_faq = new Saloon("C-FAQ");

        // à traduire
        System.out.println("--Bienvenue sur DisCode, le discord dédié aux passionnés de codage informatique.\nUne fois connecté, vous pourrez intégrer des salons, triés par catégories, eux-mêmes situés sur un serveur pour pouvoir lire des informations ou en demander/partager.--\n");
        // demande à l'utilisateur de rentrer son nom
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        User user1 = new User(scanner.nextLine());
        System.out.println("Welcome to inside of DisCode !!");
        while (!exit) {
            server_choice();
        }
        System.out.println("See you soon! :)");
    }

    private static void web_choice() {
        // gérer les exceptions lettres etc
        switch (web_category_choice()) {
            case 1:
                // gérer les exceptions lettres etc
                switch (upper_front_saloon_choice()) {
                    case 1:
                        // gérer les exceptions lettres etc
                        if (chat_or_faq("HTML") == 1) {
                            // redirection vers le saloon html_chatting_saloon
                        } else {
                            // redirection vers le saloon html_faq_saloon
                        }
                        break;
                    case 2:
                        // gérer les exceptions lettres etc
                        if (chat_or_faq("CSS") == 1) {
                            // redirection vers le saloon css_chatting_saloon
                        } else {
                            // redirection vers le saloon css_faq_saloon
                        }
                        break;
                    case 3:
                        // gérer les exceptions lettres etc
                        if (chat_or_faq("JS_front") == 1) {
                            // redirection vers le saloon js_front_chatting_saloon
                        } else {
                            // redirection vers le saloon js_front_faq_saloon
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
                        // gérer les exceptions lettres etc
                        if (chat_or_faq("Golang") == 1) {
                            // redirection vers le saloon Golang_chatting_saloon
                        } else {
                            // redirection vers le saloon Golang_faq_saloon
                        }
                        break;
                    case 2:
                        // gérer les exceptions lettres etc
                        if (chat_or_faq("JS_back") == 1) {
                            // redirection vers le saloon JS_back_chatting_saloon
                        } else {
                            // redirection vers le saloon JS_back_faq_saloon
                        }
                        break;
                    case 3:
                        // gérer les exceptions lettres etc
                        if (chat_or_faq("MySQL") == 1) {
                            // redirection vers le saloon MySQL_chatting_saloon
                        } else {
                            // redirection vers le saloon MySQL_faq_saloon
                        }
                        break;
                    case 4:
                        // gérer les exceptions lettres etc
                        if (chat_or_faq("PHP") == 1) {
                            // redirection vers le saloon PHP_chatting_saloon
                        } else {
                            // redirection vers le saloon PHP_faq_saloon
                        }
                        break;
                    case 5:
                        // Return
                        break;
                }
                break;
        }
    }

    private static void poo_choice() {
        switch (poo_category_choice()) {
            //exceptions
            case 1:
                if (chat_or_faq("C++") == 1) {
                    //redirection vers  c++ chatting
                } else {
                    //redirection vers c++ faq
                }
                break;
            case 2:
                if (chat_or_faq("Java") == 1) {
                    //redirection vers  java chatting
                } else {
                    //redirection vers java faq
                }
                break;
            case 3:
                // Return
                break;
        }
    }

    private static void app_choice() {
        switch (app_category_choice()) {
            case 1:
                if (chat_or_faq("C#") == 1) {
                    //redirection vers C# chatting
                } else {
                    // redirection vers c# faq
                }
                break;
            case 2:
                if (chat_or_faq("Python") == 1) {
                    //redirection vers Python chatting
                } else {
                    // redirection vers Python faq
                }
                break;
            case 3:
                if (chat_or_faq("C") == 1) {
                    //redirection vers C chatting
                } else {
                    // redirection vers c faq
                }
                break;
            case 4:
                // Return
                break;
        }
    }

    private static void server_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a server between:\n(1) Web\n(2) POO\n(3) Application\n(4) Exit\nYour choice: ");
        // gérer les exceptions lettres etc
        int server_choice = Integer.parseInt(scanner.nextLine());
        switch (server_choice) {
            case 1:
                web_choice();
                break;
            case 2:
                // Exception, si (category_choice() == 3) -> break; etc
                poo_choice();
                break;
            case 3:
                // Exception, si (category_choice() == 3) -> break;
                app_choice();
                break;
            case 4:
                exit = true;
                break;
        }
    }

    private static void saloon_choice(int choice) {
        switch (choice) {
            case 1:
                // choisir un langage en front
                // accès au salon spécifique
                // dans salon spécifique (appeler/configurer setExit)
                break;
            case 2:
                //salon beginner, back (tous les langages simples en back)
                // accès au salon spécifique
                break;
            case 3:
                //salon intermediare, front (tous les langages simples+intermediaires en front)
                // accès au salon spécifique
                break;
            case 4:
                //salon intermediare, back (tous les langages simples+intermediaires en back)
                // accès au salon spécifique

                break;
            case 5:
                // tout en front
                // accès au salon spécifique

                break;
            case 6:
                // tout en back
                // accès au salon spécifique
                break;
        }
    }

    private static void set_exit() {
        // si l'entrée du user est égale à "exit" alors on return vers le switch plus haut; exception ?
    }
}
