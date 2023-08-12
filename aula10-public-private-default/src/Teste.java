import br.com.racalix.lugares.Biblioteca;

public class Teste {
  public static void main(String[] args) {
    Piscina piscina; // da erro se um class fora do pacote tentar acessar uma class default
    Biblioteca biblioteca = new Biblioteca();
    System.out.println(biblioteca.banheiro);
    
  }
}
