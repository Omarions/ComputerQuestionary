package questionary;

import java.util.Scanner;

public class Questionary {
    //Constants for menus and its items
    public static final String[] CATEGORIES = {"Products", "Services", "Tools", "Support", "Contact", "Restart Questionary", "Exit"};
    public static final String[] PRODUCTS_MENU = {"HP", "DELL", "Back", "Exit"};
    public static final String[] SERVICES_MENU = {"Upgrading", "Maintenance", "Back", "Exit"};
    public static final String[] TOOLS_MENU = {"Inputs Devices", "Printing Devices", "Back", "Exit"};
    public static final String[] SUPPORT_MENU = {"HW Support", "SW Support", "Back", "Exit"};
    public static final String[] CONTACT_MENU = {"Phone", "Mail", "Back", "Exit"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Questionary Application");
        System.out.println("---------------------------");
        System.out.println("");

        
        //create the scanner to get input from the user.
        Scanner input = new Scanner(System.in);
        //always show the menu until exit the application.
        while (true) {
            System.out.println("Please, answer the following qeustions to help you in purchasing computer...");
            System.out.println("1.How does the user like to use the computer?");
            System.out.println("a.	Sit in one place.");
            System.out.println("b.	Freedom to using the computer anywhere and can be taken anywhere anytime.");
            System.out.print("Enter your choice (a or b): ");

            //read the choice from the user
            String choice = input.nextLine();
            switch (choice) {
                case "a":       //for Desktop
                    desktop(input);
                    break;
                case "b":       //for laptop
                    laptop(input);
                    break;
            }
            //show the main menu.
            mainMenu();
        }
    }

    /**
     * For main menu
     */
    public static void mainMenu() {

        System.out.println("Please, select a category...");
        Scanner input = new Scanner(System.in);
        int choice;
        try {

            for (int i = 0; i < CATEGORIES.length; i++) {
                System.out.println((i + 1) + ". " + CATEGORIES[i]);
            }
            System.out.print("Your choice: ");
            choice = Integer.valueOf(input.nextLine());
            //always show the menu.
            while (choice != -1) {
                switch (choice) {
                    case 1:             //show the product sub-menu
                        products(input);
                        break;
                    case 2:             //show the services sub-menu
                        services(input);
                        break;
                    case 3:             //show the tools sub-menu
                        tools(input);
                        break;
                    case 4:             //show the support sub-menu
                        support(input);
                        break;
                    case 5:             //show the contact sub-menu
                        contact(input);
                        break;
                    case 6:             //restart questionary
                        break;
                    case 7:             //exit the application
                        System.exit(0);
                    default:            //in case not defined choice.
                        mainMenu();
                        break;
                }
                break;
            }
        } catch (NumberFormatException ex) {
            //in case wrong choice 
            System.err.println("Please, select number...");
            mainMenu();
        }

    }

    /**
     * sub-menu of product menu item.
     *
     * @param input
     */
    public static void products(Scanner input) {
        System.out.println("Please, select an Item...");
        int choice;
        try {
            //show the products items sub-menu
            for (int i = 0; i < PRODUCTS_MENU.length; i++) {
                System.out.println((i + 1) + ". " + PRODUCTS_MENU[i]);
            }
            System.out.print("Your choice: ");
            //read the choice from the user
            choice = Integer.valueOf(input.nextLine());
            //always show the menu.
            while (choice != -1) {
                switch (choice) {
                    case 1:         //show HP recommendation device
                        System.out.println("We would recommend HP Pavilion P6 Model");
                        System.out.println("");
                        break;
                    case 2:         //show Dell recommendation device
                        System.out.println("We would recommend DELL Latitude E6520 Model");
                        System.out.println("");
                        break;
                    case 3:         //back to the main menu.
                        mainMenu();
                        break;
                    case 4:         //exit the application
                        System.exit(0);
                    default:        //in case undefined choice
                        products(input);
                        break;
                }
                break;
            }
        } catch (NumberFormatException ex) {
            //in case wrong choice
            System.err.println("Please, select number...");
            products(input);
        }
    }

