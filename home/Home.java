package home;

import user.User;

import java.util.Scanner;

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
        System.out.println("See you soon! :-)");
    }

    private static void server_choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You can select a server between:\n(1) Beginner\n(2) Intermediate\n(3) Advanced\n(4) Exit\nYour choice: ");
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
        switch (choice) {
            case 1:
                System.out.println("salon beginner, front (tous les langages simples en front)");
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

    private static void setExit(){
        // si l'entrée du user est égale à "EXIT" alors on return vers le switch plus haut; exception ?
    }
}
