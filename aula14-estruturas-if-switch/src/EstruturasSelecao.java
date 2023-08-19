import java.util.Scanner;

public class EstruturasSelecao {
  public static void main(String[] args) {
    System.out.println("-------------------------------------------");
    System.out.println("Bem-vindo ao canal...");
    System.out.println("1. Se inscrever no canal");
    System.out.println("2. Dar like no vídeo");
    System.out.println("3. Compartilhar com os amigos");
    System.out.println("4. Ativar as notificações");
    System.out.println("Digite a opção desejada: ");

    Scanner scanner = new Scanner(System.in);
    int opcao = scanner.nextInt();
    scanner.close();

    // if(opcao == 1)
    //   System.out.println("Obrigada por se inscrever!");
    // else if (opcao == 2)
    //   System.out.println("Obrigada pelo like");
    // else if (opcao == 3)
    //   System.out.println("Obrigada por compartilhar");
    // else if (opcao == 4)
    //   System.out.println("Obrigada por ativar notificações");
    // else 
    //   System.out.println("Opção não suportada!");

    // switch(opcao) {
    //   case 1 -> System.out.println("Obrigada por se inscrever!");
    //   case 2 -> System.out.println("Obrigada pelo like");
    //   case 3 -> System.out.println("Obrigada por compartilhar");
    //   case 4 -> System.out.println("Obrigada por ativar notificações");
    //   default -> System.out.println("Opção não suportada!");
    // }

    String mensagem = switch(opcao) {
      case 1 -> "Obrigada por se inscrever!";
      case 2 -> "Obrigada pelo like";
      case 3 -> "Obrigada por compartilhar";
      case 4 -> "Obrigada por ativar notificações";
      default -> "Opção não suportada!";
    };

    System.out.println(mensagem);
  }
}