    /**
     * sub-menu of services menu item.
     *
     * @param input
     */
    public static void services(Scanner input) {
        System.out.println("Please, select an Item...");
        int choice;
        try {
            //show the services sub-menu items
            for (int i = 0; i < SERVICES_MENU.length; i++) {
                System.out.println((i + 1) + ". " + SERVICES_MENU[i]);
            }
            System.out.print("Your choice: ");
            //read the choice from the user
            choice = Integer.valueOf(input.nextLine());
            //always show the menu.
            while (choice != -1) {

                switch (choice) {
                    case 1:         //show upgrade services
                        System.out.println("We could help you in upgrading hardware...");
                        System.out.println("");
                        break;
                    case 2:         //show maintenance services
                        System.out.println("We could help you in mainaining hardware...");
                        System.out.println("");
                        break;
                    case 3:         //back to the main menu
                        mainMenu();
                        break;
                    case 4:         //exit the application
                        System.exit(0);
                    default:        //in case undefined choice.
                        services(input);
                        break;
                }
                break;
            }
        } catch (NumberFormatException ex) {
            //in case wrong choice.
            System.err.println("Please, select number...");
            services(input);
        }
    }
    
    /**
     * sub-menu of tools menu item.
     *
     * @param input
     */
    public static void tools(Scanner input) {
        System.out.println("Please, select an Item...");
        int choice;
        try {
            //show tools sub-menu items
            for (int i = 0; i < TOOLS_MENU.length; i++) {
                System.out.println((i + 1) + ". " + TOOLS_MENU[i]);
            }
            System.out.print("Your choice: ");
            //read the choice from the user
            choice = Integer.valueOf(input.nextLine());
            //always show the menu.
            while (choice != -1) {

                switch (choice) {
                    case 1:             //show input devices tools 
                        System.out.println("We have perfect input devices...");
                        System.out.println("");
                        break;
                    case 2:             //show the printing devices tools
                        System.out.println("We have perfect printing devices...");
                        System.out.println("");
                        break;
                    case 3:             //back the main menu
                        mainMenu();
                        break;
                    case 4:             //exit the application
                        System.exit(0);
                    default:            //in case undefined choice
                        tools(input);
                        break;
                }
                break;
            }
        } catch (NumberFormatException ex) {
            //in case wrong choice
            System.err.println("Please, select number...");
            tools(input);
        }
    }
    
    /**
     * sub-menu of support menu item.
     *
     * @param input
     */
    public static void support(Scanner input) {
        System.out.println("Please, select an Item...");
        int choice;
        try {
            //show support sub-menu items
            for (int i = 0; i < SUPPORT_MENU.length; i++) {
                System.out.println((i + 1) + ". " + SUPPORT_MENU[i]);
            }
            System.out.print("Your choice: ");
            //read the choice from the user
            choice = Integer.valueOf(input.nextLine());
            //always show the menu.
            while (choice != -1) {

                switch (choice) {
                    case 1:             //show the support in hardware
                        System.out.println("We could support you in Hardware issues...");
                        System.out.println("");
                        break;
                    case 2:             //show the support in software
                        System.out.println("We could support you in Software issues...");
                        System.out.println("");
                        break;
                    case 3:             //back to main menu
                        mainMenu();
                        break;
                    case 4:             //exit the application
                        System.exit(0);
                    default:            //in case undefined choice
                        support(input);
                        break;
                }
                break;
            }
        } catch (NumberFormatException ex) {
            //in case wrong choice.
            System.err.println("Please, select number...");
            support(input);
        }
    }
    
