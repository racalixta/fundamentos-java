public class StringBasics {
  public static void main(String[] args) {
    String str1 = new String("Java s2");
    String str2 = new String("Java s2");

    // false
    System.out.println(str1 == str2);
    
    String str3 = "Java s2";
    String str4 = "Java s2";

    // true
    System.out.println(str3 == str4);

    // Caracteres especiais
    System.out.println("\nPular linha");
    System.out.println("\tTab");
    System.out.println("\n----------------------");

    // Strings são arrays de chars
    String nome = "Joao Silva";
    System.out.println("Pirmeira letra do nome: " + nome.charAt(0));

    // Posicao de um caractere
    System.out.println("Posicao da letra A no nome: " + nome.indexOf("a"));

    // Sobrenome da pessoa
    int posicaoSobrenome = nome.indexOf(" ") + 1;
    System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome));
    // ^^ pode receber dois valores - inical e final

    System.out.println("Número de caracteres no nome: " + nome.length());

    // substituição de caracteres - oq vc tem, pelo oq vc quer
    System.out.println(nome.replace("i", "1"));
    System.out.println("Original: " + nome);

    // concatenacao
    String maria = "Maria";
    String joana = "Joana";
    System.out.println(maria + " " + joana);

  }
}
