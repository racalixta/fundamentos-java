// import java.util.Scanner;

import java.io.Console;

public class App {
    public static void main(String[] args) {
        // System.out.println("Olá, " + args[0] + " " + args[1]);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite seu nome: ");
        // String name = scanner.nextLine();
        // System.out.println("Olá, " + name);
        // scanner.close();

        Console console = System.console();
        System.out.println("Digite seu nome: ");
        String name = console.readLine();
        System.out.println("Olá, " + name);
        
    }
}