    /**
     * sub-menu of contact menu item.
     *
     * @param input
     */
    public static void contact(Scanner input) {
        System.out.println("Please, select an Item...");
        int choice;
        try {
            //show the contact sub-menu items
            for (int i = 0; i < CONTACT_MENU.length; i++) {
                System.out.println((i + 1) + ". " + CONTACT_MENU[i]);
            }
            System.out.print("Your choice: ");
            //read the choice from the user
            choice = Integer.valueOf(input.nextLine());
            //always show the menu.
            while (choice != -1) {

                switch (choice) {
                    case 1:             //show phone contact
                        System.out.println("Our Phone number: 01119911001 - 02224443330");
                        System.out.println("");
                        break;
                    case 2:             //show mail contact
                        System.out.println("our Mail: info@company.com");
                        System.out.println("");
                        break;
                    case 3:             //back to the main menu
                        mainMenu();
                        break;
                    case 4:             //exit the application
                        System.exit(0);
                    default:            //in case undefined choice
                        contact(input);
                        break;
                }
                break;
            }
        } catch (NumberFormatException ex) {
            //in case wrong choice
            System.err.println("Please, select number...");
            contact(input);
        }
    }

    /**
     * Questionary for Intel processor
     *
     * @param input
     */
    public static void intel(Scanner input) {
        System.out.println("What is the purpose of buying desktop?");
        System.out.println("a.	Gaming.");
        System.out.println("b.	General Use.");
        System.out.print("Enter your choice (a or b): ");
        String choice = input.nextLine();
        if ("a".equalsIgnoreCase(choice)) { //for gaming (Intel)
            gaming(input, "intel");
        } else if ("b".equalsIgnoreCase(choice)) {  //for general use (Intel)
            generalUse(input, "intel");
        } else {
            System.out.println("Please, choose from options...");
            intel(input);
        }
    }

    /**
     * Questionary for AMD processor
     *
     * @param input
     */
    public static void amd(Scanner input) {
        System.out.println("What is the purpose of buying desktop?");
        System.out.println("a.	Gaming.");
        System.out.println("b.	General Use.");
        System.out.print("Enter your choice (a or b): ");
        String choice = input.nextLine();
        if ("a".equalsIgnoreCase(choice)) { //for gaming (Intel)
            gaming(input, "amd");
        } else if ("b".equalsIgnoreCase(choice)) {  //for general use (Intel)
            generalUse(input, "amd");
        } else {
            System.out.println("Please, choose from options...");
            amd(input);
        }
    }

    public static void desktop(Scanner input) {
        System.out.println("buying a desktop is a good option for you.");
        System.out.println("Will the user be looking for Intel or AMD processor?");
        System.out.println("a.	Intel.");
        System.out.println("b.	AMD.");
        System.out.print("Enter your choice (a or b): ");
        String choice = input.nextLine();
        if ("a".equalsIgnoreCase(choice)) {     //for Intel
            intel(input);
        } else if ("b".equalsIgnoreCase(choice)) {  //for AMD
            amd(input);
        } else {
            System.out.println("Please, choose processor type from options...");
            desktop(input);
        }
    }

    public static void laptop(Scanner input) {
        System.out.println("buying a laptop is a good option for you.");
        System.out.println("buying a desktop is a good option for you.");
        System.out.println("What kinf of processor do you want for your laptop??");
        System.out.println("a.	Intel.");
        System.out.println("b.	AMD.");
        System.out.print("Enter your choice (a or b): ");
        String choice = input.nextLine();
        if ("a".equalsIgnoreCase(choice)) {     //for Intel
            intel(input);
        } else if ("b".equalsIgnoreCase(choice)) {  //for AMD
            amd(input);
        }
    }

