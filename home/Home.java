package home;

import logs.AppClass;
import logs.LogsReader;
import logs.MyLogHandler;
import servers.Category;
import servers.Saloon;
import servers.Server;
import servers.Under_saloon;
import user.User;


import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Home {
    private static boolean exit;


    public static void home() {

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
        System.out.println("See you soon! :]");
    }

    private static void server_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a server between:\n(1) Web\n(2) POO\n(3) Application\n(4) Exit\nYour choice: ");
        // gérer les exceptions lettres etc
        int server_choice = Integer.parseInt(scanner.nextLine());
        switch (server_choice) {
            case 1:
                // Exception, si (category_choice() == 3) -> break;
                if (category_choice() == 1) {
                    saloon_choice(1);
                } else {
                    saloon_choice(2);
                }
                break;
            case 2:
                // Exception, si (category_choice() == 3) -> break;
                if (category_choice() == 1) {
                    saloon_choice(3);
                } else {
                    saloon_choice(4);
                }
                break;
            case 3:
                // Exception, si (category_choice() == 3) -> break;
                if (category_choice() == 1) {
                    saloon_choice(5);
                } else {
                    saloon_choice(6);
                }
                break;
            case 4:
                exit = true;
                break;
        }
    }

    private static int category_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a category:\n(1) Front-end\n(2) Back-end\n(3) Return\nYour choice: ");
        // gérer les exceptions lettres etc
        return Integer.parseInt(scanner.nextLine());
    }


    private static void saloon_choice(int choice) {
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

        //---------SALOONS--------------------------
        //---------for WEB--------------------------
        //(FRONT)
        Saloon html = new Saloon("HTML");
        Saloon css = new Saloon("CSS");
        Saloon js_front = new Saloon("JavaScript-FRONT");
        //(BACK)
        Saloon golang = new Saloon("Golang");
        Saloon js_back = new Saloon("JavaScript-BACK");
        Saloon my_sql = new Saloon("MySQL");
        Saloon php = new Saloon("PHP");

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

        //---------UNDER SALOONS---------------------
        Under_saloon html_chatting = new Under_saloon("HTML-Chatting");
        Under_saloon html_faq = new Under_saloon("HTML-FAQ");

        Under_saloon css_chatting = new Under_saloon("CSS-Chatting");
        Under_saloon css_faq = new Under_saloon("CSS-FAQ");

        Under_saloon js_front_chatting = new Under_saloon("JS Front-Chatting");
        Under_saloon js_front_faq = new Under_saloon("JS Front-FAQ");

        Under_saloon go_chatting = new Under_saloon("GO-Chatting");
        Under_saloon go_faq = new Under_saloon("GO-FAQ");

        Under_saloon js_back_chatting = new Under_saloon("JS Back-Chatting");
        Under_saloon js_back_faq = new Under_saloon("JS Back-FAQ");

        Under_saloon mysql_chatting = new Under_saloon("MYSQL-Chatting");
        Under_saloon mysql_faq = new Under_saloon("MYSQL-FAQ");

        Under_saloon php_chatting = new Under_saloon("PHP-Chatting");
        Under_saloon php_faq = new Under_saloon("PHP-FAQ");

        LogManager.getLogManager().reset();
        Logger rootLogger = LogManager.getLogManager().getLogger("");

        rootLogger.addHandler(new MyLogHandler());
        AppClass appClass = new AppClass();
        switch (choice) {
            case 1:
                System.out.println("Wellcome to Front-End chat ! Enjoy !");
                Scanner scanner = new Scanner(System.in);
                while (!Objects.equals(scanner.nextLine(), "exit")) {
                    rootLogger.info("Message dans " + web_server.getName() + "->" + html.getName() + "->" + html_chatting.getName() +" : " + scanner.nextLine());
                    try {
                        html_chatting.add_content(scanner.nextLine());
                    } catch (NullPointerException ignored) {

                    } finally {
                        System.out.print("");
                    }

                }
                scanner.close();



                // accès au salon spécifique
                // dans salon spécifique (appeler/configurer setExit)

                break;
            case 2:
                LogsReader.readLogs("logs.txt");
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
}