    /**
     * For gaming questions.
     *
     * @param input
     * @param processorType
     */
    public static void gaming(Scanner input, String processorType) {
        //check the processor type first.
        System.out.println("Are you a hardcore gamer?");
        System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
        String choice = input.nextLine();
        if ("intel".equalsIgnoreCase(processorType)) {
            if ("y".equalsIgnoreCase(choice)) { //for hard gaming
                System.out.println("a.	We would recommend you for Intel core i7 processor.\n"
                        + "b.	Intel HD Graphic card of 4200/4400 is recommended.\n"
                        + "c.	We would recommend you a RAM of 8GB.");
                System.out.println("Will you be downloading a lot games in the computer?");
                System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
                choice = input.nextLine();
                if ("y".equalsIgnoreCase(choice)) { //for heavy download
                    System.out.println("we would recommend you a hard-drive of at least 1TB or higher.");
                } else if ("n".equalsIgnoreCase(choice)) {  //for not heavy download.
                    System.out.println("we would recommend you a hard-drive of at least 750GB or higher.");
                } else {
                    System.out.println("Please, choose from options...");
                    gaming(input, "intel");
                }
            } else if ("n".equalsIgnoreCase(choice)) {  //for not hard gaming.
                //display recommendation.
                System.out.println("a.	We would recommend you for Intel core i3-i5 processor.\n"
                        + "b.	Intel HD graphic card of 4200/4400 is recommended. \n"
                        + "c.	We would recommend you a RAM of GB.");
                //further questions.
                System.out.println("Will you be downloading a lot of games in the computer?");
                System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
                choice = input.nextLine();
                if ("y".equalsIgnoreCase(choice)) { //for heavy download
                    System.out.println("we would recommend you a hard drive of at least 750GB or higher.");
                } else if ("n".equalsIgnoreCase(choice)) {  //for not heavy download.
                    System.out.println("we would recommend you a hard drive of at least 500GB or higher.");
                } else {
                    System.out.println("Please, choose from options...");
                    gaming(input, "intel");
                }
            } else {
                System.out.println("Please, enter correct choice...");
                gaming(input, "intel");
            }
        } else if ("amd".equalsIgnoreCase(processorType)) { //for AMD type
            if ("y".equalsIgnoreCase(choice)) { //for hard gaming
                System.out.println("a.	We would recommend you for AMD A-10 processor.\n"
                        + "b.	A graphic card AMD Radeon of 6xxx Series to 8xxx series is recommended.\n"
                        + "c.	We would recommend you a RAM of 8GB.");
                System.out.println("Will you be downloading a lot games in the computer?");
                System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
                choice = input.nextLine();
                if ("y".equalsIgnoreCase(choice)) {         //for heavy download
                    System.out.println("we would recommend you a hard-drive of at least 1TB or higher.");
                } else if ("n".equalsIgnoreCase(choice)) {  //for not heavy download.
                    System.out.println("we would recommend you a hard-drive of at least 750GB or higher.");
                } else {
                    System.out.println("Please, choose from options...");
                    gaming(input, "amd");
                }
            } else if ("n".equalsIgnoreCase(choice)) {      //for not hard gaming.
                //display recommendation.
                System.out.println("a.	We would recommend you for AMD A8 processor.\n"
                        + "b.	A graphic card AMD Radeon of 6xxx Series to 8xxx Series is recommended. \n"
                        + "c.	We would recommend you a RAM of GB.");
                //further questions.
                System.out.println("Will you be downloading a lot of games in the computer?");
                System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
                choice = input.nextLine();
                if ("y".equalsIgnoreCase(choice)) {         //for heavy download
                    System.out.println("we would recommend you a hard drive of at least 750GB or higher.");
                } else if ("n".equalsIgnoreCase(choice)) {  //for not heavy download.
                    System.out.println("we would recommend you a hard drive of at least 500GB or higher.");
                } else {                                    //for wrong choice
                    System.out.println("Please, choose from options...");
                    gaming(input, "amd");
                }
            } else {                                        //for wrong choice
                System.out.println("Please, enter correct choice...");
                gaming(input, "amd");
            }
        }
    }

    /**
     * For general use questions.
     *
     * @param input
     * @param processorType
     */
    public static void generalUse(Scanner input, String processorType) {
        System.out.println("How fast do you want your computer to run?");
        System.out.println("a.	fast.");
        System.out.println("b.	very fast.");
        System.out.print("Enter your choice (a or b): ");
        String choice = input.nextLine();
        //check for processor type
        if ("intel".equalsIgnoreCase(processorType)) {
            if ("a".equalsIgnoreCase(choice)) {             //for fast
                System.out.println("a.	We would recommend you Intel Celeron Processor. \n"
                        + "b.	We would recommend you Intel HD Graphics 5500 or higher.\n"
                        + "c.	We would recommend you a RAM of 3GB.");

                System.out.println("Will you downloading a lot of videos, audio and other text files?");
                System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
                choice = input.nextLine();
                if ("y".equalsIgnoreCase(choice)) {         //for heavy download
                    System.out.println("we would recommend you a hard drive of at least 500 GB or higher.");
                } else if ("n".equalsIgnoreCase(choice)) {  //for not heavy download.
                    System.out.println("we would recommend you a hard drive of 250GB or higher.");
                } else {                                    //for wrong choice
                    System.out.println("Please, choose from options...");
                    generalUse(input, "intel");
                }
            } else if ("b".equalsIgnoreCase(choice)) {      //for very fast
                System.out.println("a.	We would recommend you an Intel Core 2 Duo Processor.\n"
                        + "b.	We would recommend you an Intel HD Graphics 5500 or higher.\n"
                        + "c.	We would recommend you a RAM of 4GB or higher.");

                System.out.println("Will you be downloading a lot of videos, audio and other text files?");
                System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
                choice = input.nextLine();
                if ("y".equalsIgnoreCase(choice)) {         //for heavy download
                    System.out.println("we would recommend you a hard drive from 500GB-750GB.");
                } else if ("n".equalsIgnoreCase(choice)) {  //for not heavy download
                    System.out.println("we would recommend you of at least 500GB or higher. ");
                } else {                                    //for wrong choice
                    System.out.println("Please, choose from options...");
                    generalUse(input, "intel");
                }
            } else {
                System.out.println("Please, choose from options...");
                generalUse(input, "intel");
            }
        } else if ("amd".equalsIgnoreCase(processorType)) { //for AMD type

            if ("a".equalsIgnoreCase(choice)) {             //for fast
                System.out.println("a.	We would recommend you AMD-A4 series processor.\n"
                        + "b.	We would recommend you a graphic card AMD Radeon 8400.\n"
                        + "c.	We would recommend you a RAM of 3GB.");

                System.out.println("Will you downloading a lot of videos, audio and other text files?");
                System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
                choice = input.nextLine();
                if ("y".equalsIgnoreCase(choice)) {         //for heavy download
                    System.out.println("we would recommend you a hard drive of at least 500 GB or higher.");
                } else if ("n".equalsIgnoreCase(choice)) {
                    System.out.println("we would recommend you a hard drive of 250GB or higher.");
                }
            } else if ("b".equalsIgnoreCase(choice)) {      //for very fast
                System.out.println("a.	We would recommend you an AMD A6 series processor.\n"
                        + "b.	We would recommend you a graphic card AMD Radeon HD 8400.\n"
                        + "c.	We would recommend you a RAM of 4GB or higher.");

                System.out.println("Will you be downloading a lot of videos, audio and other text files?");
                System.out.print("Enter your choice ('y' for YES or 'n' for NO): ");
                choice = input.nextLine();
                if ("y".equalsIgnoreCase(choice)) {         //for heavy download
                    System.out.println("we would recommend you a hard drive from 500GB-750GB.");
                } else if ("n".equalsIgnoreCase(choice)) {  //for not heave download
                    System.out.println("we would recommend you of at least 500GB or higher. ");
                } else {                                    //for wrong choice
                    System.out.println("Please, choose from options...");
                    generalUse(input, "amd");
                }
            } else {                                        //for wrong choice
                System.out.println("Please, choose from options...");
                generalUse(input, "amd");
            }
        }
    }
}
